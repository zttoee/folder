package com.salesforce;

public interface AuthorDao {
	public int insert(AuthorVO vo);
	public void getList();
	public int delete(Long authorId);
	public int update(AuthorVO vo);
}
