import static java.lang.IO.*;

public class controle_temperatura {
public static void main(String[] args) {

    String[] temperaturaC = new String[1000];
    double valorF = 1.8;

    for (int i = 0;i < temperaturaC.length; i++) {
        temperaturaC[i] = IO.readln("Digite a temperatura em graus celsius: ");

   if (temperaturaC[i].equals("0")) {
   break;
   }
    }
IO.println("=====TABELA DE TEMPERATURA=====");

    for (int i = 0;i < temperaturaC.length; i++) {
float temperaturaF = temperaturaC * valorF;

}




}


}
