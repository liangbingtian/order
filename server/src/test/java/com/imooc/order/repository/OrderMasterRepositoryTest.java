package com.imooc.order.repository;

import static org.junit.Assert.*;

import com.imooc.order.OrderApplicationTests;
import com.imooc.order.dataobject.OrderMaster;
import com.imooc.order.enums.OrderStatusEnum;
import com.imooc.order.enums.PayStatusEnum;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * liangbingtian 2019/3/7 上午11:12
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

  @Autowired
  private OrderMasterRepository orderMasterRepository;

  @Test
  public void testSave(){
    OrderMaster orderMaster = new OrderMaster();
    orderMaster.setOrderId("1234567");
    orderMaster.setBuyerAddress("天津静海");
    orderMaster.setBuyerName("梁炳田");
    orderMaster.setBuyerOpenid("112211");
    orderMaster.setBuyerPhone("13772111430");
    orderMaster.setOrderAmount(new BigDecimal(2.5));
    orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
    orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
    OrderMaster result = orderMasterRepository.save(orderMaster);
    Assert.assertNotNull(result);
  }

}
