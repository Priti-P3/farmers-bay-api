package com.p3.farmersbay.farmersbayapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p3.farmersbay.farmersbayapi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
