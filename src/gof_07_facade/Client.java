package gof_07_facade;

import gof_07_facade.service.LetterProcess;
import gof_07_facade.service.LetterProcessImpl;

/**
 * 门面模式： 是一个很好的封装方法，一个子系统比较复杂的实话，比如算法或者业务比较 复杂，就可以封装出一个或多个门面出来，项目的结构简单，而且扩展性非常好。还有，在一个较大项目
 * 中的时候，为了避免人员带来的风险，也可以使用这个模式，技术水平比较差的成员，尽量安排独立的模 块（Sub
 * System），然后把他写的程序封装到一个门面里，尽量让其他项目成员不用看到这些烂人的代码， 看也看不懂，我也遇到过一个“高人”写的代码，private 方法、构造函数、常量基本都不用，你要一个
 * public 方法，好，一个类里就一个 public 方法，所有代码都在里面，然后你就看吧，一大坨的程序，看着
 * 能把人逼疯，使用门面模式后，对门面进行单元测试，约束项目成员的代码质量，对项目整体质量的提升 也是一个比较好的帮助。
 *
 * <p>本质：就是化零为整；引入一个中介类，把各个分散的功能组合成一个整体，只对外暴露一个统一的接口； 目的：为了用户使用方便，把过度拆分的分散功能，组合成一个整体，对外提供一个统一的接口
 *
 * <p>优点： 松耦合 用户与子系统解耦，屏蔽子系统；可以提高子系统的独立性；
 *
 * <p>使用简单 简化用户与子系统的依赖关系； 用户只与门面对接，有统一的入口；不需要知道所有子系统及内部构造；
 *
 * <p>缺点： 不规范的编程方式 没有面向抽象编程，而是通过增加中介层，转换服务提供方的服务接口；
 *
 * @author zhr
 */
public class Client {
  public static void main(String[] args) {
    LetterProcess letterProcess = new LetterProcessImpl();
    letterProcess.writeContext("你好，老朋友最近怎么样！！！");
    letterProcess.fillEnvelope("地址是：深圳市龙岗区坂田街道");
    letterProcess.letterInfoEnvelope();
    letterProcess.sendLetter();
    System.out.println(".............................");

    /** 门面模式 */
    ModelPostOffice modenPostOffice = new ModelPostOffice();

    modenPostOffice.sendLetter("你好，老朋友最近怎么样！！！", "地址是：深圳市龙岗区坂田街道");
  }
}
