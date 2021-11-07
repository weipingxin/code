package com.example.demo.contronller;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author weipingxin
 * Date 2021/10/31
 * Desc
 */

@RestController
public class DemoController {

    @Autowired
    Person person;

    @ResponseBody
    @RequestMapping("/hello")
    public Person hello(){
        return person;
    }
}
