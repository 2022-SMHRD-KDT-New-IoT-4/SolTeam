package com.smhrd.model;

import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;
import com.smhrd.model.UserDTO;

public class UserDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
    // join
	public int joinTeacher(UserDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.smhrd.model.UserDAO.joinTeacher", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return row;
	}
	// join
	public int joinStudent(UserDTO dto) {
		int row = 0;
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
			row = session.insert("com.smhrd.model.UserDAO.joinStudent", dto);
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
			row = sqlSession.selectOne("com.smhrd.model.UserDAO.researchId", dto);
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
			row = sqlSession.selectOne("com.smhrd.model.UserDAO.researchPw", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
	// InfoStudent
	public List<UserDTO> SelectStudent(UserDTO dto) {
		List<UserDTO> list = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			list = sqlSession.selectList("com.smhrd.model.UserDAO.SelectStudent", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return list;
	}

}
