package com.duing.yaml.controller;

import com.duing.yaml.configuration.FoodConfig;
import com.duing.yaml.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YamlController {

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json() {
        Food food = new Food();
        food.setApple(foodConfig.getApple());
        food.setJuice(foodConfig.getJuice());
        return food;
    }

    @RequestMapping("/word")
    public String word() {
        return "Hello World";
    }
}
