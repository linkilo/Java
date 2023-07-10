package com.carlease.carlease.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogMapper {

    /**
     * 记录操作日志
     * @param userId
     * @param className
     * @param methodName
     * @param methodParams
     * @param costTime
     * @param jsonResult
     */
    @Insert("insert into log(user_id,class_name,method_name,update_time,method_params,return_value,cost_time) values (#{userId},#{className},#{methodName},now(),#{methodParams},#{jsonResult},#{costTime})")
    void insertLog(@Param("userId") Integer userId, @Param("className") String className,
                   @Param("methodName") String methodName,
                   @Param("methodParams") String methodParams,
                   @Param("costTime") Long costTime,@Param("jsonResult") String jsonResult);
}
