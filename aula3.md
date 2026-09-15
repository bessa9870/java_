# PROGRAMAÇÃO ORIENTADA A OBJETOS | 14/09/26

## HERANÇA
  A herança é um mecanismo que permite criar uma classificação hierárquica no código, é o mesmo conceito aplicado no modelo entidade-relacionamento estendido.
De início, você cria uma classe génerica (superclasse) com atributos (variáveis e métodos) próprios, e ao usar o conceito de herança, você é capaz de criar 
classes (subclasses) que podem acessar os mesmos atributos (variáveis e métodos) daquela classe (superclasse). Vamos imaginar um programa que precise cadastrar 
pessoas, tal qual um minimundo de um modelo entidade-relacionamento:
| Pessoa |
| :-- |
| nome |
| data_de_nascimento |
| cpf |
| nacionalidade |
| numero_de_telefone |
| email |
| endereco |

  Pronto, temos uma pessoa. Mas, e se o código precisar cadastrar funcionários e clientes? Cada un possue sua própria especialização. Cliente tem histórico de 
pedidos e forma de pagamento salva no sistema (cartão, pix..) já o funcionário tem cargo e salário. Na programação estrutural, eu teria criado mais duas structs: 
Funcionario e Cliente, mas na programação orientada a objetos isso não é mais necessário, principalmente quando podemos empregar o uso do conceito de herança.
Ao encarar de maneira lógica, além das suas características especificas, essas duas classes têm atributos relacionados com os da classe genérica (superclasse): 
nome, nacionalidade, cpf, data de nascimento...
  Ao invés de repetir esses atributos como: nome_pessoa, nome_funcionario, nome_cliente... Podemos simplesmente herdá-los da superclasse através do modificador
`extends`. Veja como fica>

1. Declaração da classe Pessoa
``JAVA
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
``
1. Declaração da subclasse Funcionario

2. Declaração da subclasse Cliente


A classe pessoa não vai suportar pois

Herança traz consigo reaproveitamento de código e organização através da lógica, ao invés de criar uma variável nome para cada classe relacionada
