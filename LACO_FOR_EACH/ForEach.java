package LACO_FOR_EACH;

public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        //percorrer coleções sem o "for each"
        for (int i = 0; i < vect.length; i++){
        System.out.println(vect[i]);
        }

        System.out.println("------------");
        //o laço "for each" le-se: para cada "obj" do tipo "String" percorra o vetor "vect"
        for (String obj : vect){
            System.out.println(obj);

        }
    }

}
/*/

 */
