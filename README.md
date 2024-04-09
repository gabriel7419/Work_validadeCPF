#VALIDADOR DE CPF 

A validação de CPF é baseada na verificação dos nove primeiros dígitos do CPF, e comparada com um dos dois últimos dígitos. Os DVs são separados em dois numeros cada numero sendo necessario a sua validação individual 

CPF que vamos usar como exemplo: 111.444.777

##Primeiro digito verificador 
1. O primeiro passo é calcular o primeiro dígito verificador, e para isso, separamos os primeiros 9 dígitos do CPF e multiplicamos cada um dos números, da direita para a esquerda por números crescentes a partir do número 2:

| 1 | 1 | 1 | 4 | 4 | 4 | 7 | 7 | 7 |  
| 10 | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 |
| 10 | 9 | 8 | 28 | 24 | 20 | 28 | 21 | 14 |
