package org.spring.cloud.eureka.client.user.provider.service.impl;

import java.util.List;

import org.spring.cloud.eureka.client.user.provider.service.face.BaseService;

public abstract class BaseServiceImpl<Model, ModelExample, PK> implements BaseService<Model, ModelExample, PK> {

	

	@Override
	public int countByExample(ModelExample example) {
		
		return getMapper().countByExample(example);
	}

	@Override
	public int deleteByExample(ModelExample example) {
		return getMapper().deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(PK id) {
		return getMapper().deleteByPrimaryKey(id);
	}

	

	@Override
	public int insertSelective(Model record) {
		return getMapper().insertSelective(record);
	}

	@Override
	public List<Model> selectByExample(ModelExample example) {
		return getMapper().selectByExample(example);
	}

	@Override
	public Model selectByPrimaryKey(PK id) {
		return getMapper().selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Model record, ModelExample example) {
		return getMapper().updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Model record, ModelExample example) {
		return getMapper().updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Model record) {
		return getMapper().updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Model record) {
		return getMapper().updateByPrimaryKey(record);
	}

}
