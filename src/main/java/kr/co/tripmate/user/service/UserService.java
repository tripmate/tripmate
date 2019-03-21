package kr.co.tripmate.user.service;

import java.util.List;

import kr.co.tripmate.user.vo.UserVO;

public interface UserService {

	public List<UserVO> selectUserList(String name) throws Exception;
	
}
