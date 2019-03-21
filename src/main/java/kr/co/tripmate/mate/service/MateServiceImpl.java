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
	public List<MateVO> selectMateList(String writer) throws Exception {

		return mateDAO.selectMateList(writer); 
		
	}

	@Override
	public void deleteMateInfo(int mate_no) throws Exception {

		mateDAO.deleteMateInfo(mate_no);
		
	}

}
