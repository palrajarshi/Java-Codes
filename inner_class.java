
class outer {
    int x = 1;

    class inner {
        void meth1() {
            System.out.println(x);
        }
    }
}

public class inner_class {
    public static void main(String[] args) {
        outer outer_obj = new outer();
        outer.inner inner_obj = outer_obj.new inner();

        inner_obj.meth1();
    }
}
