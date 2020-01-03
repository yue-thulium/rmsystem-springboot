package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.model.Rm;
import com.wuyue.rmsystem.mapper.RmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RmService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    RmMapper rmMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Rm rm = rmMapper.loadUserByUsername(username);
        if (rm == null) {
            throw new UsernameNotFoundException("账户不存在！");
        }
        rm.setRoles(rmMapper.getUserRolesByUid(rm.getId()));
        return rm;
    }

    /**
     * 注册用类
     * 当前为测试方法，实装时应修改传递参数
     * @param rm
     * @param role
     * @return
     */
    public Rm addRm(Rm rm,String role) {
        if (rm.getUsername() != null && rm.getPassword() != null){
            rm.setPassword(passwordEncoder.encode(rm.getPassword()));
            int i = rmMapper.saveNewRm(rm.getName(),rm.getUsername(),rm.getPassword(),role);
        }
        return rm;
    }
}
