package gof_10_builder.model.modelExtends;

import gof_10_builder.model.CarModel;

/**
 * @author zhr
 */
public class BenzModel extends CarModel {
  @Override
  protected void start() {
    System.out.println("奔驰启动");
  }

  @Override
  protected void stop() {
    System.out.println("奔驰停止");
  }

  @Override
  protected void alarm() {
    System.out.println("奔驰鸣笛");
  }

  @Override
  protected void engineBoom() {
    System.out.println("奔驰发动引擎启动");
  }
}
