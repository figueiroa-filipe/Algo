# 🎯 Two Pointers Pattern - Guia Completo

## Índice
- [O que é o Padrão Two Pointers?](#o-que-é-o-padrão-two-pointers)
- [Por que usar?](#por-que-usar)
- [Os Três Tipos Principais](#os-três-tipos-principais)
  - [1. Aplicação Direta](#1️⃣-aplicação-direta-direct-application)
  - [2. Redução do Subproblema](#2️⃣-redução-do-subproblema-subproblem-reduction)
  - [3. Identificando Subproblema](#3️⃣-identificando-subproblema-identifying-subproblem)
- [Como Identificar Qual Usar?](#-como-identificar-qual-usar)
- [Aplicações Práticas](#-aplicações-no-mundo-real)
- [Complexidade](#-complexidade)

---

## O que é o Padrão Two Pointers?

O padrão **Two Pointers** (Dois Ponteiros) é uma técnica de programação que usa **dois marcadores** (ponteiros) para percorrer uma estrutura de dados, geralmente um array, de forma eficiente.

**Analogia simples:** Imagine que você tem uma fila de pessoas e precisa encontrar duas pessoas específicas. Em vez de comparar cada pessoa com todas as outras (muito demorado!), você usa dois "dedos" que apontam para pessoas diferentes e os move de forma inteligente pela fila.

### Vantagem Principal
- **Sem Two Pointers:** O(n²) - compara cada elemento com todos os outros
- **Com Two Pointers:** O(n) - percorre o array apenas uma vez

---

## Por que usar?

✅ **Eficiência:** Reduz significativamente o tempo de execução
✅ **Simplicidade:** Código mais limpo e fácil de entender
✅ **Versatilidade:** Aplicável a diversos problemas de arrays e strings
✅ **Economia de memória:** Não requer estruturas auxiliares complexas

---

## Os Três Tipos Principais

### 1️⃣ Aplicação Direta (Direct Application)

#### Descrição
Os dois ponteiros começam em **extremos opostos** do array e se movem em direção ao centro.

#### Características
- Array geralmente está **ordenado**
- Ponteiros se movem em **direções opostas**
- Usado para encontrar **pares** de elementos

#### Quando usar
- ✅ Array está ordenado
- ✅ Busca por dois elementos que satisfazem uma condição (soma, diferença, etc.)
- ✅ Problemas de "par" ou "dois números"
- ✅ Reversão de arrays/strings

#### Palavras-chave que indicam uso
`soma igual a`, `par de números`, `dois elementos`, `reverter`, `palíndromo simples`, `container with most water`

#### Template
```java
public int[] twoPointerDirect(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left < right) {
        int currentSum = arr[left] + arr[right];
        
        if (currentSum == target) {
            return new int[]{left, right};
        } else if (currentSum < target) {
            left++;  // Aumenta a soma
        } else {
            right--;  // Diminui a soma
        }
    }
    
    return new int[]{-1, -1};  // Não encontrado
}
```

#### Exemplo Prático
**Problema:** Encontrar dois números em `[1, 2, 3, 4, 5, 6, 7, 8]` que somam 9

```
Passo 1: [1, 2, 3, 4, 5, 6, 7, 8]
          ↑                    ↑
        left                right
        1 + 8 = 9 ✓ Encontrado!
```

#### Aplicações Comuns
- Two Sum (array ordenado)
- Container With Most Water
- Trapping Rain Water
- Valid Palindrome
- Remove Duplicates

---

### 2️⃣ Redução do Subproblema (Subproblem Reduction)

#### Descrição
Os ponteiros começam **juntos** (geralmente nas extremidades) e se afastam, **reduzindo** o problema em partes menores.

#### Características
- Divide o problema em **subproblemas menores**
- Ponteiros se movem **afastando-se** um do outro
- Usado para problemas de **simetria** e **validação**

#### Quando usar
- ✅ Problemas de palíndromo
- ✅ Verificação de strings/arrays válidos
- ✅ Comparação de extremidades
- ✅ Problemas que podem ser divididos ao meio

#### Palavras-chave que indicam uso
`palíndromo`, `válido`, `balanceado`, `simétrico`, `espelhado`, `matching`, `verificar de fora para dentro`

#### Template
```java
public boolean subproblemReduction(String s) {
    int left = 0;
    int right = s.length() - 1;
    
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}
```

#### Exemplo Prático
**Problema:** Verificar se "arara" é um palíndromo

```
Passo 1: a r a r a
         ↑       ↑
         a == a ✓

Passo 2: a r a r a
           ↑   ↑
           r == r ✓

Passo 3: a r a r a
             ↑
         Centro alcançado ✓
```

#### Aplicações Comuns
- Valid Palindrome
- Longest Palindromic Substring
- Valid Parentheses (variação)
- Reverse String
- Compare Version Numbers

---

### 3️⃣ Identificando Subproblema (Identifying Subproblem)

#### Descrição
Os dois ponteiros se movem na **mesma direção**, mas em **velocidades diferentes**, criando uma "janela" que pode expandir ou contrair.

#### Características
- Ponteiros se movem na **mesma direção**
- Velocidades **diferentes** (um lento, um rápido)
- Cria uma **janela deslizante**
- Mais complexo que os outros dois

#### Quando usar
- ✅ Problemas de substring/subarray
- ✅ Janela deslizante (sliding window)
- ✅ Sequências contínuas
- ✅ Quando precisa manter um intervalo variável

#### Palavras-chave que indicam uso
`substring`, `subarray`, `contínuo`, `sequência`, `janela`, `menor/maior substring`, `soma de subarray`, `k elementos`

#### Template
```java
public int[] identifyingSubproblem(int[] arr, int target) {
    int left = 0;
    int currentSum = 0;
    
    for (int right = 0; right < arr.length; right++) {
        currentSum += arr[right];
        
        while (currentSum > target && left <= right) {
            currentSum -= arr[left];
            left++;
        }
        
        if (currentSum == target) {
            return new int[]{left, right};
        }
    }
    
    return new int[]{-1, -1};  // Não encontrado
}
```

#### Exemplo Prático
**Problema:** Encontrar subarray com soma = 7 em `[1, 2, 3, 4, 5]`

```
Passo 1: [1, 2, 3, 4, 5]
          ↑  ↑
          l  r    soma = 1+2 = 3 (< 7, expande)

Passo 2: [1, 2, 3, 4, 5]
          ↑     ↑
          l     r    soma = 1+2+3 = 6 (< 7, expande)

Passo 3: [1, 2, 3, 4, 5]
          ↑        ↑
          l        r    soma = 1+2+3+4 = 10 (> 7, contrai)

Passo 4: [1, 2, 3, 4, 5]
             ↑     ↑
             l     r    soma = 2+3+4 = 9 (> 7, contrai)

Passo 5: [1, 2, 3, 4, 5]
                ↑  ↑
                l  r    soma = 3+4 = 7 ✓ Encontrado!
```

#### Aplicações Comuns
- Longest Substring Without Repeating Characters
- Minimum Window Substring
- Subarray Sum Equals K
- Max Consecutive Ones
- Fruit Into Baskets
- Longest Repeating Character Replacement

---

## 🤔 Como Identificar Qual Usar?

### Fluxograma de Decisão

```
O array está ordenado?
│
├─ SIM → Precisa comparar extremos ou encontrar pares?
│         ├─ SIM → 1️⃣ APLICAÇÃO DIRETA
│         └─ NÃO → Continue
│
└─ NÃO → O problema envolve simetria ou validação?
          ├─ SIM → 2️⃣ REDUÇÃO DO SUBPROBLEMA
          └─ NÃO → Precisa de janela/substring/subarray?
                   └─ SIM → 3️⃣ IDENTIFICANDO SUBPROBLEMA
```

### Tabela de Comparação Rápida

| Critério | Aplicação Direta | Redução | Identificando |
|----------|------------------|---------|---------------|
| **Direção** | Opostas (← →) | Afastando (→ ←) | Mesma (→ →) |
| **Início** | Extremos | Extremos | Início do array |
| **Array ordenado?** | Geralmente SIM | Não necessário | Não necessário |
| **Velocidade** | Igual | Igual | Diferente |
| **Complexidade** | Baixa | Média | Alta |
| **Janela variável?** | NÃO | NÃO | SIM |

---

## 🌍 Aplicações no Mundo Real

### 1. Redes Sociais
- **Aplicação Direta:** Encontrar amigos em comum entre duas pessoas
- **Identificando:** Sugerir novos amigos baseado em interesses

### 2. E-commerce
- **Aplicação Direta:** Encontrar produtos que juntos cabem no orçamento
- **Identificando:** Encontrar combinações de produtos para promoções

### 3. Editores de Texto
- **Redução:** Verificar se parênteses/colchetes estão balanceados
- **Identificando:** Buscar e substituir palavras, spell checker

### 4. Análise de Dados
- **Identificando:** Encontrar períodos com maior/menor vendas
- **Aplicação Direta:** Comparar métricas de períodos diferentes

### 5. Streaming (Netflix, Spotify)
- **Identificando:** Recomendar sequências de conteúdo
- **Aplicação Direta:** Comparar preferências de usuários

### 6. Segurança/Criptografia
- **Redução:** Validar senhas e padrões
- **Identificando:** Detectar padrões suspeitos em logs

---

## 📊 Complexidade

### Temporal
- **Aplicação Direta:** O(n)
- **Redução do Subproblema:** O(n)
- **Identificando Subproblema:** O(n) no melhor caso, O(n²) no pior caso

### Espacial
Todos os três padrões: **O(1)** - usam apenas variáveis auxiliares

### Comparação com Força Bruta
```
Problema: Encontrar par que soma X
- Força Bruta: O(n²) tempo, O(1) espaço
- Two Pointers: O(n) tempo, O(1) espaço
- Hash Map: O(n) tempo, O(n) espaço
```

---
