package gof_06_abstractFactory.factory;

import gof_06_abstractFactory.human.service.Human;

/**
 * @author zhr
 */
public interface HumanFactory {

  /**
   * 创建黄种人
   *
   * @return
   */
  public Human createYellowHuman();

  /**
   * 创建白种人
   *
   * @return
   */
  public Human createWhiteHuman();

  /**
   * 创建黑种人
   *
   * @return
   */
  public Human createBlackHuman();
}
