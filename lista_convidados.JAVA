import static java.lang.IO.*;

void main() {

String [] convidado = new String[5];

for (int i = 0; i < convidado.length; i++) {
    convidado[i] = IO.readln("digite o nome do " + (1 + i) + "°convidado: ");

}
IO.println("-----Lista de convidados-----");

    for (int i = 0; i < convidado.length; i++) {
        IO.println(convidado[i]);
    }

}
