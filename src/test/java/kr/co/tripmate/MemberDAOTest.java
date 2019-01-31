package kr.co.tripmate;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.tripmate.domain.MemberVO;
import kr.co.tripmate.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	//@Test
	public void testTime() throws Exception {
		
		System.out.println(dao.getTime());
		
	}
	
	//@Test
	public void testInsertMember() throws Exception {
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user02");
		vo.setUserpw("user02");
		vo.setUsername("USER02");
		vo.setEmail("user02@aaa.com");
		
		dao.insertMember(vo);
		
	}
	
	@Test
	public void testSelectMember() throws Exception {
		
		System.out.println(dao.readMember("user02"));
		
	}
	
	//@Test
	public void testReadMemberWithPW() throws Exception {
	
		System.out.println(dao.readWithPW("user02", "user02"));
		
	}
	
}
