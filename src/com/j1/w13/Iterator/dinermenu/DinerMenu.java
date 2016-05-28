package com.j1.w13.Iterator;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS=6;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("�Ұ�����","(�ܹ��� �� 2��, �����, �Ұ�� ��Ƽ 1��)",false,2.49);
    addItem("����Ұ�����","(�ܹ��� �� 2��, �����, �Ұ�� ��Ƽ 2��)",false,2.99);
    addItem("�������","(�ܹ��� �� 2��, ���� ��Ƽ 1��, ġ�� 1��",false,3.49);
    addItem("ġŲ����","(�ܹ��� �� 2��, ġŲ ��Ƽ 1��, �����)",false,3.49);
    addItem("�ſ�ġŲ����","(�ܹ��� �� 2��, �ſ�ġŲ ��Ƽ 1��, �����)",false,3.49);
    addItem("�������","(�ܹ��� �� 2��, �����, �� ��Ƽ 1��)",true,2.99);
  }
  
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    if (numberOfItems>=MAX_ITEMS) {
      System.out.println("Error");
    }else {
      menuItems[0]= menuItem;
      numberOfItems = numberOfItems+1;
    }
  }
  public MenuItem[] getMenuItems(){
    return menuItems;
  }
  public Iterator creatIterator(){
    return new DinerMenuIterator(menuItems);
  }
}