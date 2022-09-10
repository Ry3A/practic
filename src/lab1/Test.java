package lab1;

public class Test {
    public static void main(String[] args){
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
        Ball b1 = new Ball("blue", 2);
        Ball b2 = new Ball("red", 1);
        Ball b3 = new Ball("green");
        b3.setSize(1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        Book t1 = new Book("Bjnxm", 1685);
        Book t2 = new Book("DFhpd", 2015);
        Book t3 = new Book("Mjnci");
        t3.setYear(1749);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
