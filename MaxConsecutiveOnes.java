/**
 * Problema: Q3. Max Consecutive Ones
 * Fonte: LeetCode
 * Dificuldade: Easy
 * 
 * Descrição:
 * Dado um array binário `nums`, retorne o maior número de 1's consecutivos no array.
 * 
 * Exemplo:
 * Entrada: nums = [1,1,0,1,1,1]
 * Saída: 3
 * 
 * Abordagem:
 * - Percorre o array contando a sequência atual de 1's
 * - Quando encontra 1, incrementa o contador
 * - Atualiza o resultado com o máximo encontrado
 * - Quando encontra 0, reseta o contador
 * 
 * Complexidade:
 * Tempo: O(n)
 * Espaço: O(1)
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int result = 0;

        for (int n : nums) {
            if (n == 1) result = Math.max(result, ++maxCount);
            else maxCount = 0;
        }

        return result;
    }
}
