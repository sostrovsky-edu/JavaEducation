package design_pattern.structural.composite.example1.figure_type;

import design_pattern.structural.composite.example1.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square...");
    }
}
