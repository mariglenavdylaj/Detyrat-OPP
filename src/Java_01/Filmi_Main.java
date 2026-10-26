package Java_01;

public class Filmi_Main {
    public static void main(String[] args) {
        Filmi filmi1 = new Filmi();
        filmi1.titulli = "Test1";
        filmi1.regjisori = "Emer1 Mbiemer1";
        filmi1.viti = 2011;
        filmi1.vleresimi = 7.8;


        Filmi filmi2 = new Filmi();
        filmi2.titulli = "Test2";
        filmi2.regjisori = "Emer2 Mbiemer2";
        filmi2.viti = 2010 ;
        filmi2.vleresimi = 7.8;

        Filmi filmi3 = new Filmi();
        filmi3.titulli = "Test3";
        filmi3.regjisori = "Emer3 Mbiemer3";
        filmi3.viti = 2015;
        filmi3.vleresimi = 9.2;

        filmi1.shfaqInfo();
        filmi2.shfaqInfo();
        filmi3.shfaqInfo();
    }
}
