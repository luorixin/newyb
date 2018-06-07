package com.yiban.erp.dao;

import com.yiban.erp.dto.CurrentBalanceResp;
import com.yiban.erp.dto.RepertorySelectQuery;
import com.yiban.erp.entities.RepertoryInfo;
import com.yiban.erp.dto.RepertoryQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface RepertoryInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RepertoryInfo record);

    int insertBatch(@Param("list") List<RepertoryInfo> infoList);

    RepertoryInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RepertoryInfo record);

    List<RepertoryInfo> getListByIdList(@Param("idList") List<Long> repertoryIdList);

    List<String> getGoodNameWithLessQuantity(Long sellOrderId);

    Integer  queryRepertoryCount(RepertoryQuery repertoryQuery);

    List<RepertoryInfo> queryRepertoryPage(RepertoryQuery repertoryQuery);



    //获取当前仓库中某一类商品的存量
    List<CurrentBalanceResp> getBalance(@Param("warehouseId") Integer warehouseId, @Param("goodsIdList") List<Long> goodsIdList);
    //获取某一商品最近一次的采购价
    List<CurrentBalanceResp> getLastBuyPrice(@Param("warehouseId") Integer warehouseId, @Param("goodsIdList") List<Long> goodsIdList);

    Integer querySelectCount( RepertorySelectQuery query); //选择存库商品列表的查询项

    List<RepertoryInfo> querySelectList(RepertorySelectQuery query);

    //一次性统计当前在单数量
    int updateOnWayQuantity(@Param("id") Long id);

    //减库存
    int sellOrderConsumeQuantity(@Param("sellOrderId") Long sellOrderId,
                                 @Param("updateBy") String updateBy,
                                 @Param("updateTime") Date updateTime);

    int buyBackConsumeQuantity(@Param("inBackId") Long inBackId,
                               @Param("updateBy") String updateBy,
                               @Param("updateTime") Date updateTime);

    int buyBackReleaseOnWayQuantity(@Param("inBackId") Long inBackId); //释放锁定的在单数量

    int sellOrderReleaseOnWayQuantity(@Param("sellOrderId") Long sellOrderId); //释放锁定的销售在单数量

    /**
     * 根据关联类型和关联单号，查询对应关联订单的明细
     * @param query
     * @return
     */
    List<RepertoryInfo> getListByRefOrder(RepertorySelectQuery query);
}