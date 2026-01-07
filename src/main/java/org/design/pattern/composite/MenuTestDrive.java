package org.design.pattern.composite;

public class MenuTestDrive {

  public static void main(String[] args) {
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

    // build tree
    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    // add items
    pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
        "Pancakes with scrambled eggs and toast", true, 2.99));

    dinerMenu.add(new MenuItem("Vegetarian BLT",
        "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
    dinerMenu.add(new MenuItem("BLT",
        "Bacon with lettuce & tomato on whole wheat", false, 2.99));

    cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
        "Veggie burger on a whole wheat bun, lettuce, tomato, fries", true, 3.99));

    // nested composite
    dinerMenu.add(dessertMenu);
    dessertMenu.add(new MenuItem("Apple Pie",
        "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));

    // client prints everything via component
    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();
  }
}
