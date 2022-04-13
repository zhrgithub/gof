package gof_04_multition;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @author zhr
 */
public class Emperor {
  private static int maxNumberEmperor = 2;

  /** 存放皇帝的名字，可以理解为存放对象信息的列表，但是有界 */
  private static ArrayList emperorInfoList = new ArrayList(maxNumberEmperor);

  /** 装皇帝的列表 */
  private static ArrayList emperorList = new ArrayList(maxNumberEmperor);

  /** 当前拜的是那个皇帝 */
  private static int countNumOfEmeperor = 0;

  public Emperor() {}

  public Emperor(String info) {
    emperorInfoList.add(info);
  }

  static {
    for (int i = 0; i < maxNumberEmperor; i++) {
      emperorList.add(new Emperor("第" + (i + 1) + "个皇帝"));
    }
  }

  public static Emperor getInstance() {
    SecureRandom random = new SecureRandom();
    countNumOfEmeperor = random.nextInt(maxNumberEmperor);
    return (Emperor) emperorList.get(countNumOfEmeperor);
  }

  public void getEmperorInfo() {
    System.out.println(emperorInfoList.get(countNumOfEmeperor));
  }
}
