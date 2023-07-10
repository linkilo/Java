package com.carlease.carlease.Aop;

import com.alibaba.fastjson.JSON;
import com.carlease.carlease.Utils.JWTUtils;
import com.carlease.carlease.mapper.LogMapper;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LogAOP {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private LogMapper logMapper;

    @Around("@annotation(com.carlease.carlease.Anno.Log)")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        String jwt=request.getHeader("token");
        Claims claims= JWTUtils.parseJWT(jwt);
        //获取操作人的id
        Integer id = (Integer) claims.get("id");
        log.info("操作人id:{}",id);

        //获取类名
        String className=joinPoint.getTarget().getClass().getName();

        //获取方法名
        String methodName=joinPoint.getSignature().getName();

        //获取参数
        String methodParams= Arrays.toString(joinPoint.getArgs());

        //记录运行原始方法的开始时间
        Long begin=System.currentTimeMillis();

        //调用原始方法运行(获取原始方法的返回值)
        Object result=joinPoint.proceed();

        //记录运行原始方法的结束时间
        Long end=System.currentTimeMillis();

        //计算运行时间
        Long costTime=end-begin;

        //获取JSON格式的返回值
        String JsonResult= JSON.toJSONString(result);


        //将日志录入数据库
        logMapper.insertLog(id,className,methodName,methodParams,costTime,JsonResult);

        //将运行结果返回给原方法
        return result;
    }

}
