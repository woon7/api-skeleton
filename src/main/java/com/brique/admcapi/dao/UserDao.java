package com.brique.admcapi.dao;

import com.brique.admcapi.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    public UserDto selectUser(String id);

    public List<String> selectRole(String username);

    public int insertUser(Map<String, Object> map);

    public int insertRole(Map<String, Object> map);
}
