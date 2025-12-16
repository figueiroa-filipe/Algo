/**
 * Problema: Approximate Three Sum
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Two Pointers (Subproblem)
 * Tempo estimado: 20min
 * 
 * Descrição:
 * Given an integer array arr and an integer target, write a function to find
 * three integers in arr such that the sum is closest to the target. You must
 * return the sum of the three integers.
 * 
 * Tradução:
 * Dado um array de inteiros arr e um inteiro target (alvo), escreva uma função
 * para encontrar três inteiros em arr tal que a soma seja a mais próxima do alvo.
 * Você deve retornar a soma dos três inteiros.
 * 
 * Objetivo:
 * - Encontrar 3 números cuja soma seja a MAIS PRÓXIMA do target
 * - Retornar a SOMA (não os números, apenas o valor da soma)
 * - Pode ser maior ou menor que target
 * 
 * Estratégia:
 * 1. Ordenar o array
 * 2. Para cada elemento fixo (i), usar Two Pointers no resto
 * 3. Calcular a soma e comparar com o melhor resultado atual
 * 4. Atualizar se a diferença for menor
 * 
 * Por que é Subproblem?
 * - Loop externo: fixa um número
 * - Loop do meio: percorre possibilidades para segundo número
 * - Two Pointers: encontra o terceiro número ideal
 * 
 * Complexidade:
 * - Tempo: O(n²) - loop externo O(n) * loop interno O(n)
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Amazon, Facebook, Apple, Bloomberg, Adobe
 */

class Solution {
    public int approximateThreeSum(int[] arr, int target) {
        int esquerda = 0;
        int direita = arr.length - 1;
        int result = arr[0]+arr[1]+arr[2];
        
        while (esquerda < direita) {
            for (int i = esquerda + 1; i < direita; i++) {
                int tempSum = arr[esquerda]+arr[direita]+arr[i];
                boolean diferenca = ((Math.abs(tempSum - target)) <= (Math.abs(result - target)));
                if (diferenca) result = tempSum;
            }
            
            if (result > target) direita--;
            else esquerda++;
        }
        
        return result;
    }
}
