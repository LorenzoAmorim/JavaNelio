## RESOLVENDO UM PROBLEMA SEM ORIENTAÇÃO A OBJETOS 

#PROBLEMA EXEMPLO

Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

area=raiz quadrada de p( p - a)( p - b)( p - c)
onde 
p = a+b+c/2s


#O QUE É CLASSE:
• É um tipo estruturado que pode conter (membros):
• Atributos (dados / campos)
• Métodos (funções / operações)

• A classe também pode prover muitos outros recursos, tais como:
    • Construtores
    • Sobrecarga
     Encapsulamento
    • Herança
    • Polimorfismo

• Exemplos:
    • Entidades: Produto, Cliente, Triangulo
    • Serviços: ProdutoService, ClienteService, EmailService, StorageService
     Controladores: ProdutoController, ClienteController
     Utilitários: Calculadora, Compactador
    • Outros (views, repositórios, gerenciadores, etc.)

    INSTANCIAÇÃO:
DURANTE A EXECUÇÃO DO PROGRAMA PODEMOS FAZER UMA ALOCAÇÃO DINÂMICA DE MEMÓRIA.

• x = new Triangle(); Será instanciada/criada um objeto do tipo Triangle em outra área de memória chamada Heap, essa área de memória é uma área onde são criada os objetos dinâmicos durante a execução.

• O "x" é criado na classe principal e receberá o "new" e em seguida o nome da classe em que está sendo referenciada. ex: x = new Triangle

