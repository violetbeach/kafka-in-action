package com.violetbeach.kafkainaction.service;

import com.violetbeach.kafkainaction.dto.CheckOutDto;
import com.violetbeach.kafkainaction.entity.CheckOutEntity;
import com.violetbeach.kafkainaction.entity.ShipmentCheckOutEntity;
import com.violetbeach.kafkainaction.repository.ShipmentCheckOutRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class ShipmentService {
    private final ModelMapper modelMapper = new ModelMapper();
    private final ShipmentCheckOutRepository shipmentCheckOutRepository;

    public Long saveCheckOutData(CheckOutDto checkOutDto) {
        ShipmentCheckOutEntity shipment = modelMapper.map(checkOutDto, ShipmentCheckOutEntity.class);
        shipmentCheckOutRepository.save(shipment);
        return shipment.getShipmentId();
    }

}