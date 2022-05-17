# Exercício Herança - Polimorfismo - Java

## Enunciado:

Uma loja que vende CD e DVDs deseja construir um cadastro com seus produtos. Para tanto, foi elaborado um diagrama
de classes, conforme figura abaixo.

![](C:\Pedro\Profissional\TI\Programa NeXT\NeXt\Aulas Java\Polimorfismo\imagem\diagrama_heranca.png)

A tabela abaixo fornece uma descrição dos métodos que deverão ser elaborados para cada uma das classes.

 **Método**    |  **Descrição**
 :--------:| :---------------
 getTipo()     | Retorna uma String com o nome da classe.
 getDetalhes() | Retorna uma String com as informações contidas nos campos.
 printDados()  | Imprime as informações contidas nos campos da classe. Para tanto, usa dois métodos para recuperar estas informações: getTipo() e getDetalhes(). Estas funções por sua vez são polimórficas.
 inserirDados() | Insere os dados necessários para se preencher os campos de um objeto de uma dada classe. Seu comportamento é polimórfico.

 Além dos métodos descritos na tavela acima, deverão ser criados os métodos getters e setters correspondentes para retornar e modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem parâmetros de cada classe. Criar um programa que simule o uso de um cadastro de CD e DVDs.
