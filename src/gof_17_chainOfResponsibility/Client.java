package gof_17_chainOfResponsibility;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @author zhr
 */
public class Client {
  public static void main(String[] args) {
    // 随机挑选几个女性
    SecureRandom rand = new SecureRandom();
    ArrayList<IWoman> arrayList = new ArrayList();
    for (int i = 0; i < 5; i++) {
      arrayList.add(new Woman(rand.nextInt(3), "我要出去逛街"));
    }
    Father father = new Father();
    Husband husband = new Husband();
    Son son = new Son();

    father.setNextHandler(husband);
    husband.setNextHandler(son);

    for (IWoman woman : arrayList) {
      father.handleMessage(woman);
    }
  }
}
