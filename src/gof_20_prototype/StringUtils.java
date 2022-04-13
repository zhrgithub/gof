package gof_20_prototype;

import java.security.SecureRandom;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 13:13
 */
public class StringUtils {

  // 获得指定长度的随机字符串
  public static String getRandString(int maxLength) {
    String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuffer sb = new StringBuffer();
    SecureRandom rand = new SecureRandom();
    for (int i = 0; i < maxLength; i++) {
      sb.append(source.charAt(rand.nextInt(source.length())));
    }
    return sb.toString();
  }
}
