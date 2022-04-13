package gof_22_memento;

/**
 * 备忘录
 *
 * @author zhr
 */
public class Memen {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Memen(String state) {
    this.state = state;
  }
}
