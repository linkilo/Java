package com.carlease.carlease.Controller;

import com.carlease.carlease.Anno.Log;
import com.carlease.carlease.Service.CarService;
import com.carlease.carlease.pojo.Cars;
import com.carlease.carlease.pojo.PageBean;
import com.carlease.carlease.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 车辆管理类
 * GET:查询
 * POST：新增
 * PUT：修改
 * DELETE：删除
 */
@Slf4j
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    /**
     * 分页条件查询车辆
     * @return List<Cars>
     */

    @GetMapping
    public Result GetCars(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer pageSize,
                          String name, String vehicleType){
        log.info("查询车辆:{},{}",name,vehicleType);
        PageBean pageBean =carService.GetCars(page,pageSize,name,vehicleType);
        log.info("查询成功");
        return new Result().success(pageBean);
    }

    /**
     * 根据id查询车辆
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result GetCarById(@PathVariable Integer id){
        log.info("查询车辆id：{}",id);
        Cars car=carService.getCarById(id);
        return new Result().success(car);
    }

    /**
     * 新增车辆
     * @param cars
     * @return Result
     */
    @Log
    @PostMapping
    public Result insert(@RequestBody Cars cars){
        log.info("新增车辆：{}",cars);
        carService.insert(cars);
        return new Result().success();
    }

    /**
     * 通过id批量删除车辆
     * @param ids
     * @return
     */
    @Log
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("删除车辆：{}",ids);
        carService.delete(ids);
        return new Result().success();
    }

    /**
     * 修改车辆信息
     * @param cars
     * @return
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Cars cars){
        log.info("修改车辆信息：{}",cars);
        carService.update(cars);
        return new Result().success();
    }
}
