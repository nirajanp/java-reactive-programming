package com.rp.sec01;

import reactor.core.publisher.Mono;

public class Lec02MonoJust {
    // 14. [Mono] - Just
    public static void main(String[] args) {

        // this is easiest way of creating mono when you already have data in hand
        // this is publisher
        Mono<Integer> just = Mono.just(1);

        // this will just print from toString method of Mono
        System.out.println(just);

        // in reactive programming nothing happens until you subscribe
        // to get the data from publisher then we will have to subscribe to
        // the publisher
        // in order for publisher to emit data subscriber must subscribe
        just.subscribe(i -> System.out.println("received : " + i));





    }
}
