import static java.lang.IO.*;


    public static void main(String[] args) {
        String[] cadastrar = new String[1000];

        for (int i = 0; i < cadastrar.length; i++) {
            cadastrar[i] = IO.readln("Qual a tarefa: ");

            if (cadastrar[i].equals("fim")) {
                break;
            }
        }

        IO.println("=====Lista de Tarefas=====");

        for (int i = 0; i < cadastrar.length; i++) {

            if (cadastrar[i] != null && !cadastrar[i].equals("fim")) {
                IO.println(cadastrar[i]);
            }
        }
    }

