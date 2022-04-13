package gof_08_adapter;

/**
 * @author zhr
 */
public interface IUserInfo {

  /**
   * 获取用户姓名
   *
   * @return
   */
  public String getUserName();

  /**
   * 获取家庭地址
   *
   * @return
   */
  public String getHomeAddress();

  /**
   * 获取电话号码
   *
   * @return
   */
  public String getMobileNumber();

  /**
   * 获取办公电话
   *
   * @return
   */
  public String getOfficeTellNumber();

  /**
   * 获取办公位置
   *
   * @return
   */
  public String getJobPosition();

  /**
   * 获取家庭电话
   *
   * @return
   */
  public String getHomeTellNumber();
}
