package gof_22_memento;

/**
 * 用于创建备忘录
 *
 * @author zhr
 */
public class Origin {

  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memen createMemen() {
    return new Memen(this.state);
  }

  public void setMemen(Memen memen) {
    this.state = memen.getState();
  }

  public void show() {
    System.out.println(this.state);
  }
}
