package com.letscode.Class06;

public class JogoDaVelha {
  public void main(String[] args) {

    /** Notes:
     _ | _ | _
     _ | _ | _
       |   |

     Helpful Indices
     [0][0], [0][2], [0][4],
     [1][0], [1][2], [1][4],
     [2][0], [2][2], [2][4]
     **/

    char[][] tabuleiro = {
            {'_', '|', '_', '|', '_'},
            {'_', '|', '_', '|', '_'},
            {' ', '|', ' ', '|', ' '}
    };
    
    printTabuleiro(tabuleiro);
    atualizarTabuleiro(2, 1, tabuleiro);

  }

    public static void printTabuleiro(char[][] tabuleiro) {

      for (char[] row: tabuleiro) {
        for (char collumn: row) {
          System.out.print(collumn);
        }
        System.out.println();
      }
    }


  /**
   * Jogador 1 = 'x'
   * Jogador 2 = 'o'
   */
  public static void atualizarTabuleiro(int posicao, int jogador, char[][] tabuleiro) {
    char character;

    if (jogador == 1) {
      character = 'x';
    } else {
      character = 'o';
    }


    switch (posicao) {
      case 1:
        tabuleiro[0][0] = character;
        printTabuleiro(tabuleiro);
        break;
      case 2:
        tabuleiro[0][2] = character;
        printTabuleiro(tabuleiro);
        break;
      case 3:
        tabuleiro[0][4] = character;
        printTabuleiro(tabuleiro);
        break;
      case 4:
        tabuleiro[1][0] = character;
        printTabuleiro(tabuleiro);
        break;
      case 5:
        tabuleiro[1][2] = character;
        printTabuleiro(tabuleiro);
        break;
      case 6:
        tabuleiro[1][4] = character;
        printTabuleiro(tabuleiro);
        break;
      case 7:
        tabuleiro[2][0] = character;
        printTabuleiro(tabuleiro);
        break;
      case 8:
        tabuleiro[2][2] = character;
        printTabuleiro(tabuleiro);
        break;
      case 9:
        tabuleiro[2][4] = character;
        printTabuleiro(tabuleiro);
        break;
      default:
        System.out.println("Número inválido");
        break;

    }

  }
}