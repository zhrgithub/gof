package gof_24_interpreter.expression;

import gof_24_interpreter.Context;

/**
 * 解释器
 *
 * @author zhr
 */
public abstract class Expression {

  /**
   * 执行解释的内容
   *
   * @param context
   */
  public abstract void excute(Context context);
}
