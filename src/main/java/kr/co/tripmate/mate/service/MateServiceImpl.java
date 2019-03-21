package kr.co.tripmate.mate.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.tripmate.mate.dao.MateDAO;
import kr.co.tripmate.mate.vo.MateVO;

@Service
public class MateServiceImpl implements MateService {

	private static final Logger logger = LoggerFactory.getLogger(MateServiceImpl.class);
	
	@Inject
	private MateDAO mateDAO;
	
	@Override
	public List<MateVO> selectMateList() throws Exception {

		return mateDAO.selectMateList(); 
		
	}
	
	@Override
	public MateVO selectMateInfo(int mate_no) throws Exception {

		return mateDAO.selectMateInfo(mate_no);
		
	}
	
	@Override
	public void insertMateInfo(MateVO mateVO) throws Exception {

		mateDAO.insertMateInfo(mateVO);
		
	}
	
	@Override
	public void updateMateInfo(MateVO mateVO) throws Exception {

		mateDAO.updateMateInfo(mateVO);
		
	}

	@Override
	public void deleteMateInfo(int mate_no) throws Exception {

		mateDAO.deleteMateInfo(mate_no);
		
	}

}
