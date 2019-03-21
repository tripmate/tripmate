package kr.co.tripmate.user.dao;

import java.util.List;

import kr.co.tripmate.user.vo.UserVO;

public interface UserMapper {

	public List<UserVO> selectUserList(String name) throws Exception;
	
}
