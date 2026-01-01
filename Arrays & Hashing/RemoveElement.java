/**
 * Problema: Remove Element
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (In-place Modification)
 * Tags: Company Tags
 * 
 * Descrição:
 * You are given an integer array nums and an integer val. Your task is to remove
 * all occurrences of val from nums in-place.
 * 
 * After removing all occurrences of val, return the number of remaining elements,
 * say k, such that the first k elements of nums do not contain val.
 * 
 * Tradução:
 * Você recebe um array de inteiros nums e um inteiro val. Sua tarefa é remover
 * todas as ocorrências de val de nums in-place (modificando o array original).
 * 
 * Após remover todas as ocorrências de val, retorne o número de elementos
 * restantes, digamos k, tal que os primeiros k elementos de nums não contenham val.
 * 
 * Notas Importantes:
 * - The order of the elements which are not equal to val does not matter
 *   (A ordem dos elementos que não são iguais a val não importa)
 * - It is not necessary to consider elements beyond the first k positions of the array
 *   (Não é necessário considerar elementos além das primeiras k posições do array)
 * 
 * Estratégia - Two Pointers:
 * - Usar ponteiro "ponteiro" para posição de escrita
 * - Percorrer array com índice i
 * - Se elemento atual != val, copiar para posição "ponteiro" e avançar
 * - Se elemento atual == val, apenas pular (não copia)
 * - Retornar "ponteiro" (quantidade de elementos válidos)
 * 
 * Exemplo:
 * Input:  nums = [3,2,2,3], val = 3
 * 
 * i=0: nums[0]=3 == 3 → pula
 * i=1: nums[1]=2 != 3 → nums[0]=2, ponteiro=1
 * i=2: nums[2]=2 != 3 → nums[1]=2, ponteiro=2
 * i=3: nums[3]=3 == 3 → pula
 * 
 * Array final: [2, 2, _, _]
 * Output: k = 2 (dois elementos válidos)
 * 
 * Complexidade:
 * - Tempo: O(n) - uma passada pelo array
 * - Espaço: O(1) - modificação in-place, sem array extra
 * 
 * Empresas: Company Tags (não especificadas)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int ponteiro = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[ponteiro++] = nums[i];
            }
        }
        
        return ponteiro;
    }
}
