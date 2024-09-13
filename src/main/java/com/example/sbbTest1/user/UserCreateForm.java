package com.example.sbbTest1.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @NotEmpty(message = "아이디가 비어있습니다.")
    @Size(min = 3, max = 25, message = "아이디가 너무 짧거나 깁니다.")
    private String username;

    @NotEmpty(message = "비밀번호가 비어있습니다.")
    private String password;

    @NotEmpty(message = "비밀번호 확인이 비어있습니다.")
    private String passwordCheck;

    @NotEmpty(message = "닉네임이 비어있습니다.")
    private String nickname;
}
