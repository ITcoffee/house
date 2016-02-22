package com.zhouyun.search.house.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhouyun.search.house.dao.UserDao;
import com.zhouyun.search.house.model.User;
import com.zhouyun.search.house.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

}
