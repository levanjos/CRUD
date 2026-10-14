package Model;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private static int id = 1;
    List<Tarefa> banco = new ArrayList<>();
    //cadastrar
    public void cadastrarTarefa(Pessoa responsavel, String nome, String descricao){
        Tarefa tarefa = new Tarefa(id++, responsavel, nome, descricao);
        banco.add(tarefa);
    }
}
