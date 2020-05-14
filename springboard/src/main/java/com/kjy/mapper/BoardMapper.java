package com.kjy.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

import com.kjy.domain.BoardVO;

public interface BoardMapper {

//		@Select("select * from tbl_board where bno > 0")
		public List<BoardVO> getList();
		
		public void insert(BoardVO board);
		
		public void insertSelectKey(BoardVO board);
		
		public BoardVO read(Long bno);
		
		public int delete(Long bno);
		//error가 날 시에는 int bno
		
		public int update(BoardVO board);
}
