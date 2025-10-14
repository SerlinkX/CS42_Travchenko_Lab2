package com.example.lab1;

import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class MaxNumberService {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Масив порожній"));
    }
}