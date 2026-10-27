
//Detyra5-Gjej dhe Korigjo gabimet 

class Makina {
String marka;     // duhen ';' pikepresja
int viti;
void shfaq() {
System.out.println(marka + " " + viti);    //viti ishte me 'V' te madhe
}
}

public class Main {
public static void main(String[] args) {
Makina m = new Makina();    //duhet 'new' ndryshe nuk krijohet klasa
m.marka = "Audi";
m.shfaq();     // duhen '()' klapat ne perfundim
}
}
