
import java.util.Scanner;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        while(opcao !=5){
        System.out.println("=============== Smart TV ===============\nO que voce deseja realizar?\n1-Ligar Tv\n2-Aumentar Volume\n3-Diminuir Volume\n4-Mudar Canal\n5-Desligar Tv");
        opcao = input.nextInt();
            switch (opcao){
                case 1:
                smartTv.ligar();
                break;
                case 2:
                smartTv.aumentarVolume();
                break;
                case 3:
                smartTv.diminuirVolume();
                break;
                case 4:
                smartTv.mudarCanal();
                break;
                case 5:
                smartTv.desligar();
                break;
                default:
                System.out.println("--------------------------------------------------\n             OPERACAO NAO PERMITIDA                    \n--------------------------------------------------");
                break;
            }
        }
    }
}
