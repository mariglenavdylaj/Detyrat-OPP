package Java_02;

public class Main {
    public static void main(String[] args) {
        Filmi filmi1 = new Filmi();
        filmi1.titulli = "test1";
        filmi1.regjisori = "emer mbiemer";
        filmi1.viti = 2011;
        filmi1.vleresimi = 7.8;


        Filmi filmi2 = new Filmi();
        filmi2.titulli = "test2";
        filmi2.regjisori = "emer mbiemer";
        filmi2.viti = 2010 ;
        filmi2.vleresimi = 7.8;

        Filmi filmi3 = new Filmi();
        filmi3.titulli = "test3";
        filmi3.regjisori = "emer mbiemer";
        filmi3.viti = 2015;
        filmi3.vleresimi = 9.2;

        filmi1.shfaqInfo();
        filmi2.shfaqInfo();
        filmi3.shfaqInfo();
    }
}
