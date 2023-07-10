package com.carlease.carlease.mapper;

import com.carlease.carlease.pojo.Cars;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 车辆映射接口类
 */
@Mapper
public interface CarMapper {

    /**
     * 查询所有车辆
     * @return List<Cars>
     */

    List<Cars> GetCars(@Param("name") String name, @Param("vehicleType") String vehicleType);

    @Select("select * from cars where id =#{id}")
    Cars getCarById(@Param("id") Integer id);

    @Insert("insert into cars(id,url,msg,name,Vehicle_type,create_time) values(#{id},#{url},#{msg},#{name},#{vehicleType},now())")
    void insert(@Param("id") Integer id, @Param("url") String url,
                @Param("msg") String msg,@Param("name") String name,
                @Param("vehicleType") String vehicleType);

    /**
     * 批量删除车辆
     * @param ids
     */
    void delete(@Param("ids") List<Integer> ids);

    /**
     * 修改车辆信息
     * @param id
     * @param name
     * @param vehicleType
     * @param msg
     */
    void update(@Param("id") Integer id, @Param("name") String name,
                @Param("vehicleType") String vehicleType, @Param("msg") String msg);
}
