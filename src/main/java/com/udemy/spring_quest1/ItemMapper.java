package com.udemy.spring_quest1;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemMapper {

    int create(@Param("item") Item item);

    int update(@Param("item") Item item);

    Item read(@Param("id") int id);

    int delete(@Param("id") int id);
}
