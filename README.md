# Jogo de xadrez em Java ♟️
## Objetivos 🎯

O objetivo desta atividade é criar um jogo simples de xadrez utilizando a linguagem de programação Java, se apoiando em conceitos como Herança, Abstração, Polimorfismo e Encapsulamento.

## Classes 📃
A princípio temos 3 classes:
  - `Tabuleiro` 
      - Esta classe contém a matriz `private Peca tabuleiro[][] = new Peca[8][8]` que pode armazenar vários objetos do tipo `Peca`.
      - Contém um construtor que inicializa a matriz preenchendo cada posição com uma peça.
      - Método para retornar a matriz.
      - Método para realizar o movimento na peça selecionada. `public void movimentar(int x, int y, int valX, int valY)`. `x` e `y` são as coordenadas da peça a ser         movimentada. `valX` e `valY` são respectivamente a coordenada de destino da peça.
#
  - `Peca`
    - Esta classe é abstrata, servindo como modelo para outras peças. Seus atributos base são; `protected int x`, `protected int y` e `final String nome`.
    - Também possuí métodos públicos para retornar valores de x e y, `getX()` e `getY()` assim como métodos para setar x e y `setX()` e `setY()`.
    - Tem outros 2 métodos abstratos, um para mover a peça `abstract boolean mover(int x, int y)` e outro para retornar o nome da peça `public abstract String getNome()`.
#
  - `Jogador`
    - Esta classe implementa as peças de xadrez através de seu construtor e as armazena em uma matriz de peças. Possuí um método para retornar a matriz `public Peca[][] retornarP(){ return pecas }` para poder ser acessada pela classe `Tabuleiro`.
   
## Herança ⤵️
Utilizei o conceito de herança no desenvolvimento do jogo de xadrez na classe `Peca`. Ela é um modelo base para outras classes extenderem e implementarem seus métodos de forma totalmente personalizada.

## Polimorfismo 
O método `mover` da classe `Peca` pode ser um exemplo de polimorfismo, uma vez que é reutilizado em cada subclasse que o instancia.

## Encapsulamento 📦
O conceito de encapsulamento foi utilizado principalmente na classe `Peca` para manipular e obter seus valores cujo modificador de acesso é `private`.
