package gof_10_builder.builder.builderExtends;

import gof_10_builder.model.modelExtends.BMWModel;
import gof_10_builder.builder.CarBuilder;
import gof_10_builder.model.CarModel;

import java.util.ArrayList;

/**
 * @author zhr
 */
public class BMWBuilder extends CarBuilder {
  BMWModel bmwModel = new BMWModel();

  @Override
  public void setSequence(ArrayList<String> sequence) {
    this.bmwModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.bmwModel;
  }
}
