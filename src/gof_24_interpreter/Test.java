package gof_24_interpreter;

import gof_24_interpreter.expression.expresionExtends.AdvanceExpression;
import gof_24_interpreter.expression.Expression;
import gof_24_interpreter.expression.expresionExtends.SimpleExpression;

/**
 * 解释器模式
 *
 * @author zhr
 */
public class Test {

  public static void main(String[] args) {
    Context context = new Context();
    // 不同的解释器共享内容
    context.setContext("很我草！！！");
    context.addListElement(new AdvanceExpression());
    context.addListElement(new SimpleExpression());
    for (Expression expression : context.getList()) {
      expression.excute(context);
    }
  }
}
