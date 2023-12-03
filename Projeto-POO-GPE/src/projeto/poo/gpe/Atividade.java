package projeto.poo.gpe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//A classe Atividade servirá, posteriormente, para cadastrar atividades e atribui-las ao projeto.
public class Atividade {

    private String nome;
    private Date data_final;

    private Relatorio relatorio;

    //Método construtor da classe não implementando completamente no sistema
    public Atividade(String nome ,String data_final) throws ParseException {
        this.data_final = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data_final);
        this.nome = nome;
    }

    public String setNome() {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
        return nome;
    }
    
    public Date setData_final() {
        if(data_final != null){
            this.data_final = data_final;
        }
        return data_final;
    }
    
    public String getNome() {
        return nome;
    }

    public Date getData_final() {
        return data_final;
    }
}