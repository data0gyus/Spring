package org.scoula.board.mapper;

import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardVO;

import java.util.List;

public interface BoardMapper {

    // 게시글 목록 조회 (어노테이션 방식)
//    @Select("SELECT * FROM tbl_board ORDER BY no DESC")
    public List<BoardVO> getList();

    // 단일 게시글 조회
    public BoardVO get(Long no);

    // 게시글 등록
    public void create(BoardVO board);

    // 게시글 수정
    public int update(BoardVO board);

    // 게시글 삭제
    public int delete(Long no);
}
