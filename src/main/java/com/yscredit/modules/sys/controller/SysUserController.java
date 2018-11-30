package com.yscredit.modules.sys.controller;

import com.yscredit.common.page.Page;
import com.yscredit.common.util.Effect;
import com.yscredit.modules.sys.entity.SysUserEntity;
import com.yscredit.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/helloWorld")
    public void helloWorld(){
        System.out.print("helloWorld");
    }

    @GetMapping("query")
    public SysUserEntity query(){
        return sysUserService.queryByUserName();
    }

    @GetMapping("queryPage")
    public Effect queryPage(Page page){
        Effect effect = new Effect();
        effect.setObj(sysUserService.queryPage(page));
        return effect;
    }



}
