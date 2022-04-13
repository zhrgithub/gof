package gof_17_chainOfResponsibility;

/**
 * @author zhr
 */
public class Husband extends Handler {
  public Husband() {
    super(0);
  }

  @Override
  public void response(IWoman woman) {
    System.out.println("女的说要" + woman.getRequest());
    System.out.println("丈夫说可以");
  }
}
