package com.nhga.zhibanserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nhga.zhibanserver.entity.Zhiban;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ZhibanMapper extends BaseMapper<Zhiban> {
//    @Select("select content from Zhiban where date(intime) = curdate()")
//    List<String> findCurrentZhiban();

    int addZhiban(Zhiban zhiban);
    int updZhiban(Zhiban zhiban);

    List<Zhiban> getZhiban();
}
