public class Procedimento {
    private String nome;
    private double custo;
    private String observacoes;

    public Procedimento(String nome, double custo, String observacoes) {
        this.nome = nome;
        this.custo = custo;
        this.observacoes = observacoes;
    }

    /**
     * metodo get nome
     * @return nome
     */
    public String getNome(){
        return nome;
    }
}
