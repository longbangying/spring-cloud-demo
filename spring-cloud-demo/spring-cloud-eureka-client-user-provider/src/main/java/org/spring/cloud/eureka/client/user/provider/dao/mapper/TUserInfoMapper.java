package org.spring.cloud.eureka.client.user.provider.dao.mapper;

import java.util.List;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserInfo;
import org.spring.cloud.eureka.client.user.provider.dao.model.TUserInfoExample;

public interface TUserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TUserInfo record);

    int insertSelective(TUserInfo record);

    List<TUserInfo> selectByExample(TUserInfoExample example);

    TUserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUserInfo record);

    int updateByPrimaryKey(TUserInfo record);
}