package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.smhrd.db.SqlSessionManager;

public class OnOffDAO {

	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	//온오프 값 확인
	
	public int OnOffDTOSelect() {
		int row = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.OnOffDAO.OnOffDTOSelect");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	//온오프 수정
	public int OnOffUpdate(OnOffDTO dto) {
		int row = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.update("com.smhrd.model.OnOffDAO.OnOffUpdate",dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
}
