package kr.co.tripmate.mate.service;

import java.util.List;

import kr.co.tripmate.mate.vo.MateVO;

public interface MateService {

	public List<MateVO> selectMateList(String writer) throws Exception;
	
	public void deleteMateInfo(int mate_no) throws Exception;
	
}
