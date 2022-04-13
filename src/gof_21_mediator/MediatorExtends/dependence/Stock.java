package gof_21_mediator.MediatorExtends.dependence;

import gof_21_mediator.AbstractColleague;
import gof_21_mediator.AbstractMediator;

/**
 * @author zhr_java@163.com
 * @date 2022/4/13 09:52
 */
public class Stock extends AbstractColleague {

  public Stock(AbstractMediator _mediator) {
    super(_mediator);
  }

  /** 刚开始有100台电脑 */
  private static int COMPUTER_NUMBER = 100;

  /**
   * 库存增加
   *
   * @param number
   */
  public void increase(int number) {
    COMPUTER_NUMBER = COMPUTER_NUMBER + number;
    System.out.println("库存数量为：" + COMPUTER_NUMBER);
  }

  /**
   * 库存降低
   *
   * @param number
   */
  public void decrease(int number) {
    COMPUTER_NUMBER = COMPUTER_NUMBER - number;
    System.out.println("库存数量为：" + COMPUTER_NUMBER);
  }

  /**
   * 获得库存数量
   *
   * @return
   */
  public int getStockNumber() {
    return COMPUTER_NUMBER;
  }

  /** 存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售 */
  public void clearStock() {
    System.out.println("清理存货数量为：" + COMPUTER_NUMBER);
    super.mediator.execute("stock.clear");
  }
}
