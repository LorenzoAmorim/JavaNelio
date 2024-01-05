# Sobreposição ou sobrescrita (palavra @Override)
### • É a implementação de um método de uma superclasse na subclasse

### • É fortemente recomendável usar a anotação @Override em um método sobrescrito

### • Facilita a leitura e compreensão do código

### • Avisamos ao compilador (boa prática)

# Palavra super
## É possível chamar a implementação da superclasse usando a palavra super.
### Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0.
~~~
@Override
public void withdraw(double amount) {
    super.withdraw(amount);
    balance -= 2.0;
}