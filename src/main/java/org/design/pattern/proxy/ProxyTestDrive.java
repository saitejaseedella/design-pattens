package org.design.pattern.proxy;

public class ProxyTestDrive {
  public static void main(String[] args) {

    Image image = new ImageProxy("photo_hd.png");

    System.out.println("App started...");
    System.out.println("User clicks image");

    image.display();
    System.out.println();

    image.display();
  }
}
