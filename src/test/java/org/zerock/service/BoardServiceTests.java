package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_= {@Autowired})
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}
//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새 글입니다.");
//		board.setContent("아무렇게나 일단 적으~");
//		board.setWriter("지아코");
//		
//		log.info(service.register(board));
//		
//		log.info("생성된 게시물의 번호: " + board.getBno());
//	}
	@Test
	public void testGetList() {
//		service.getList().forEach(board->log.info(board));
		service.getList(new Criteria(2,10)).forEach(board->log.info(board));
	}
//	@Test
//	public void testGet() {
//		log.info(service.get(23L));
//	}
//	@Test
//	public void testDelete() {
//		log.info("REMOVE RESULT: " + service.remove(21L));
//	}
//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(25L);
//		
//		if(board == null) {
//			return;
//		}
//		board.setWriter("geunhyeong0421");
//		log.info("MODIFY RESULT: " + service.modify(board));
//	}
	

}
