package com.dict.pop.user.popdictuser.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dict.pop.common.popdictcommon.bean.User;
import com.dict.pop.common.popdictcommon.jiekou.UserService;
import com.dict.pop.user.popdictuser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean register(String name, String password) {
        boolean flag;
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setPrikey("930999999");
        try {
            flag = userMapper.insertUsers(user);
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
