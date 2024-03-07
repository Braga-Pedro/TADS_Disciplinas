/*
Escreva um programa que leia dois valores L 1 e L 2 , que representam os lados de um retângulo e mostre o perímetro do mesmo.

Entrada
Uma única linha com dois valores inteiros L 1 e L 2 ( 1 ≤  L 1 ,  L 2  ≤ 10 9 ).

Saída
Um único inteiro com o perímetro do retângulo.

Exemplos
entradacópia de
1 2
saídacópia de
6
entradacópia de
1 10
saídacópia de
22
entradacópia de
9 3
saídacópia de
24
entradacópia de
800 2
saídacópia de
1604
*/

#include <iostream>

int main() {
  int lado1, lado2;

  std::cin >> lado1 >> lado2;

  if (lado1 >= 1 and lado2 <= 1000000000) {
    // P = 2 * (b * h)
    int perimetro = 2 * (lado1 + lado2);
    std::cout << perimetro << std::endl;
  }
}
