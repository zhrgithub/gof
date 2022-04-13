package gof_15_composition;

import java.util.ArrayList;

/**
 * @author zhr
 */
public class Branch extends Corp {

  /** 领导下边有那些下级领导和小兵 */
  ArrayList<Corp> subordinateList = new ArrayList<Corp>();

  public Branch(String _name, String _position, int _salary) {
    super(_name, _position, _salary);
  }

  /**
   * 增加一个下属，可能是小头目，也可能是个小兵
   *
   * @param corp
   */
  public void addSubordinate(Corp corp) {
    // 设置父节点
    corp.setParent(this);
    this.subordinateList.add(corp);
  }

  /**
   * 我有哪些下属
   *
   * @return
   */
  public ArrayList<Corp> getSubordinate() {
    return this.subordinateList;
  }
}
