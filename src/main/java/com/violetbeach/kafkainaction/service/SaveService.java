package com.violetbeach.kafkainaction.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.violetbeach.kafkainaction.dto.CheckOutDto;
import com.violetbeach.kafkainaction.entity.CheckOutEntity;
import com.violetbeach.kafkainaction.repository.CheckOutRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class SaveService {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private final ModelMapper modelMapper = new ModelMapper();
    private final CheckOutRepository checkOutRepository;

    public Long saveCheckOutData(CheckOutDto checkOutDto) {
        CheckOutEntity checkOutEntity = saveDatabase(checkOutDto);

        checkOutDto.setCheckOutId(checkOutEntity.getCheckOutId());
        checkOutDto.setCreatedAt(new Date(checkOutEntity.getCreatedAt().getTime()));

        return checkOutEntity.getCheckOutId();
    }

    private CheckOutEntity saveDatabase(CheckOutDto checkOutDto) {
        CheckOutEntity checkOutEntity = modelMapper.map(checkOutDto, CheckOutEntity.class);
        return checkOutRepository.save(checkOutEntity);
    }


}
