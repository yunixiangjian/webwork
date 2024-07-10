package com.ityc.controller;

import com.ityc.pojo.Emp;
import com.ityc.pojo.PageBean;
import com.ityc.pojo.Result;
import com.ityc.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       @RequestParam(defaultValue = "")  String name,
                       @RequestParam(defaultValue = "")  Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("分页查询, 参数：{},{},{},{},{},{}", page, pageSize, name, gender, begin, end);

        PageBean pageBean = empService.page(page,pageSize,name, gender, begin, end);
        return Result.success(pageBean);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID查询员工信息, id: {}",id);
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("批量删除操作, ids:{}",ids);
        empService.delete(ids);
        return Result.success();
    }

    @PostMapping()
    public Result save(@RequestBody Emp emp){
        log.info("新增员工, emp:{}",emp);
        empService.save(emp);
        return Result.success();
    }

    @PutMapping()
    public Result update(@RequestBody Emp emp){
        log.info("更新员工信息: {}",emp);
        empService.update(emp);
        return Result.success();
    }
}
