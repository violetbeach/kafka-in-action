package com.violetbeach.kafkainaction.repository;

import com.violetbeach.kafkainaction.entity.CheckOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckOutRepository extends JpaRepository<CheckOutEntity, Long> {
}
