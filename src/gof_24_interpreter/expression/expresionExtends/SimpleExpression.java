package gof_24_interpreter.expression.expresionExtends;

import gof_24_interpreter.Context;
import gof_24_interpreter.expression.Expression;

/**
 * 简单的解释器
 *
 * @author zhr
 */
public class SimpleExpression extends Expression {
  @Override
  public void excute(Context context) {
    System.out.println("这是一个简单的解释器：" + context.getContext());
  }
}
