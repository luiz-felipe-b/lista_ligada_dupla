import java.util.Random;
public class TesteDupla {
    public static void main(String[] args) {
        Random r = new Random();
        ListaDupla lDupla = new ListaDupla();
        do {
            if (r.nextBoolean()) { //verdadeiro: insere
                if (r.nextBoolean()) { //verdadeiro: inicio
                    lDupla.insereInicio(r.nextInt(10));
                    System.out.println("insere inicio");
                } else { //falso: fim
                    lDupla.insereFim(r.nextInt(10));
                    System.out.println("insere fim");
                }
            } else if (!lDupla.estaVazia()) { //falso: remove
                if (r.nextBoolean()) { //verdadeiro: fim
                    System.out.println(lDupla.removeFim() + " saiu do final");
                } else { //falso: inicio
                    System.out.println(lDupla.removeInicio() + " saiu do início");
                }
            }
            System.out.println(lDupla);
        } while (!lDupla.estaVazia());
//        for (int i=1; i<=12; i++) {
//            if (r.nextInt(2) % 2 == 0) {
//                l.insereInicio(r.nextInt(10));
//                System.out.print("inicio: ");
//            }
//            else {
//                l.insereFim(r.nextInt(10));
//                System.out.print ("fim: ");
//            }
//            System.out.println(l);
//        }
    }
}
