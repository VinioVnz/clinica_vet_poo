import java.util.List;

/**
 * Classe representa um animal
 * 
 * @author Vinícius Bornhofen (vinbornhofen@furb.br)
 */
public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private String historico;
    private Tutor tutor;
    private List<Atendimento> atendimentos;
    /**
     * Este é o construtor padrão do Animal,
     * inicia o nome como "Nome de Animal Desconhecido",
     * a especie como "Espécie de Animal Desconhecido",
     * a idade como 1 ano,
     * e o histórico como "Historico de Animal Desconhecido"
     */
    public Animal() {
        nome = "Nome de Animal Desconhecido";
        especie = "Espécie de Animal Desconhecido";
        idade = 1;
        historico = "Historico de Animal Desconhecido";
    }

    /**
     * Este é o construtor completo do Animal,
     * inicia o nome como o parametro String nome,
     * a especie como o parametro String especie,
     * a idade como o parametro int idade,
     * e o histórico como o parametro String historico
     * @param nome, o nome
     * @param especie, a especie
     * @param idade, a idade
     * @param historico, o histórico
     */

    public Animal(String nome, String especie, int idade, String historico) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.historico = historico;
    }

    /**
     * método getter do nome
     * @return o nome do animal
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * método getter da especie
     * @return a especie do animal
     */
    public String getEspecie(){
        return especie;
    }

    /**
     * método getter da idade
     * @return a idade do animal
     */
    public int getIdade(){
        return idade;
    }

    /**
     * método getter do historico
     * @return o historico do animal
     */
    public String getHistorico(){
        return historico;
    }

    /**
     * método setter do nome
     * @param o nome do animal
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * método setter da especie
     * @param a especie do animal
     */
    public void setEspecie(String especie){
        this.especie = especie;
    }

    /**
     * método setter da idade
     * @param a idade do animal
     * @throws IllegalArgumentException se idade for negativa
     */
    public void setIdade(int idade){
        if(idade < 0){
             throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    /**
     * método setter do historico
     * @param o historico do animal
     */
    public void setHistorico(String historico){
        this.historico = historico;
    }

    /**
     * metodo get do tutor
     * @return o tutor
     */
    public Tutor getTutor() {
        return tutor;
    }
    /**
     * metodo setter do tutor
     * @param tutor, o tutor
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
        /**
     * método para adicionar historico
     * @param descricao
     */

     public void adicionarHistorico(String descricao){
        historico += " | "+descricao;
     }
     /**
      * metodo para add atendimento
      * @param atendimento
      */
      public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }
    /**
     * metodo get de atendimento
     * @return atendimentos
     */
    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }


}
