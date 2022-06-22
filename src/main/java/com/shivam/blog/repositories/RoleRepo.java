package com.shivam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
