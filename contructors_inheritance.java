class father {
    father() {
        System.out.println("father class");
    }

    father(int x) {
        System.out.println("Overloaded constructor");
    }
}

class baby extends father {
    baby() {
        super(1);
        System.out.println("Child class");
    }
}

public class contructors_inheritance {
    public static void main(String[] args) {
        baby obj = new baby();
    }
}
