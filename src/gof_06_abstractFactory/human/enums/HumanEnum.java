package gof_06_abstractFactory.human.enums;

/**
 * @author zhr
 */
public enum HumanEnum {
  // 黑种女性
  FemaleBlackHuman("gof_06_abstractFactory.human.service.impl.FemaleBlackHuman"),
  // 白种女性
  FemaleWhiteHuman("gof_06_abstractFactory.human.service.impl.FemaleWhiteHuman"),
  // 黄种女性
  FemaleYellowHuman("gof_06_abstractFactory.human.service.impl.FemaleYellowHuman"),
  // 黑种男性
  MaleBlackHuman("gof_06_abstractFactory.human.service.impl.MaleBlackHuman"),
  // 白种男性
  MaleWhiteHuman("gof_06_abstractFactory.human.service.impl.MaleWhiteHuman"),
  // 黄种男性
  MaleYellowHuman("gof_06_abstractFactory.human.service.impl.MaleYellowHuman");

  private String value;

  HumanEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}
