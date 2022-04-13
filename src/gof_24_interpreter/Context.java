package gof_24_interpreter;

import gof_24_interpreter.expression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhr
 */
public class Context {
  private String context;

  private List<Expression> list = new ArrayList<>();

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public List<Expression> getList() {
    return list;
  }

  public void addListElement(Expression expression) {
    this.list.add(expression);
  }
}
