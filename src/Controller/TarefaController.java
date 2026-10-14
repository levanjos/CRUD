package Controller;

import Model.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService, TarefaService tarefaService1){this.tarefaService = tarefaService1;}

    public void cadastrar(){
        tarefaService.cadastrarTarefa("Leticia", "Responder e-mail", " Escrevar uma resposta curta validando o recebimento de uma mensagem ou agendamento.");
    }

}
