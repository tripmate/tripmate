package kr.co.tripmate.mate.service;

import java.util.List;

import kr.co.tripmate.mate.vo.MateVO;

public interface MateService {

	public List<MateVO> selectMateList() throws Exception;
	
	public MateVO selectMateInfo(int mate_no) throws Exception;
	
	public void insertMateInfo(MateVO mateVO) throws Exception;
	
	public void updateMateInfo(MateVO mateVO) throws Exception;
	
	public void deleteMateInfo(int mate_no) throws Exception;

	
}
