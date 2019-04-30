package com.imooc.order.dto;

import com.imooc.order.dataobject.OrderDetail;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

/**
 * liangbingtian 2019/3/7 下午2:19
 */
@Data
public class OrderDTO {

  private String orderId;

  /** 买家名字 */
  private String buyerName;

  /** 买家手机号 */
  private String buyerPhone;

  /** 买家地址 */
  private String buyerAddress;

  /** 买家微信openid */
  private String buyerOpenid;

  /** 订单总金额 */
  private BigDecimal orderAmount;

  /** 订单状态,默认为0新下单 */
  private Integer orderStatus;

  /** 支付状态,默认为0未支付 */
  private Integer payStatus;


  private List<OrderDetail> orderDetailList;

}
