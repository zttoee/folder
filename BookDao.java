package com.salesforce;

import java.util.List;

public interface BookDao {
  public List<BookVo> getList();
  public boolean insert(BookVo vo);
  public boolean update(BookVo vo);
  public boolean delete(Long bookId);
	public List<BookVo> findKeyword(String keyword);
}
