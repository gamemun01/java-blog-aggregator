package com.test.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jba.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
