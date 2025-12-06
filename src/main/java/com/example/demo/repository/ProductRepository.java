package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByCategory_CategoryId(Integer categoryId);
}
