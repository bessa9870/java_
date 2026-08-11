# PROGRAMAÇÃO ORIENTADA A OBJETOS

## Paradigma orientado a objetos:
Na programação existem diferentes modos que podemos adotar para resolver problemas e estruturas sistemas, chamamos isso de: **Paradigmas de programação**. A programação orientada a objetos é um desses paradigmas. Ele foca em juntar todos os dados e funções que seriam independentes, e encapsulá-los dentro de classes, tratando-os como atributos membros da classe.

## Classes:
Pegando de uma perspectiva de alguém que veio do C puro: Uma classe é uma struct bufada que declara as variáveis e também contêm os métodos (funções) que iram trabalhar com essas variáveis. Na programação orientada a objetos dá pra definir uma classe facilmente como: **Construção lógica que define um objeto**. Em Java, tudo obrigatoriamente deve estar encapsulado em uma classe, e a identificação da classe principal deve levar o mesmo nome do arquivo .java onde está a classe principal.
*(Naturalmente, uma classe não ocupa espaço na memória RAM tal qual uma struct.)*
  - Variáveis dentro de uma classe são chamados: **Variáveis de instância/Atributos**;
  - Os métodos e variáveis definidas em uma classe são chamados de **membros da classe**.
  - Já dentro das classes, **todo código deve estar dentro de um método**, nada fica solto.

## Objeto:
O objeto é tão simples quanto, em C, ele seria a variável declarada na main que é do tipo struct. Na programação orientada a objetos a definição seria: **A instância física da classe**, essa instância é uma variável que pode acessar as variáveis e métodos dentro da classe. Em Java você cria o objeto e seguidamente, o aloca na memória RAM usando o parâmetro **new**:
  1. <classe>  <nome_objeto>;  //Aqui você cria a instância
  2. <nome_objeto> **new** <construtor()>;  //Aqui você aloca na memória
  3. <classe> <nome_projeto> new <construtor()>;  //Também da pra fazer tudo numa linha só

| Classe | Objeto |
| :-- | :-- |
| Um formulário vazio | O formulário preenchido |
| A planta baixa de uma casa | A casa construída |

