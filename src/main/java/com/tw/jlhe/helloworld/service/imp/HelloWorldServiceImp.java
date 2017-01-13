package com.tw.jlhe.helloworld.service.imp;

import com.tw.jlhe.helloworld.entity.User;
import com.tw.jlhe.helloworld.repository.HelloWorldRepositroy;
import com.tw.jlhe.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cqu on 11/01/2017.
 */
@Service
public class HelloWorldServiceImp implements HelloWorldService {

    @Autowired
    HelloWorldRepositroy helloWorldRepositroy;

    @Override
    public String greering() {
        return "Hello World!";
    }

    @Override
    public String greetingToSomeone(String name) {
        return "Hellow " + name + "!";
    }

    @Override
    public String greetingToRepository(Long id) {
        User user = helloWorldRepositroy.findOne(id);
        return "Hellow " + user.getName() +"!";
    }
}
