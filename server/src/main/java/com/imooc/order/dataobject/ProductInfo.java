package com.imooc.order.dataobject;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 * liangbingtian 2019/3/8 下午4:32
 */
@Data
@Entity
public class ProductInfo {

  @Id
  private String productId;

  private String productName;

  // 商品单价
  private BigDecimal productPrice;

  // 商品库存
  private String productStock;

  // 商品描述
  private String productDescription;

  // 小图
  private String productIcon;

  // 商品状态 0-正常，1-下架
  private Integer productStatus;

  // 类目编号
  private Integer categoryType;

  private Date createTime;

  private Date updateTime;

}
