package com.carlease.carlease.Controller;

import com.carlease.carlease.Anno.Log;
import com.carlease.carlease.Service.EmpService;
import com.carlease.carlease.pojo.Emp;
import com.carlease.carlease.pojo.PageBean;
import com.carlease.carlease.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 员工管理类
 * GET:查询
 * POST：新增
 * PUT：修改
 * DELETE：删除
 */
@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;


    /**
     * 分页查询员工
     * @param page
     * @param pageSize
     * @param name
     * @param id
     * @return
     */
    @GetMapping
    public Result GetCars(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer pageSize,
                          String name,Integer id){
        log.info("分页条件查询员工");
        PageBean pageBean=empService.getEmp(page,pageSize,name,id);
        return new Result().success(pageBean);
    }

    /**
     * 新增员工
     * @param emp
     * @return
     */
    @Log
    @PostMapping
    public Result insert(@RequestBody Emp emp){
        log.info("新增员工：{}",emp);
        empService.insert(emp);
        return new Result().success();
    }

    /**
     * 批量删除员工
     * @param ids
     * @return
     */
    @Log
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("删除员工:{}",ids);
       empService.delete(ids);
        return new Result().success();

    }

    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getEmpById(@PathVariable Integer id){
        log.info("查询员工：{}",id);
        Emp emp=empService.getEmpById(id);
        return new Result().success();
    }

    /**
     * 修改员工信息
     * @param emp
     * @return
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Emp emp){
        log.info("修改员工：{}信息为：{}",emp.getId(),emp);
        if(empService.update(emp))
        {
        return new Result().success();
        }else{
            return new Result().error("emmm");
        }
    }

}
