import java.util.Scanner;

public class exercicio7for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int primeira = 0;
        int segunda = 0;
        int terceira = 0;
        for(int i = 1; i<=n; i++){
            primeira = i;
            segunda = i * i;
            terceira = i*i*i;
            System.out.printf("%d %d %d\n", primeira, segunda, terceira);
        }

        sc.close();
    }
}
