public class main7exemploFOR {
    public static void main(String[] args) {       

        int x = 4; //x=4
        int y = x + 2; //y=6

        //USAR DEBUG PARA UM MELHOR ENTENDIMENTO
        for(int i=0; i<x; i++){//x=4 E i MENOR QUE 4
            System.out.print(x +" "+y);//4 6
            y = y + i;//y=6 E i=0, ENTÃO Y=6
        }
    }
}
