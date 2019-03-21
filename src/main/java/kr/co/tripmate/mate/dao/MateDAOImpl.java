package kr.co.tripmate.mate.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.tripmate.mate.vo.MateVO;

@Repository
public class MateDAOImpl implements MateDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "kr.co.tripmate.mate.mapper.MateMapper";

	@Override
	public List<MateVO> selectMateList() throws Exception {
		
		return sqlSession.selectList(namespace + ".selectMateList");
		
	}

	@Override
	public MateVO selectMateInfo(int mate_no) throws Exception {

		return sqlSession.selectOne(namespace + ".selectMateInfo", mate_no);
		
	}
	
	@Override
	public void insertMateInfo(MateVO mateVO) throws Exception {

		sqlSession.insert(namespace + ".insertMateInfo", mateVO);
		
	}
	
	@Override
	public void updateMateInfo(MateVO mateVO) throws Exception {
		
		sqlSession.update(namespace + ".updateMateInfo", mateVO);
		
	}
	
	@Override
	public void deleteMateInfo(int mate_no) throws Exception {

		sqlSession.delete(namespace + ".deleteMateInfo", mate_no);
		
	}

}
