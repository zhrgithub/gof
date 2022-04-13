package gof_21_mediator.MediatorExtends.dependence;

import gof_21_mediator.AbstractColleague;
import gof_21_mediator.AbstractMediator;

/**
 * @author zhr_java@163.com
 * @date 2022/4/13 09:52
 */
public class Purchase extends AbstractColleague {

  public Purchase(AbstractMediator _mediator) {
    super(_mediator);
  }

  /**
   * 采购IBM型号的电脑
   *
   * @param number
   */
  public void buyIBMcomputer(int number) {
    super.mediator.execute("purchase.buy", number);
  }

  /** 不在采购IBM电脑 */
  public void refuseBuyIBM() {
    System.out.println("不再采购IBM电脑");
  }
}
