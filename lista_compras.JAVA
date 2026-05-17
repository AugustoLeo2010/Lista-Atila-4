public class lista_compras {
    public static void main(String[] args) {

        String[] itens = new String[1000];
        String opcao;

        int quantidade = 0;

        while (true) {
            opcao = IO.readln("=====Lista de Compras=====\n 1- Adicionar Item.\n 2- Pesquisar Item.\n" +
                    " 3- Remover Item.\n 4- Alterar Item.\n 5- listar Produtos.\n 6- Sair.\n Escolha a opção desejada: ");


            if (opcao.equals("1")) {

                while (true) {
                    String item;

                    item = IO.readln("Oque deseja adicionar a lista: ");

                    if (item.equals("fim")) {
                        IO.println("voltando ao inicio");
                        break;
                    }
                    itens[quantidade] = item;
                    quantidade++;
                }
                IO.println("itens adicionados");

            } else if (opcao.equals("2")) {
                itens[1] = IO.readln("Pesquisa: ");

            } else if (opcao.equals("3")) {
                itens[2] = IO.readln("Qual item deseja remover: ");

            } else if (opcao.equals("4")) {
                for (int i = 0; i < itens.length; i++)
                    itens[3] = IO.readln("Qual item deseja alterar: ");

            } else if (opcao.equals("5")) {
                itens[4] = IO.readln("=====Lista de Produtos=====");


                for (int i = 0; i < quantidade; i++) {
                    IO.println((i + 1) + " - " + itens[i]);
                }

                System.exit(0);

            } else if (opcao.equals("6")) {
                itens[5] = IO.readln("Voçê saiu da lista de compras...");
                System.exit(0);

            } else {
                IO.println("Opção não existente");
                System.exit(0);
            }
        }


    }
}

