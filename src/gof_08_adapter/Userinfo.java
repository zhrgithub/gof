package gof_08_adapter;

/**
 * @author zhr
 */
public class Userinfo implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println("张三");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码");
        return null;
    }

    @Override
    public String getOfficeTellNumber() {
        System.out.println("办公电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("工作岗位");
        return null;
    }

    @Override
    public String getHomeTellNumber() {
        System.out.println("家庭电话");
        return null;
    }
}
