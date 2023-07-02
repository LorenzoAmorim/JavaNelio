# ENCAPSULAMENTO

## O encapsulamento em Java é um conceito da programação orientada a objetos que consiste em proteger os membros de uma classe (atributos e métodos) de acessos externos, permitindo apenas sua manipulação de forma indireta por meio de métodos públicos1. O encapsulamento tem as seguintes vantagens2:

### 1- Aumenta a segurança e a qualidade do código, evitando que os dados sejam alterados indevidamente ou que os métodos sejam chamados incorretamente.
### 2- Facilita a manutenção e a modificação do código, pois permite alterar a implementação interna de uma classe sem afetar as outras classes que a utilizam.
### 3- Simplifica o uso e o entendimento da classe, pois oculta os detalhes de baixo nível e expõe apenas as funcionalidades essenciais.

#### Para usar o encapsulamento em Java, você deve declarar os atributos de uma classe como private e criar métodos public para acessá-los ou modificá-los, chamados de getters e setters. Por exemplo1:
public class Livro {
  private String titulo; // atributo privado
  private String autor; // atributo privado

  public String getTitulo() { // método getter
    return titulo;
  }

  public void setTitulo(String titulo) { // método setter
    this.titulo = titulo;
  }

  public String getAutor() { // método getter
    return autor;
  }

  public void setAutor(String autor) { // método setter
    this.autor = autor;
  }
}

Você deve usar o encapsulamento sempre que quiser proteger os dados de uma classe e controlar como eles são acessados ou modificados. O encapsulamento também ajuda a organizar os dados que sejam relacionados, agrupando-os em objetos (classes) que representam conceitos ou entidades do domínio do problema