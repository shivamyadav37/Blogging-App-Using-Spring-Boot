package com.shivam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
