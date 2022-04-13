package gof_14_iterator.service.impl;

import gof_14_iterator.service.IProject;
import gof_14_iterator.service.IProjectIterator;

import java.util.ArrayList;

/**
 * @author zhr
 */
public class Project implements IProject {

  /** 存储项目的列表 */
  private ArrayList<IProject> iProjects = new ArrayList<>();

  /** 项目名称 */
  private String name = "";

  /** 项目成员数量 */
  private int num = 0;

  /** 项目费用 */
  private int cost = 0;

  public Project() {}

  public Project(String name, int num, int cost) {
    this.name = name;
    this.num = num;
    this.cost = cost;
  }

  @Override
  public void add(String name, int num, int cost) {
    this.iProjects.add(new Project(name, num, cost));
  }

  @Override
  public String getProjectInfo() {
    String info = "";
    info = info + "项目名称是：" + this.name;
    info = info + "\t项目人数：" + this.num;
    info = info + "\t项目费用：" + this.cost;
    return info;
  }

  @Override
  public IProjectIterator iterator() {
    return new ProjectIterator(this.iProjects);
  }
}
