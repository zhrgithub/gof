package gof_20_prototype;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 13:09
 */
public class Mail {

  /** 标题 */
  private String subject;

  /** 内容 */
  private String content;

  /** 收件人 */
  private String receiver;

  /** 称呼 */
  private String appellation;

  /** 邮件后缀，"xxx版权所有等信息" */
  private String tail;

  /**
   * 发送邮件
   *
   * @param mail
   */
  public static void sendMail(Mail mail) {
    System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t....发送成功！");
  }

  public Mail(AdvTemplate advTemplate) {
    this.subject = advTemplate.getAdvSubject();
    this.content = advTemplate.getAdvContext();
  }

  @Override
  protected Object clone() {
    try {
      return super.clone();
    } catch (Exception e) {
      return this;
    }
  }

  public String getSubject() {

    return subject;
  }

  public void setSubject(String subject) {

    this.subject = subject;
  }

  public String getContent() {

    return content;
  }

  public void setContent(String content) {

    this.content = content;
  }

  public String getReceiver() {

    return receiver;
  }

  public void setReceiver(String receiver) {

    this.receiver = receiver;
  }

  public String getAppellation() {

    return appellation;
  }

  public void setAppellation(String appellation) {

    this.appellation = appellation;
  }

  public String getTail() {

    return tail;
  }

  public void setTail(String tail) {

    this.tail = tail;
  }
}
