package com.imooc.order.dto;

import lombok.Data;

/**
 * liangbingtian 2019/3/10 下午2:47
 */
@Data
public class CartDTO {

  /**
   * 商品id
   */
  private String productId;

  /**
   * 商品数量
   */
  private Integer productQuantity;

  public CartDTO() {
  }

  public CartDTO(String productId, Integer productQuantity) {
    this.productId = productId;
    this.productQuantity = productQuantity;
  }
}
