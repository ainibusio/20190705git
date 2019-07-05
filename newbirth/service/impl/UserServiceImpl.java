package cn.beyond.newbirth.service.impl;

import cn.beyond.newbirth.domain.User;
import cn.beyond.newbirth.mapper.UserMapper;
import cn.beyond.newbirth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public User selectById(Long id) {
        return userMapper.selectByPriMaryKey(id);

    }
}
