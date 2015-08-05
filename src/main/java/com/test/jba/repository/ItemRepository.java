package com.test.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
