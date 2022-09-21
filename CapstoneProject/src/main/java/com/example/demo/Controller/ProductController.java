package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Service.IProductService;

import java.util.List;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService pro;

	// buyproduct

	@PostMapping("/buyProduct")

	public void buyProduct(@RequestHeader int clientId, @RequestHeader int productId) {
		pro.buyProduct(clientId, productId);

	}

	// add product
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		pro.addProduct(product);
		return "Product added successfully";

	}

	// remove product
	@DeleteMapping("/removeProduct")
	public String removeProduct(@RequestParam("productId") Integer productId) {
		pro.removeProduct(productId);
		return "Product removed successfully";
	}

	// get product
	@GetMapping("/getProduct")
	public ResponseEntity<Product> getProduct(@RequestParam("productId") Integer productId) {
		return new ResponseEntity<>(pro.getProduct(productId),HttpStatus.OK);

	}

	// update product warranty
	@PutMapping("/updProductWar")
	public String updateProductWarrenty(@RequestParam("productId") Integer productId, @RequestParam("years") int years) {
		pro.updateProductWarrenty(productId, years);
		return "Warranty updated successfully";
	}

	// get product complaint
	@GetMapping("/getprodComp")
	public List<Complaint> getProductComplaints(@RequestParam("productId") Integer productId) {
		return pro.getProductComplaints(productId);

	}

	// get engineer by product
	@GetMapping("/getEngbyProd")
	public List<Engineer> getEngineersByProduct(@RequestParam("productId") Integer productId) {
		return pro.getEngineersByProduct(productId);
	}

}