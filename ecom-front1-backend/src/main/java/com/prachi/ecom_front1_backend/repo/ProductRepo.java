package com.prachi.ecom_front1_backend.repo;

import com.prachi.ecom_front1_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ProductRepo extends JpaRepository<Product,Integer>{

}
