package gof_21_mediator;

/**
 * @author zhr_java@163.com
 * @date 2022/4/13 09:52
 */
public abstract class AbstractColleague {

  protected AbstractMediator mediator;

  public AbstractColleague(AbstractMediator _mediator) {
    this.mediator = _mediator;
  }
}
