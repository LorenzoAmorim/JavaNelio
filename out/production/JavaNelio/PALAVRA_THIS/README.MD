# PALAVRA THIS

### É uma referência para o próprio objeto.
### Usos comuns:
### . Diferenciar atributos de variáveis locais.
### . Passar o próprio objeto como argumento na chamada de um método ou construtor.

<hr>

Quando o objeto é chamado na instanciação com os atributos já definidos, é chamado também a função do construtor Product, onde as variáveis locais são apenas o “name”, “price” e “quantity”.

Já as variáveis definidas no corpo do construtor Product, referem-se aos atributos da classe Product, antecipadas pela palavra “this” (que referenciam os atributos globais da classe).

Os valores chamados na instanciação do objeto, é alocado na memória no escopo do construtor: “TV”, “1500.0” e “0”. Esses valores dessas variáveis ficarão salvas no objeto Product, graças a palavra “this”.

## RESUMO:

this.name= atributo da classe.
name = atributo do método.