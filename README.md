# VALIDADOR DE CPF 

A validação de CPF é baseada na verificação dos nove primeiros dígitos do CPF, e comparada com um dos dois últimos dígitos. Os DVs são separados em dois numeros cada numero sendo necessario a sua validação individual 

CPF que vamos usar como exemplo: 111.444.777-05

## Primeiro digito verificador 
1. O primeiro passo é calcular o primeiro dígito verificador, e para isso, separamos os primeiros 9 dígitos do CPF e multiplicamos cada um dos números, da direita para a esquerda por números crescentes a partir do número 2:

| Dígito | Número correspondente | Result. multiplicação |
|--------|-----------------------|-----------------------|
| 1      | 10                    | 10                    |
| 1      | 9                     | 9                     |
| 1      | 8                     | 8                     |
| 4      | 7                     | 28                    |
| 4      | 6                     | 24                    |
| 4      | 5                     | 20                    |
| 7      | 4                     | 28                    |
| 7      | 3                     | 21                    |
| 7      | 2                     | 14                    |

2. Após isso deve-se comar todos o resultados
   
   10 + 9 + 8 + 28 + 24 + 20 + 28 + 21 + 14 = 162    

3. em seguida dividimos o total do somatório por 11 e consideramos o resto da divisão.

   162 / 11  =    14  com resto 8 

4. por fim pegar o resto e diminuir por 11

   11 - 8 = 3

como podemos ver o CPF é ivalido voi o primeiro DV ficou diferente 

ex no codigo:
![image](https://github.com/rodrigoinaldo/Work_validadeCPF/assets/97739673/931db223-6276-4af8-ab7e-d24633c1f60a)

## Segundo digito verificador 
Ao contrario do anterios em vez multiplicar pela orden decrecebte de 10 ate 2 vomos de 11 até 2 usando mais o primeiro DV que acabamos de descobrir

| Dígito | Número correspondente | Result. multiplicação |
|--------|-----------------------|-----------------------|
| 1      | 11                    | 11                    |
| 1      | 10                    | 10                    |
| 1      | 9                     | 9                     |
| 4      | 8                     | 32                    |
| 4      | 7                     | 28                    |
| 4      | 6                     | 24                    |
| 7      | 5                     | 35                    |
| 7      | 4                     | 28                    |
| 7      | 3                     | 21                    |
| 3      | 2                     | 6                     |

2. Após isso deve-se comar todos o resultados
   
   11 + 10 + 9 + 32 + 28 + 24 + 35 + 28 + 21 + 6 = 204

3.em seguida dividimos o total do somatório por 11 e consideramos o resto da divisão.

  204 / 11  =  18  e  resto 6
  
4. por fim pegar o resto e diminuir por 11

   11-6= 5

porem como o primeiro digito ja deu errado não passaria para segunda parte:
ex code:
![image](https://github.com/rodrigoinaldo/Work_validadeCPF/assets/97739673/9b971369-fbad-4f4a-84db-552acaa0185b)

Abaixo segue um diagrama de atividade para mostrar o funcionamento do software 

[Fluxogramas JAVA.pdf](https://github.com/rodrigoinaldo/Work_validadeCPF/files/14933067/Fluxogramas.JAVA.pdf)


