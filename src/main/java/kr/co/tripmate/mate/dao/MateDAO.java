package kr.co.tripmate.mate.dao;

import java.util.List;

import kr.co.tripmate.mate.vo.MateVO;

public interface MateDAO {

	public List<MateVO> selectMateList(String writer) throws Exception;

	public void deleteMateInfo(int mate_no) throws Exception;
	
}
