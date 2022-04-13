package gof_06_abstractFactory;

import gof_06_abstractFactory.factory.FemalHumanFactory;
import gof_06_abstractFactory.factory.HumanFactory;
import gof_06_abstractFactory.factory.MaleHumanFactory;
import gof_06_abstractFactory.human.service.Human;

/**
 * 抽象工厂模式：抽象工厂方法是工厂方法模式的延伸，它提供了功能更为强大的工厂类并且具备较好的可扩展性；
 *
 * <p>优点： 1、符合开闭原则 2、可以添加子工厂，制造更多类型的产品 3、高内聚、低耦合 4、如果是一群低水平的程序员开发，那么只需要提供工厂方法和产品接口
 *
 * <p>缺点： 1、增加新的产品等级结构很复杂，需要修改抽象工厂和所有的具体工厂类，对“开闭原则”的支持呈现倾斜性。
 *
 * <p>应用场景： 1、用户无需关心对象的创建过程，将对象的创建和使用解耦； 2、产品等级结构稳定，在设计完成之后不会向系统中增加新的产品等级结构或者删除已有的产品等级结构；
 * 3、系统中有多于一个的产品族，而每次只使用其中某一产品族。可以通过配置文件等方式来使用户能够动态改变产品族，也可以很方便的增加新的产品族；
 *
 * @author zhr
 */
public class NvWa {

  public static void main(String[] args) {
    HumanFactory maleHumanFactory = new MaleHumanFactory();

    HumanFactory femalHumanFactory = new FemalHumanFactory();

    Human yellowMaleHuman = maleHumanFactory.createYellowHuman();
    Human yellowFemalHuman = femalHumanFactory.createYellowHuman();

    yellowFemalHuman.sex();
    yellowFemalHuman.talk();
    yellowFemalHuman.cry();
    yellowFemalHuman.laugh();

    System.out.println("............");
    yellowMaleHuman.sex();
    yellowMaleHuman.laugh();
  }
}
