package PROBLEMA_EXEMPLO_CLASSE_METODO.course.src.entities;

public class Products {
    
    public String name;
    public double price;
    public int quantity;
    
    /*public pois pode ser usado em outros programas, double pois é um valor double
    e o nome do atributo, parênteses vazio pois não tem argumento
    o "TotalValueInStock" retorna o preço pela quantidade*/
    public double TotalValueInStock(){
        return price * quantity;
    }

    public void AddProducts(int quantity){
        
    }


}
