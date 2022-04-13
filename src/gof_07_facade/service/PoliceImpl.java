package gof_07_facade.service;

/**
 * @author zhr
 */
public class PoliceImpl implements Police {
  @Override
  public void checkLetter(String context) {
    System.out.println("检测邮件信息内容--->>> " + context + " --->>>>安全！！！");
  }
}
