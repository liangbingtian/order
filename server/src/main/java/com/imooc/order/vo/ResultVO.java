package com.imooc.order.vo;

import lombok.Data;

/**
 * liangbingtian 2019/3/7 下午7:08
 */
@Data
public class ResultVO<T> {

  private Integer code;

  private String message;

  private T data;

}
