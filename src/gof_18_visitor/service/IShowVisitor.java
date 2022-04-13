package gof_18_visitor.service;

/**
 * 负责展示表
 * @author zhr
 */
public interface IShowVisitor extends Ivisiter {

    /**
     * 展示报表
     */
    public void report();
}
