Durante os testes, meu simulador dava erro toda vez que eu colocava o package Q1; e os outros packages.
Provavelmente foi algo que eu não soube alocar direito.

Todavia, no código enviado aqui na plataforma, optei por manter o package Qx; de cada código, ainda que nos testes eles tenham falhado, sucedendo quando retirados.


b) da 3° questão, diagrama de classes

Classe: Arma
* Atributos:
  - dano: Double
  - tipo: String
* Métodos
  - Somente o construtor
 
    
 
Classe: Personagem
* Atributos:
  - nome: String
  - classe: String
  - arma: Arma
  - vivo: boolean
  - energia: Double
* Métodos:
  - entrarEmBatalha(): void
  - atacar(intensidade: Double): void
  - nivelDeEnergia(): int
