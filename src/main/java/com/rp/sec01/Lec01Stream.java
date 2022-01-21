package com.rp.sec01;

import java.util.stream.Stream;

public class Lec01Stream {
    // 13. Stream Lazy Behavior
    public static void main(String[] args) {
        // this is Stream having two data
        Stream<Integer> integerStream = Stream.of(10,20)
                .map(i -> {
                    try {
                        System.out.println("Sleep");
                        Thread.sleep(1000);
                        System.out.println("Wake up");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return i*2;
                });
        // this will only print reference address
        //System.out.println(integerStream);

        // terminal operator of stream
        integerStream.forEach(System.out::println);
    }

}
