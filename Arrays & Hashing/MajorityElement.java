/**
 * Problema: Majority Element
 * Fonte: LeetCode
 * Dificuldade: Easy
 * 
 * Descrição:
 * Dado um array de inteiros `nums` de tamanho n, retorne o elemento majoritário.
 * 
 * O elemento majoritário é o elemento que aparece mais de ⌊n / 2⌋ vezes.
 * É garantido que o elemento majoritário sempre existe no array.
 * 
 * Abordagem:
 * Implementação do algoritmo Boyer-Moore Voting.
 * - Mantém um candidato (`resultado`)
 * - Mantém um contador (`quantidade`)
 * - Quando o contador zera, o candidato é atualizado
 * 
 * Complexidade:
 * Tempo: O(n)
 * Espaço: O(1)
 */

class Solution {
    public int majorityElement(int[] nums) {
        int resultado = 0, quantidade = 0;

        for (int valor : nums) {
            if (quantidade == 0) resultado = valor;
            quantidade += (valor == resultado) ? 1 : -1;
        }

        return resultado;
    }
}
