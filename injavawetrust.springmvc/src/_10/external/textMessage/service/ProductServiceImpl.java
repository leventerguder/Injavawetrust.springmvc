package _10.external.textMessage.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _10.external.textMessage.dao.ProductRepositoryDAO;
import _10.external.textMessage.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepositoryDAO productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {
		return productRepository.getProductsByBrands(brands);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

}
