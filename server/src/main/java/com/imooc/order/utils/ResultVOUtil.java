package com.imooc.order.utils;

import com.imooc.order.vo.ResultVO;

/**
 * liangbingtian 2019/3/7 下午7:10
 */
public class ResultVOUtil {

  public static <T> ResultVO<T> success(T object){

    ResultVO resultVO = new ResultVO();
    resultVO.setCode(0);
    resultVO.setMessage("成功");
    resultVO.setData(object);

    return resultVO;
  }

}
