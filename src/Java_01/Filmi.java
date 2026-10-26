package Java_01;

public class Filmi {
    String titulli;
    String regjisori;
    int viti;
    double vleresimi; // vlersimi double per arsye te njofi numrat dhjetore  me presje.

    void shfaqInfo() {
        System.out.println("Titulli: " + titulli);
        System.out.println("Regjisori: " + regjisori);
        System.out.println("Viti: " + viti);
        System.out.println("Vleresimi: " + vleresimi + "/10");
        System.out.println("----");//ndarja  midis vlersimeve.
    }
}
