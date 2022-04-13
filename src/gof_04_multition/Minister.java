package gof_04_multition;

/**
 * 多例模式：
 *
 * <p>应用场景： 多并发请求环境下，系统需要为每个客户端的独立请求提供单独服务的资源，但是系统总的开销是有限的，系统在并发量很大时也不可能为所有的并发请求同时提供相应的资源，
 * 否则不但系统资源消耗量大而且非常耗时。这时就可以考虑使用池的概念，也即是一种多例模式的实现。具体的应用场景，比如数据库连接池、EJB无状态会话Bean的实例池
 * 代码实现上一般是提供一个容器类，也即是容纳资源对象的池，对象池的一些属性可以通过配置文件来配置，比如数据库连接池中容纳的Connection类型的对象数目的上限和下限、闲置连接超时时间等；
 * 然后每当应用程序请求数据库连接时，先判断池中有无空闲的连接，如有，即返回这个对象，如没有，则新建一个连接对象，并放入连接池中进行管理
 *
 * <p>优点：是单例模式的延伸
 *
 * <p>缺点：只能创建有限多个实例对象
 *
 * @author zhr
 */
public class Minister {
  public static void main(String[] args) {

    int numOfMinister = 10;
    for (int i = 0; i < numOfMinister; i++) {
      Emperor emperor = Emperor.getInstance();
      System.out.print("第" + (i + 1) + "位大臣拜的是");
      emperor.getEmperorInfo();
    }
  }
}
