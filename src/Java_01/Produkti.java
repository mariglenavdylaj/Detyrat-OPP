package Java_01;

public class Produkti {
    String emri;
    double cimi;
    boolean gjendja;

    void shfaqInfo() {
        System.out.println("Produkti : " + emri);
        System.out.println("cimi : " + cimi + " euro");
        System.out.println("gjendja : " + gjendja);
        System.out.println("-----");
    }
    public  static  void main(String[] args) {
        Produkti p1 = new Produkti();
        p1.emri = "Express";
        p1.cimi = 2.5;
        p1.gjendja = true;

        Produkti p2 = new Produkti();
        p2.emri = "Makiato ";
        p2.cimi = 3.5;
        p2.gjendja = true;

        p1.shfaqInfo();
        p2.shfaqInfo();
    }
}
