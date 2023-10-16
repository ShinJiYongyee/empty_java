package app;

import base.Shape;
import derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();               //업캐스팅, 오버라이드된 draw() 호출
        ((Circle) shape).sex();     //다운캐스팅하여 자손 Circle의 함수 사용
    }
}
