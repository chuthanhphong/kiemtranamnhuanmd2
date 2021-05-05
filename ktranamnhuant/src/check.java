import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isleapyear = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    isleapyear = true;
                }

            } else {
                isleapyear = true;
            }
        } else {
            isleapyear = false;
        }
        if(isleapyear){
            System.out.println("là năm nhuận " + year);
        }else {
            System.out.println("không là năm nhuận" +year);
        }
    }
}
