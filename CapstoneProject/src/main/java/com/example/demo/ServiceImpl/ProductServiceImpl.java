package com.example.demo.ServiceImpl;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Exceptions.InvalidModelNumberException;
import com.example.demo.Repository.IClientRepository;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Repository.IProductRepsoitory;
import com.example.demo.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductRepsoitory productRepsoitory;
	@Autowired
	IComplaintRepository complaintRepository;
	@Autowired
	IEngineerRepository engineerRepository;
	@Autowired
	IClientRepository clientRepsoitory;

	@Override
	public void addProduct(Product product) {
		productRepsoitory.save(product);
	}

	@Override
	public void removeProduct(Integer productId) {
		productRepsoitory.deleteById(productId);
	}

	@Override
	public Product getProduct(Integer productId)  {
	Product prod = this.productRepsoitory.findById(productId).orElseThrow(()->new InvalidModelNumberException(productId));
		return prod;
	}

	@Override
	public void updateProductWarrenty(Integer productId, int years) {
		Optional<Product> product = productRepsoitory.findById(productId);
		if (product.isPresent()) {
			product.get().setWarrantyYears(years);
			productRepsoitory.save(product.get());
		}
	}

	@Override
	public List<Complaint> getProductComplaints(Integer productId) {
		Optional<Product> product = productRepsoitory.findById(productId);
		if (product.isPresent()) {
			return product.get().getComplaint();
		}
		return null;
	}

	

	@Override
	public void buyProduct(int clientId, int productId) {
		Optional<Client> cli = clientRepsoitory.findById(clientId);
		Optional<Product> pro = productRepsoitory.findById(productId);
		List<Product> prod = new ArrayList<>();
		prod.add(pro.get());
		cli.get().setProduct(prod);
		pro.get().setClient(cli.get());
		clientRepsoitory.save(cli.get());
		productRepsoitory.save(pro.get());

	}
	@Override
	public List<Engineer> getEngineersByProduct(Integer productId) {
		// Todo:: No Direct mapping found between Engineer and Product.
		return null;
	}
}
