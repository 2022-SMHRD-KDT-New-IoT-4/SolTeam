////////////////////////////////////////데이터베이스 테이블 생성코드
//
//* DB멘토링 : 김광진
//
//팀명 : 솔팀
//팀원 : 이솔, 김경진, 류승주, 정윤한, 이인영, 이채영, 정인홍
//주제 :  센서-액츄에이터를 활용한 수업 중 학생과 강사간의 소통개선 도구
//일시 : 2023.1.17 오전 
//
//> 모델링 주소 
//URL : https://aquerytool.com/aquerymain/index/?rurl=48eeef7f-160b-44c4-901f-cabf827c1247&
//Password : aj214z
//
//
//● 객체지향프로그래밍(OOP, Object-Oriented Programming) : JAVA
//
// 객체란?
//. 세상에 존재하는 것(유무형) 
//. 사람/동물/사물/장소/노래/공연/예약/주문/배송/느낌/감정 등 지극히 개념적인 것.
//
//(1) 고유한 속성이 있는 것 
//(2) 타인도 알 수 있는 것 
//(3) 사전에 등록된 단어
//
//A : "우리 오늘 점심 때 라면 먹을래?"
//B : "응, 그래 좋아~!"
//
//         라면 --> 객체(o)
//"오뚜기진라면" --> 객체가 구현된 실체(instance)       
//---------------------------------------------------------------------
//
//* 고유한 속성을 자바언어에서 어떻게 표현하지?
//
//> Primitive Type
//
//정수형(4)
//. byte     ... 8 bit(작은수), 2^8=256 (-128~-1, 0~127)
//. short    ...16 bit(큰수)
//. int      ...32 bit(더큰수)
//. long     ...64 bit(엄청큰수)
//실수형(2)
//. float    ...32 bit
//. double   ...64 bit
//문자형(1)
//. char     ...16 bit 유니코드
//불린형(1)
//. boolean  ... 1 bit(True/False)ㄹㄹdddddlddsd
//
//*비트(bit, binary digit) : 컴퓨터에서 정보를 표시하기 위한 최소 단위(0,1)
//
//---------------------------------------------------------------------
//* 속성 + 기능까지 포함된 객체는 어떻게 다루지?  클래스
//
//(1) 사용자 정의 클래스(user-defined class) : Student 
//(2) 내장 클래스(built-in class) : ArrayList / String / Integer / Double / Random / Date / Calendar etc
//
//
//학생 : 이름/나이/학과  +  출석하다()/공부하다()/시험보다()
//      --------------     ------------------------------
//          (속성)                   (기능)
//
//public class Student {                           // 클래스 이름
//
//   private String name;                          // 속성:멤버필드:Property
//   private int age;
//
//   
//   public Student()                              // 생성자 1
//   {
//   
//   }
//   
//   public Student(String name, int age)          // 생성자 2
//   {
//      this.name = name;
//      this.age  = age;
//   }
//
//   public void setName(String name) {            // 기능:메소드:멤버함수:Operation  
//         this.name = name;
//   }
//      
//   public String getName() {
//         return this.name;
//   }  
//
//   public void setAge(int age) {
//         this.age = age;
//   }
//      
//   public int getAge() {
//         return this.age;
//   }
//      
//}          
//
//
//(0) 객체──┐
//(1) 고유 속성 --> Primitive Type (기초타입 8가지)
//(2) 속성+기능 --> Reference Type (클래스/추상클래스/인터페이스)
//
//---------------------------------------------------------------------
//> 추상 클래스(abstract class) :
//
//   (type)     (subtype)
//. 구기종목 : 축구/야구/농구/배구/탁구
//. 가전제품 : TV/냉장고/세탁기/전자렌지
//. 모양     : 세모/네모/동그라미/마름모/별모양
//. 색깔     : 빨강/노랑/파랑/초록/보라
//. 병       : 술병/물병/약병/꽃병
//
//class C extends A    (o)
//class C extends A, B (o) // 중복상속 금지
//---------------------------------------------------------------------
//> 인터페이스(interface) : 객체들 간에 자주 발생하는 동작이나 상태를 미리 정의해 놓은 것.
//
//   face <--> face
//        .talk()
//        .fight()
//
//public interface Human {
//
//   public void talk();
//   public void fight();
//
//}  
//
//public class Boy implements Human {
//
//   @Override // 재정의
//   public void talk()
//   {
//      System.out.println("Boy is talking...");
//   }
//   @Override
//   public void fight()
//   {
//      System.out.println("Boy is fighting..");
//   }
//}
//
//
//public void talk()  // 선언부(head)
//{
//   ....             // 구현부(body)
//}
//
//public interface ITV {
//
//   public void on();
//   public void off();
//   public void switchChannel(int channel);
//
//}
//
//
//Tom Crusso : "There is no new thing under the sun." (1923)
//
//
//int a = 10;
//Student s1 = new Student();
//
//Student.java --> Student.class --> JVM(Java Virtual Machine)-->Java Runtime Data Area 
//
//
//     [Stack Area].......................[Heap Area]
//        a=10                            new Student() : 0x3098523045923409dafe 
//        s1= 0x3098523045923409dafe
//
//-------------------------------------------------------------------------------
//Student s1 = new Student();  (o)
//Human   h1 = new Human();    (x)
//Boy     h1 = new Boy();      (o)
//Human   h1 = new Boy();      (o)
//
//ex) List list = new ArrayList();
//
//
//Student s1 = new Student("Tomson", 28);
//Student s2 = new Student("Jack",   25);
//Student s3 = new Student("Bill",   24);
//Student s4 = new Student("John",   26);
//Student s5 = new Student("Steve",  28);
//
//
//ArrayList<Student> list = new ArrayList<Student>();
//
//list.add(s1);
//list.add(s2);
//list.add(s3);
//list.add(s4);
//list.add(s5);
//
//list = {s1, s2, s3, s4, s5}
//
//
//for (int i = 0; i < list.size(); i++) {
//   Student s = list.get(i);
//   System.out.println(s.getName());
//}
//
//for (Student s : list)
//{
//   System.out.println(s.getName());
//}
//
//* ArrayList 사용 시 주의할 점 3가지 
//
//(i) ArrayList<T> list = new ArrayList<T>();   // 타입<T>을 지정하지 않으면, Object가 기본 타입으로 세팅됨.
//
//ArrayList list = new ArrayList();
//list.add("a");                                // "a"가 문자열로 들어가는 게 아니라, Object로 들어감.
//String s = (String) list.get(0);              // 형변환이 필요함.
//
//ArrayList<String> list = new ArrayList<String>();
//list.add("b");
//String s = list.get(0);                       // 형변환이 필요 없음.
//
//(ii) ArrayList<String> list = new ArrayList<>();  // 인정됨? 네.왜죠? 타입추론 
//
//(iii) ArrayList<int> list = new ArrayList<int>(); // int 같은 Primitive Type은 타입으로 쓸 수 없음.
//
//ArrayList<int> list = new ArrayList<int>();          (x)
//ArrayList<Integer> list = new ArrayList<Integer>();  (o) 
//list.add(new Integer(10));                        // boxing
//list.add(10);                                     // autoboxing
//
//int .... Integer 
//
//int a = 10;
//Integer num1 = new Integer(a);                // boxing 
//int     num2 = num1.intValue();               // unboxing 
//Integer num3 = a;                             // autoboxing 
//int     num4 = num3;                          // autounboxing 
//
//[Wrapper Class] : Primitive Type --> Reference Type으로 바꿔주는 클래스
//----------------------------------------------------------------------
//         기초타입(8) ... 참조형 클래스
//            byte    ...  Byte
//            short   ...  Short
//            int     ...  Integer *
//            long    ...  Long
//            float   ...  Float
//            double  ...  Double
//            char    ...  Character
//            boolean ...  Boolean 
//-----------------------------------------------------------------------
//* 근데, 인스턴스 개수가 엄청나게 많아지면 어떡할래? 데이터베이스!
//
//회원관리={회원1, 회원2, 회원3, 회원4, 회원5, ... } <--- 인스턴스 집합: 엔터티(entity)
//
//회원관리       MEMBER_INFO/ MEMBERS / T_MEMBER / TB_MEMBER / TBL_MEMBER
//---------------------------------------------------------------------
//회원 아이디    MB_ID VARCHAR2(20) NOT NULL
//회원 비밀번호  MB_PW VARCHAR2(20) NOT NULL
//회원 이름      MB_NAME VARCHAR2(40) NOT NULL 
//회원 이메일    MB_EMAIL VARCHAR(50) NOT NULL
//---------------------------------------------------------------------
//CREATE TABLE T_MEMBER (
//   MB_ID VARCHAR2(20) NOT NULL,
//   MB_PW VARCHAR2(20) NOT NULL,
//   MB_NAME VARCHAR2(40) NOT NULL,
//   MB_EMAIL VARCHAR(50) NOT NULL,
//   CONSTRAINT PK_MEMBER PRIMARY KEY(MB_ID)
//);
//
//CREATE TABLE T2(
//   ....
//   ....
//   ....
//);
//
//쌤! 제가 타이핑을 해서 테이블을 하나씩 만들고 있습니다.
//손가락이 욜라 아픕니다.
//좀 더 편한 방법이 업떠요? 이떠요! 그게 모죠? DB설계툴!:?!
//
//(1) https://www.erwin.com      (전세계 1위) <--'네카라쿠배당토직야'
//
//(2) https://www.erdcloud.com 
//
//(3) https://www.aquerytool.com (국산허접, but...)
//
//------------------------------------------------------------------------------------------
//> 생년월일을 VARCHAR2(8)로 해도 됨. VARCHAR2를 사용해도 
//정렬과 비교 기능이 가능함.
//
//20020410
//20050824
//20061216
//
//> 회원 구분 : CHAR(1)
//
//학생 : 'S'
//선생님 : 'T'
//관리자 : 'A'
//
//> 누가 ~을 했다.
//
//S(학생) + V(풀다/예약/주문/배송) + O(문제)
//
//
//욕설 백업 트리거 
//
//CREATE OR REPLACE TRIGGER TRG_BOARD_TB_DELETE
//BEFORE DELETE ON BOARD_TB
//REFERENCING NEW AS NEW FOR EACH ROW
//BEGIN
//    INSERT INTO board_tb_deleted (board_seq, board_title, board_content, board_file, board_dt, user_id, board_views, delete_time) 
//    VALUES (:OLD.board_seq, :OLD.board_title, :OLD.board_content, :OLD.board_file, :OLD.board_dt, :OLD.user_id, :OLD.board_views, SYSDATE);
//END;
//
//
//
//
//CREATE TABLE board_tb
//(
//    board_seq        NUMBER(12, 0)     NOT NULL, 
//    board_title      VARCHAR2(500)     NOT NULL, 
//    board_content    VARCHAR2(4000)    NOT NULL, 
//    board_file       VARCHAR2(500)     NOT NULL, 
//    board_dt         DATE              NOT NULL, 
//    user_id          VARCHAR2(20)      NOT NULL, 
//    board_views      NUMBER(12, 0)     NOT NULL, 
//     PRIMARY KEY (board_seq)
//);
//
//--주가의변화/전력사용량.판매량/글번호/악보 등 앞뒤 순서를 분명히 알 수 있는 데이터
//
//CREATE SEQUENCE board_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//(현재값) 0 : board_tb_SEQ.CURRVAL
//(다음값) 1 : board_tb_SEQ.NEXTVAL
//
//-- Auto Increment를 위한 Trigger 추가 SQL - board_tb.board_seq
//CREATE OR REPLACE TRIGGER board_tb_AI_TRG
//BEFORE INSERT ON board_tb -- 오라클 트리거는 DML(INSERT/UPDATE/DELETE)에만 사용 가능함. * SELECT 문에는 사용 못함!
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT board_tb_SEQ.NEXTVAL
//    INTO :NEW.board_seq
//    FROM DUAL;
//END;
//
//SELECT 3 + 2 FROM DUAL;
//SELECT SYSDATE FROM DUAL;
//SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;
//SELECT TO_CHAR(SYSDATE + 1, 'YYYY-MM-DD HH24:MI:SS') FROM DUAL;
//
//
//
//
//
//INSERT INTO board_tb (board_seq, board_title, board_content, board_file, board_dt, user_id, board_views) 
//VALUES (1, 'board_title 1', 'board_content 1', 'board_file 1', sysdate, 'user_id 1', 1);
//
//NEW.board_seq = 1
//NEW.board_title = 'board_title 1'
//
//
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 1', 'board_content 1', 'board_file 1', sysdate, 'user_id 1', 1);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 2', 'board_content 2', 'board_file 2', sysdate, 'user_id 2', 2);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 3', 'board_content 3', 'board_file 3', sysdate, 'user_id 3', 3);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 4', 'board_content 4', 'board_file 4', sysdate, 'user_id 4', 4);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 5', 'board_content 5', 'board_file 5', sysdate, 'user_id 5', 5);
//
//
//
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 1', 'board_content 1', 'board_file 1', sysdate, 'user_id 0001', 1);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('야~ 이 개쉐이야 ㅆㅂㄴㅇ~', 'board_content 2', 'board_file 2', sysdate, 'user_id 0002', 2);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 3', 'board_content 3', 'board_file 3', sysdate, 'user_id 0003', 3);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 4', 'board_content 4', 'board_file 4', sysdate, 'user_id 0004', 4);
//INSERT INTO board_tb (board_title, board_content, board_file, board_dt, user_id, board_views) VALUES ('board_title 5', 'board_content 5', 'board_file 5', sysdate, 'user_id 0005', 5);
//-- 테이블 Comment 설정 SQL - board_tb
//
//
//
//
//-- 테이블 생성 SQL - board_tb_deleted
//CREATE TABLE board_tb_deleted
//(
//    delete_seq       NUMBER(12, 0)     NOT NULL, 
//    board_seq        NUMBER(12, 0)     NOT NULL, 
//    board_title      VARCHAR2(500)     NOT NULL, 
//    board_content    VARCHAR2(4000)    NOT NULL, 
//    board_file       VARCHAR2(500)     NOT NULL, 
//    board_dt         DATE              NOT NULL, 
//    user_id          VARCHAR2(20)      NOT NULL, 
//    board_views      NUMBER(12, 0)     NOT NULL, 
//    delete_time      DATE              DEFAULT SYSDATE NOT NULL, 
//     PRIMARY KEY (delete_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - board_tb_deleted.delete_seq
//CREATE SEQUENCE board_tb_deleted_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - board_tb_deleted.delete_seq
//CREATE OR REPLACE TRIGGER board_tb_deleted_AI_TRG
//BEFORE INSERT ON board_tb_deleted 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT board_tb_deleted_SEQ.NEXTVAL
//    INTO :NEW.delete_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER board_tb_deleted_AI_TRG; 
//
//-- DROP SEQUENCE board_tb_deleted_SEQ; 
//
//-- 테이블 Comment 설정 SQL - board_tb_deleted
//COMMENT ON TABLE board_tb_deleted IS '게시판 백업';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.delete_seq
//COMMENT ON COLUMN board_tb_deleted.delete_seq IS '삭제 번호';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_seq
//COMMENT ON COLUMN board_tb_deleted.board_seq IS '글 순번';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_title
//COMMENT ON COLUMN board_tb_deleted.board_title IS '글 제목';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_content
//COMMENT ON COLUMN board_tb_deleted.board_content IS '글 내용';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_file
//COMMENT ON COLUMN board_tb_deleted.board_file IS '글 첨부파일';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_dt
//COMMENT ON COLUMN board_tb_deleted.board_dt IS '글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.user_id
//COMMENT ON COLUMN board_tb_deleted.user_id IS '글 작성자';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.board_views
//COMMENT ON COLUMN board_tb_deleted.board_views IS '글 조회수';
//
//-- 컬럼 Comment 설정 SQL - board_tb_deleted.delete_time
//COMMENT ON COLUMN board_tb_deleted.delete_time IS '글 삭제 시간';
//
//
//COMMENT ON TABLE board_tb IS '게시판';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_seq
//COMMENT ON COLUMN board_tb.board_seq IS '글 순번';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_title
//COMMENT ON COLUMN board_tb.board_title IS '글 제목';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_content
//COMMENT ON COLUMN board_tb.board_content IS '글 내용';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_file
//COMMENT ON COLUMN board_tb.board_file IS '글 첨부파일';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_dt
//COMMENT ON COLUMN board_tb.board_dt IS '글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.user_id
//COMMENT ON COLUMN board_tb.user_id IS '글 작성자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_views
//COMMENT ON COLUMN board_tb.board_views IS '글 조회수';
//
//-- Foreign Key 설정 SQL - board_tb(user_id) -> user_tb(user_id)
//ALTER TABLE board_tb
//    ADD CONSTRAINT FK_board_tb_user_id_user_tb_us FOREIGN KEY (user_id)
//        REFERENCES user_tb (user_id) ;
//
//CREATE OR REPLACE TRIGGER TRG_BOARD_TB_DELETE
//BEFORE DELETE ON BOARD_TB
//REFERENCING NEW AS NEW FOR EACH ROW
//BEGIN
//    INSERT INTO board_tb_deleted (board_seq, board_title, board_content, board_file, board_dt, user_id, board_views, delete_time) 
//    VALUES (:OLD.board_seq, :OLD.board_title, :OLD.board_content, :OLD.board_file, :OLD.board_dt, :OLD.user_id, :OLD.board_views, SYSDATE);
//END;
//
//DELETE FROM BOARD_TB WHERE BOARD_SEQ=4;
//
//------------------------------------------------
//(핵심 프로젝트 최종 SQL문)
//-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.
//
//-- user_tb Table Create SQL
//-- 테이블 생성 SQL - user_tb
//
//CREATE TABLE user_tb
//(
//    user_id           VARCHAR2(20)     NOT NULL, 
//    user_pw           VARCHAR2(20)     NOT NULL, 
//    user_name         VARCHAR2(30)     NOT NULL, 
//    user_joindate     DATE             NOT NULL, 
//    user_birthdate    VARCHAR2(8)      NOT NULL, 
//    user_point        NUMBER(12, 0)    NOT NULL, 
//    user_type         CHAR(1)          NOT NULL, 
//    serial_no         VARCHAR2(30)     NULL, 
//     PRIMARY KEY (user_id)
//);
//
//-- 테이블 Comment 설정 SQL - user_tb
//COMMENT ON TABLE user_tb IS '회원 정보';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_id
//COMMENT ON COLUMN user_tb.user_id IS '회원 아이디';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_pw
//COMMENT ON COLUMN user_tb.user_pw IS '회원 패스워드';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_name
//COMMENT ON COLUMN user_tb.user_name IS '회원 이름';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_joindate
//COMMENT ON COLUMN user_tb.user_joindate IS '회원 가입일자';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_birthdate
//COMMENT ON COLUMN user_tb.user_birthdate IS '회원 생년월일';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_point
//COMMENT ON COLUMN user_tb.user_point IS '회원 포인트';
//
//-- 컬럼 Comment 설정 SQL - user_tb.user_type
//COMMENT ON COLUMN user_tb.user_type IS '회원 유형';
//
//-- 컬럼 Comment 설정 SQL - user_tb.serial_no
//COMMENT ON COLUMN user_tb.serial_no IS '시리얼 넘버';
//
//
//-- shop_tb Table Create SQL
//-- 테이블 생성 SQL - shop_tb
//CREATE TABLE shop_tb
//(
//    shop_seq     NUMBER(12, 0)    NOT NULL, 
//    shop_name    VARCHAR2(50)     NOT NULL, 
//     PRIMARY KEY (shop_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - shop_tb.shop_seq
//CREATE SEQUENCE shop_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - shop_tb.shop_seq
//CREATE OR REPLACE TRIGGER shop_tb_AI_TRG
//BEFORE INSERT ON shop_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT shop_tb_SEQ.NEXTVAL
//    INTO :NEW.shop_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER shop_tb_AI_TRG; 
//
//-- DROP SEQUENCE shop_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - shop_tb
//COMMENT ON TABLE shop_tb IS '사이버 상점 정보';
//
//-- 컬럼 Comment 설정 SQL - shop_tb.shop_seq
//COMMENT ON COLUMN shop_tb.shop_seq IS '상점 순번';
//
//-- 컬럼 Comment 설정 SQL - shop_tb.shop_name
//COMMENT ON COLUMN shop_tb.shop_name IS '상점 이름';
//
//
//-- question_tb Table Create SQL
//-- 테이블 생성 SQL - question_tb
//CREATE TABLE question_tb
//(
//    q_seq        NUMBER(12, 0)     NOT NULL, 
//    q_title      VARCHAR2(500)     NOT NULL, 
//    q_content    VARCHAR2(4000)    NOT NULL, 
//    q_time       VARCHAR2(20)      NOT NULL, 
//    q_score      NUMBER(12, 0)     NOT NULL, 
//     PRIMARY KEY (q_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - question_tb.q_seq
//CREATE SEQUENCE question_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - question_tb.q_seq
//CREATE OR REPLACE TRIGGER question_tb_AI_TRG
//BEFORE INSERT ON question_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT question_tb_SEQ.NEXTVAL
//    INTO :NEW.q_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER question_tb_AI_TRG; 
//
//-- DROP SEQUENCE question_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - question_tb
//COMMENT ON TABLE question_tb IS '문제 정보';
//
//-- 컬럼 Comment 설정 SQL - question_tb.q_seq
//COMMENT ON COLUMN question_tb.q_seq IS '문제 순번';
//
//-- 컬럼 Comment 설정 SQL - question_tb.q_title
//COMMENT ON COLUMN question_tb.q_title IS '문제 제목';
//
//-- 컬럼 Comment 설정 SQL - question_tb.q_content
//COMMENT ON COLUMN question_tb.q_content IS '문제 내용';
//
//-- 컬럼 Comment 설정 SQL - question_tb.q_time
//COMMENT ON COLUMN question_tb.q_time IS '문제풀이시간';
//
//-- 컬럼 Comment 설정 SQL - question_tb.q_score
//COMMENT ON COLUMN question_tb.q_score IS '문제 점수';
//
//
//-- board_tb Table Create SQL
//-- 테이블 생성 SQL - board_tb
//CREATE TABLE board_tb
//(
//    board_seq        NUMBER(12, 0)     NOT NULL, 
//    board_title      VARCHAR2(500)     NOT NULL, 
//    board_content    VARCHAR2(4000)    NOT NULL, 
//    board_file       VARCHAR2(500)     NOT NULL, 
//    board_dt         DATE              NOT NULL, 
//    user_id          VARCHAR2(20)      NOT NULL, 
//    board_views      NUMBER(12, 0)     NOT NULL, 
//     PRIMARY KEY (board_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - board_tb.board_seq
//CREATE SEQUENCE board_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - board_tb.board_seq
//CREATE OR REPLACE TRIGGER board_tb_AI_TRG
//BEFORE INSERT ON board_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT board_tb_SEQ.NEXTVAL
//    INTO :NEW.board_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER board_tb_AI_TRG; 
//
//-- DROP SEQUENCE board_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - board_tb
//COMMENT ON TABLE board_tb IS '게시판 테이블';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_seq
//COMMENT ON COLUMN board_tb.board_seq IS '글 순번';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_title
//COMMENT ON COLUMN board_tb.board_title IS '글 제목';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_content
//COMMENT ON COLUMN board_tb.board_content IS '글 내용';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_file
//COMMENT ON COLUMN board_tb.board_file IS '글 첨부파일';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_dt
//COMMENT ON COLUMN board_tb.board_dt IS '글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.user_id
//COMMENT ON COLUMN board_tb.user_id IS '글 작성자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_views
//COMMENT ON COLUMN board_tb.board_views IS '글 조회수';
//
//-- Foreign Key 설정 SQL - board_tb(user_id) -> user_tb(user_id)
//ALTER TABLE board_tb
//    ADD CONSTRAINT FK_board_tb_user_id_user_tb_us FOREIGN KEY (user_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - board_tb(user_id)
//-- ALTER TABLE board_tb
//-- DROP CONSTRAINT FK_board_tb_user_id_user_tb_us;
//
//
//-- items_tb Table Create SQL
//-- 테이블 생성 SQL - items_tb
//CREATE TABLE items_tb
//(
//    item_seq      NUMBER(12, 0)    NOT NULL, 
//    item_name     VARCHAR2(50)     NOT NULL, 
//    item_price    NUMBER(12, 0)    NOT NULL, 
//    shop_seq      NUMBER(12, 0)    NOT NULL, 
//    item_pic1     VARCHAR2(500)    NULL, 
//    item_pic2     VARCHAR2(500)    NULL, 
//    item_pic3     VARCHAR2(500)    NULL, 
//     PRIMARY KEY (item_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - items_tb.item_seq
//CREATE SEQUENCE items_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - items_tb.item_seq
//CREATE OR REPLACE TRIGGER items_tb_AI_TRG
//BEFORE INSERT ON items_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT items_tb_SEQ.NEXTVAL
//    INTO :NEW.item_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER items_tb_AI_TRG; 
//
//-- DROP SEQUENCE items_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - items_tb
//COMMENT ON TABLE items_tb IS '아이템 정보';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_seq
//COMMENT ON COLUMN items_tb.item_seq IS '아이템 순번';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_name
//COMMENT ON COLUMN items_tb.item_name IS '아이템 이름';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_price
//COMMENT ON COLUMN items_tb.item_price IS '아이템 가격';
//
//-- 컬럼 Comment 설정 SQL - items_tb.shop_seq
//COMMENT ON COLUMN items_tb.shop_seq IS '상점 순번';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_pic1
//COMMENT ON COLUMN items_tb.item_pic1 IS '아이템 사진1';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_pic2
//COMMENT ON COLUMN items_tb.item_pic2 IS '아이템 사진2';
//
//-- 컬럼 Comment 설정 SQL - items_tb.item_pic3
//COMMENT ON COLUMN items_tb.item_pic3 IS '아이템 사진3';
//
//-- Foreign Key 설정 SQL - items_tb(shop_seq) -> shop_tb(shop_seq)
//ALTER TABLE items_tb
//    ADD CONSTRAINT FK_items_tb_shop_seq_shop_tb_s FOREIGN KEY (shop_seq)
//        REFERENCES shop_tb (shop_seq)  ;
//
//-- Foreign Key 삭제 SQL - items_tb(shop_seq)
//-- ALTER TABLE items_tb
//-- DROP CONSTRAINT FK_items_tb_shop_seq_shop_tb_s;
//
//
//-- levelcheck_db Table Create SQL
//-- 테이블 생성 SQL - levelcheck_db
//CREATE TABLE levelcheck_db
//(
//    click_seq       NUMBER(12, 0)    NOT NULL, 
//    std_id          VARCHAR2(20)     NOT NULL, 
//    red_click       CHAR(1)          NOT NULL, 
//    orange_click    CHAR(1)          NOT NULL, 
//    green_click     CHAR(1)          NOT NULL, 
//    q_seq           NUMBER(12, 0)    NOT NULL, 
//    click_time      DATE             NOT NULL, 
//     PRIMARY KEY (click_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - levelcheck_db.click_seq
//CREATE SEQUENCE levelcheck_db_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - levelcheck_db.click_seq
//CREATE OR REPLACE TRIGGER levelcheck_db_AI_TRG
//BEFORE INSERT ON levelcheck_db 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT levelcheck_db_SEQ.NEXTVAL
//    INTO :NEW.click_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER levelcheck_db_AI_TRG; 
//
//-- DROP SEQUENCE levelcheck_db_SEQ; 
//
//-- 테이블 Comment 설정 SQL - levelcheck_db
//COMMENT ON TABLE levelcheck_db IS '난이도 체크 테이블';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.click_seq
//COMMENT ON COLUMN levelcheck_db.click_seq IS '클릭 순번';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.std_id
//COMMENT ON COLUMN levelcheck_db.std_id IS '학생 아이디';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.red_click
//COMMENT ON COLUMN levelcheck_db.red_click IS '빨강 버튼 클릭';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.orange_click
//COMMENT ON COLUMN levelcheck_db.orange_click IS '주황 버튼 클릭';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.green_click
//COMMENT ON COLUMN levelcheck_db.green_click IS '녹색 버튼 클릭';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.q_seq
//COMMENT ON COLUMN levelcheck_db.q_seq IS '문제 순번';
//
//-- 컬럼 Comment 설정 SQL - levelcheck_db.click_time
//COMMENT ON COLUMN levelcheck_db.click_time IS '클릭 시간';
//
//-- Foreign Key 설정 SQL - levelcheck_db(std_id) -> user_tb(user_id)
//ALTER TABLE levelcheck_db
//    ADD CONSTRAINT FK_levelcheck_db_std_id_user_t FOREIGN KEY (std_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - levelcheck_db(std_id)
//-- ALTER TABLE levelcheck_db
//-- DROP CONSTRAINT FK_levelcheck_db_std_id_user_t;
//
//-- Foreign Key 설정 SQL - levelcheck_db(q_seq) -> question_tb(q_seq)
//ALTER TABLE levelcheck_db
//    ADD CONSTRAINT FK_levelcheck_db_q_seq_questio FOREIGN KEY (q_seq)
//        REFERENCES question_tb (q_seq)  ;
//
//-- Foreign Key 삭제 SQL - levelcheck_db(q_seq)
//-- ALTER TABLE levelcheck_db
//-- DROP CONSTRAINT FK_levelcheck_db_q_seq_questio;
//
//
//-- control_led_tb Table Create SQL
//-- 테이블 생성 SQL - control_led_tb
//CREATE TABLE control_led_tb
//(
//    control_seq    NUMBER(12, 0)    NOT NULL, 
//    red_led        CHAR(1)          NOT NULL, 
//    orange_led     CHAR(1)          NOT NULL, 
//    green_led      CHAR(1)          NOT NULL, 
//    student_id     VARCHAR2(20)     NOT NULL, 
//     PRIMARY KEY (control_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - control_led_tb.control_seq
//CREATE SEQUENCE control_led_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - control_led_tb.control_seq
//CREATE OR REPLACE TRIGGER control_led_tb_AI_TRG
//BEFORE INSERT ON control_led_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT control_led_tb_SEQ.NEXTVAL
//    INTO :NEW.control_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER control_led_tb_AI_TRG; 
//
//-- DROP SEQUENCE control_led_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - control_led_tb
//COMMENT ON TABLE control_led_tb IS '학생 LED 점등 현황';
//
//-- 컬럼 Comment 설정 SQL - control_led_tb.control_seq
//COMMENT ON COLUMN control_led_tb.control_seq IS '점등 순번';
//
//-- 컬럼 Comment 설정 SQL - control_led_tb.red_led
//COMMENT ON COLUMN control_led_tb.red_led IS '빨강 LED';
//
//-- 컬럼 Comment 설정 SQL - control_led_tb.orange_led
//COMMENT ON COLUMN control_led_tb.orange_led IS '주황 LED';
//
//-- 컬럼 Comment 설정 SQL - control_led_tb.green_led
//COMMENT ON COLUMN control_led_tb.green_led IS '녹색 LED';
//
//-- 컬럼 Comment 설정 SQL - control_led_tb.student_id
//COMMENT ON COLUMN control_led_tb.student_id IS '학생 아이디';
//
//-- Foreign Key 설정 SQL - control_led_tb(student_id) -> user_tb(user_id)
//ALTER TABLE control_led_tb
//    ADD CONSTRAINT FK_control_led_tb_student_id_u FOREIGN KEY (student_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - control_led_tb(student_id)
//-- ALTER TABLE control_led_tb
//-- DROP CONSTRAINT FK_control_led_tb_student_id_u;
//
//
//-- comment_tb Table Create SQL
//-- 테이블 생성 SQL - comment_tb
//CREATE TABLE comment_tb
//(
//    cmt_seq        NUMBER(12, 0)     NOT NULL, 
//    board_seq      NUMBER(12, 0)     NOT NULL, 
//    cmt_content    VARCHAR2(4000)    NOT NULL, 
//    cmt_dt         DATE              NOT NULL, 
//    user_id        VARCHAR2(20)      NOT NULL, 
//     PRIMARY KEY (cmt_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - comment_tb.cmt_seq
//CREATE SEQUENCE comment_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - comment_tb.cmt_seq
//CREATE OR REPLACE TRIGGER comment_tb_AI_TRG
//BEFORE INSERT ON comment_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT comment_tb_SEQ.NEXTVAL
//    INTO :NEW.cmt_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER comment_tb_AI_TRG; 
//
//-- DROP SEQUENCE comment_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - comment_tb
//COMMENT ON TABLE comment_tb IS '댓글';
//
//-- 컬럼 Comment 설정 SQL - comment_tb.cmt_seq
//COMMENT ON COLUMN comment_tb.cmt_seq IS '댓글 순번';
//
//-- 컬럼 Comment 설정 SQL - comment_tb.board_seq
//COMMENT ON COLUMN comment_tb.board_seq IS '원글 순번';
//
//-- 컬럼 Comment 설정 SQL - comment_tb.cmt_content
//COMMENT ON COLUMN comment_tb.cmt_content IS '댓글 내용';
//
//-- 컬럼 Comment 설정 SQL - comment_tb.cmt_dt
//COMMENT ON COLUMN comment_tb.cmt_dt IS '댓글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - comment_tb.user_id
//COMMENT ON COLUMN comment_tb.user_id IS '댓글 작성자';
//
//-- Foreign Key 설정 SQL - comment_tb(board_seq) -> board_tb(board_seq)
//ALTER TABLE comment_tb
//    ADD CONSTRAINT FK_comment_tb_board_seq_board_ FOREIGN KEY (board_seq)
//        REFERENCES board_tb (board_seq)  ;
//
//-- Foreign Key 삭제 SQL - comment_tb(board_seq)
//-- ALTER TABLE comment_tb
//-- DROP CONSTRAINT FK_comment_tb_board_seq_board_;
//
//-- Foreign Key 설정 SQL - comment_tb(user_id) -> user_tb(user_id)
//ALTER TABLE comment_tb
//    ADD CONSTRAINT FK_comment_tb_user_id_user_tb_ FOREIGN KEY (user_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - comment_tb(user_id)
//-- ALTER TABLE comment_tb
//-- DROP CONSTRAINT FK_comment_tb_user_id_user_tb_;
//
//
//-- test_tb Table Create SQL
//-- 테이블 생성 SQL - test_tb
//CREATE TABLE test_tb
//(
//    test_seq      NUMBER(12, 0)    NOT NULL, 
//    student_id    VARCHAR2(20)     NOT NULL, 
//    q_seq         NUMBER(12, 0)    NOT NULL, 
//    test_time     DATE             NOT NULL, 
//    test_score    NUMBER(12, 0)    NOT NULL, 
//     PRIMARY KEY (test_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - test_tb.test_seq
//CREATE SEQUENCE test_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - test_tb.test_seq
//CREATE OR REPLACE TRIGGER test_tb_AI_TRG
//BEFORE INSERT ON test_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT test_tb_SEQ.NEXTVAL
//    INTO :NEW.test_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER test_tb_AI_TRG; 
//
//-- DROP SEQUENCE test_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - test_tb
//COMMENT ON TABLE test_tb IS '문제 풀이';
//
//-- 컬럼 Comment 설정 SQL - test_tb.test_seq
//COMMENT ON COLUMN test_tb.test_seq IS '문제풀이 순번';
//
//-- 컬럼 Comment 설정 SQL - test_tb.student_id
//COMMENT ON COLUMN test_tb.student_id IS '학생 아이디';
//
//-- 컬럼 Comment 설정 SQL - test_tb.q_seq
//COMMENT ON COLUMN test_tb.q_seq IS '문제 순번';
//
//-- 컬럼 Comment 설정 SQL - test_tb.test_time
//COMMENT ON COLUMN test_tb.test_time IS '완료 시간';
//
//-- 컬럼 Comment 설정 SQL - test_tb.test_score
//COMMENT ON COLUMN test_tb.test_score IS '획득 점수';
//
//-- Foreign Key 설정 SQL - test_tb(q_seq) -> question_tb(q_seq)
//ALTER TABLE test_tb
//    ADD CONSTRAINT FK_test_tb_q_seq_question_tb_q FOREIGN KEY (q_seq)
//        REFERENCES question_tb (q_seq)  ;
//
//-- Foreign Key 삭제 SQL - test_tb(q_seq)
//-- ALTER TABLE test_tb
//-- DROP CONSTRAINT FK_test_tb_q_seq_question_tb_q;
//
//-- Foreign Key 설정 SQL - test_tb(student_id) -> user_tb(user_id)
//ALTER TABLE test_tb
//    ADD CONSTRAINT FK_test_tb_student_id_user_tb_ FOREIGN KEY (student_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - test_tb(student_id)
//-- ALTER TABLE test_tb
//-- DROP CONSTRAINT FK_test_tb_student_id_user_tb_;
//
//
//-- purchase_tb Table Create SQL
//-- 테이블 생성 SQL - purchase_tb
//CREATE TABLE purchase_tb
//(
//    purchase_seq    NUMBER(12, 0)    NOT NULL, 
//    student_id      VARCHAR2(20)     NOT NULL, 
//    item_seq        NUMBER(12, 0)    NOT NULL, 
//    purchase_cnt    NUMBER(12, 0)    NOT NULL, 
//    total_amount    NUMBER(12, 0)    NOT NULL, 
//    purchase_dt     DATE             NOT NULL, 
//     PRIMARY KEY (purchase_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - purchase_tb.purchase_seq
//CREATE SEQUENCE purchase_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - purchase_tb.purchase_seq
//CREATE OR REPLACE TRIGGER purchase_tb_AI_TRG
//BEFORE INSERT ON purchase_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT purchase_tb_SEQ.NEXTVAL
//    INTO :NEW.purchase_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER purchase_tb_AI_TRG; 
//
//-- DROP SEQUENCE purchase_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - purchase_tb
//COMMENT ON TABLE purchase_tb IS '아이템 구매';
//
//-- 컬럼 Comment 설정 SQL - purchase_tb.purchase_seq
//COMMENT ON COLUMN purchase_tb.purchase_seq IS '구매 순번';
//
//-- 컬럼 Comment 설정 SQL - purchase_tb.student_id
//COMMENT ON COLUMN purchase_tb.student_id IS '학생 아이디';
//
//-- 컬럼 Comment 설정 SQL - purchase_tb.item_seq
//COMMENT ON COLUMN purchase_tb.item_seq IS '아이템 순번';
//
//-- 컬럼 Comment 설정 SQL - purchase_tb.purchase_cnt
//COMMENT ON COLUMN purchase_tb.purchase_cnt IS '구매 수량';
//
//CREATE OR REPLACE TRIGGER purchase_tb_AI_TRG
//BEFORE INSERT ON purchase_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT purchase_tb_SEQ.NEXTVAL
//    INTO :NEW.purchase_seq
//    FROM DUAL;
//END;
//-- 컬럼 Comment 설정 SQL - purchase_tb.total_amount
//COMMENT ON COLUMN purchase_tb.total_amount IS '합계 금액';
//
//-- 컬럼 Comment 설정 SQL - purchase_tb.purchase_dt
//COMMENT ON COLUMN purchase_tb.purchase_dt IS '구매 일자';
//
//-- Foreign Key 설정 SQL - purchase_tb(student_id) -> user_tb(user_id)
//ALTER TABLE purchase_tb
//    ADD CONSTRAINT FK_purchase_tb_student_id_user FOREIGN KEY (student_id)
//        REFERENCES user_tb (user_id)  ;
//
//-- Foreign Key 삭제 SQL - purchase_tb(student_id)
//-- ALTER TABLE purchase_tb
//-- DROP CONSTRAINT FK_purchase_tb_student_id_user;
//
//-- Foreign Key 설정 SQL - purchase_tb(item_seq) -> items_tb(item_seq)
//ALTER TABLE purchase_tb
//    ADD CONSTRAINT FK_purchase_tb_item_seq_items_ FOREIGN KEY (item_seq)
//        REFERENCES items_tb (item_seq)  ;
//
//-- Foreign Key 삭제 SQL - purchase_tb(item_seq)
//-- ALTER TABLE purchase_tb
//-- DROP CONSTRAINT FK_purchase_tb_item_seq_items_;
//
//
//1 : 0/1/N  <--------Numerous 수많은
//
//회원={회원1, 회원2, 회원3, 회원4, 회원5....} <--- 인스턴스 집합: 엔터티(Entity)
//
//속성들의 집합 : Entity 
//
//
//* 엔터티란
//. 2개 이상의 인스턴스의 집합
//. 2개 이상의 속성의 모음
//. 데이터베이스에 저장될 대상
//
//
//개념설계 : 회원/게시판/LED점등 저장될 대상이 확정됨 
//논리설계 : 속성을 정하는 단계
//물리설계 : 컬럼명/데이터타입.길이/제약조건/외래키 지정
//
//(문제) 다음 중 데이터베이스 설계 순서로 올바른 것은? 개.눈.물
//
//요구사항 분석 > 개념설계 > 논리설계 > 물리설계 > 데이터베이스 구현
//
//ERD
//ER-Diagram
//Entity Relationship Diagram 
//
//VO(Value Object)=DTO(Data Transfer Object)=Java Model=Java Bean=POJO(Plain Old Java Object)
//--------------------------------------------------------------------------------------------                          
//꼭 외울 것!
//
//-- 테이블 생성 SQL - board_tb
//CREATE TABLE board_tb
//(
//    board_seq        NUMBER(12, 0)     NOT NULL, 
//    board_title      VARCHAR2(500)     NOT NULL, 
//    board_content    VARCHAR2(4000)    NOT NULL, 
//    board_file       VARCHAR2(500)     NOT NULL, 
//    board_dt         DATE              NOT NULL, 
//    user_id          VARCHAR2(20)      NOT NULL, 
//    board_views      NUMBER(12, 0)     NOT NULL, 
//     PRIMARY KEY (board_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - board_tb.board_seq
//CREATE SEQUENCE board_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - board_tb.board_seq
//CREATE OR REPLACE TRIGGER board_tb_AI_TRG
//BEFORE INSERT ON board_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT board_tb_SEQ.NEXTVAL
//    INTO :NEW.board_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER board_tb_AI_TRG; 
//
//-- DROP SEQUENCE board_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - board_tb
//COMMENT ON TABLE board_tb IS '게시판';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_seq
//COMMENT ON COLUMN board_tb.board_seq IS '글 순번';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_title
//COMMENT ON COLUMN board_tb.board_title IS '글 제목';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_content
//COMMENT ON COLUMN board_tb.board_content IS '글 내용';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_file
//COMMENT ON COLUMN board_tb.board_file IS '글 첨부파일';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_dt
//COMMENT ON COLUMN board_tb.board_dt IS '글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.user_id
//COMMENT ON COLUMN board_tb.user_id IS '글 작성자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_views
//COMMENT ON COLUMN board_tb.board_views IS '글 조회수';
//
//-- Foreign Key 설정 SQL - board_tb(user_id) -> user_tb(user_id)
//ALTER TABLE board_tb
//    ADD CONSTRAINT FK_board_tb_user_id_user_tb_us FOREIGN KEY (user_id)
//        REFERENCES user_tb (user_id) ON DELETE RESTRICT ;
//
//-- Foreign Key 삭제 SQL - board_tb(user_id)
//-- ALTER TABLE board_tb
//-- DROP CONSTRAINT FK_board_tb_user_id_user_tb_us;
//
//-- 테이블 생성 SQL - board_tb
//CREATE TABLE board_tb
//(
//    board_seq        NUMBER(12, 0)     NOT NULL, 
//    board_title      VARCHAR2(500)     NOT NULL, 
//    board_content    VARCHAR2(4000)    NOT NULL, 
//    board_file       VARCHAR2(500)     NOT NULL, 
//    board_dt         DATE              NOT NULL, 
//    user_id          VARCHAR2(20)      NOT NULL, 
//    board_views      NUMBER(12, 0)     NOT NULL, 
//     PRIMARY KEY (board_seq)
//);
//
//-- Auto Increment를 위한 Sequence 추가 SQL - board_tb.board_seq
//CREATE SEQUENCE board_tb_SEQ
//START WITH 1
//INCREMENT BY 1;
//
//-- Auto Increment를 위한 Trigger 추가 SQL - board_tb.board_seq
//CREATE OR REPLACE TRIGGER board_tb_AI_TRG
//BEFORE INSERT ON board_tb 
//REFERENCING NEW AS NEW FOR EACH ROW 
//BEGIN 
//    SELECT board_tb_SEQ.NEXTVAL
//    INTO :NEW.board_seq
//    FROM DUAL;
//END;
//
//-- DROP TRIGGER board_tb_AI_TRG; 
//
//-- DROP SEQUENCE board_tb_SEQ; 
//
//-- 테이블 Comment 설정 SQL - board_tb
//COMMENT ON TABLE board_tb IS '게시판';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_seq
//COMMENT ON COLUMN board_tb.board_seq IS '글 순번';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_title
//COMMENT ON COLUMN board_tb.board_title IS '글 제목';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_content
//COMMENT ON COLUMN board_tb.board_content IS '글 내용';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_file
//COMMENT ON COLUMN board_tb.board_file IS '글 첨부파일';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_dt
//COMMENT ON COLUMN board_tb.board_dt IS '글 작성일자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.user_id
//COMMENT ON COLUMN board_tb.user_id IS '글 작성자';
//
//-- 컬럼 Comment 설정 SQL - board_tb.board_views
//COMMENT ON COLUMN board_tb.board_views IS '글 조회수';
//
//-- Foreign Key 설정 SQL - board_tb(user_id) -> user_tb(user_id)
//ALTER TABLE board_tb
//    ADD CONSTRAINT FK_board_tb_user_id_user_tb_us FOREIGN KEY (user_id)
//        REFERENCES user_tb (user_id) ON DELETE RESTRICT ;
//
//-- Foreign Key 삭제 SQL - board_tb(user_id)
//-- ALTER TABLE board_tb
//-- DROP CONSTRAINT FK_board_tb_user_id_user_tb_us;
