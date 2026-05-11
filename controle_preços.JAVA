import static java.lang.IO.*;

void main() {
    String [] preços = new String[5];


    int soma = 0;

    for (int i = 0; i < preços.length; i++) {
     preços[i] = IO.readln("Digite o valor dos produtos: ");

    }
    IO.println("=====Lista de valores dos produtos=====");

    for (int i = 0; i < preços.length; i++) {
        IO.println("Produto " + (1+i) + " Preço: " + "R$" + preços[i]);
    }
}
