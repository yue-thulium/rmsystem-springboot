package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Rm;
import com.wuyue.rmsystem.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RmMapper {
    Rm loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);
    int saveNewRm(String name,String username,String password,String role);
}
