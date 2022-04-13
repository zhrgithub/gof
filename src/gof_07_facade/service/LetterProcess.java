package gof_07_facade.service;

/**
 * @author zhr
 */
public interface LetterProcess {

  /**
   * 写入内容
   *
   * @param context
   */
  public void writeContext(String context);

  /**
   * 填写邮件的收件人和地址
   *
   * @param address
   */
  public void fillEnvelope(String address);

  /** 装进信封 */
  public void letterInfoEnvelope();

  /** 发送邮件 */
  public void sendLetter();
}
