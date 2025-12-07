/**
 * Problema: Two Sum
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Reduction)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given an integer array arr and an integer target, write a function to check if
 * two numbers exist in the array that sum up to the target. If such a pair exists,
 * return them in an array, if not return an empty array. You can return the answer
 * in any order.
 * 
 * Tradução:
 * Dado um array de inteiros arr e um inteiro target (alvo), escreva uma função
 * para verificar se dois números existem no array que somam até o alvo. Se tal
 * par existir, retorne-os em um array, se não retorne um array vazio. Você pode
 * retornar a resposta em qualquer ordem.
 * 
 * Nota:
 * It is guaranteed that not more than one answer exists.
 * (É garantido que não existe mais de uma resposta)
 * 
 * Restrições:
 * - Array ordenado (necessário para two pointers reduction)
 * - Encontrar exatamente um par
 * - Pode retornar em qualquer ordem
 * 
 * Complexidade:
 * - Tempo: O(n log n) - devido ao sort + O(n) para two pointers
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Amazon, Apple, Google, Facebook, Microsoft, Adobe
 */

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        if (arr.length <= 1) return new int[0];
        
        Arrays.sort(arr);
        
        int esquerda = 0;
        int direita = arr.length - 1;
        
        while (esquerda < direita) {
            int soma = arr[esquerda] + arr[direita];
            if (soma == target) return new int[]{arr[esquerda], arr[direita]};
            if (soma < target) esquerda++;
            else direita--;
        }
        
        return new int[0];
    }
}
