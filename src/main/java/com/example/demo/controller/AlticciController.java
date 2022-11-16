package com.example.demo.controller;

import com.example.demo.service.AlticciImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alticci/")
public class AlticciController {

    /*
    * Param: n is the index of sequence
    *
    * That method call Alticci Implement for make algorithm
    *
    * */
@PostMapping("{n}")
    public long receiveNumber(@PathVariable long n) {
        AlticciImpl alticciImpl = new AlticciImpl();
        return alticciImpl.alticciSequence(n);
    }
}
