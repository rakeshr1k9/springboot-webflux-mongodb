package com.rakeshr1k9.springbootwebfluxmongodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/api/name")
    public Mono<List<String>> getName(){

        List<String> names = new ArrayList<>();

        names.add("Name1");
        names.add("Test Name");
        names.add("Test Name 3");

        return Mono.just(names);

    }

}
