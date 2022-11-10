package com.example.demo;

import lombok.Data;

@Data
public class AlticciSequenceArray {

    private long[] number_n;

    private String error;


    public AlticciSequenceArray(final long[] n, final String err) {
       if (n == null || n.length == 0) {
           number_n = new long[0];
       } else {
           number_n = new long[n.length];
           System.arraycopy(n, 0, number_n, 0, number_n.length);
       }
       error = err;
    }

    public long[] getNumber_n() {
        final long[] rtn;
        if (number_n == null || number_n.length == 0) {
            rtn = new long[0];
        } else {
            rtn = new long[number_n.length];
            System.arraycopy(number_n, 0, rtn, 0, rtn.length);
        }
        return rtn;
    }

    public void setNumber_n(final long[] aL) {
        if (aL == null || aL.length == 0) {
            number_n = new long[0];
        } else {
            number_n = new long[aL.length];
            System.arraycopy(aL, 0, number_n, 0, number_n.length);
        }
    }
}
