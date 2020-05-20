package com.fyk.mapper;

import com.fyk.model.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select(" select * from t_book tb, t_book_type tbt where tb.book_type = tbt.id")
    List<Book> selectBookList();

    @Delete(" delete from t_book where book_id = #{id} ")
    void deleteBook(Integer id);
}
