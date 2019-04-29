package com.imooc.order.repository;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderDetail;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * liangbingtian 2019/3/7 下午1:38
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

  @Autowired
  private OrderDetailRepository orderDetailRepository;

  @Test
  public void testSave() {
    OrderDetail orderDetail = new OrderDetail();
    orderDetail.setDetailId("123567");
    orderDetail.setOrderId("123456");
    orderDetail.setProductIcon("http://xxx.com");
    orderDetail.setProductName("皮蛋粥");
    orderDetail.setProductId("157875196366160022");
    orderDetail.setProductPrice(new BigDecimal("2.12"));
    orderDetail.setProductQuantity(2);

    OrderDetail result = orderDetailRepository.save(orderDetail);
    Assert.assertNotNull(result);

  }

}
