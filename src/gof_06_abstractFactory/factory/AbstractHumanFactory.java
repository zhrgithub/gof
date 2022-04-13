package gof_06_abstractFactory.factory;

import gof_06_abstractFactory.human.enums.HumanEnum;
import gof_06_abstractFactory.human.service.Human;

/**
 * @author zhr
 */
public abstract class AbstractHumanFactory implements HumanFactory {

  protected Human createHuman(HumanEnum humanEnum) {
    Human human = null;
    if (!humanEnum.getValue().equals("")) {
      try {
        human = (Human) Class.forName(humanEnum.getValue()).newInstance();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return human;
  }
}
