package myspring.di.strategy1.service;

import java.util.List;

import myspring.di.strategy1.dao.UserDao;
import myspring.user.vo.UserVO;

public class UserServiceImpl implements UserService {

	UserDao userdao;	

	public List<UserVO> getUserList() {
		return userdao.readAll();
	}

	@Override
	public UserVO getUser(int index) {
		return userdao.read(index);
	}

}
