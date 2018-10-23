/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   lin
 * Date:     2018/9/29 15:14
 * Description: ff
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dict.pop.controller.popdictcontroller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dict.pop.common.popdictcommon.jiekou.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ff〉
 *
 * @author lin
 * @create 2018/9/29
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/register")
    public boolean register(String name, String password) {
        // 登录鉴权
        boolean flag = userService.register(name, password);
        System.out.println("smsmsmsmsmsm!!!"+flag);
        return flag;
    }
}
