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

                String pesquisa = IO.readln("Digite o produto para pesquisar: ");

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (itens[i].equalsIgnoreCase(pesquisa)) {

                        IO.println("Produto encontrado: " + itens[i]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    IO.println("Produto não encontrado");
                }


            } else if (opcao.equals("3")) {
                String remover = IO.readln("Qual item deseja remover: ");

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (itens[i].equalsIgnoreCase(remover)) {

                        for (int j = 0; j < quantidade; j++) {
                            itens[j] = itens[j + 1];

                        }

                        quantidade--;

                        IO.println("Produto encontrado e removido om sucesso");
                        encontrado = true;
                        break;
                    }
                }
                        if (!encontrado) {
                            IO.println("Produto não encontrado");
                        }


                } else if (opcao.equals("4")) {
                String alterar = IO.readln("Qual item deseja alterar: ");

                boolean encontrado = false;

                for (int i = 0; i < quantidade; i++) {

                    if (itens[i].equalsIgnoreCase(alterar)) {

                    String novoproduto = IO.readln("Digite o novo produto:");

                    itens[i] = novoproduto;

                    IO.println("Produto alterado com sucesso");
                    encontrado = true;
                    break;

                    }
                }
                if (!encontrado) {
                    IO.println("Produto não encontrado");
                }


                if (!encontrado) {
                    IO.println("Produto não encontrado");
                }


            } else if (opcao.equals("5")) {

                if (quantidade == 0) {
                    IO.println("Lista vazia");

                }else{

                    IO.println("=====Produto cadastrado=====");

                    for(int i = 0; i < quantidade; i++) {
                        IO.println((i + 1) + " - " + itens[i]);
                        
                    }
                }


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
