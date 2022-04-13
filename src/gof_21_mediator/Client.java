package gof_21_mediator;

import gof_21_mediator.MediatorExtends.Mediator;
import gof_21_mediator.MediatorExtends.dependence.Purchase;
import gof_21_mediator.MediatorExtends.dependence.Sale;
import gof_21_mediator.MediatorExtends.dependence.Stock;

/**
 * @author zhr_java@163.com
 * @date 2022/4/13 10:15
 */
public class Client {
  public static void main(String[] args) {
    AbstractMediator mediator = new Mediator();
    // 采购人员采购电脑
    System.out.println("------采购人员采购电脑--------");
    Purchase purchase = new Purchase(mediator);
    purchase.buyIBMcomputer(100);

    // 销售人员销售电脑
    System.out.println("\n------销售人员销售电脑--------");
    Sale sale = new Sale(mediator);
    sale.sellIBMComputer(1);

    // 库房管理人员管理库存
    System.out.println("\n------库房管理人员清库处理--------");
    Stock stock = new Stock(mediator);
    stock.clearStock();
  }
}
