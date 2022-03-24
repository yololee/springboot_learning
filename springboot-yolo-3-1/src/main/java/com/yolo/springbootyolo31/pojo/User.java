package com.yolo.springbootyolo31.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description="用户实体")
public class User {

    @ApiModelProperty(value = "用户编号",position = 1)
    private Long id;
    @ApiModelProperty(value = "用户姓名",position = 2)
    private String name;
    @ApiModelProperty(value = "用户年龄",position = 3)
    private Integer age;

}