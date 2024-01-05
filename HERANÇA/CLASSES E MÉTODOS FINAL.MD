# Classes e métodos 'final'
### • Palavra chave: final
### • Classe: evita que a classe seja herdada 
~~~
public final class SavingsAccount {
~~~
### • Método: evita que o método sob seja sobreposto
~~~
@Override
    public final void withdraw(double amount){
        balance -= amount;
    }
~~~
### Suponha que você não queira que o método Withdraw de SavingsAccount seja sobreposto
###  Geralmente convém acrescentar final em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências