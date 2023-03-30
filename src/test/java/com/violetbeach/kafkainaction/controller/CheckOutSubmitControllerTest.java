package com.violetbeach.kafkainaction.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class CheckOutSubmitControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPostSubmitCheckOut() throws Exception {

        // when
        ResultActions result = mockMvc.perform(post("/submitCheckOut")
                .param("memberId", "10001")
                .param("productId", "20001")
                .param("amount", "3300")
                .param("shippingAddress", "546"));

        // then
        result.andExpect(status().isOk())
                .andDo(print());
    }

}