# Conteúdo e atividades aula 02/08
## Conteúdo da aula sobre layoutManager e atividades

# introdução
- Assim como qualquer outro elemento na programação java, as telas também são objetos.
- O pacote java.swing traz classes que geram objetos que representam as telas (Paineis, listas, botões, campos, textos, rótulos, entre outros).
- Além do que vemos na tela, há outros objetos envolvidos no processo de criação de telas, os (listeners, layouts, entre outros).
- Para livrar o programador de perder tempo posicionando os elementos de layout na tela, os elementos do java.swing possui gerenciadores de leiaute, ou LayoutManagers.
- Um gerenciado de layout faz a organização dos elementos dentro de um container
- Os principais gerenciadores de layout
###	FlowLayout
-		Coloca os componentes em sequência, da esquerda para direita, na ordem que forem adicionados.
-		É possível também especificar a posição que o elemento deve ser adicionado, passando ao método add um índice.
###	BorderLayout
-		Este padrão organiza os componentes em 5 possíveis área, norte, sul, leste, oeste e Centro.
###	GridLayout
-		Organiza os componentes em linhas e colunas
```		
``` Fonte: Java Como Programar. p.643, item 12.14;
```
# Documentações
- Sobre o layout manager [https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html]
# Outros recursos
- Pacote de ícones em png 24x24 [http://www.icon-files.com/downloads/icon-design-pack.zip]
# Atividades
## Step-by-Step instructions
- faça um fork deste repositórios
- clone o repositório para a máquina
- crie um pacote para seu codigo fonte
- Crie 3 classes (1 para cada tela), você deverá criar uma tela com o BorderLayout, Outra com FlowLayout e Outra com GridLayout.
- As 3 telas devem conter componentes
- As 3 telas devem implementar a interface Tela do pacote br.com.adrianob deste projeto.
- Para cada tela você deve criar uma fabrica de tela ou Factory (nada mais é do que uma classe que deve implementar a interface TelaFactory também do pacote br.com.adrianob)
- Por último, quando já tiver todas as telas e factories criadas, faça a alteração do arquivo LayoutManagers e nas linhas comentadas (linhas 17,18,19), descomente-as e substitua pelo factory de cada uma de suas telas.
- Execute o projeto para testar.
- Faça o commit
- Envie para o seu repositório
- Faça o envio de um pull request para este repositório adicionando um comentário da seguinte forma
``` 
- #ownSEU NOME COMPLETO#own
```
- O exercício será avaliado e pontuado. O Requisito inicial de avaliação é o pull request atendendo estes requisitos. 
# NÃO SERÁ ANALISADO NENHUM OUTRO CÓDIGO FONTE ENVIADO POR OUTRO MEIO ZERANDO ESTA PONTUAÇÃO.
