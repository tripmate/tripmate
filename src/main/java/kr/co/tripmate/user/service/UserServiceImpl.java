package kr.co.tripmate.user.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.tripmate.user.dao.UserMapper;
import kr.co.tripmate.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Inject
	private UserMapper userMapper;
	
	@Override
	public List<UserVO> selectUserList(String name) throws Exception {
		
		return userMapper.selectUserList(name);
		
	}

}
