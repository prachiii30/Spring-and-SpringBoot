package com.prachi.ecom_front1_backend.service;

import com.prachi.ecom_front1_backend.model.Product;
import com.prachi.ecom_front1_backend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProduct() {
        return productRepo.findAll();

    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProductImage(Product jsonData, MultipartFile image) throws IOException {
        jsonData.setImageName(image.getOriginalFilename());
        jsonData.setImageType(image.getContentType());
        jsonData.setImageData(image.getBytes());

        return productRepo.save(jsonData);
    }

    public Product updateImage(Product jsonData, MultipartFile image) throws IOException {
        jsonData.setImageName(image.getOriginalFilename());
        jsonData.setImageType(image.getContentType());
        jsonData.setImageData(image.getBytes());

        return productRepo.save(jsonData);
    }

    public void delProduct(int id) {
        productRepo.deleteById(id);
    }

    public List<Product> search(String keyword) {
        return productRepo.searchProduct(keyword);
    }
}
