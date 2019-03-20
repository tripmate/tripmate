package kr.co.tripmate.user.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.tripmate.user.vo.UserVO;

@Repository
public class UserMapperImpl implements UserMapper {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "kr.co.tripmate.user.mapper.UserMapper";

	@Override
	public List<UserVO> selectUserList(String name) throws Exception {
		return sqlSession.selectList(namespace + ".selectUserList", name);
	}

}
