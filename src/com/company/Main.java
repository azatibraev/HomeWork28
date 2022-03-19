package com.company;


import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println("sqrt = " + sqrt.apply(36.0));
    }
        public static UnaryOperator<Double> sqrt = Math::sqrt;
    }