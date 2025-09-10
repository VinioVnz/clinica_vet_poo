import java.util.ArrayList;

/**
 * Classe representa um tutor
 * 
 * @author Vinícius Bornhofen (vinbornhofen@furb.br)
 */
public class Tutor {
    private String nome;
    private String telefone;
    private String endereco;
    private ArrayList<Animal> animais = new ArrayList<>();

     /**
     * Este é o construtor completo do Tutor,
     * inicia o nome como o parametro String nome,
     * o telefone como o parametro String telefone,
     * o endereco como o parametro String endereco,
     * @param nome, o nome
     * @param telefone, o telefone
     * @param endereco, o endereco
     */
    public Tutor(String nome, String telefone, String endereco){
        this.nome = nome;
        setTelefone(telefone);
        this.endereco = endereco;
    }

      /**
     * Este é o construtor padrão do Tutor,
     * inicia o nome como "Nome Desconhecido",
     * e o endereco como "Endereço Desconhecido"
     */
    public Tutor(){
        nome = "Nome desconhecido";
        endereco = "Endereço Desconhecido";
    }

    /**
     * metodo getter do nome
     * @return nome do tutor
     */
    public String getNome(){
        return nome;
    }

    /**
     * metodo getter do telefone
     * @return telefone do tutor
     */
    public String getTelefone(){
        return telefone;
    }

    /**
     * metodo getter do endereco
     * @return endereco do tutor
     */
    public String getEndereco(){
        return endereco;
    }

    
    /**
     * método setter do nome
     * @param o nome do tutor
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * método setter do telefone
     * @param o telefone do tutor
     * @throws IllegalArgumentException caso o telefone seja null
     */
    public void setTelefone(String telefone){
        if(telefone == null | telefone.isEmpty()){
            throw new IllegalArgumentException("Telefone não pode ser nullo!");
        }
        this.telefone = telefone;
    }

    /**
     * método setter do endereco
     * @param o endereco do tutor
     */
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    /**
     * metodo para adicionar um animal
     * @param animal, o animal
     */
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    /**
     * metodo para remover um animal
     * @param animal, o animal
     */
    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    public ArrayList<Animal> getAnimais(){
        return animais;
    }

}
