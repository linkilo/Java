package com.carlease.carlease.Service;

import com.carlease.carlease.pojo.Emp;
import com.carlease.carlease.pojo.PageBean;

import java.util.List;

public interface EmpService {
    Emp getEmpByNameAndPassword(Emp emp);

    PageBean getEmp(Integer page, Integer pageSize, String name, Integer id);

    void insert(Emp emp);

    boolean delete(List<Integer> ids);

    Emp getEmpById(Integer id);

    boolean update(Emp emp);
}
