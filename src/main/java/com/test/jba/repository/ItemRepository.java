package com.test.jba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jba.entity.Blog;
import com.test.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	List<Item> findByBlog(Blog blog, Pageable pageable);
}
