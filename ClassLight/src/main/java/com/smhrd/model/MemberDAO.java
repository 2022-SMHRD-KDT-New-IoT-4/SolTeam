package com.smhrd.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MemberDAO {
private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	
	public int join(MemberDTO dto) {
		int row = 0;
		// sqlSession 열기
		SqlSession session = sqlSessionFactory.openSession(true);
		// try catch사용하여 listener refused 오류 잡기
		try {
		// session 사용해서 insert
		row = session.insert("com.smhrd.model.MessageDAO.join", dto);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		// 자원반납
		session.close();
		}
		// 결과값 반납
		return row;
	}
	
	public MemberDTO login(MemberDTO dto) {
		MemberDTO resultDto = null;
		// sqlsesion 열어주기
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
		// session 사용해서 select 실행하기
		// data 돌려주기 --> 무조건 select문만!
		resultDto = sqlSession.selectOne("com.smhrd.model.MemberDAO.login", dto);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 자원반납
			sqlSession.close();
		}
		// 결과값 반환
		return resultDto;
	}
	
	public int update(MemberDTO dto) {
		int row = 0;
		// sqlsession 열어주기
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
		// session 사용해서 update실행하기
		row = session.update("com.smhrd.model.MemberDAO.update", dto);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 자원반납
			session.close();
		}
		// 결과값 반환
		return row;
		
	}
	

	public List<MemberDTO> selectAll() {
		// 반환할 데이터(리스트)
		List<MemberDTO> list = null;
		// sqlsesion 열어주기
		SqlSession session = sqlSessionFactory.openSession(true);
		try {
		// session 사용해서 select 실행하기
			// Mapper 파일에 가져가야 하는 데이터 있을 시 매개변수 2개, 없을 시 1개
			list =  session.selectList("com.smhrd.model.MemberDAO.selectAll");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 자원반납
			session.close();
		}
		// 결과값 반환
		return list;
	}
}
