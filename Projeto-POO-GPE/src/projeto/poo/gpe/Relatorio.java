package projeto.poo.gpe;

//Classe relátorio irá guardar quantas atividades foram entregues e quantas ainda não foram entregues, porém não foi implementado completamente.
public class Relatorio {
    private int entregues;
    private int faltantes;

    //Método construtor que será implementado futuramente.
    public Relatorio(String atividade, int entregues, int faltantes) {
        this.entregues = entregues;
        this.faltantes = faltantes;
    }

    public int getEntregues() {
        return entregues;
    }

    public void setEntregues(int entregues) {
        this.entregues = entregues;
    }

    public int getsFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }
}
