package org.design.pattern.proxy;

public class RealImage implements Image {

  private final String fileName;

  RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk();
  }
  private void loadFromDisk() {
    System.out.println("Loading image from disk: " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying image: " + fileName);
  }
}
