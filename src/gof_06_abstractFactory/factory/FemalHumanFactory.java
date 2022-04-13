package gof_06_abstractFactory.factory;

import gof_06_abstractFactory.human.enums.HumanEnum;
import gof_06_abstractFactory.human.service.Human;

/**
 * @author zhr
 */
public class FemalHumanFactory extends AbstractHumanFactory {

  @Override
  public Human createYellowHuman() {
    return super.createHuman(HumanEnum.FemaleYellowHuman);
  }

  @Override
  public Human createWhiteHuman() {
    return super.createHuman(HumanEnum.FemaleWhiteHuman);
  }

  @Override
  public Human createBlackHuman() {
    return super.createHuman(HumanEnum.FemaleBlackHuman);
  }
}
