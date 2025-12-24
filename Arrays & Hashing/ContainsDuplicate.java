/**
 * Problema: Contains Duplicate
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Hash Table
 * Tags: Company Tags
 * 
 * Descrição:
 * Given an integer array nums, return true if any value appears more than once
 * in the array, otherwise return false.
 * 
 * Tradução:
 * Dado um array de inteiros nums, retorne true se algum valor aparece mais de
 * uma vez no array, caso contrário retorne false.
 * 
 * Estratégia:
 * - Usar HashSet para rastrear elementos já vistos
 * - Para cada elemento, verificar se já existe no set
 * - Se existe, é duplicata → return true
 * - Se não existe, adicionar ao set e continuar
 * - Se terminar o loop sem encontrar duplicatas → return false
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre o array uma vez
 * - Espaço: O(n) - no pior caso, armazena todos os elementos únicos no HashSet
 * 
 * Empresas: Company Tags (não especificadas)
 */

import java.util.*;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        
        return false;
    }
}
