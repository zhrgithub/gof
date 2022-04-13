package gof_11_bridge.product.productExtends;

import gof_11_bridge.product.Product;

/**
 * @author zhr
 */
public class ShanZhai extends Product {
  @Override
  public void beProduce() {
    System.out.println("生产的山寨产品");
  }

  @Override
  public void beSell() {
    System.out.println("被销售的山寨货");
  }
}
