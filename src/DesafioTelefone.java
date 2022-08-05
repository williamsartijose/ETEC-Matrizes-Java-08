import java.util.Locale;
import java.util.Scanner;

public class DesafioTelefone {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		 System.out.println("Digite a quantidade de clientes: ");
	        int quantidade = sc.nextInt();

	        String[] nomes = new String[quantidade];
	        String[] telefones = new String[quantidade];
	        int[] tiposDeAssinaturas = new int[quantidade];
	        int[] minutosConsumidos = new int[quantidade];
	        double[][] assinaturas = new double[3][2];
	        double[] contas = new double[quantidade];

	        for (int i = 0; i < quantidade; i++) {
	            System.out.println("Dados do " + (i + 1) + "o. cliente: ");
	            System.out.print("Nome: ");
	            nomes[i]. = sc.next();
	            sc.next();
	            System.out.print("Telefone: ");
	            telefones[i] = sc.next();
	            System.out.print("Tipo: ");
	            tiposDeAssinaturas[i] = sc.nextInt();
	            System.out.print("Minutos: ");
	            minutosConsumidos[i] = sc.nextInt();
	            System.out.println();
	        }

	        System.out.println("Informe o preco basico e excedente de cada tipo de conta: ");

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Tipo " + i + ": ");
	            for (int j = 0; j < 2; j++) {
	                assinaturas[i][j] = sc.nextDouble();
	            }
	        }

	        System.out.println("Relatório dos clientes: ");
	        System.out.println();

	        for (int i = 0; i < quantidade; i++) {
	            if (tiposDeAssinaturas[i] == 0 && minutosConsumidos[i] <= 90) {
	                contas[i] = assinaturas[0][0];
	            } else if (tiposDeAssinaturas[i] == 0 && minutosConsumidos[i] > 90) {
	                contas[i] = assinaturas[0][0] + ((minutosConsumidos[i] - 90) * assinaturas[0][1]);
	            } else if (tiposDeAssinaturas[i] == 1 && minutosConsumidos[i] <= 90) {
	                contas[i] = assinaturas[1][0];
	            } else if (tiposDeAssinaturas[i] == 1 && minutosConsumidos[i] > 90) {
	                contas[i] = assinaturas[1][0] + ((minutosConsumidos[i] - 90) * assinaturas[1][1]);
	            } else if (tiposDeAssinaturas[i] == 2 && minutosConsumidos[i] <= 90) {
	                contas[i] = assinaturas[2][0];
	            } else if (tiposDeAssinaturas[i] == 2 && minutosConsumidos[i] > 90) {
	                contas[i] = assinaturas[2][0] + ((minutosConsumidos[i] - 90) * assinaturas[2][1]);
	            }
	        }

	        for (int i = 0; i < quantidade; i++) {
	            System.out.println(nomes[i] + ", " + telefones[i] + ", Tipo " + tiposDeAssinaturas[i] + ", Minutos: " + minutosConsumidos[i] + ", Conta= R$ " + contas[i]);
	        }

	        sc.close();
	    }
}