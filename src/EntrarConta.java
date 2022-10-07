import java.util.Scanner;

public class EntrarConta {

    private boolean ISGODMODE = false;

    private String contaInput;
    private String agenciaInput;
    private String senhaInput;


    public Boolean entrarConta(){
        Scanner scan = new Scanner(System.in);
        ContaDados conta = new ContaDados();
        IOJson lerJson = new IOJson();


        System.out.println("Conta: ");
        contaInput = scan.nextLine();
        System.out.println("Agencia: ");
        agenciaInput = scan.nextLine();
        System.out.println("Senha: ");
        senhaInput = scan.nextLine();

        conta = lerJson.lerArquivoCliente(agenciaInput,contaInput);


        if (contaInput.equals(conta.getConta())){
            if (agenciaInput.equals(conta.getAgencia())){
                if (senhaInput.equals(conta.getSenha())){
                    return true;
                }else {
                    System.out.println("Dados incorretos!");
                }
            }else {
                System.out.println("Dados incorretos!");
            }
        } else {
            System.out.println("Dados incorretos!");
        }

        if (ISGODMODE){
            return true;
        }

        return false;
    }

}
