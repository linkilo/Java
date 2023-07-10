package com.carlease.carlease.Service.Impl;

import com.carlease.carlease.Service.EmpService;
import com.carlease.carlease.mapper.EmpMapper;
import com.carlease.carlease.pojo.Emp;
import com.carlease.carlease.pojo.PageBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public Emp getEmpByNameAndPassword(Emp emp) {
        return empMapper.getEmpByNameAndPassword(emp.getName(),emp.getPassword());
    }


    @Override
    public PageBean getEmp(Integer page, Integer pageSize, String name, Integer id) {
        PageHelper.startPage(page,pageSize);

        Page<Emp> empPage=(Page<Emp>)empMapper.getEmps(name,id);

        return new PageBean(empPage.getTotal(),empPage.getResult());
    }

    @Override
    public void insert(Emp emp) {
        empMapper.insert(emp.getName(),emp.getUrl(),emp.getSex(),emp.getUsername(),emp.getPassword());
    }

    @Override
    public boolean delete(List<Integer> ids) {
        Integer b=empMapper.delete(ids);
        return b==1;
    }

    @Override
    public Emp getEmpById(Integer id) {
        return empMapper.getEmpById(id);
    }

    @Override
    public boolean update(Emp emp) {
        return empMapper.update(emp.getId(), emp.getName(), emp.getPassword(), emp.getUsername(), emp.getSex());
    }
}
