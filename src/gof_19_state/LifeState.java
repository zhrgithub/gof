package gof_19_state;

/**
 * @author zhr_java@163.com
 * @date 2022/4/12 10:17
 */
public abstract class LifeState {

    /**
     * 通过上下文来操作电梯的状态
     */
    protected Context context;

    public void setContext(Context context) {

        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
