package gof_05_factoryMethod;

import gof_05_factoryMethod.service.Human;
import gof_05_factoryMethod.service.impl.BlackHuman;
import gof_05_factoryMethod.service.impl.WhiteHuman;
import gof_05_factoryMethod.service.impl.YellowHuman;

/**
 * 工厂方法模式
 *
 * <p>适用场景： 当一个类不知道它所必须创建的对象的类的时候 当一个类希望由它的子类来指定它所创建的对象的时候
 * 当类将创建对象的职责委托给多个帮忙子类的中的某一个，并且你希望将哪一个帮助子类是代理者者一信息局部化的时候
 *
 * <p>优点：每次添加一个产品的时候，可以直接添加一下产品和产品的方法 缺点：产品变得多了，维护起来比较麻烦
 *
 * @author zhr
 */
public class NvWa {
  public static void main(String[] args) {
    Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
    yellowHuman.talk();
    yellowHuman.cry();
    yellowHuman.laugh();

    Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
    whiteHuman.laugh();
    whiteHuman.cry();
    whiteHuman.talk();

    Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
    blackHuman.talk();
    blackHuman.cry();
    blackHuman.laugh();

    for (int i = 0; i < 100; i++) {
      System.out.println(".........................");
      Human human = HumanFactory.createHuman();
      human.laugh();
      human.cry();
      human.talk();
    }
  }
}
