package com.violetbeach.kafkainaction.repository;

import com.violetbeach.kafkainaction.entity.CheckOutEntity;
import com.violetbeach.kafkainaction.entity.ShipmentCheckOutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentCheckOutRepository extends JpaRepository<ShipmentCheckOutEntity, Long> {
}
