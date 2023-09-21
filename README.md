# Arvore Binária de Busca 
Trabalho realizado por Gabriel Molec Nunes, Gustavo Luiz Farignoli e João Gabriel Stresser Trigo para matéria de Resolução de Problemas Estruturados em Computação para o 4 periodo do curso de Engenharia de Software da Pontificia Universidade Católica do Paraná

## Intuito do Projeto
Este projeto tem como objetivo implementação manual de uma árvore binária de busca na linguagem java, com o intuito de simular o funcionamento real de uma BST.

## Principais Classes:
O Programa conta com 3 classes principais:
  - ArvoreBusca
  - No (Classe interna da classe Arvore)
  - TreeFormatter

### TreeFormatter
É a classe responsável pela impressão formatada da árvore para visualização do usuário. esta classe recebe um objeto do tipo ArvoreBusca e percorre seus nós, calculando qual o espacamento necessário entre eles para manter a estrutura da árvore e adicionando os galhos que conectam cada um desses nós.

### No
Esta classe é a classe que preenchem a arvore, mantendo referência do valor de cada um dos nó assim como a referência para os filhos de cada um deles, permitindo a estrutura simplesmente encadeada da classe árvore.
os atributos da classe são:
  - Inteiro valor
  - No esquerdo
  - No direito

### ArvoreBusca
Esta classe é a arvore binária de busca em si em que as operações de inserção, busca e remoção estão armazenadas. O único atributo desta classe é um No chamado raiz, que permite o deslocamento simplesmente encadeado pelos nós que compoem a árvore.

#### Inserção:
No método de inserção é conferido se a raiz é nula, pois se for o caso é preciso atualizar a referência do atributo raiz, se não são feitas chamadas recursivas comparando o valor a ser inserido com o no atual para compreender se é menor, assim sendo feita a mesma chamada ao nó a esquerda, ou maior (ou igual),
assim sendo feita a mesma chamada ao nó a direita, até que se encontre um nó em que esteja vazio para ser feita a inserção.

#### Busca:
No método de busca a mesma chamada recursiva do método da inserção é feita para até que se encontre um nó com o mesmo valor do valor buscado, retornando verdadei caso encontre o valor ou retornado falso caso não seja encontrada.

#### Remoção:
No método de remoção é feita a busca pelo valor passado para remoção e caso seja encontrado é conferido qual a situação do nó a ser removido. Caso o nó a ser removido não tenha filhos é simplesmente feita sua remoção caso contrário é feito a troca de nós para garantir que
seus filhos não serão removidos da árvore, mas ainda seja mantiad as regras da BST (valores menores a esquerda e maiores a direita).
