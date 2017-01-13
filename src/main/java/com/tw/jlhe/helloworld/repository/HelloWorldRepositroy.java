package com.tw.jlhe.helloworld.repository;

import com.tw.jlhe.helloworld.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cqu on 11/01/2017.
 */
public interface HelloWorldRepositroy extends CrudRepository<User,Long> {

}
