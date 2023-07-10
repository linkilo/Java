package com.carlease.carlease.Service;

import com.carlease.carlease.pojo.Cars;
import com.carlease.carlease.pojo.PageBean;

import java.util.List;

/**
 * 车辆功能接口类
 */
public interface CarService {
    PageBean GetCars(Integer page, Integer pageSize, String name, String vehicleType);

    Cars getCarById(Integer id);

    void insert(Cars cars);

    void delete(List<Integer> ids);

    void update(Cars cars);
}
