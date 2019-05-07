package org.spring.cloud.eureka.client.user.provider.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper<Model,ModelExample,PK> {
	int countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(PK id);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(PK id);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}
