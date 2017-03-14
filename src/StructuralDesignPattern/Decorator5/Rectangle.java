package StructuralDesignPattern.Decorator5;
public class Rectangle implements Shape
{

  @Override
  public void draw()
  {
    System.out.println("Shape: Rectangle has been drawn");
  }
}