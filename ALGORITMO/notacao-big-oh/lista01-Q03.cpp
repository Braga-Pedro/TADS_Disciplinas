/*
https://docs.google.com/document/d/1LK8Y7yZehHGktauI1Jzvx8o08_ah345usDjwSQLrhHw/edit?usp=sharing

(a) Determine,de forma aproximada, a quantidade de operações do seu algoritmo.
R:
10 + 2n² -1 = 2n² + 9
(b) Determine, usando a notação big-Oh, o desempenho, no pior caso, do seu
algoritmo.
R:
O(n²)

(c) Escreva um programa, em C++, e realize testes para verificar se
sua análise está correta.
R:
Feito!

(d) Faça um gráfico do tamanho da entrada em função do
tempo de execução.
R:
*/

#include <cmath>
#include <iostream>

int main() {
  // array a de n valores
  std::cout << "Insira o tamanho do array: " << std::endl;

  int n;    // 1
  int a[n]; // 1

  std::cin >> n; // 2
  // validar se n está entre 2 e 10^9
  if (n < 2 or n > pow(10, 9)) // 2
    int a[n];
  else {
    std::cout << "Tamanho inválido" << std::endl;
    return 0;
  }

  // informe a soma desejada
  std::cout << "Insira a soma desejada: " << std::endl;

  int s;         // 1
  std::cin >> s; // 1
  // validar se s está entre 1 e 2*10^9
  if (!(s < 1 or s > 2 * pow(10, 9))) { // 2
    std::cout << "Tamanho inválido" << std::endl;
    return 0;
  }

  // preenchendo o array com valores inteiros aleatorios dentro dos intervalos
  int i = 0;
  for (int i = 0; i < n; i++) { // n
    a[i] = (int)std::rand();
  }
  // verificando se existe um par de números cuja soma seja s
  for (int i = 0; i < n; i++) {       // n
    for (int j = i + 1; j < n; j++) { // n
      if (a[i] + a[j] == s) {         // 2n² -1
        std::cout << "S" << std::endl;
      } else {
        std::cout << "N" << std::endl;
      }
    }
  }
}
