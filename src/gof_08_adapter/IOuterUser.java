package gof_08_adapter;

import java.util.Map;

/**
 * @author zhr
 */
public interface IOuterUser {

  /**
   * 获取用户基本信息
   *
   * @return
   */
  public Map getUserBaseInfo();

  /**
   * 获取用户的办公信息
   *
   * @return
   */
  public Map getUserOfficeInfo();

  /**
   * 获取用户的家庭信息
   *
   * @return
   */
  public Map getUserHomeInfo();
}
