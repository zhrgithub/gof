package gof_05_factoryMethod;

import gof_05_factoryMethod.service.Human;
import gof_05_factoryMethod.utils.ClassUtils;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhr
 */
public class HumanFactory {
  private static HashMap<String, Human> humans = new HashMap<String, Human>();

  public static Human createHuman(Class c) {
    Human human = null;
    try {

      if (humans.containsKey(c.getSimpleName())) {
        human = humans.get(c.getSimpleName());
      } else {
        human = (Human) Class.forName(c.getName()).newInstance();
        humans.put(c.getSimpleName(), human);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    return human;
  }

  public static Human createHuman() {
    // 定义一个人类的类型
    Human human = null;
    // 首先获取接口所有的实现类，多少个人种
    List<Class> createHumanList = ClassUtils.getAllClassByInterface(Human.class);
    // 八卦炉i自己开始想烧出什么人就烧出什么人种
    SecureRandom random = new SecureRandom();
    int rand = random.nextInt(createHumanList.size());
    human = createHuman(createHumanList.get(rand));
    return human;
  }
}
