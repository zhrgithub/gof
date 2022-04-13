package gof_07_facade.service;

/**
 * @author zhr
 */
public class LetterProcessImpl implements LetterProcess {
  @Override
  public void writeContext(String context) {
    System.out.println("信封内容：" + context);
  }

  @Override
  public void fillEnvelope(String address) {
    System.out.println("填写收件人的地址、姓名。。。" + address);
  }

  @Override
  public void letterInfoEnvelope() {
    System.out.println("把信件放到信封中。。。");
  }

  @Override
  public void sendLetter() {
    System.out.println("递交到邮局！！！");
  }
}
