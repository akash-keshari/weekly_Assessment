package com.example.demo.Service;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProductService {
    void addProduct(Product product);

    void removeProduct(Integer productId);

    Product getProduct(Integer productId);

    void updateProductWarrenty(Integer productId, int years);

    List<Complaint> getProductComplaints(Integer productId);

    List<Engineer> getEngineersByProduct(Integer productId);
    
    void buyProduct(int clientId, int productId);

	
}
