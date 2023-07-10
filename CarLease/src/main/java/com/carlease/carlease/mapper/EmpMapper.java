package com.carlease.carlease.mapper;

import com.carlease.carlease.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("select * from emps where name =#{name} and password =#{password}")
    Emp getEmpByNameAndPassword(@Param("name") String name,@Param("password") String password);

    /**
     * 分页条件查询员工
     * @param name
     * @param id
     * @return
     */
    List<Emp> getEmps(@Param("name") String name, @Param("id") Integer id);

    /**
     * 新增员工
     * @param name
     * @param url
     * @param sex
     * @param username
     * @param password
     */
    @Insert("insert into emps(name,username,password,url,sex,create_time) values (#{name},#{username},#{password},#{url},#{sex},now())")
    void insert(@Param("name") String name,@Param("url") String url
            ,@Param("sex") String sex, @Param("username") String username, @Param("password") String password);

    /**
     * 批量删除员工
     * @param ids
     */
    Integer delete(@Param("ids") List<Integer> ids);

    /**
     * 通过id查询员工
     * @param id
     * @return
     */
    @Select("select * from emps where id =#{id}")
    Emp getEmpById(@Param("id") Integer id);

    /**
     * 修改员工信息
     * @param id
     * @param name
     * @param password
     * @param username
     * @param sex
     * @return
     */
    boolean update(@Param("id") Integer id,@Param("name") String name,
                   @Param("password") String password,@Param("username") String username,
                   @Param("sex") String sex);
}
