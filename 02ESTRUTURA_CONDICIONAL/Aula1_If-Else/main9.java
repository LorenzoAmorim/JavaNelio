public class main9 {
    /* 
    -ESCOPO DE UMA VARIÁVEL É A REGIÃO DO PROGRAMA ONDE A VARIÁVEL É VÁLIDA
    OU SEJA, ELA NÃO PODE SER REFERENCIADA.
    -UMA VARIÁVEL NÃO PODE SER USADA SE NÃO FOR INICIADA
    */
    public static void main(String[] args) {
        double price = 400.00;

        double discount;

        if(price <200.00){
            discount = price * 0.1;
        }else{
            discount =0;
        }
        /*AQUI (L20) A VARIÁVEL "discount" NÃO PODERIA SER USADA (COMPILADOR IRIA ACUSAR ERRO)
        SE A NÃO FOSSE INICIADA COMO DOUBLE (L10) OU SE NÃO FOSSE CONDICIONADA NO ELSE (L14).
        */
        System.out.println(discount);
    }
    
}
