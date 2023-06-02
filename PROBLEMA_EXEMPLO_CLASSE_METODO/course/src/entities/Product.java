package PROBLEMA_EXEMPLO_CLASSE_METODO.course.src.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;
    
    /*public pois pode ser usado em outros programas, double pois é um valor double
    e o nome do atributo, parênteses vazio pois não tem argumento
    o "TotalValueInStock" retorna o preço pela quantidade*/
    //Após o "public class Products" será feita as operações, como exemplo abaixo
    //OPERAÇÃO: numero de valor total no estoque
    public double totalValueInStock(){
        return price * quantity;
    }

    //o método addProducts receberá como argumento um valor inteiro de quantidade(int quantity)
    //OPERAÇÃO: adicionar produtos
    public void addProducts(int quantity){
        /* o "this" serve para especificar que queremos acessar o atributo da classe e não
         o parâmetro da operação (apenas se  atributo e o parâmetro receberem nomes iguais)*/ 
         //o primeiro "quantity" refere-se ao atributo da classe, o segundo ao parâmetro da operação
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    /*como a classe Product também é um Object, estamos sobrepondo a operação toString padrão
    do object, então no método toString podemos implementar a nossa versão do toString*/
    public String toString(){
        /*o método toString terá como ação o nome do produto, na forma de String
        ou seja, se no programa principal e mandarmos imprimir o products.toString()
        na variável name, ele irá receber o valor que for inserido na caixa "name*/
        return name 
        /*formatação normal e formatação para deixar com 2 casa decimais depois da vírgula
        nas variáveis com preço e valores quebrados*/
            + ", $ "    
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, total: $ "
            + String.format("%.2f",totalValueInStock());

            /*ANTES DA FORMATAÇÃO
            + ", $ " 
            + price 
            + ", " 
            + quantity 
            + " units, Total: $ "
            + totalValueInStock();
            */
    }
}
