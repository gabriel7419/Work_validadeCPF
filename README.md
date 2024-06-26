# VALIDADOR DE CPF 

A validação de CPF é baseada na verificação dos nove primeiros dígitos do CPF, e comparada com um dos dois últimos dígitos. Os DVs são separados em dois numeros cada número sendo necessário a sua validação individual 

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

2. Após isso deve-se somar todos o resultados:
   
   10 + 9 + 8 + 28 + 24 + 20 + 28 + 21 + 14 = 162    

3. Em seguida dividimos o total do somatório por 11 e consideramos o resto da divisão.

   162 / 11  =    14  com resto 8 

4. Por fim pegar o resto e diminuir por 11

   11 - 8 = 3

Como podemos ver o CPF é inválido pois o primeiro DV ficou diferente 

Ex no codigo:

![image](https://github.com/rodrigoinaldo/Work_validadeCPF/assets/97739673/931db223-6276-4af8-ab7e-d24633c1f60a)

## Segundo digito verificador 
Ao contrário do anterior, em vez multiplicar pela ordem decrescente de 10 até 2 vamos de 11 até 2 usando somando o primeiro DV que acabamos de descobrir

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

2. Após isso deve-se somar todos o resultados
   
   11 + 10 + 9 + 32 + 28 + 24 + 35 + 28 + 21 + 6 = 204

3.Em seguida dividimos o total do somatório por 11 e consideramos o resto da divisão.

  204 / 11  =  18  e  resto 6
  
4. Por fim pegar o resto e diminuir por 11.

   11-6= 5

Porém como o primeiro digito já deu errado não passaria para segunda parte:
Código de Exemplo:
![image](https://github.com/rodrigoinaldo/Work_validadeCPF/assets/97739673/9b971369-fbad-4f4a-84db-552acaa0185b)

A baixo segue um diagrama de atividade para mostrar o funcionamento do software :

![FluxogramasJava](https://github.com/rodrigoinaldo/Work_validadeCPF/assets/97739673/6d65f83a-e7c0-4c22-a222-f96d64a400cc)

--------------------------------
### Trabalho realizado por:
Rodrigo Alcantar -> 13633.

Bruno Cherbaty -> 11174.

Gabriel Paiva -> 13631.

Brenon da Silva -> 13722


