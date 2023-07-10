package com.carlease.carlease.Controller;

import com.alibaba.fastjson.JSON;
import com.carlease.carlease.Service.EmpService;
import com.carlease.carlease.Utils.JWTUtils;
import com.carlease.carlease.pojo.Emp;
import com.carlease.carlease.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class loginController {

    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("：{}进行登录操作",emp);
        Emp emp1=empService.getEmpByNameAndPassword(emp);
        if(emp1!=null){
            Map<String,Object> claims = new HashMap<>();
            claims.put("id",emp1.getId());
            log.info("id:{}",emp1.getId());
            claims.put("name",emp1.getName());
            claims.put("password",emp1.getPassword());
            String str= JWTUtils.generateJWT(claims);
            String jwt=JSON.toJSON(str).toString();
            log.info("：{}登录成功",emp1.getName());
            log.info("返回令牌：{}",jwt);
            return new Result().success(jwt);
        }
        else{
            log.info(":{}登录失败",emp.getName());
        }
        return new Result().error("用户名称或密码输入错误");
    }
}
