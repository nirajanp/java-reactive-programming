package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {

    public static void main(String[] args) {
        // this acts as a subscriber
        // it is asks publisher if it has this data and if it has give it to me
        // if data is present it will invoke noNext() method and then noComplete()
        // and done because Mono can emit only one data
         userRepository(2)
                 .subscribe(
                         Util.onNext(),
                         Util.onError(),
                         Util.onComplete()
                 );
    }

    // based on the userId given to repo, it will find corresponding user
    // this acts like a subscriber
    private static Mono<String> userRepository(int userId) {

        if (userId == 1) {
            return Mono.just(Util.faker().name().firstName());
        } else if (userId == 2) {
            // this is better way saying that it does not have data.
            // it is null
            return Mono.empty();
        } else {
            return Mono.error(new RuntimeException("Not in the allowed range"));
        }
    }
}
