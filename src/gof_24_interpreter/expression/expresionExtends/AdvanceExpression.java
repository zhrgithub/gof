package gof_24_interpreter.expression.expresionExtends;

import gof_24_interpreter.Context;
import gof_24_interpreter.expression.Expression;

/**
 * 高级解释器
 *
 * @author zhr
 */
public class AdvanceExpression extends Expression {
  @Override
  public void excute(Context context) {
    System.out.println("这是一个高级的解释器：" + context.getContext());
  }
}
