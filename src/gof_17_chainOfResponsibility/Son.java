package gof_17_chainOfResponsibility;

/**
 * @author zhr
 */
public class Son extends Handler {
  public Son() {
    super(0);
  }

  @Override
  public void response(IWoman woman) {
    System.out.println("女的说要" + woman.getRequest());
    System.out.println("儿子说可以");
  }
}
