package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import static java.util.Arrays.asList;

@RestController
public class SimpleRestController {

  @PostMapping("/test")
  public String handleFileUpload(@RequestParam("uid") String uid,
                                 MultipartHttpServletRequest request) {

    System.out.println("uid = " + uid);
    request.getParameterMap()
            .forEach((key, val) -> System.out.println("key:" + key + " , val:" + asList(val)));

    return "200";
  }
}
