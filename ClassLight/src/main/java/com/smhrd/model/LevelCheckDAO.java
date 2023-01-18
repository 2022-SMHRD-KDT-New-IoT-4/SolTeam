package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class LevelCheckDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	// 학생 난이도 체크 조회 기능 
	
	public List<LevelCheckDTO> selectAll() {

		List<LevelCheckDTO> list = null;

		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			list = sqlSession.selectList("com.smhrd.model.LevelCheckDAO.selectAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return list;
	}

}
