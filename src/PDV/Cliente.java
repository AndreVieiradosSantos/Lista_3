package PDV;

import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String email;
    private String endereco;
    Scanner clinte = new Scanner(System.in);
    public void fazerPedido(){
        System.out.println("Nome do cliente:");
        nomeCliente = clinte.nextLine();
        System.out.println("E-mail:");
        email = clinte.nextLine();
        System.out.println("Endereço:");
        endereco = clinte.nextLine();
    }
    public void exibirDados(){
        System.out.println("Nome do cliente:"+nomeCliente);
        System.out.println("E-mail:"+email);
        System.out.println("Endereço:"+endereco);

    }


}
