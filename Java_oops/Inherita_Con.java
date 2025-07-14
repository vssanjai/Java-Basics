class shape {
    int l;
    int b;

    // using constructor
    shape(int l, int b) {
        this.l = l;
        this.b = b;
        System.out.println("WELCOME ");
    }

    void print() {
        System.out.println("Ready to calculate machii..... ");
    }
}

class Rectangle extends shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    void recresult() {
        int a = l * b;
        System.out.println("Shape of Rectangle is: " + a);
    }
}

class Tri extends shape {
    Tri(int l, int b) {
        super(l, b);
    }

    void triresult() {
        int t = (l * b) / 2;
        System.out.println("Shape of triangle is: " + t);
    }
}

public class Inherita_Con {
    public static void main(String[] args) {
        Rectangle p = new Rectangle(5, 5);
        p.print();
        p.recresult();

        Tri q = new Tri(5, 2);
        q.print();
        q.triresult();
    }
}
