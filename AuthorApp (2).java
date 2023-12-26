package com.salesforce;

import java.util.ArrayList;
import java.util.List;

import jdbcEx.AuthorVo;

public class AuthorApp {

	public static void main(String[] args) {
		
		int count = 0;
		AuthorDao dao = new AuthorDaoImpl();
		List<AuthorVO> list = new ArrayList<AuthorVO>();
		
//		// 새로운 데이터 입력
//		AuthorVO vo = new AuthorVO(1,"전두광","캐릭터");
//		count = dao.insert(vo);
//	  
//	  // 기존 데이터 수정
//		AuthorVO vo2 = new AuthorVO(28,"전두광","모티브 : 전두환");
//		dao.update(vo2);
		
	  // 기존 데이터 삭제
//		Long author_id = new Long(28);
//		dao.delete(author_id);
		
	  // 전체 데이터 조회
		list = dao.getList();
		//System.out.print( "전체 데이터 건수 : " + count);
		
		for(AuthorVO vo : list) {
      System.out.println(vo);
    }
		System.out.print( "전체 데이터 건수 : " + list.size());
	  
	}

}
