package com.imooc.order.converter;

import com.alibaba.fastjson.JSON;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dto.OrderDTO;
import com.imooc.order.enums.ResultEnum;
import com.imooc.order.exception.OrderException;
import com.imooc.order.form.OrderForm;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * liangbingtian 2019/3/7 下午4:56
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

  public static OrderDTO convert(OrderForm orderForm) {
    OrderDTO orderDTO = new OrderDTO();
    orderDTO.setBuyerName(orderForm.getName());
    orderDTO.setBuyerPhone(orderForm.getPhone());
    orderDTO.setBuyerAddress(orderForm.getAddress());
    orderDTO.setBuyerOpenid(orderForm.getOpenid());
    List<OrderDetail> orderDetailList = new ArrayList<>();
    try {
      orderDetailList
          = JSON.parseArray(orderForm.getItems(), OrderDetail.class);
    }catch (Exception e){
      log.error("【json转换】错误,string = {}", orderForm.getItems());
      throw new OrderException(ResultEnum.PARAM_ERROR);
    }
    orderDTO.setOrderDetailList(orderDetailList);
    return orderDTO;
  }

}
