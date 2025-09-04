public class Main2 {
    public static void main(String[] args) {
        Tutor tutor = new Tutor("Vinicius", "479999999", "Rua legal");
        Animal animal1 = new Animal("Nina", "cachorro", 1, null);
        tutor.adicionarAnimal(animal1);

        Veterinario veterinario = new Veterinario("Lara", "112312312", "cachorro");
        Procedimento procedimento = new Procedimento("Castrar", 1000, "Cachorro agitado");

        Atendimento atendimento = new Atendimento("09/09/2025", "A noite, castrar", veterinario, procedimento, animal1);

        atendimento.exibirDados();
    }
}
