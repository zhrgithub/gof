package gof_11_bridge.product.productExtends;

import gof_11_bridge.product.Product;

/**
 * @author zhr
 */
public class Clothse extends Product {
  @Override
  public void beProduce() {
    System.out.println("生产的衣服");
  }

  @Override
  public void beSell() {
    System.out.println("被销售的衣服");
  }
}
