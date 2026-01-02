/**
 * Problema: 961. N-Repeated Element in Size 2N Array
 * Fonte: LeetCode / Codeintuition
 * Dificuldade: Easy
 * Padrão: Hash Table
 * Tags: Topics, Companies
 * 
 * Descrição:
 * You are given an integer array with the following properties:
 * - nums.length == 2 * n
 * - nums contains n + 1 unique elements
 * - Exactly one element of nums is repeated n times
 * 
 * Return the element that is repeated n times.
 * 
 * Tradução:
 * Você recebe um array de inteiros com as seguintes propriedades:
 * - nums.length == 2 * n (tamanho é o dobro de n)
 * - nums contém n + 1 elementos únicos
 * - Exatamente um elemento de nums é repetido n vezes
 * 
 * Retorne o elemento que é repetido n vezes.
 * 
 * Estratégia - HashMap com Contagem:
 * 1. Calcular n = nums.length / 2
 * 2. Usar HashMap para contar frequência de cada elemento
 * 3. Quando encontrar elemento com frequência == n, retornar
 * 4. getOrDefault(num, 0) + 1 para incrementar contador
 * 
 * Exemplo:
 * Input:  nums = [1,2,3,3]
 * n = 4/2 = 2
 * 
 * map após processamento:
 * {1: 1, 2: 1, 3: 2}
 *                ↑
 *         frequência = n = 2
 * 
 * Output: 3 (aparece n=2 vezes)
 * 
 * Propriedades do Array:
 * - Total de elementos: 2n
 * - Elementos únicos: n+1
 * - Um deles aparece n vezes
 * - Os outros n aparecem 1 vez cada
 * 
 * Exemplo com n=3:
 * Array tem 6 elementos (2*3)
 * 4 elementos únicos (3+1)
 * Um aparece 3 vezes, três aparecem 1 vez
 * [5, 1, 5, 2, 5, 3] → 5 aparece 3 vezes
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre array uma vez, no pior caso
 * - Espaço: O(n) - HashMap armazena até n+1 elementos
 * 
 * Empresas: Companies (não especificadas)
 */

import java.util.*;

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length/2;
        int result = 0;
        
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == n) result = num;
        }
        
        return result;
    }
}
