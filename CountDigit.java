public class CountDigit {
    public static void main (String[]args){
        int num = 78910;
        int count = 0;
        int temp = num;
        while (temp > 0){
            temp = temp / 10;
            count++;
        }
        System.out.println("Number of digits in " + num + " = " + count);
    }

    
}
