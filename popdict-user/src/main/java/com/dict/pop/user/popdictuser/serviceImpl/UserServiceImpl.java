/**
 * copyright (c), 2015-2018, xxx有限公司
 * filename: userserviceimpl
 * author:   lin
 * date:     2018/9/28 16:08
 * description: 登录烦烦烦
 * history:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dict.pop.user.popdictuser.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dict.pop.common.popdictcommon.bean.User;
import com.dict.pop.common.popdictcommon.jiekou.UserService;
import com.dict.pop.user.popdictuser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * 〈登录烦烦烦〉
 *
 * @author lin
 *  2018/9/28
 * @since 1.0.0
 */
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
        user.setPrikey("933977723");
        try {

            flag = userMapper.insertUsers(user);
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
