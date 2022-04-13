package gof_02_proxy.service.impl;

import gof_02_proxy.service.KindWomen;

/**
 * @author zhr
 */
public class JiaShi implements KindWomen {

  @Override
  public void makeEyesWithMan() {
    System.out.println("贾氏给男人抛媚眼！！！");
  }

  @Override
  public void happyWithMan() {
    System.out.println("贾氏和男人做快乐的事情！！！");
  }
}
