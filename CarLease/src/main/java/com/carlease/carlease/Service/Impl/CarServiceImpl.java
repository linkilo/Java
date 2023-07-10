package com.carlease.carlease.Service.Impl;
import com.carlease.carlease.Service.CarService;
import com.carlease.carlease.Utils.AliOSSUtils;
import com.carlease.carlease.mapper.CarMapper;
import com.carlease.carlease.pojo.Cars;
import com.carlease.carlease.pojo.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * 车辆功能接口实现类
 */
@Slf4j
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private AliOSSUtils aliOSSUtils;
    @Override
    public PageBean GetCars(Integer page, Integer pageSize, String name, String vehicleType) {
        PageHelper.startPage(page,pageSize);

        Page<Cars> carsPage=(Page<Cars>)carMapper.GetCars(name, vehicleType);

        return new PageBean(carsPage.getTotal(),carsPage.getResult());
    }

    @Override
    public Cars getCarById(Integer id) {
        return carMapper.getCarById(id);
    }

    @Override
    public void insert(Cars cars) {

        carMapper.insert(cars.getId(),cars.getUrl(),cars.getMsg(), cars.getName(), cars.getVehicleType());
    }

    @Override
    public void delete(List<Integer> ids) {
        carMapper.delete(ids);
    }

    @Override
    public void update(Cars cars) {
        carMapper.update(cars.getId(), cars.getName(), cars.getVehicleType(), cars.getMsg());
    }
}
