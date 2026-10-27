package Java_01; //Detyra 4

public class Drejtkendeshi {
    double gjatesia;
    double gjeresia;

    double siperfaqja() {
        return gjatesia * gjeresia;
    }

    double perimietri() {
        return 2 * (gjatesia + gjeresia);
    }
    public static   void   main(String[] args) {
        Drejtkendeshi d1 = new Drejtkendeshi();
        d1.gjatesia = 5;
        d1.gjeresia = 3;

        Drejtkendeshi d2 = new Drejtkendeshi();
        d2.gjatesia = 10;
        d2.gjeresia = 2.5;

        System.out.println("-------------");

        System.out.println("Drejtkendeshi i pare: ");
        System.out.println("Siperfaqja: " + d1.siperfaqja());
        System.out.println("Perimietri: " + d1.perimietri());

        System.out.println("-------------");

        System.out.println("Drejtkendeshi i dyte: ");
        System.out.println("Siperfaqja: " + d2.siperfaqja());
        System.out.println("Perimetri: " + d2.perimietri());

        System.out.println("-------------");

        if (d1.siperfaqja() > d2.siperfaqja()) {
            System.out.println("Drejtkendeshi i pare ka siperfaqe me te madhe.");
        }
        else if (d2.siperfaqja() > d1.siperfaqja()) {
            System.out.println("Drejtkendeshi i dyte ka sipserfaqe me te madhe.");
        }
        else {
            System.out.println("Te dy Drejtekendeshat kane siperfaqe te barabarte");
        }
        System.out.println("-------------");

        if (d1.perimietri() > d2.perimietri()) {
            System.out.println("Drejtkendeshi i pare ka Perimeter me te madh.");
        }
        else if (d2.perimietri() > d1.perimietri()) {
            System.out.println("Drejtkendeshi i dyte ka Perimeter me te madh.");
        }
        else {
            System.out.println("Te dy Drejtekendeshat kane Perimeter te barabarte");
        }

        System.out.println("-------------");

    }

}
