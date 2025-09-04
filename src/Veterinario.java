public class Veterinario {
    private String nome; // Nome completo do veterinário.
    private String crmv; // Registro profissional do veterinário
    private String especialidade; // Área de atuação (ex.: “Clínico Geral”, “Dermatologia”, “Ortopedia”).
    private Veterinario supervisor; // Associação reflexiva (um veterinário pode ter outro como supervisor).

    /**
     * Este é o construtor padrão do Veterinario,
     * inicia o nome como "Nome Desconhecido",
     * o crmv como "Desconhecido",
     * a especialidade como "Desconhecida"
     */
    public Veterinario() {
        nome = "Nome Desconhecido";
        crmv = "Desconhecido";
        especialidade = "Desconhecida";
    }

    /**
     * Este é o construtor completo do Veterinario,
     * inicia o nome como o parametro String nome,
     * o crmv como o parametro String crmv,
     * a especialidade como o parametro String especialidade,
     * e o supervisor como o parametro Veterinario supervisor
     * 
     * @param nome,          o nome
     * @param crmv,          o crmv
     * @param especialidade, a especialidade
     */
    public Veterinario(String nome, String crmv, String especialidade) {
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    /**
     * método getter do nome
     * 
     * @return o nome do animal
     */
    public String getNome() {
        return nome;
    }

    /**
     * método getter do crmv
     * 
     * @return o crmv do veterinario
     */
    public String getCRMV() {
        return crmv;
    }

    /**
     * método getter do especialidade
     * 
     * @return a especialidade do veterinario
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * método getter do supervisor
     * 
     * @return o supervisor do veterinario
     */
    public Veterinario getSupervisor() {
        return supervisor;
    }

    /**
     * método setter do nome
     * 
     * @param o nome do veterinario
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * método setter do nome
     * 
     * @param o crmv do veterinario
     */
    public void setCRMV(String crmv) {
        this.crmv = crmv;
    }

    /**
     * método setter da especialidade
     * 
     * @param a especiaidade do veterinario
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * método setter do supervisor
     * 
     * @param o supervisor do veterinario
     */
    public void setSupervisor(Veterinario supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return Retorna uma string com as informações básicas do veterinário.
     */
    public String retornaDados() {
        return "Nome: " + nome + " | CRMV: " + crmv + " | Especialidade: " + especialidade + " | Supervisor "
                + supervisor;
    }

}
