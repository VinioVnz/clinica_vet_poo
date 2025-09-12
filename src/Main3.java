public class Main3 {
    public static void main(String[] args) {

        Veterinario vet1 = new Veterinario("Dr. Carlos", "12345", "Clínico Geral");
        Veterinario vet2 = new Veterinario("Dra. Ana", "67890", "Dermatologia");


        Tutor tutor1 = new Tutor("João", "9999-1111", "Rua A, 123");
        Tutor tutor2 = new Tutor("Maria", "8888-2222", "Rua B, 456");
        Tutor tutor3 = new Tutor("Pedro", "7777-3333", "Rua C, 789");

        Animal animal1 = new Animal("Rex", "Cachorro", 5, "Sem histórico relevante");
        Animal animal2 = new Animal("Mimi", "Gato", 3, "Alergia a pulgas");
        Animal animal3 = new Animal("Bob", "Coelho", 2, "Problema digestivo");

        animal1.setTutor(tutor1);
        animal2.setTutor(tutor2);
        animal3.setTutor(tutor3);

        tutor1.adicionarAnimal(animal1);
        tutor2.adicionarAnimal(animal2);
        tutor3.adicionarAnimal(animal3);

        Procedimento proc1 = new Procedimento("Vacina Antirrábica", 50.0, "Dose única anual");
        Procedimento proc2 = new Procedimento("Exame de Sangue", 80.0, "Rotina");
        Procedimento proc3 = new Procedimento("Curativo", 30.0, "Troca diária");

        Atendimento consulta1 = new Atendimento("2025-09-11", "Consulta de rotina", vet1, proc1, animal1);
        Atendimento consulta2 = new Atendimento("2025-09-12", "Consulta de rotina", vet2, proc2, animal2);


        AtendimentoEmergencia emergencia = new AtendimentoEmergencia(3); // nível de urgência 3
        emergencia.animal = animal3; 
        emergencia.veterinario = vet1; 
        emergencia.addProcedimento(proc3);

 
        AtendimentoRetorno retorno = new AtendimentoRetorno(consulta1);
        retorno.animal = animal1;
        retorno.veterinario = vet1;
        retorno.addProcedimento(proc1);

       
        consulta1.registar();
        consulta2.registar();
        emergencia.registar();
        retorno.registar();
    }
}
