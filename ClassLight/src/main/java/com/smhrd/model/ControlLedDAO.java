package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class ControlLedDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	
	
	//시리얼넘버를 사용하여 현재 led의 값을 확인
	public LedCountDTO LedSelect(LedCountDTO dto) {
		LedCountDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.LedSelect", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
	//아두이노 버튼 값 
	public int LedUpdate(LedCountDTO dto) {
		int row = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.update("com.smhrd.model.ControlLedDAO.LedUpdate", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
   
	
   
}
