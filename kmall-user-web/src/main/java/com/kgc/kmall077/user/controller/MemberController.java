package com.kgc.kmall077.user.controller;

import com.kgc.kmall.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shkstart
 * @create 2020-12-15 19:30
 */
@Controller
public class MemberController {
    @Reference
    MemberService memberService;
    @RequestMapping("/")
    @ResponseBody
    public String select(){
        return memberService.select().get(1).getNickname();
    }

}
