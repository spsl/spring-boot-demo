package com.lalala.dao.master;

import com.lalala.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lwxzbh on 2017/7/20.
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> selectUserByName(String name);
}
