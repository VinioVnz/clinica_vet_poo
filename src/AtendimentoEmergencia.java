public class AtendimentoEmergencia extends Atendimento {
    private int nivelUrgencia;

    public AtendimentoEmergencia(int nivelUrgencia) {
        super();
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public void registar() {
        System.out.println("Consulta de emergencia registrada para " + animal.getNome() + "(urgencia: "
                + nivelUrgencia + ") com o veterinário " + veterinario.getNome());
    }
}
