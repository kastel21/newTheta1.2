package com.swantech.stocktakev2;

import javafx.scene.control.TreeItem;











public class TreeItem1<T>
  extends TreeItem
{
  private String name;
  
  public TreeItem1(TreeItem tree)
  {
    super(tree);
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  

  public String getName()
  {
    return name;
  }
}
