import java.awt.*;
import java.util.Scanner;
import java.util.function.Function;

public class LAB1 {
    private static Math math;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter first number");
        int first=s.nextInt() ;
        System.out.println("please enter second number");
        int second = s.nextInt();
        int sum = first+ second;
        int mult = first*second;
        int sub = first-second;
        int portion = first/second;
        int rim = first %second;

        System.out.println("first+ second ="+ sum);
        System.out.println("first* second ="+ mult);
        System.out.println("first- second ="+sub);
        System.out.println("first/ second ="+ portion);
        System.out.println("first % second ="+ rim);
        ///////////////////////////////////////////////
        System.out.println("please enter  number");
        int numbeer = s.nextInt();
        int summ =0;
        for (int i = 1; i <= 10; i++) {

                summ =numbeer*i;
            System.out.println(summ);
        }
    /////////////////////////////////////////////////
        double rad= 7.5;
         double per = 2*math.PI *rad;
        double area =math.PI *rad*rad;
        System.out.println("per = "+ per);
        System.out.println("area = "+area);

        ///////////////////////////////////
//        4
        System.out.println("please enter numbears");
        double new_num = s.nextDouble();
       double total =0;
       int count=0;
        for (int i = 0; i <=new_num ; i++)
        {
           if(new_num==0){
               break;
           }
            total+=new_num;
           count++;
            System.out.println("please enter numbears");
            new_num = s.nextDouble();
        }
        double avr = total/count;
        System.out.println(count);
      //  double pss = new_num -1;

        System.out.println("total number"+ total);
        System.out.println("average number"+ avr);
        /////////////////////////////////
        System.out.println("please first number");
        int fir_num =s.nextInt();
        System.out.println("please second number");
        int sec_num =s.nextInt();
        System.out.println("please third number");
        int thir =s.nextInt();
        int tota = fir_num+sec_num;
        if(thir== tota){
            System.out.println(true);
        }else System.out.println(false);
        System.out.println("please second enter word");

        String maseeg = s.next();
        int num2 = maseeg.length();
        String new_mas ="";
        for (int i = num2-1 ; i >=0 ; i--) {
            new_mas +=maseeg.charAt(i);

        }

        System.out.println( "Reverse word:"+ new_mas);
      ///////////////////////////////////////////
//        7
        System.out.println("please enter number");
        int number = s.nextInt();
        int new_numm =number%2;
        if (new_numm==0 ){
            System.out.println("Even");
        }else System.out.println("odd");
//       8
        System.out.println("Please enter the temperature");
        double c =s.nextDouble();
        double f =(c*1.8)+32;
        System.out.println("Fahrenheit is:"+f);
//        9
        System.out.println("Please enter the String");

        String testData =s.nextLine();
        System.out.println("Please enter the number");
        int test =s.nextInt();
        char ch =testData.charAt(test);
        System.out.println(ch);
//     10
        System.out.println("Please enter number the width");
        double width =s.nextDouble();
        System.out.println("Please enter number the height");
        double height =s.nextDouble();
        double areaa =width*height;
        double perimeter = 2*(width+height);
        System.out.println("Area is width *Height = "+area);
        System.out.println("2*(width+height) = "+perimeter);

//    11
        System.out.println("please enter first number");
        int firstt=s.nextInt() ;
        System.out.println("please enter second number");
        int secondd = s.nextInt();
        if (firstt>= secondd){

            System.out.println(firstt+">="+secondd);

        if (firstt!= secondd)
            System.out.println(firstt+"!="+secondd);
         if (firstt< secondd)
            System.out.println(firstt+"<"+secondd);
         if (firstt<secondd)
            System.out.println(firstt+"<="+secondd);
         if (firstt> secondd)
            System.out.println(firstt+">"+secondd);
        }
//    12
        System.out.println("please enter  Number of seconds");

        int seconds = s.nextInt();
        int ss = seconds%60;
        int m = (seconds/60);
        int h =  m/60;
        System.out.println(h+":"+m+":"+ss);
/////////
//        13
        System.out.println("please enter  number");

        int f_num = s.nextInt();
        System.out.println("please enter  number");

        int s_num = s.nextInt();
        System.out.println("please enter  number");

        int t_num = s.nextInt();
        System.out.println("please enter  number");
        int ff_num = s.nextInt();
        if(f_num==s_num && s_num==ff_num){
            System.out.println("equal");
        }else System.out.println("Numbers are not equal");
       //14
    int num14 =s.nextInt();
    if (num14>0){
        System.out.println("positive");
    } else if (num14<0) {
        System.out.println("negative");
    }else System.out.println("Zero");

       System.out.println("please enter  number");
        int num15 = s.nextInt();
        int positives =0;
        int Zero =0;
        int negatives =0;
        for (int i = num15; i >1 ; i++) {
                if (num15>0){
                    positives++;
                } if (num15<0){
                negatives++;
            }
            if (num15==0){
                Zero++;
            }
            if(num15==-1){
                break;
            }

            System.out.println("please enter  number");
             num15 = s.nextInt();

        }
        System.out.println("positives ="+ positives);
        System.out.println("negatives="+negatives);
        System.out.println("Zero="+Zero );
       //16
        System.out.println("pleas enter password");
        int user =s.nextInt();
        int new_pass=0;
        while (user!=0){
            int gg =user%10;
            new_pass =new_pass *10+ gg;
            user/=10;
        }
        System.out.println(new_pass);

    }
}
