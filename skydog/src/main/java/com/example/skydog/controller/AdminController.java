package com.example.skydog.controller;

import com.example.skydog.module.entity.Admin;
import com.example.skydog.module.entity.Scale;
import com.example.skydog.module.entity.User;
import com.example.skydog.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
@Api(tags = "管理员控制器")
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    @GetMapping("/add")
    @ApiOperation("添加管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "admin", value = "管理员", dataType = "Admin"),
    })
    public Admin add(@RequestBody Admin admin) {
        adminService.add(admin);
        return admin;
    }
    /*
     * 删除管理员
     * */
    @GetMapping("/delete/{adminId}")
    @ApiOperation("删除管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员id", dataType = "Int"),
    })
    public Object delete(@PathVariable Integer adminId) {
        adminService.delete(adminId);
        return true;
    }
    /*
   修改管理员信息
    */
    @GetMapping("/update")
    @ApiOperation("修改管理员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "admin", value = "管理员", dataType = "Admin"),
    })
    public Admin update(@RequestBody Admin admin) {
        adminService.update(admin);
        return admin;
    }
    /*
  按id查询
   */
    @GetMapping("/queryById/{adminId}")
    @ApiOperation("id查询管理员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "adminId", value = "管理员id", dataType = "Int"),
    })
    public Admin queryById(@PathVariable Integer adminId) {
        Admin admin =adminService.queryId(adminId);
        return admin;
    }

    /**
     * 登入模块
     * @param adminAcc,adminPwd
     * @return
     */
    @PostMapping("/login/{adminAcc} &&{adminPwd}")

    public Admin login(@PathVariable String adminAcc,@PathVariable String adminPwd) {
//        ResultVO resultVO = new ResultVO();
//        resultVO.ResultVOa();
        return adminService.login( adminAcc,adminPwd);
    }

}
