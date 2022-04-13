package gof_03_singleton;

/**
 * @author zhr
 */
public class SingletonPattern {
  private static final SingletonPattern singletonPattern = new SingletonPattern();

  private SingletonPattern() {}

  public static synchronized SingletonPattern getInstance() {
    return singletonPattern;
  }
}
