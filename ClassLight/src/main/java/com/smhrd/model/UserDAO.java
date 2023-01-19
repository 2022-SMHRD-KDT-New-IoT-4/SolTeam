package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class UserDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
    // join
	public int join(UserDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.smhrd.model.UserDAO.join", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
	
    // login
	public UserDTO login(UserDTO dto) {
		UserDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.UserDAO.login", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
    // researchId
	public UserDTO researchId(UserDTO dto) {
		UserDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.UserDAO.researchId", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
    // researchPw
	public UserDTO researchPw(UserDTO dto) {
		UserDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.UserDAO.researchPw", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}

}
