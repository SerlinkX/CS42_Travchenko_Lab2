package com.example.lab1;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;
import java.util.Scanner;


@SpringBootApplication
public class Lab1Application implements CommandLineRunner {


    private final MaxNumberService maxNumberService;


    // Інʼєкція залежностей через конструктор
    public Lab1Application(MaxNumberService maxNumberService) {
        this.maxNumberService = maxNumberService;
    }


    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }


    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа через пробіл:");


        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        int max = maxNumberService.findMax(numbers);
        System.out.println("Максимальне число: " + max);
    }
}

