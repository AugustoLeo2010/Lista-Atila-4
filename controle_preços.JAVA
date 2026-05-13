import static java.lang.IO.*;

void main() {
    int[] precos = new int[5];


    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;


    for (int i = 0; i < precos.length; i++){
        precos[i] = Integer.parseInt(IO.readln("Digite o valor dos produtos: "));


    if (precos[i] > maior) {
        maior = precos[i];
    }
    if (precos[i] < menor) {
        menor = precos[i];
    }
}
    IO.println("=====Lista de valores dos produtos=====");
    IO.println("");

    for (int i = 0; i < precos.length; i++) {
        IO.println("         Produto " + (1 + i) + " Preço: " + "R$" + precos[i]);
    }
    IO.println("         O preço mais alto é R$" + maior + ".");
    IO.println("         O preço mais baixo é R$" +  menor + ".");

    }
