# Jogo de xadrez em Java ♟️
## Objetivos 🎯

O objetivo desta atividade é criar um jogo simples de xadrez utilizando a linguagem de programação Java, se apoiando em conceitos como Herança, Abstração, Polimorfismo e Encapsulamento.

## Classes 📃
A princípio temos 3 classes:
  - `Tabuleiro` 
      - Esta classe contém a matriz `private Peca tabuleiro[][] = new Peca[8][8];  ` que pode armazenar vários objetos do tipo `Peca`.
      - Contém um construtor que inicializa a matriz preenchendo cada posição com uma peça.
      - Método para retornar a matriz.
      - Método para realizar o movimento na peça selecionada. `public void movimentar(int x, int y, int valX, int valY)`. `x` e `y` são as coordenadas da peça a ser         movimentada. `valX` e `valY` são respectivamente a coordenada de destino da peça.
  - `Peca`
    - Esta classe é abstrata, servindo como modelo para outras peças. Seus atributos base são; `protected int x` e `protected int y`  
