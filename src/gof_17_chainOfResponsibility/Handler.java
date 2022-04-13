package gof_17_chainOfResponsibility;

/**
 * @author zhr
 */
public abstract class Handler {
  /** 等级：0表示父亲，1表示丈夫，2表示儿子 */
  private int level = 0;

  /** 下一个节点的handler */
  private Handler nextHandler;

  /**
   * 每个类都要说明一下自己能处理哪些请求
   *
   * @param level
   */
  public Handler(int level) {
    this.level = level;
  }

  public final void handleMessage(IWoman woman) {
    if (woman.getType() == this.level) {
      this.response(woman);
    } else {
      this.nextHandler.response(woman);
    }
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public Handler getNextHandler() {
    return nextHandler;
  }

  public void setNextHandler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  /**
   * 响应信息
   *
   * @param woman
   */
  public abstract void response(IWoman woman);
}
