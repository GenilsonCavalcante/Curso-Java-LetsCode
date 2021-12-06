**VARIÁVEIS E TIPOS**

Java é uma linguagem fortemente tipada, nela temos os tipos inteiros, que podem variar conforme a necessidade, pois 
alguns tipos podem ser usados para quantidades pequenas, ex o byte, e outros para números muito grandes, como o long.
Mas que normalmente, o tipo int atende muitas das nossas necessidades diárias.

***

*Tipos inteiros:*

* byte (1 byte): -128 a 127
* short (2 bytes): -32.768 a 32.767
* int (4 bytes): -2.147.483.648 a 2.147.483.647
* long (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

***

*Tipos de ponto flutuante*

* float (4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
* double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)

Percebe-se que o tipo double é o mais preciso. E para o desses tipos, temos que informar o **f** no final para 
**float**, e **d** para **double**, da mesma forma que é feita no **long**, com o uso do **l**.

***

*Variáveis*

Exemplos de usos de variáveis:

- boolean done;
- int age;
- long earthPopulation;
- double pi;

***

*Constantes*

Ao contrário de variáveis, constantes possuem seus valores fixos e imutáveis.
Exemplo de seu uso para uma quantidade limitade de tentativas ao digitar uma senha:

**final int QUANTIDADE_TENTATIVAS = 3;**

***



