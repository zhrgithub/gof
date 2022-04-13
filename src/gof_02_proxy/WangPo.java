package gof_02_proxy;

import gof_02_proxy.service.KindWomen;
import gof_02_proxy.service.impl.PanjinLian;

/**
 * @author zhr
 */
public class WangPo implements KindWomen {

  KindWomen kindWomen;

  public WangPo() {
    this.kindWomen = new PanjinLian();
  }

  public WangPo(KindWomen kindWomen) {
    this.kindWomen = kindWomen;
  }

  @Override
  public void makeEyesWithMan() {
    this.kindWomen.makeEyesWithMan();
  }

  @Override
  public void happyWithMan() {
    this.kindWomen.happyWithMan();
  }
}
