package com.prachi.ecom_front1_backend.controller;

import com.prachi.ecom_front1_backend.model.Product;
import com.prachi.ecom_front1_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping("/products")
//    public List<Product> getProduct(){
//        return productService.getAllProduct();
//    }

    //same as above but also sending status code
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProduct() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/product/{id}")

    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product p = productService.getProductById(id);
        if (p != null)
            return new ResponseEntity<>(p, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping("/product")
    private ResponseEntity<?> addProductImage(@RequestPart Product product, @RequestPart MultipartFile imageFile) throws IOException {
        Product savedProduct=null;
        try {
           savedProduct = productService.addProductImage(product, imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        }
        catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Product product =productService.getProductById(productId);
        return new ResponseEntity<>(product.getImageData(),HttpStatus.OK);


    }




}






