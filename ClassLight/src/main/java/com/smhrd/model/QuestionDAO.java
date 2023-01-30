package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class QuestionDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int make_q(QuestionDTO dto) {
		int row = 0;
		// 1) sqlsession 열어주기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		try {
		// 2) session사용해서 insert진행
		row = sqlSession.insert("com.smhrd.model.QuestionDAO.makeQuestion", dto);
		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 3) sqlsession 자원 반납
			sqlSession.close();
		}
		// 4) 결과값 반환
		return row;
		
	}
    
	
	// 문제 시간 불러오기 
	public List<QuestionDTO> time() {
		List<QuestionDTO> timeList = null;
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			timeList = sqlSession.selectList("com.smhrd.model.QuestionDAO.time");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return timeList;
		
	}




}
