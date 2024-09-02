class circle {
    double radius;

    void set_Radius(int r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}

public class getters_setters {
    public static void main(String[] args) {
        circle obj = new circle();

        obj.set_Radius(7);
        System.out.println(obj.getArea());
    }
}
