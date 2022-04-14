package gof_21_mediator;

/**
 * 相当于一个上下文，对中介者的值传递，业务处理在子类中
 * @author zhr_java@163.com
 * @date 2022/4/13 09:52
 */
public abstract class AbstractColleague {

  protected AbstractMediator mediator;

  public AbstractColleague(AbstractMediator _mediator) {
    this.mediator = _mediator;
  }
}
