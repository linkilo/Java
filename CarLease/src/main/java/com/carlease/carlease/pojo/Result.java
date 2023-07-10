package com.carlease.carlease.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 统一响应结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public Result success(){
        return new Result(1,"success",null);
    }

    public Result success(Object data){
        return new Result(1,"success",data);
    }

    public Result error(String msg){
        return new Result(0,msg,null);
    }
}
