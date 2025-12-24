/**
 * Problema: Two Sum
 * Fonte: LeetCode
 * Dificuldade: Easy
 * Padrão: Hash Table
 * Tags: Company Tags
 *
 * Descrição:
 * Given an array of integers nums and an integer target,
 * return the indices i and j such that nums[i] + nums[j] == target and i != j.
 *
 * You may assume that each input has exactly one solution,
 * and you may not use the same element twice.
 *
 * Return the answer with the smaller index first.
 *
 * Tradução:
 * Dado um array de inteiros nums e um inteiro target,
 * retorne os índices i e j tais que nums[i] + nums[j] == target e i != j.
 *
 * Você pode assumir que cada entrada possui exatamente uma solução
 * e não é permitido usar o mesmo elemento duas vezes.
 *
 * Retorne a resposta com o menor índice primeiro.
 *
 * Estratégia:
 * - Usar um HashMap para armazenar o valor do array como chave
 *   e seu índice como valor
 * - Para cada número, calcular a diferença: target - nums[i]
 * - Verificar se essa diferença já existe no map
 *   - Se existir, encontramos a solução
 * - Caso contrário, armazenar o número atual no map
 *
 * Exemplo:
 * Input: nums = [2, 7, 11, 15], target = 9
 *
 * Iteração:
 * i = 0 → nums[i] = 2 → diferença = 7 → map = {}
 * i = 1 → nums[i] = 7 → diferença = 2 → map contém 2
 *
 * Output: [0, 1]
 *
 * Complexidade:
 * - Tempo: O(n) — percorre o array apenas uma vez
 * - Espaço: O(n) — HashMap pode armazenar até n elementos
 *
 * Empresas: Company Tags (não especificadas)
 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diferenca = target - nums[i];

            if (map.containsKey(diferenca)) {
                return new int[] { map.get(diferenca), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
