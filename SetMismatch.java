/**
 * Problema: Q1. Set Mismatch
 * Fonte: LeetCode / Codeintuition
 * Dificuldade: Easy
 * Padrão: Hash Table / Counting Array
 * Tags: Topics, Companies
 * 
 * Descrição:
 * You have a set of integers s, which originally contains all the numbers from
 * 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated
 * to another number in the set, which results in repetition of one number and
 * loss of another number.
 * 
 * You are given an integer array nums representing the data status of this set
 * after the error.
 * 
 * Find the number that occurs twice and the number that is missing and return
 * them in the form of an array.
 * 
 * Tradução:
 * Você tem um conjunto de inteiros s, que originalmente contém todos os números
 * de 1 a n. Infelizmente, devido a algum erro, um dos números em s foi duplicado
 * para outro número no conjunto, o que resulta em repetição de um número e perda
 * de outro número.
 * 
 * Você recebe um array de inteiros nums representando o status dos dados deste
 * conjunto após o erro.
 * 
 * Encontre o número que ocorre duas vezes e o número que está faltando e retorne-os
 * na forma de um array.
 * 
 * Estratégia - Array de Contagem:
 * 1. Criar array count[size+1] para contar frequência de cada número
 * 2. Percorrer nums e incrementar count[n]
 * 3. Percorrer count:
 *    - Se count[i] == 2 → número duplicado
 *    - Se count[i] == 0 → número faltante
 * 4. Retornar [duplicado, faltante]
 * 
 * Exemplo:
 * Input:  nums = [1,2,2,4]
 * 
 * count = [0, 1, 2, 0, 1]  (índices 0 a 4)
 *             ↑  ↑  ↑  ↑
 *             1  2  3  4
 * 
 * count[2] = 2 → duplicado = 2
 * count[3] = 0 → faltante = 3
 * 
 * Output: [2, 3]
 * 
 * Complexidade:
 * - Tempo: O(n) - duas passadas pelo array
 * - Espaço: O(n) - array count de tamanho n+1
 * 
 * Empresas: Companies (não especificadas)
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        int[] count = new int[size + 1];
        int duplicado = -1, faltante = -1;
        
        for (int n : nums) count[n]++;
        
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) duplicado = i;
            if (count[i] == 0) faltante = i;
        }
        
        return new int[]{duplicado, faltante};
    }
}
