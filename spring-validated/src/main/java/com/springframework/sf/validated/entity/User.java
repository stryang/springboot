package com.springframework.sf.validated.entity;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@ToString
public class User {
    @NotEmpty(message = "姓名不能为空")
    private String username;

    @Min(value = 1 , message = "年龄不能小于1岁")
    @Max(value = 100 , message = "年龄不能大于100岁")
    private Integer age;

    @Email
    @NotEmpty(message = "邮箱不能为空")
    private String email;

    @NotEmpty(message = "地址不能为空")
    private String address;
}
