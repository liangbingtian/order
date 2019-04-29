package com.imooc.order.utils;

import java.util.Random;

/**
 * liangbingtian 2019/3/7 下午2:57
 */
public class KeyUtil {

  /**
   * 生成唯一的主键
   * 格式:时间戳+随机数
   * 加上synchronized关键字,避免多线程的时候生成同一订单号
   */
   public static synchronized String genUniqueKey() {
     Random random = new Random();
     Integer num = random.nextInt(900000) + 100000;
     return System.currentTimeMillis() + String.valueOf(num);
   }


}
