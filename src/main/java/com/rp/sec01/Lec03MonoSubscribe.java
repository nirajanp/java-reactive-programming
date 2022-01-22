package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    // 15. [Mono] - Subscribe - Part 1
    public static void main(String[] args) {

        // publisher
        Mono<Object> mono = Mono.just("ball")
                .map(String ::length)
                .map(l -> l/2);

        // 1 of the overloaded options
        // this methods makes the publisher to emit the item
        // when you run this program no output will be seen because onNext
        // behavior is not provided
        mono.subscribe();

        // 2
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );


    }
}
