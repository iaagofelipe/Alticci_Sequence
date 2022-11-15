package com.example.demo.controller;

import com.example.demo.service.AlticciImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alticci/")
public class AlticciController {
@GetMapping("{n}")
    public long receiveNumber(@PathVariable long n) {
        AlticciImpl alticciImpl = new AlticciImpl();
        return alticciImpl.alticciSequence(n);
    }
}
