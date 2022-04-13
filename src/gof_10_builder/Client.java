package gof_10_builder;

import gof_10_builder.builder.builderExtends.BMWBuilder;
import gof_10_builder.builder.builderExtends.BenzBuilder;
import gof_10_builder.model.modelExtends.BMWModel;
import gof_10_builder.model.modelExtends.BenzModel;

import java.util.ArrayList;
/**
 * @author zhr_java@163.com
 * @date 2022/3/31 10:02
 */
public class Client {
  public static void main(String[] args) {

    /*
     * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
     * 说要这样一个模型，这样一个顺序，然后我就来制造
     */
    BenzModel benz = new BenzModel();
    // 存放run的顺序
    ArrayList<String> sequence = new ArrayList<String>();
    // 客户要求，run的时候时候先发动引擎
    sequence.add("engineboom");
    // 启动起来
    sequence.add("start");
    // 开了一段就停下来
    sequence.add("stop");
    // 然后我们把这个顺序给奔驰车：
    benz.setSequence(sequence);
    benz.run();
    System.out.println("......................");
    BenzBuilder benzBuilder = new BenzBuilder();
    // 把顺序给这个builder类，制造出这样一个车出来
    benzBuilder.setSequence(sequence);
    // 制造出一个奔驰车
    BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
    // 奔驰车跑一下看看
    benzModel.run();

    System.out.println("....................");
    // 按照同样的顺序，我再要一个宝马
    BMWBuilder bmwBuilder = new BMWBuilder();
    bmwBuilder.setSequence(sequence);
    BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
    bmw.run();

    System.out.println("下面开始智能产出");
    Director director = new Director();
    // 1W辆A类型的奔驰车
    for (int i = 0; i < 2; i++) {
      director.getABenzModel().run();
    }
    System.out.println("...............");
    // 100W辆B类型的奔驰车
    for (int i = 0; i < 2; i++) {
      director.getBBenzModel().run();
    }
    System.out.println("...............");
    // 1000W量C类型的宝马车
    for (int i = 0; i < 2; i++) {
      director.getCBMWModel().run();
    }
  }
}
