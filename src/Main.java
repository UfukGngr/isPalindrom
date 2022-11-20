public class Main {

    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        //number 124
        while (temp!=0){
            lastNumber= temp % 10;//lastNumber 4 , 2 , 1

            reverseNumber= (reverseNumber * 10) + lastNumber;//reverseNumber 421

            temp/=10;//temp 12 , 1 , 0
        }

        return reverseNumber == number;


    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4224));



    }
}