package com.bcp.project.repository;

import com.bcp.project.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Integer> {
//  List<Review> findAllById(int idItem);
}
