class perimeter {
    int l;
    int b;

     void prin() {
        System.out.println("Perimert is calculating");
    }
}

class rectangle extends perimeter {
    void calculatePerimeter() {
        System.out.println("rextangle:" + (l + b));
    }
}

class square extends perimeter {
    void calculatePerimeters() {
        System.out.println("square:" + (l * b));
    }
}

public class Inherita_e {
    public static void main(String[] args) {

        rectangle b = new rectangle();
        b.l = 12;
        b.b = 12;
		b.prin();
        b.calculatePerimeter();

        square c = new square();
        c.l = 12;
        c.b = 14;
		c.prin();
        c.calculatePerimeters();
    }
}
