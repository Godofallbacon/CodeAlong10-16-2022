package NumberThree;

import lombok.AllArgsConstructor;
import lombok.Data;

public class OpenClosedPrinciple {
    public static void main(String[] args) {

        //open closed principle states that the software entities (classes, modules, functions, etc) should be open for extension but closed for modification

    }
}

@Data
@AllArgsConstructor
class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

interface Shape {
    void calculate();
}

@Data
@AllArgsConstructor
class Rectangle implements Shape {
    public Double height;
    public Double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

@Data
@AllArgsConstructor
class Circle implements Shape {
    public Double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}
