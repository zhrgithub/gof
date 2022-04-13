package gof_17_chainOfResponsibility;

/**
 * @author zhr
 */
public interface IWoman {

  /**
   * 获得个人状况
   *
   * @return
   */
  public int getType();

  /**
   * 获得个人请示，你要干什么？出去逛街？约会?还是看电影
   *
   * @return
   */
  public String getRequest();
}
