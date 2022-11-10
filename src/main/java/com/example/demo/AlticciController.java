package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AlticciController {


@RequestMapping("/alticci/{n}")
    public AlticciSequenceArray postAlticciSequence(@PathVariable Optional<Integer> n) {

        try {
            AlticciImpl.getAlticciSequence(Optional.of())
        }
    }
}
