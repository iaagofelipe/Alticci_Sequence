package com.example.demo;

import lombok.Data;

@Data
public class AlticciSequenceString {

    private String number_n;


    public AlticciSequenceString(String number_n) {
        this.number_n = number_n;
    }
}
