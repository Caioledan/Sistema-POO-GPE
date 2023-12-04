
package projeto.poo.gpe.Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//A classe Atividade servirá, posteriormente, para cadastrar atividades e atribui-las ao projeto.
public class Atividade {
    //Atributos da classe
    private String nome;
    private Date data_final;

    //Método construtor da classe
    public Atividade(String nome ,String data_final) throws ParseException {
        this.data_final = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data_final);
        this.nome = nome;
    }

    //Métodos getter
    public String getNome() {
        return nome;
    }

    public Date getData_final() {
        return data_final;
    }
}
