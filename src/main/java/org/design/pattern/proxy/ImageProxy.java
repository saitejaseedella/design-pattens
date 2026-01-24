package org.design.pattern.proxy;

public class ImageProxy implements Image {

  private RealImage realImage;
  private final String fileName;

  public ImageProxy(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {

    if (realImage == null) {
      System.out.println("Loading image... please wait");
      realImage = new RealImage(fileName);
    }

    realImage.display();
  }
}
