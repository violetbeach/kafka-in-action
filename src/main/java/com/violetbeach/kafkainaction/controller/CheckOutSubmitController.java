package com.violetbeach.kafkainaction.controller;

import com.violetbeach.kafkainaction.dto.CheckOutDto;
import com.violetbeach.kafkainaction.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class CheckOutSubmitController {

    private final CheckoutService checkoutService;

    @PostMapping("/submitCheckOut")
    public String submitCheckOut(CheckOutDto checkOutDto, Model model) {
        log.info(checkOutDto.toString());
        Long checkOutId = checkoutService.saveCheckOutData(checkOutDto);
        model.addAttribute("checkOutId", checkOutId);
        return "submitComplete";
    }
}
