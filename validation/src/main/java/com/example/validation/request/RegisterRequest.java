package com.example.validation.request;

import com.example.validation.MinimumRequiredParameters;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@MinimumRequiredParameters(value = {"phone", "email"}, message = "手机号码和邮箱至少有一个必填")
public class RegisterRequest {
    @NotBlank(message = "用户名不能为空")
    private String username;

    @Pattern(regexp = "\\d{11}", message = "手机号码格式不正确")
    private String phone;

    @Email(message = "邮箱格式不正确")
    private String email;

    @NotBlank(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
