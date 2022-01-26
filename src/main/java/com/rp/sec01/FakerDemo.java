package com.rp.sec01;

import com.github.javafaker.Faker;
// this is a using Faker library which can generate fake information
public class FakerDemo {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            System.out.println(
                    Faker.instance().name().fullName()
            );
        }
    }
}
