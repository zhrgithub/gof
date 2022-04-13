package gof_20_prototype;

/**
 * 简介：原型模式先产生出一个包含大量共有信息的类，然后可以拷贝出副本，修正细节信息，建立了一个完 整的个性对象。
 *
 * <p>应用场景：一是类初始化需要消化非常多的资源，这个资源包括数据、硬件资源 等；二是通过 new 产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式；三是一个对
 * 象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对 象供调用者使用。在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过 clone
 * 的方法创建一个对象，然后由工厂方法提供给调用者。
 *
 * @author zhr_java@163.com
 * @date 2022/4/12 13:12
 */
public class Client {

  /** 发送账单的数量，这个值是从数据库中获得 */
  private static int MAX_COUNT = 6;

  public static void main(String[] args) {
    /** 模拟发送邮件 */
    int i = 0;
    /** 把模板定义出来，这个是从数据库中获得 */
    Mail mail = new Mail(new AdvTemplate());
    mail.setTail("XX银行版权所有");
    while (i < MAX_COUNT) {
      Mail cloneMail = (Mail) mail.clone();
      /** 以下是每封邮件不同的地方 */
      cloneMail.setAppellation(StringUtils.getRandString(5) + " 先生（女士）");
      cloneMail.setReceiver(
          StringUtils.getRandString(5) + "@" + StringUtils.getRandString(8) + ".com");

      /** 然后发送邮件 */
      Mail.sendMail(cloneMail);
      i++;
    }
  }
}
