package com.salesforce;

public class AuthorApp {

	public static void main(String[] args) {
		int count = 0;
		AuthorDao dao = new AuthorDaoImpl();
		AuthorVO vo = new AuthorVO(1,"홍길동","홍길동");
		count = dao.insert(vo);
	  System.out.println("AuthorApp.dao.insert(vo) 결과 --> " + count);
	}

}
