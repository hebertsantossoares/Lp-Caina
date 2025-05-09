![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( inicio )) --> input1[\digite sua nota\]
   input1 --> input2[\ digite sua frequncia em % \]
   input2 --> teste{ nota >=50 \n E \n frequncia >= 75% ? }
   teste --> |Não| resposta1[/ reprovado /]
   teste --> |Sim| resposta2[/ aprovado /]
   resposta1 --> final([fim])
   resposta2 --> final  
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start((incio)) --> input1[\digite o N1\]
   input1 --> input2[\digite o N2\]
   input2 --> sum[ resultado = N1 + N2]
   sum --> out[/resultado/]
   out --> finish([fim])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start((inicio)) --> input[\digite o numero\]
   input --> ver{Numero >=0}
   ver -->|sim| reposta1[/positivo/]
   ver -->|não| reposta2[/Negativo/]
   reposta1
   out --> finish([fim])
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
<<<<<<< HEAD
      start((inicio)) --> input1[\digite sua idade\]
   input1 --> input2[\voce tem titulo?\]
   input2 --> ver1{idade>=16? \n E \n Titulo=sim}
   ver1 -->|sim| resposta1[/pode votar/]
   ver1 -->|não| resposta2[/não pode votar/]
   resposta1 --> finish([fim])
   resposta2 --> finish
=======
      start((inicio)) --> input[\digite sua idade\]
   input --> ver{numero >=16}
   ver -->|sim| resposta1[/pode votar/]
   ver -->|não| resposta2[/não pode votar/]
   out --> finish([fim])
>>>>>>> c91f469f3cbe28aba936ad5bbea6714d1e809a0a
   ```
   
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
    ```mermaid
   flowchart TD
      start((inicio)) --> input1[\ digite N1\]
   input1 --> input2[\ digite N2\]
<<<<<<< HEAD
   input2 --> resultado1[ resultado = N1 > N2]
   input2 --> resultado2[ resultado = N1 < N2]
   resultado1 --> resposta1[/N1/]
   resultado2 --> resposta2[/N2/]
   resposta1 --> finish([fim])
   resposta2 --> finish
=======
>>>>>>> c91f469f3cbe28aba936ad5bbea6714d1e809a0a
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.

```mermaid
   flowchart TD
      start((inicio)) --> input1[\ digite N1\] 
   input1 --> input2[\ digite N2\]
   input2 --> input3[\ digite N3\]
   input2 --> resultado1[ resultado = N1 > N2]
   input2 --> resultado2[ resultado = N1 < N2]
   input1 --> resultado3[ resultado = N1 < N3]
   input2 --> resultado3[ resultado = N2 < N3]
   resultado1 --> resposta1[/N1/]
   resultado2 --> resposta2[/N2/]
   resultado3 --> resposta3[/N3/]
   resposta1 --> finish([fim])
   resposta2 --> finish
   resposta3 --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
       A((inicio)) --> B[\digite um numero\]
      B --> C[r=1]
      C --> D{n>1?}
      D --> |sim| E[r=r*n]
      E --> F[n=n-1]
      F --> D
      D --> |não| G[/resposta = r/]
      G --> H([final])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2

  ```mermaid
   flowchart TD
   A[Início] --> B[Digite um número]
   B --> C{Número % 2 == 0?}
   C -- Sim --> D[Exibir: O número é par]
   C -- Não --> E[Exibir: O número é ímpar]
   D --> F[Fim]
   E --> F[Fim]
   ```
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
<<<<<<< HEAD
      A((inicio)) --> B[\digite um numero\]
   B --> C[i=n/2]
   C --> D{i>1?}
   D --> |sim| E{n % 1 por i \n é  igual a zero?}
   D --> |nao| F[/É primo/]
   E --> |sim| H[/nao é primo/]
   E --> |nao| G[1=1-1]
   G --> D
   F --> I([final])
   H --> I
   ```
=======
      I["Sua resposta aqui!"]
   ```
>>>>>>> c91f469f3cbe28aba936ad5bbea6714d1e809a0a
