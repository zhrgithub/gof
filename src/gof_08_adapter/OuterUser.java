package gof_08_adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhr
 */
public class OuterUser implements IOuterUser {
  @Override
  public Map getUserBaseInfo() {
    HashMap hashMap = new HashMap(16);
    hashMap.put("userName", "混世魔王");
    hashMap.put("moblieNumber", "0862323238");
    return hashMap;
  }

  @Override
  public Map getUserOfficeInfo() {
    HashMap hashMap = new HashMap(16);
    hashMap.put("jobPosition", "职位是山大王");
    hashMap.put("officeTelNumber", "办公电话32433484873");
    return hashMap;
  }

  @Override
  public Map getUserHomeInfo() {
    HashMap hashMap = new HashMap(16);
    hashMap.put("homeTelNumbner", "家庭电话2333443");
    hashMap.put("homeAddress", "翠屏山");
    return hashMap;
  }
}
