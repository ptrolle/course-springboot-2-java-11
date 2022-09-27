package com.ptrolle.course.repositories;

import com.ptrolle.course.entities.Order;
import com.ptrolle.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
