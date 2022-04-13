package gof_11_bridge.corp;

import gof_11_bridge.product.Product;

/**
 * @author zhr
 */
public abstract class Corp {
  private Product product;

  public Corp(Product product) {
    this.product = product;
  }

  public void makeMoney() {
    this.product.beProduce();
    this.product.beSell();
  }
}
