package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * liangbingtian 2019/3/7 上午11:10
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

}
