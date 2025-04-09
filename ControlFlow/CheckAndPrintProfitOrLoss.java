import java.util.Scanner;
public class CheckAndPrintProfitOrLoss {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Entet the cp: ");
     double cp=sc.nextDouble();
     System.out.println("Entet the sp: ");
     double sp=sc.nextDouble();
     if(cp<sp){
        double profit=sp-cp;
        double profitPercent=profit*100/cp;
        System.out.println("The profit % is: "+profitPercent);
     }
    else if(cp>sp){
        double loss=cp-sp;
        double lossPercent=loss*100/cp;
        System.out.println("The loss % is: "+lossPercent);
     }
     else{
        System.out.println("No profit and No loss..");
     }
    }
    
}
