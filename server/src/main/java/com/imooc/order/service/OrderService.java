package com.imooc.order.service;

import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;

/**
 * liangbingtian 2019/3/7 下午2:17
 */
public interface OrderService {

  /**
   * 创建订单
   * @param orderDTO
   * @return
   */
   OrderDTO create(OrderDTO orderDTO);

}
