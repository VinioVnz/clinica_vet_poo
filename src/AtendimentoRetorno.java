public class AtendimentoRetorno extends Atendimento {
    private Atendimento atendimentoAnterior;

    public AtendimentoRetorno(Atendimento atendimentoAnterior) {
        super();
        this.atendimentoAnterior = atendimentoAnterior;
    }

    @Override
    public void registar() {
        System.out.println("Consulta de retorno registrada para " + animal.getNome()
                + ", referente à consulta anterior em " + data+ ".");
    }
}
