import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArryDemo {
    public static void main(String[] args) {

//        double[] arr = new double[5];
//    String [] customers = new String[5];
//    customers[0] = "Tom";
//    customers[1] = "Toam";
//    customers[2] = "Tona";
//    customers[3] = "Tommy";
//    customers[4] = "Tommy teo";
        //for(elementType : arry)
//    for (String customer : customers){
//        System.out.println(customer);
//    }
//        for (int i = 0; i < customers.length; i++) {
//            System.out.println(customers[i]);
//        }
        // runtime Error
        System.out.println(args.length);
        System.out.println(args[0]);

        String tinhCuaToi = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ban o dau the?");
        tinhCuaToi = sc.nextLine();
        sayHello(tinhCuaToi);

    }
    public  static void sayHello(String tinhThanh){
        System.out.println("Xin chao "+ tinhThanh);
    }
}
