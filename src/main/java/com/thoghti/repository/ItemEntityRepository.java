package com.thoghti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoghti.repository.entity.ItemEntity;
@Repository
public interface ItemEntityRepository extends JpaRepository<ItemEntity, Integer>{

}
