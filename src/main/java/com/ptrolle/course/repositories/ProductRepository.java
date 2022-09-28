package com.ptrolle.course.repositories;

import com.ptrolle.course.entities.Category;
import com.ptrolle.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
