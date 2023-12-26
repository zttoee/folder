package com.salesforce;

public class AuthorApp {

	public static void main(String[] args) {
		int count = 0;
		AuthorDao dao = new AuthorDaoImpl();
		AuthorVO vo = new AuthorVO(1,"전두광","캐릭터");
		
		System.out.println("AuthorApp.vo --> " + vo);
		
		count = dao.insert(vo);
	  System.out.println("AuthorApp.dao.insert(vo) 결과 --> " + count);
	}

}
