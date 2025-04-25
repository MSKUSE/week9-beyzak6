public class Rectangle extends Shape implements Drawable{


    int sideA = 0, sideB=0;

    public Rectangle(){

    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return 2*(this.sideA + this.sideB);
    }

    @Override
    public double area() {
        return sideA*sideB ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public void draw() {
        System.out.println("A rectangle is drawn");
    }
}
