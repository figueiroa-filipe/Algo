# 🎯 Two Pointers Pattern — Guia Completo

## 📘 O que é o Padrão Two Pointers?

O padrão **Two Pointers** utiliza **dois índices** para percorrer um array/string de forma **eficiente**.
Em vez de testar todas as combinações possíveis (O(n²)), você move dois ponteiros de forma inteligente e resolve o problema em **O(n)**.

**Analogia:**
Imagine que você tem uma régua com vários números. Em vez de comparar cada número com todos os outros, você usa dois dedos que se movem baseados em regras simples.

---

## 🚀 Por que usar?

* **Performance:** reduz O(n²) → O(n)
* **Código mais limpo**
* **Pouca memória (O(1))**
* **Funciona para uma grande variedade de problemas**

---

# 📚 Os 3 Tipos de Two Pointers

---

# 1️⃣ Aplicação Direta (Direct Application)

### 💡 Ideia

Os ponteiros começam **nos extremos do array** e se movem **um em direção ao outro**.

### Quando usar

* Array **ordenado**
* Problemas que envolvem **par de valores**
* Verificar **simetria**
* Encontrar soma/diferença alvos

### Palavras-chave

`par`, `soma`, `dois números`, `reverter`, `palíndromo`, `container`, `comparar extremos`

### Template

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int sum = arr[left] + arr[right];

    if (sum == target) return new int[]{left, right};
    if (sum < target) left++;
    else right--;
}
```

### Exemplo rápido

Array: `[1, 2, 3, 4, 5, 6, 7, 8]`
Objetivo: soma = 9

```
1 + 8 = 9 ✓
```

### Exemplos comuns

* Two Sum (ordenado)
* Valid Palindrome
* Reverse String
* Container With Most Water

---

# 2️⃣ Redução do Subproblema (Subproblem Reduction)

### 💡 Ideia

Você **descarta grupos inteiros de possibilidades** com base em decisões lógicas.

É muito usado quando você quer **maximizar ou minimizar** algo.

### Quando usar

* Problemas de **área**, **volume**, **distância**, **largura**
* Quando sempre existe **um lado que nunca levará ao melhor resultado**
* Comparação baseada no **menor ou maior lado**

### Palavras-chave

`max area`, `min`, `max`, `otimizar`, `reduzir espaço de busca`

### Template

```java
int left = 0;
int right = heights.length - 1;
int maxArea = 0;

while (left < right) {
    int width = right - left;
    int height = Math.min(heights[left], heights[right]);

    maxArea = Math.max(maxArea, width * height);

    if (heights[left] < heights[right]) left++;
    else right--;
}
```

### Exemplo: *Container With Most Water*

```
Comparamos os extremos:
- Área depende da menor altura
- Então avançamos o ponteiro da menor linha
```

Esse movimento **remove vários subproblemas impossíveis** de forma segura.

### Exemplos comuns

* Container With Most Water
* Trapping Rain Water
* Minimize Maximum Pair Sum
* Boats to Save People

---

# 3️⃣ Identificando Subproblema (Identifying Subproblem / Sliding Window)

### 💡 Ideia

Os ponteiros avançam **na mesma direção**, criando uma **janela variável**.

Um ponteiro expande a janela, o outro contrai.

### Quando usar

* Subarrays / substrings
* Problemas contínuos
* Somatório de janela
* Contagem de caracteres
* Maior/menor substring com restrições

### Palavras-chave

`substring`, `janela`, `window`, `subarray`, `contínuo`, `k elementos`

### Template

```java
int left = 0, sum = 0;

for (int right = 0; right < arr.length; right++) {
    sum += arr[right];

    while (sum > target) {
        sum -= arr[left];
        left++;
    }

    if (sum == target) return new int[]{left, right};
}
```

### Exemplo: soma = 7 em `[1,2,3,4,5]`

A janela cresce até passar do limite, e então contrai até estabilizar.

### Exemplos comuns

* Longest Substring Without Repeating Characters
* Minimum Window Substring
* Subarray Sum Equals K
* Max Consecutive Ones
* Fruit Into Baskets

---

# 🎯 Como Escolher o Tipo Certo?

### Fluxograma

```
O array está ordenado?
│
├─ SIM → preciso comparar extremos/procurar pares?
│         ├─ SIM → Aplicação Direta
│         └─ NÃO → Talvez Redução
│
└─ NÃO → envolve otimização (max/min)?
          ├─ SIM → Redução do Subproblema
          └─ NÃO → envolve substring/janela?
                     └─ SIM → Identificando Subproblema
```

---

# 🧠 Comparação Rápida

| Critério        | Aplicação Direta | Redução       | Identificando       |
| --------------- | ---------------- | ------------- | ------------------- |
| Movimento       | ← → (opostos)    | ← → (opostos) | → → (mesma direção) |
| Janela          | Não              | Não           | Sim                 |
| Uso principal   | Comparação       | Otimização    | Subarrays           |
| Complexidade    | O(n)             | O(n)          | O(n) amortizado     |
| Array ordenado? | Ideal            | Não precisa   | Não precisa         |

---

# 📊 Complexidade

### Tempo

* **O(n)** em todos os tipos (na maioria dos casos)

### Espaço

* **O(1)** — apenas variáveis auxiliares
