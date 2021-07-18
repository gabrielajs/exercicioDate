import java.time.DayOfWeek;
import java.util.Calendar;
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

        System.out.println("---------------------");

        Calendar agora = Calendar.getInstance();

        System.out.printf("Data de vencimento: %tF\n", agora);

        if(agora.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            agora.add(Calendar.DATE, 2);
            System.out.printf("Vencimento caiu no sabado nova data de vencimento: %tF\n", agora.getTime());
        }

        if(agora.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            agora.add(Calendar.DATE, 1);
            System.out.printf("Vencimento caiu no domingo nova data de vencimento: %tF\n", agora.getTime());
        }

        agora.add(Calendar.DATE, 10);
        System.out.printf("Pode pagar até %tF\n", agora.getTime());
    }
}
