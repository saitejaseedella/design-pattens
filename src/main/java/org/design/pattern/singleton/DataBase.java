package org.design.pattern.singleton;


public class DataBase {
  private static DataBase instance;
  private DataBase() {}

  public static DataBase getInstance() {
    if(instance == null){
      synchronized (DataBase.class) {
        if(instance == null){
          instance = new DataBase();
        }
      }
    }
    return instance;
  }



}
