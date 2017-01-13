package com.tw.jlhe.helloworld.controller;

import com.tw.jlhe.helloworld.model.Greeting;
import com.tw.jlhe.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/greeting" , method = RequestMethod.GET)
    public ResponseEntity<?> greeting(){
        Greeting greeting = new Greeting();
        greeting.setGreetingContent(helloWorldService.greering());
        return ResponseEntity.ok(greeting);
    }

    @RequestMapping(value = "/{name}" , method = RequestMethod.GET )
    public ResponseEntity<?> greetingToSomeone(@PathVariable String name){
        Greeting greeting = new Greeting();
        greeting.setGreetingContent(helloWorldService.greetingToSomeone(name));
        return ResponseEntity.ok(greeting);
    }

    @RequestMapping(value = "/greeting/{id}" , method = RequestMethod.GET)
    public ResponseEntity<?> greetingToRepository(@PathVariable Long id){
        Greeting greeting = new Greeting();
        greeting.setGreetingContent(helloWorldService.greetingToRepository(id));
        return ResponseEntity.ok(greeting);
    }
}
