package com.jenny.controller;

import com.jenny.controller.entity.Table;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/table")
    public String table(){
        return "table";
    }

    @GetMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        List<Table> list = new ArrayList<>();
        Table table1 = new Table();
        table1.setVersion("2.2.2 CURRENT GA");
        table1.setApiurl("https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/api/");
        table1.setDocurl("https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/html/");
        Table table2 = new Table();
        table2.setVersion("2.2.3 SNAPSHOT");
        table2.setApiurl("https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/api/");
        table2.setDocurl("https://docs.spring.io/spring-boot/docs/2.2.3.RELEASE/reference/html/");
        Table table3 = new Table();
        table3.setVersion("2.1.12 SNAPSHOT");
        table3.setApiurl("https://docs.spring.io/spring-boot/docs/2.1.12.RELEASE/api/");
        table3.setDocurl("https://docs.spring.io/spring-boot/docs/2.1.12.RELEASE/reference/html/");
        list.add(table1);
        list.add(table2);
        list.add(table3);
        modelAndView.setViewName("table");
        modelAndView.addObject("springs",list);
        return modelAndView;
    }
}
