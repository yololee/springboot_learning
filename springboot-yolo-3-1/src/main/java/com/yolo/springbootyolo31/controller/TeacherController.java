package com.yolo.springbootyolo31.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"教师管理"})
@ApiSort(value = 1)
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

    @GetMapping("/xxx")
    public String xxx() {
        return "xxx";
    }

}