import java.util.Scanner;
public class SmartTv {
    Scanner input = new Scanner(System.in);
    boolean ligado = false;
    int volume = 30;
    int canal = 1;

    public void ligar(){
        ligado = true;
        System.out.println("--------------------------------------------------\n                     Ligando Tv                    \n--------------------------------------------------");
    }

    //AUMENTANDO VOLUME
    public void aumentarVolume(){
        System.out.println("Volume atual: "+ this.volume);
        System.out.println("Voce deseja aumentar para: ");
        int novoVolume = input.nextInt();
            if (novoVolume > volume){
                for (int i=volume; i<=novoVolume; i++){
                    System.out.println("|"+i+"|");
                }
                this.volume = novoVolume;}
            else{
                System.out.println("--------------------------------------------------\n             OPERACAO NAO PERMITIDA                    \n--------------------------------------------------");}
    }

    //DIMINUINDO VOLUME
    public void diminuirVolume(){
        System.out.println("Volume atual: "+ this.volume);
        System.out.println("Voce deseja diminuir para: ");
        int novoVolume = input.nextInt();
            if(novoVolume < volume){
                for (int i=volume; i>=novoVolume; i--){
                    System.out.println("|"+i+"|");
                }
                this.volume = novoVolume;}
            else{
                System.out.println("--------------------------------------------------\n             OPERACAO NAO PERMITIDA                    \n--------------------------------------------------");}
    }

    //MUDAR O CANAL
    public void mudarCanal(){
        System.out.println("O seu canal atual: "+this.canal);
        System.out.println("Qual o novo canal?");
        int novoCanal = input.nextInt();
        System.out.println("-------------------------------------------------- \nO canal foi alterado do: "+canal+" para o canal: "+novoCanal+"\n--------------------------------------------------");
        novoCanal = this.canal;
    }

    public void desligar(){
        ligado = false;
         System.out.println("--------------------------------------------------\n             DESLIGANDO TV!\n          ENCERRANDO PROGRAMA!                    \n--------------------------------------------------");;
    }
}
