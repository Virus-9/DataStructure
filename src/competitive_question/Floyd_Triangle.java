package competitive_question;

public class Floyd_Triangle {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
