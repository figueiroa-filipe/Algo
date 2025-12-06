Técnica dos Dois Ponteiros (Two Pointers)
O que é?
A técnica dos dois ponteiros é como ter dois dedos apontando para diferentes posições em uma fila de pessoas. Imagine que você tem uma lista de números em ordem, e precisa encontrar dois números que somados dão um valor específico.
Em vez de verificar todas as combinações possíveis (o que seria muito lento), você coloca:

Um ponteiro no início da lista
Outro ponteiro no final da lista

Então você move esses ponteiros de forma inteligente até encontrar a resposta!
Como funciona?
Passos básicos:

Coloque um ponteiro left (esquerda) no início do array
Coloque um ponteiro right (direita) no final do array
Compare ou calcule algo usando os valores apontados
Mova os ponteiros baseado no resultado:

Se o valor for muito pequeno → mova left para a direita
Se o valor for muito grande → mova right para a esquerda
Se encontrou a resposta → pronto!



Exemplo Prático
Problema: Encontrar dois números que somados dão 9 no array [2, 3, 4, 5, 6, 7, 8]
Array:  [2, 3, 4, 5, 6, 7, 8]
         ↑                 ↑
       left              right

Soma: 2 + 8 = 10 (muito grande!)
Move right para esquerda

Array:  [2, 3, 4, 5, 6, 7, 8]
         ↑              ↑
       left           right

Soma: 2 + 7 = 9 ✓ Encontrou!
Quando usar?
✅ Use quando:

O array estiver ordenado (ou você puder ordená-lo)
Precisar encontrar pares de elementos
Precisar verificar palíndromos
Trabalhar com subarrays ou subsequências

Complexidade

Tempo: O(n) - muito rápido! Percorre o array apenas uma vez
Espaço: O(1) - não precisa de memória extra

Aplicações Comuns

Encontrar pares com soma específica
Verificar se uma string é palíndromo
Remover duplicatas de array ordenado
Encontrar triplas que somam zero
Problemas de recipientes/containers
