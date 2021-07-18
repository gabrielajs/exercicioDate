import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        boolean anterior;

        Date dataNasc = new Date(720669600000L);
        System.out.println("Minha data nascimento: " + dataNasc);

        Date dataAtual = new Date();
        System.out.println(dataAtual);

        //15 de maio de 2010
        Date novaData = new Date(1273892400000L);
        System.out.println(novaData);

        if(anterior = dataNasc.before(novaData)){
            System.out.println("É anterior a data " + novaData);
        } else {
            System.out.println("É posterior a data " + novaData);
        }
    }
}
