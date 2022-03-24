package com.yolo.springbootyolo31.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiSort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"学生管理"})
@ApiSort(value = 2)
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @ApiOperation(value = "获取学生清单")
    @ApiOperationSupport(order = 3)
    @GetMapping("/list")
    public String bbb() {
        return "bbb";
    }

    @ApiOperation("获取教某个学生的老师清单")
    @ApiOperationSupport(order = 1)
    @GetMapping("/his-teachers")
    public String ccc() {
        return "ccc";
    }

    @ApiOperation("创建一个学生")
    @ApiOperationSupport(order = 2)
    @PostMapping("/aaa")
    public String aaa() {
        return "aaa";
    }

}