package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {

    @NotEmpty(message="회원 이름은 필수입니다.")
    @Size(min = 2, message = "회원 이름은 2글자 이상입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
