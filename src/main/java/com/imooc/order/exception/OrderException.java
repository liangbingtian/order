package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * liangbingtian 2019/3/7 下午3:17 订单方面的业务异常
 */
public class OrderException extends RuntimeException {

  private Integer code;

  public OrderException(Integer code, String message) {
    super(message);
    this.code = code;
  }

  public OrderException(ResultEnum resultEnum){
    super(resultEnum.getMessage());
    this.code = resultEnum.getCode();
  }


}
