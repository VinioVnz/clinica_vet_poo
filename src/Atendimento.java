import java.time.LocalDate;
import java.util.ArrayList;

public class Atendimento {
    protected String data;
    private String descricao;
    protected Veterinario veterinario;
    protected Animal animal;
    ArrayList<Procedimento> procedimentos = new ArrayList<>();

    
    /**
     * Este é o construtor padrão do Atendimento,
     * inicia a data como "Não informada",
     * a descricao como "Desconhecido",
     * o veterinario como instancia padrao
     * os procedimentos como uma arrayList vazia
     * o animal como instancia padrao
     */
    public Atendimento(){
        this.data = "Não informada";
        this.descricao = "Desconhecido";
        this.veterinario = new Veterinario();
        this.procedimentos = new ArrayList<>();
        this.animal = new Animal();
    }

    /**
     * Este é o construtor completo do Atendimento,
     * inicia a data como o parametro String data,
     * a descricao como o parametro String descricao,
     * o veterinario como o parametro Veterinario veterinario,
     * e o procedimentos como o parametro ArrayList<Procedimento> procedimentos
     * 
     * @param data, a data
     * @param descricao, a descricao
     * @param veterinario, o veterinario
     * @param procedimentos, os procedimentos
     */
    public Atendimento(String data, String descricao, Veterinario veterinario, Procedimento procedimento, Animal animal){
        this.data = data;
        this.descricao = descricao;
        this.veterinario = veterinario;
        procedimentos.add(procedimento);
        this.animal = animal;
    }
    /**
     * 
     * @param procedimento
     */
    public void registar(){
        System.out.println("Consulta registrada para "+animal.getNome() +"com o veterinário "+veterinario.getNome());
    }
    public String getAnimalName(){
        return animal.getNome();
    }
    public String getVeterinarioName(){
        return veterinario.getNome();
    }
    /**
     * metodo para add procedimento
     * @param procedimento, o procedimento
     */
    public void addProcedimento(Procedimento procedimento){
        procedimentos.add(procedimento);
    }  
    
    /**
     * metodo para remover procedimento
     * @param procedimento, o procedimento
     */ 
    public void removeProcedimento(Procedimento procedimento){
        procedimentos.remove(procedimento);
    }

    public void exibirDados(){
        System.out.println("Data: "+data);
        System.out.println("Descricao: "+descricao);
        System.out.println("Veterinario: "+veterinario.getNome());
        for(Procedimento procedimento : procedimentos){
            System.out.println("Procedimento: "+procedimento.getNome());
        }
        System.out.println("Animal: "+animal.getNome());


    }
}
