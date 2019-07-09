package com.lzcy.baseframework.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzcy.baseframework.entity.User;
import com.lzcy.baseframework.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("测试接口")
@RestController("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @ApiOperation(value="查询用户列表",notes="获取所有用户")
    @GetMapping("/selectAllUser")
    public Object selectUserName(){
        PageHelper.startPage(1,5);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectAll());

        return pageInfo;
    }
}
