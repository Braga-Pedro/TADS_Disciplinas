/*
https://docs.google.com/document/d/1LK8Y7yZehHGktauI1Jzvx8o08_ah345usDjwSQLrhHw/edit?usp=sharing

7. Um novo vírus foi descoberto e sua taxa de transmissão é de 1.0 (100%), o que
indica que a quantidade de infectados dobra a cada dia. Uma vez que o vírus se
instala no seu corpo ele se mantém vivo e não causa nenhum mal a sua saúde, isto
quer dizer que todos na cidade serão infectados. Faça um algoritmo que, dada a
população de uma cidade, informe em quantos dias todos da cidade estarão
infectados depois do primeiro cidadão ser infectado. Determine o desempenho do
seu algoritmo usando a notação O (big-Oh).

Exemplos de entrada e saída

Exemplo de entrada 1
10
Exemplo de saída 1
4 dia(s)
*/

#include <cmath>
#include <iostream>

int main() {
  int populacao = 0, dias = 0, infectados = 1;

  std::cin >> populacao;

  while (infectados <= populacao) {
    infectados = pow(2, dias);
    dias++;
    std::cout << dias << " dia(s)\n";
    std::cout << infectados << " infectado(s)\n";
  }
  std::cout << "RESULTADO\n";
  std::cout << populacao << " populacao\n";
  std::cout << dias << " dia(s)";
}
