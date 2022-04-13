package gof_10_builder.builder;

import gof_10_builder.model.CarModel;

import java.util.ArrayList;

/**
 * @author zhr
 * @date 2022/3/29 20:59
 *     <p>建造者抽象 把建造的顺序抽象出来，具体的顺序由具体的建造者设置 把需要建造的车模型抽象出来，具体获得的车模型由具体的建造者获取
 */
public abstract class CarBuilder {

  /**
   * 设置造车的顺序
   *
   * @param sequence
   */
  public abstract void setSequence(ArrayList<String> sequence);

  /**
   * 获取目标车模型
   *
   * @return
   */
  public abstract CarModel getCarModel();
}
