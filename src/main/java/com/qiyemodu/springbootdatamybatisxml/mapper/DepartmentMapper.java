package com.qiyemodu.springbootdatamybatisxml.mapper;

import com.qiyemodu.springbootdatamybatisxml.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@Mapper
public interface DepartmentMapper {

    public Department getDepartment(Integer id);
}
