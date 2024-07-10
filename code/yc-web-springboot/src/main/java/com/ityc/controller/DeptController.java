package com.ityc.controller;

import com.ityc.pojo.Dept;
import com.ityc.pojo.Result;
import com.ityc.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

//    private static Logger log= LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

//    @RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping()
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping()
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable Integer id){
        log.info("根据id查询部门：{}",id);
        Dept deptget = deptService.get(id);
        return Result.success(deptget);
    }

    @PutMapping()
    public Result update( @RequestBody Dept dept){
        log.info("修改部门信息 : {}",dept);
        deptService.update(dept);
        return Result.success(dept);
    }
}
