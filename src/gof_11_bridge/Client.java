package gof_11_bridge;

import gof_11_bridge.corp.corpExtends.HouseCorp;
import gof_11_bridge.corp.corpExtends.ShanZhaiCorp;
import gof_11_bridge.product.productExtends.House;
import gof_11_bridge.product.Product;
import gof_11_bridge.product.productExtends.ShanZhai;

/**
 * @author zhr
 */
public class Client {

  public static void main(String[] args) {
    Product shanZhai = new ShanZhai();

    Product house = new House();

    HouseCorp corp1 = new HouseCorp(house);
    corp1.makeMoney();

    ShanZhaiCorp corp2 = new ShanZhaiCorp(shanZhai);
    corp2.makeMoney();
  }
}
