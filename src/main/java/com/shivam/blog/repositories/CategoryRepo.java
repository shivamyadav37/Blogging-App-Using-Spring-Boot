package com.shivam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
