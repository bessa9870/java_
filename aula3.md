# PROGRAMAÇÃO ORIENTADA A OBJETOS | 14/09/26

## HERANÇA
  A herança é **um mecanismo que permite criar uma classificação hierárquica no código**, é o mesmo conceito aplicado no modelo entidade-relacionamento estendido.
Primeiro você cria uma classe genérica (superclasse) com atributos (variáveis e métodos) próprios e depois pode criar classes (subclasses) que podem acessar os 
atributos (variáveis e métodos) da classe genérica (superclasse). 

Vamos imaginar um programa que precise cadastrar pessoas, tal qual um minimundo de um modelo entidade-relacionamento:
| Pessoa |
| :-- |
| nome |
| data_de_nascimento |
| cpf |
| nacionalidade |
| numero_de_telefone |
| email |
| endereco |

  Pronto, temos uma pessoa. Mas, e se o código precisar cadastrar funcionários e clientes? Na programação sequencial, eu teria criado mais duas structs: 
Funcionario{} e Cliente{}, mas na programação orientada a objetos isso não é mais necessário, principalmente quando podemos empregar o uso do conceito de herança.

  Ao encarar de maneira lógica, além das suas características especificas, essas duas classes têm **atributos relacionados com os da classe genérica (superclasse)**: 
*nome, nacionalidade, cpf, data de nascimento...*

  Ao invés de repetir esses atributos em cada classe, podemos simplesmente **herdá-los da superclasse** através das palavras-chave `extends` para acessar os membros 
e `super` que estabelecepara acessar o construtor / os construtores:
  1. `Extends`: Permite que uma nova classe herde todos os **atributos** e **métodos** de uma classe já existente.
  2. `super`: Estabelece uma comunicação direta com a classe-mãe, podendo acessar seus construtores e métodos.

### Observação sobre o super:
O super pode servir como critério de desempate. Se a subclasse possui uma método com o mesmo identificador da superclasse, o JAVA dará prioridade ao método mais novo, 
mas se for necessário acessar acessar o método da superclasse, basta usar a palavra-chave super e o JAVA listará o método mais velho da superclasse com o mesmo identificador 
e saberá que você quer usá-lo ao invés do método mais novo.
```JAVA
//Dentro da classe Cilindro
    double area(){
        return super.area() + circ() * altura; 
        //Repare, o nome do método mais novo é area, dentro desse método
        //eu chamo outro método com o mesmo identificador, mas usando a
        //palavra-chave super, dizendo ao JAVA para acessar o método da
        //superclasse
    }
    double volume(){
        return super.area()*altura;
        //Aqui é a mesma situação
    }
```
**Além de métodos, também funciona ccom variáveis**

1. Declaração da classe genérica Pessoa:
```JAVA
class Pessoa{
    String nome;
    String cpf;
    // variáveis para data de nascimento
    int dia, mes, ano;

    String telefone;
    String email;
    // Variáveis para endereço
    String rua;
    int numero;
    int cep;
    Pessoa(String nom, String cp, int di, int me, int an, String te, String em, String ru, int nu, int ce){
        nome = nom;
        cpf = cp;
        dia = di;
        mes = me;
        ano = an;
        telefone = te;
        email = em;
        rua = ru;
        numero = nu;
        cep = ce;
    }
}
```
2. Declaração da subclasse Funcionario:
```JAVA
class Funcionario extends Pessoa{
    String cargo;
    double salario;
    int horas;

    Funcionario(String nom, String cp, int di, int me, int an, String te, String em, String ru, int nu, int ce, double sa, String ca, int ho){
        super(nom, cp, di, me, an, te, em, ru, nu, ce);  //Acesso o construtor da superclasse Pessoa

        cargo = ca;
        salario = sa;
        horas = ho;
    }
}
```
3. Declaração da subclasse Cliente:
```JAVA
class Cliente extends Pessoa{
    String forma_de_pagamento;
    String pedido;
    double valor_pedido;

    Cliente(String nom, String cp, int di, int me, int an, String te, String em, String ru, int nu, int ce, String fo, String pe, double va){
        super(nom, cp, di, me, an, te, em, ru, nu, ce); // Acesso o construtor da superclasse Pessoa
    
        forma_de_pagamento = fo;
        pedido = pe;
        valor_pedido = va;
    }
}
```
*Construtores não são herdados, usamos `super` para chamá-los durante a instanciação do objeto na memória.*
 
  Herança traz reaproveitamento de código e evita repetição desnecessária, ao invés de repetir as variáveis que aparecem nas três classes, basta 
declará-las na superclasse e usar `extends` para que a a subclasse tenha acesso a todos os membros da superclasse. 

### MODIFICADORES DE ACESSO:
Os modificadores de acesso em Java são palavras-chave que controlam a visibilidade de classes, métodos e atributos

  public (Público): É a praça pública. Qualquer outra classe do seu sistema pode ir lá e acessar os valores. É muito perigoso deixar dados importantes assim.

  private (Privado): É o cofre da classe. O acesso é restrito exclusivamente à própria classe onde o membro foi declarado, nem as classes-filhas 
  podem acessar esses valores.

  protected (Protegido): É o "segredo de família". Ele bloqueia o acesso para o resto do sistema (protegendo os dados de estranhos), mas libera o acesso total  
  para as subclasses.

### GETTERS E SETTERS
  O que chamamos de getters e setters, **são métodos customizados (criados por você) de acesso que acessam variáveis com modificadores não públicos.** Uma variável
`protected`/`private` não pode ser acessada pelo objeto da classe, por isso, usamos esses métodos para apontar para essas variáveis dentro do sistema e trabalhar
com elas, mesmo que modificador de acesso não permita. Tratando sobre os dois: 
  1. O método set (definir) serve para alterar ou atribuir um novo valor a esse atributo.
  2. O método get (pegar) serve para ler ou retornar o valor de um atributo.

  Podemos usá-los para criar validações de entrada mais robustas:
```JAVA
public class Pessoa {
    //Atributo privado
    protected int idade;

    //Construtor chama o set
    Pessoa(){
        setIdade(0);
    }

    //Método set (só ele modifica o valor)
    public void setIdade(int i) {
        if (idade >= 0) { // Validação de segurança
            idade = i;
        }
    }

    //Método GET (retorna o valor)
    public int getIdade() {
        return idade;
    }
}
```

### Herança Multinível - Efeito Cascata

  Uma classe filha pode servir de classe mãe para uma nova geração (Ex: Classe A -> Classe B -> Classe C).

  Acúmulo de Herança: A classe que está na base da árvore (C) acumula os atributos e métodos protegidos ou públicos de todas as classes que estão acima dela.

  Irmãos não compartilham: Classes que herdam exatamente do mesmo pai (ex: Quadrado e Retangulo estendendo Quadrilatero) continuam sem acesso aos dados uma da outra.

*Veja o exemplo que coloca isso em prática no diretório `segundo_exemplo`.*
