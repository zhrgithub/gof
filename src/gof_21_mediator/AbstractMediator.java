package gof_21_mediator;

import gof_21_mediator.MediatorExtends.dependence.Purchase;
import gof_21_mediator.MediatorExtends.dependence.Sale;
import gof_21_mediator.MediatorExtends.dependence.Stock;

/**
 * @author zhr_java@163.com
 * @date 2022/4/13 09:50
 */
public abstract class AbstractMediator {

  protected Purchase purchase;

  protected Sale sale;

  protected Stock stock;

  public AbstractMediator() {
    purchase = new Purchase(this);
    sale = new Sale(this);
    stock = new Stock(this);
  }

  /**
   * //中介者最重要的方法，叫做事件方法，处理多个对象之间的关系
   *
   * @param str
   * @param objects
   */
  public abstract void execute(String str, Object... objects);
}
