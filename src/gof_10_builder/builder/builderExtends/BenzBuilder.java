package gof_10_builder.builder.builderExtends;

import gof_10_builder.model.modelExtends.BenzModel;
import gof_10_builder.builder.CarBuilder;
import gof_10_builder.model.CarModel;

import java.util.ArrayList;

/**
 *
 * @author zhr
 */
public class BenzBuilder extends CarBuilder {
  BenzModel benzModel = new BenzModel();

  @Override
  public void setSequence(ArrayList<String> sequence) {
    this.benzModel.setSequence(sequence);
  }

  @Override
  public CarModel getCarModel() {
    return this.benzModel;
  }
}
