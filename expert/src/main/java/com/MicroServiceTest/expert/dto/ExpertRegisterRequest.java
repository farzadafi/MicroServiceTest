package com.MicroServiceTest.expert.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class ExpertRegisterRequest {
    @NotNull(message = "وارد کردن نام اجباری است!")
    private String firstName;
    private String lastName;
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",message = "لطفا یک معتبر وارد کنید!")
    private String email;
}
