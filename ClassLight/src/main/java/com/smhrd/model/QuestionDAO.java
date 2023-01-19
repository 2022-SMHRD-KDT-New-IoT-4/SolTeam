package com.smhrd.model;

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
		row = sqlSession.insert("com.smhrd.model.QuestionDAO.mQuestion", dto);
		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 3) sqlsession 자원 반납
			sqlSession.close();
			
		}
		// 4) 결과값 반환
		return row;
		
	}

}
