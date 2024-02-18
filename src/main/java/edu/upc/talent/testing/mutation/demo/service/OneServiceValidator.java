package edu.upc.talent.testing.mutation.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OneServiceValidator {
    boolean isValid(int input) {
        return input > 0 && input <= 100;
    }
}
