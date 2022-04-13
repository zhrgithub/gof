package gof_08_adapter;

import java.util.Map;

/**
 * @author zhr
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {
  private Map userBaseInfo = super.getUserBaseInfo();

  private Map userHomeInfo = super.getUserHomeInfo();

  private Map userOffficeInfo = super.getUserOfficeInfo();

  @Override
  public String getUserName() {
    return (String) userBaseInfo.get("userName");
  }

  @Override
  public String getHomeAddress() {
    return (String) userHomeInfo.get("homeAddress");
  }

  @Override
  public String getMobileNumber() {
    return (String) userBaseInfo.get("moblieNumber");
  }

  @Override
  public String getOfficeTellNumber() {
    return (String) userOffficeInfo.get("homeTelNumbner");
  }

  @Override
  public String getJobPosition() {
    return (String) userOffficeInfo.get("jobPosition");
  }

  @Override
  public String getHomeTellNumber() {
    return (String) userHomeInfo.get("homeTelNumbner");
  }
}
