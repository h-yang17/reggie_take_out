package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
/**
 * 因为继承了BaseMapper，所以常见的增删改查方法都已经有了
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

}
