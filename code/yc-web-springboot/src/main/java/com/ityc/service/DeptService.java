package com.ityc.service;

import com.ityc.pojo.Dept;

import java.util.List;

public interface DeptService {
    /*查询全部部门数据*/
    List<Dept> list();
    /*删除部门*/
    void delete(Integer id);
    /*新增部门*/
    void add(Dept dept);
    /*查询部门*/
    Dept get(Integer id);
    /*修改部门数据*/
    void update(Dept dept);

}
