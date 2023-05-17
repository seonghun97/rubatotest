package com.rubato.home.dao;

import java.util.List;

import com.rubato.home.dto.RfboardDto;

public interface IDao {
	
	public int boardWriteDao(String bname, String btitle, String bcontent, String buserid, int filecount);
	public List<RfboardDto> boardListDao(); //게시판 모든글 리스트
	public int boardTotalCountDao(); //게시판 총 게시글 개수
}
