package zbl.study.service.impl;

import org.springframework.stereotype.Service;
import zbl.study.dubbo.interfaces.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "dubbo test data from provider";
    }
}
