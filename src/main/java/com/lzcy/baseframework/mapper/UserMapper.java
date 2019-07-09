package com.lzcy.baseframework.mapper;

import com.lzcy.baseframework.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

}
