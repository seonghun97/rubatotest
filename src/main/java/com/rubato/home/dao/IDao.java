package com.rubato.home.dao;

import java.util.List;

import com.rubato.home.dto.FileDto;
import com.rubato.home.dto.RReplyDto;
import com.rubato.home.dto.RfboardDto;

public interface IDao {
	//게시판 기본 기능
	public int boardWriteDao(String bname, String btitle, String bcontent, String buserid, int filecount);
	public List<RfboardDto> boardListDao(); //게시판 모든글 리스트
	public int boardTotalCountDao(); //게시판 총 게시글 개수
	public RfboardDto boardContentViewDao(String bnum);//클릭한 글의 내용 보기
	public void boardHitDao(String bnum); //조회수 증가
	public void boardDeleteDao(String bnum); //글삭제
	
	
	//게시판 검색 기능
	public List<RfboardDto> boardSearchTitleDao(String keyword);//게시판 제목에서 검색
	public List<RfboardDto> boardSearchContentDao(String keyword);//게시판 내용에서 검색
	public List<RfboardDto> boardSearchWriterDao(String keyword);//게시판 작성자에게서 검색
	
	//댓글 기능
	public int replyWriteDao(String rcontent, String rorinum); //댓글 입력
	public void replyCountDao(String rorinum); //댓글이 달린 원글이 댓글 필드 값 +1
	public List<RReplyDto> replyListDao(String rorinum); //해당 원글에 달린 댓글의 리스트 가져오기
	public void replyDeleteDao(String rnum); //댓글삭제
	public void replyCountMinusDao(String roinum); // 댓글이 달린 원글의 댓글 필드값 -1
	
	//파일 첨부 관련기능
	public void fileInfoCreateDao(int forinum, String fileoriname, String filename ,String fileextension, String fileurl);
	public FileDto getFileInfoDao(String forinum);// 파일이 첨부된 글의 번호로 검색하여 파일정보 가져오기
}
