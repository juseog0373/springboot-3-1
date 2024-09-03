package com.office.library.admin.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

    @Autowired
    AdminMemberService adminMemberService;

    @GetMapping("/createAccountForm") //값이 넘어오는 방식이 get 방식이면 @GetMapping 어노테이션 사용이 가능하다
    public String createAccountForm() {

        System.out.println("AdminMemberController 클래스의 createAccountForm() 메소드");
        String nextPage = "/admin/member/create_account_form";

        return nextPage;
    }

    //@RequestMapping(value = "/createAccountConfirm", method = RequestMethod.POST )
    @PostMapping("/createAccountConfirm") //값이 넘어오는 방식이 get 방식이면 @PostMapping 어노테이션 사용이 가능하다
    public String createAccountConfirm(AdminMemberVo adminMemberVo, Model model) {
        System.out.println("AdminMemberController 클래스의 createAccountConfirm() 메소드");

        String nextPage = "/admin/member/create_account_ok";

        AdminMemberVo accountConfirm = adminMemberService.createAccountConfirm(adminMemberVo);
        model.addAttribute("accountConfirm", accountConfirm);

        return nextPage;
    }
}
