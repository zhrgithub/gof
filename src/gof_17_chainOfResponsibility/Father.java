package gof_17_chainOfResponsibility;

/**
 * @author zhr
 */
public class Father extends Handler {
  public Father() {
    super(0);
  }

  @Override
  public void response(IWoman woman) {
    System.out.println("女的说要" + woman.getRequest());
    System.out.println("父亲说可以");
  }
}
