public class funcaostring1 {
    public static void main(String[] args) {
         
        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s1 = original.toLowerCase();//FORMATAR A STRING PARA LETRAS MINÚSCULAS
        String s2 = original.toUpperCase();//FORMATAR A STRING PARA CAIXA ALTA (LETRAS MAIÚSCULAS)
        String s3 = original.trim();//FORMATAR A STRING PARA RETIRAR TODOS OS ESPAÇOS DESNECESSÁRIOS
        String s4 = original.substring(2);//PARA COMEÇAR A STRING A PARTIR DA POSIÇÃO SELECIONADA (2)
        String s5 = original.substring(2, 9);//PARA COMEÇAR E ACABAR A STRING A PARTIR DAS POSIÇÕES SELECIONADAS(2,9) 
        String s6 = original.replace("a", "x");//PARA REALOCAR NA STRING "a" A STRING "x" ('a', 'x')
        String s7 = original.replace("abc", "xy");//PARA REALOCAR NA STRING "abc" A STRING "xy" ('abc', 'xy')
        int i = original.indexOf("bc");//PARA CONTAR/ACHAR A POSIÇÃO DO PRIMEIRO "bc"
        int j = original.lastIndexOf("bc");//PARA CONTAR/ACHAR A POSIÇÃO DO ÚLTIMO "bc"


        System.out.println("Original -" + original + "-");
        System.out.println("to lower case -" + s1 + "-");
        System.out.println("to upper case -" + s2 + "-");
        System.out.println("trim -" + s3 + "-");
        System.out.println("substring(2) -" + s4 + "-");
        System.out.println("substring(2,9) -" + s5 + "-");
        System.out.println("replace ('a', 'x') -" + s6 + "-");
        System.out.println("replace ('abc', 'xy') -" + s7 + "-");
        System.out.println("index of ('bc') - " + i);
        System.out.println("las index of bc - " + j);
        }
}
