package com.daidai.dao;

import com.daidai.entity.FundsFlow;
import org.apache.ibatis.annotations.Param;

public interface FundsFlowMapper {

  int deleteByPrimaryKey(Long id);

  int insert(FundsFlow record);

  int insertSelective(FundsFlow record);

  FundsFlow selectByPrimaryKey(Long id);

  int updateByPrimaryKeySelective(FundsFlow record);

  int updateByPrimaryKey(FundsFlow record);

  /**
   * 根据流水类型和申请ID查询一条记录
   * @param type {@link com.daidai.enums.FundsFlowTypeEnum}
   * @param applyId 申请ID
   * @return
   */
  FundsFlow selectByTypeAndApplyId(@Param("type") Integer type,@Param("applyId") Long applyId);
}