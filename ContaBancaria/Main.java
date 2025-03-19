
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta c1 = new Conta();
        

        System.out.println("Digite o nome do usuário: ");
        String nomeUsuario = input.nextLine();
        c1.setNome(nomeUsuario);
        

        System.out.println("Olá " + c1.getNome());
        
    }
}
