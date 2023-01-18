package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class ControlLedDAO {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
    // student_id
	public ControlLedDTO studentId(ControlLedDTO dto) {
		ControlLedDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.studentId", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
    // control_seq
	public ControlLedDTO controlSeq(ControlLedDTO dto) {
		ControlLedDTO row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.controlSeq", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
    // red_led
	public String redLed(ControlLedDTO dto) {
		String row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.redLed", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	
    // orange_led
	public String orangeLed(ControlLedDTO dto) {
		String row = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.orangeLed", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return row;
	}
	// green_led
		public String greenLed(ControlLedDTO dto) {
			String row = null;
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			try {
				row = sqlSession.selectOne("com.smhrd.model.ControlLedDAO.greenLed", dto);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sqlSession.close();
			}
			return row;
		}
}
