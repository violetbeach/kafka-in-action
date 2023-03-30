package com.violetbeach.kafkainaction.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@AllArgsConstructor
public class MessageObject {
    private String name;
    private String message;
}
