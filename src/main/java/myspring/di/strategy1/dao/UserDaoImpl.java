package myspring.di.strategy1.dao;

import java.util.Arrays;
import java.util.List;

import myspring.user.vo.UserVO;

public class UserDaoImpl implements UserDao {
	List<UserVO> userList;
	
	public UserDaoImpl() {
		userList = Arrays.asList(
				new UserVO(1L,"gildong", "홍길동", "남", "마곡"),
				new UserVO(2L,"dooly", "둘리", "남", "마곡나루"));
	}
	
	@Override
	public UserVO read(int index) {
		return userList.get(index);
	}

	@Override
	public List<UserVO> readAll() {		
		return userList;
	}	


}
