package gof_14_iterator.service;

/**
 * @author zhr
 */
public interface IProject {

  /**
   * 增加项目
   *
   * @param name
   * @param num
   * @param cost
   */
  public void add(String name, int num, int cost);

  /**
   * 从老板这里看到的就是项目信息
   *
   * @return
   */
  public String getProjectInfo();

  /**
   * 获得一个可以被遍历的对象
   *
   * @return
   */
  public IProjectIterator iterator();
}
