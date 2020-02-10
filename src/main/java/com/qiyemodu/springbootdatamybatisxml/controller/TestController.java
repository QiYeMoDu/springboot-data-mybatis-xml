package com.qiyemodu.springbootdatamybatisxml.controller;

import com.qiyemodu.springbootdatamybatisxml.bean.Department;
import com.qiyemodu.springbootdatamybatisxml.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@RestController
public class TestController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/de/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartment(id);
    }
}
