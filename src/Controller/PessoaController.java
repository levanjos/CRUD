package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {

    private final PessoaService pessoaService;
    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

   public void cadastrar(){
        pessoaService.cadastrarPessoa("Leticia", "levitoria@gmail.com");
        pessoaService.cadastrarPessoa("Evellyn", "evy@gmail.com");
        pessoaService.cadastrarPessoa("Sarah", "sarah@gmail.com");
   }

   public List<?> mostrar(){
        return pessoaService.listarPessoa();
   }

   public void deletar(int id){
        pessoaService.deletarPessoa(id);
   }

   public void atualizar(int id, String nome){
        pessoaService.atualizarPessoa(id, nome);
   }
}
