import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tutor tutor1 = new Tutor();
        Tutor tutor2 = new Tutor("Vinicius", "479999-9999", "Rua das Palmeiras");

        // tutor1.setTelefone(null); //throw illegalArgumentException
        tutor1.setEndereco("Rua legal");
        tutor1.setTelefone("4799999-9999");

        Animal animal;
        Animal[] animais = new Animal[3];
        for (int i = 0; i < 3; i++) {
            animal = new Animal();

            System.out.println("Digite o nome do animal:");
            animal.setNome(input.nextLine());

            System.out.println("Digite a especie do animal:");
            animal.setEspecie(input.nextLine());

            System.out.println("Digite a idade do animal:");
            animal.setIdade(input.nextInt());
            input.nextLine();

            System.out.println("Digite o historico do animal:");
            animal.setHistorico(input.nextLine());

            animais[i] = animal;
        }
        animais[0].adicionarHistorico("Quebrou a pata");
        for (int i = 0; i < animais.length; i++) {
            System.out.println("------- animal " + i + " ---------");
            System.out.println("Nome: " + animais[i].getNome());
            System.out.println("Especie: " + animais[i].getEspecie());
            System.out.println("Idade: " + animais[i].getIdade());
            System.out.println("Historico: " + animais[i].getHistorico());
        }
    }
}
