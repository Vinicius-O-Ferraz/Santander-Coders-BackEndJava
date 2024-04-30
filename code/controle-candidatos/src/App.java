import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do salario base:  ");
        int salarioBase = scanner.nextInt();
        System.out.println("Informe o valor do salario pretendido pelo candidato:  ");
        int salarioPretendidoPeloCandidato = scanner.nextInt();

        scanner.close();
        
    if (salarioBase>salarioPretendidoPeloCandidato){
        System.out.println("Ligar para o candidato");
    }
    else if (salarioBase==salarioPretendidoPeloCandidato){
        System.out.println("Ligar para o candidato, com contra proposta");
    }
    else{
        System.out.println("Aguardando resultado dos demais candidatos");
    }
    }
}
