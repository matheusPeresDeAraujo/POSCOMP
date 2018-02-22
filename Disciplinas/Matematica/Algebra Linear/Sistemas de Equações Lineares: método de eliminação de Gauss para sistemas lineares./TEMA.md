# Sistemas de Equações Lineares: método de eliminação de Gauss para sistemas lineares.


## O que e um sistema de equacoes lineares?
> E um conjunto finito de equações aplicadas num mesmo conjunto. As equacoes possuem apenas polinomios uma incognita.

> x + y + z = 10 -- OK  
> x + xy + z = 10 -- ERROR(Nao pode haver algo como XY, multiplicacao de variaveis)

## Etapas do metodo de Gauss
> Fase de eliminacao  
> Fase de substituicao retrocedida

## Fase de eliminacao
> Durante esta fase realizamos operacoes dentro do sistema afim de chegar a um sistema tringular superior.

#### Sistema triangular superior
> Matriz onde abaixo da diagonal principal apenas existem zeros.

#### Operacoes
> 1- Trocar duas linhas entre si.  
> 2- Multiplicar todos os elementos de uma linha por uma cnstante nao nula  
> 3- Substituir uma linha pela sua soma com uma outra.


#### Exemplo utilizando operacao 1

> Dada as equacoes:  
> 2x + 3y + 4z = 10  
> 1x + 2y + 3z = 10  
> 0x + 1y + 2z = 10

> Temos a matriz  
> 2	3	4	10  
> 1	2	3	10  
> 0	1	2	10

> Atraves da operacao 1 podemos modificar a matriz  
> 2	3	4	10  
> 0	1	2	10  
> 1	2	3	10


#### Exemplo utilizando operacao 2

> Matriz  
> 2	3	4	10  
> 1	2	3	10  
> 0	1	2	10

> Podemos multiplicar a segunda linha por (-2)  
> 2	3	4	10  
> -2	-4	-6	-20  
> 0	1	2	10


### Exemplo utilizando operacao 3

> Matriz  
> 2	3	4	10  
> -2	-4	-6	-20  
> 0	1	2	10

> Podemos substituir a linha 2 ao realizar a soma entre a linha 1 e a 2
> 2	3	4	10  
> 0	-1	-2	-10  
> 0	1	2	10



