package com.carlease.carlease.Filter;
import com.alibaba.fastjson.JSON;
import com.carlease.carlease.Utils.JWTUtils;
import com.carlease.carlease.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 拦截器（拦截任何访问并验证）
 */
@Slf4j
@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;

        log.info("拦截请求中......");
        String url= request.getRequestURI();
        log.info("成功拦截请求的url:{}",url);

        if(url.contains("login")){
            log.info("登录操作,放行");
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        String jwt= request.getHeader("token");

       if(!StringUtils.hasLength(jwt)){
            log.info("非法请求,拒绝访问");

           Result result=new Result().error("NOT_LOGIN");
           String NOT_LOGIN= JSON.toJSONString(result);

           response.getWriter().write(NOT_LOGIN);
           return;
       }

       try{
           JWTUtils.parseJWT(jwt);
       }catch (Exception e){
           e.printStackTrace();
           log.info("非法请求,拒绝访问");

           Result result=new Result().error("NOT_LOGIN");
           String NOT_LOGIN= JSON.toJSONString(result);
           response.getWriter().write(NOT_LOGIN);
           return;
       }
        log.info("验证通过，放行");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
