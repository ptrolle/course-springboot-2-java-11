package com.ptrolle.course.repositories;

import com.ptrolle.course.entities.OrderItem;
import com.ptrolle.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
