package org.spring.cloud.eureka.client.user.provider.service.face;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring.cloud.eureka.client.user.provider.dao.mapper.BaseMapper;

public interface BaseService<Model,ModelExample,PK> {
	
	BaseMapper<Model,ModelExample,PK> getMapper();
	
	int countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int deleteByPrimaryKey(PK id);

    int insertSelective(Model record);

    List<Model> selectByExample(ModelExample example);

    Model selectByPrimaryKey(PK id);

    int updateByExampleSelective( Model record, ModelExample example);

    int updateByExample( Model record,  ModelExample example);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
	

}
