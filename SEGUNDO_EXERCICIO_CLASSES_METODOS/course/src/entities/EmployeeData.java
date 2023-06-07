package SEGUNDO_EXERCICIO_CLASSES_METODOS.course.src.entities;

public class EmployeeData {
    public String name;
    public double GrossSalary;
    public double Tax;
    public double percentage;

    public double NetSalary(){
        return GrossSalary - Tax;
    }
    public void IncreaseSalary(double percentage){
        
    }
}
