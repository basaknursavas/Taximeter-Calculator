import java.util.Scanner ;
public class TaximeterCalculator {
    public static void main(String[] args) {

        int km, startPrice = 10 ;
        double perKm = 2.20, total ;

        Scanner input = new Scanner(System.in);

        System.out.print("Please write the distance : ");
        km = input.nextInt();
        total = (km * perKm) + startPrice ;
        if(total<20){
            total = 20;
        }
        System.out.println("Your total : " + total);




    }
}
