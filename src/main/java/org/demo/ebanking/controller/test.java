package org.demo.ebanking.controller;

import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("/api/test")
    public class test {

        @GetMapping("/config")
        public String config() {
            return "config work well";
        }

        @GetMapping("/config2")
        public String config2() {
            return "config2 work well";
        }


    }

