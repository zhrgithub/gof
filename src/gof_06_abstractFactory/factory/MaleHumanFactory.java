package gof_06_abstractFactory.factory;

import gof_06_abstractFactory.human.enums.HumanEnum;
import gof_06_abstractFactory.human.service.Human;

/**
 * @author zhr
 */
public class MaleHumanFactory extends AbstractHumanFactory {

  @Override
  public Human createYellowHuman() {
    return super.createHuman(HumanEnum.MaleYellowHuman);
  }

  @Override
  public Human createWhiteHuman() {
    return super.createHuman(HumanEnum.MaleWhiteHuman);
  }

  @Override
  public Human createBlackHuman() {
    return super.createHuman(HumanEnum.MaleBlackHuman);
  }
}
