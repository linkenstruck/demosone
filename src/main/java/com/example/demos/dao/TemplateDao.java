package com.example.demos.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @param <E>
 * @author 丁松
 *
 */

@Repository
@Mapper
public interface TemplateDao<E>{
    void insert(E e)throws SQLException;
    void update(@Param("id")int id, @Param("e") Map<String,Object> map)throws SQLException;
    void delete(int id)throws SQLException;
    E select(@Param("column") String column,@Param("value")Object value)throws SQLException;
    List<E> selectAll(@Param("orderByColumn")String orderBy)throws SQLException;
}
