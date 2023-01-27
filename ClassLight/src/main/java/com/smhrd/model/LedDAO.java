package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class LedDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	// 시리얼넘버를 사용하여 현재 led의 값을 확인
	public LedDTO LedSelect(LedDTO dto) {
		LedDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.LedDAO.LedSelect", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}

	// 아두이노 버튼 값
	public int LedUpdate(LedDTO dto) {
		int row = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.update("com.smhrd.model.DAO.LedUpdate", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}

}
