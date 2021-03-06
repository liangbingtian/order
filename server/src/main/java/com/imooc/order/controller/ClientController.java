package com.imooc.order.controller;


import com.imooc.product.client.ProductClient;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * liangbingtian 2019/3/8 上午10:57
 */
@RestController
public class ClientController {

  @Autowired
  private LoadBalancerClient balancerClient;

  @Autowired
  private ProductClient productClient;

  @GetMapping("/getProductMsg")
  public String getProductMsg() {
    RestTemplate restTemplate = new RestTemplate();
    ServiceInstance serviceInstance = balancerClient.choose("PRODUCT");
    String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort())
        + "/getMessage";
    String response = restTemplate.getForObject(url, String.class);
    return response;
  }


  @GetMapping("/getProductList")
  public List<ProductInfoOutput> getProductList() {
    return productClient.listForOrder(Arrays.asList("164103465734242707"));
  }

  @GetMapping("/productDescreaseStock")
  public String descreaseStock() {
    productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("164103465734242707", 3)));
    return "ok";
  }

}
