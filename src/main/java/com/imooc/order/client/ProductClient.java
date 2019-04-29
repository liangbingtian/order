package com.imooc.order.client;

import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * liangbingtian 2019/3/8 下午2:56
 */
@FeignClient(name = "product")
public interface ProductClient {

  @GetMapping("/getMessage")
  String productMsg();

  @PostMapping("/product/listForOrder")
  List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

  @PostMapping("/product/decreaseStock")
  void decreaseStock(@RequestBody List<CartDTO> cartDTOList);

}
