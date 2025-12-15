/**
 * Problema: Three Sum
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Two Pointers (Subproblem)
 * Tempo estimado: 20min
 * 
 * Descrição:
 * Given an integer array arr, write a function that returns all the triplets
 * [arr[i], arr[j], arr[k]] such that i != j, i != k, and j != k, and
 * arr[i] + arr[j] + arr[k] == 0. You can return the answer in any order.
 * 
 * Tradução:
 * Dado um array de inteiros arr, escreva uma função que retorna todos os triplets
 * (trios) [arr[i], arr[j], arr[k]] tal que i != j, i != k, e j != k, e
 * arr[i] + arr[j] + arr[k] == 0. Você pode retornar a resposta em qualquer ordem.
 * 
 * Restrição Importante:
 * Notice that the solution set must not contain duplicate triplets.
 * (Observe que o conjunto de soluções não deve conter triplets duplicados)
 * 
 * Estratégia:
 * 1. Ordenar o array
 * 2. Para cada elemento (índice i), resolver o subproblema "Two Sum" para o resto
 * 3. Two Sum procura dois números que somados com arr[i] dão 0
 * 4. Usar Set para evitar duplicatas
 * 
 * Por que é Subproblem?
 * - Problema principal: encontrar triplets que somam 0
 * - Subproblema: para cada número fixo, encontrar dois outros (Two Sum)
 * - Loop externo fixa um número, loop interno usa Two Pointers
 * 
 * Complexidade:
 * - Tempo: O(n²) - O(n) loop externo * O(n) two pointers
 * - Espaço: O(n) - para o Set que evita duplicatas
 * 
 * Empresas: Amazon, Apple, Facebook, Google, Microsoft, Adobe
 */

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            int esquerda = i + 1;
            int direita = arr.length - 1;
            int soma = arr[i];
            
            while (esquerda < direita) {
                int tempSoma = soma + arr[esquerda] + arr[direita];
                
                if (tempSoma == 0) {
                    set.add(Arrays.asList(arr[i], arr[esquerda], arr[direita]));
                    esquerda++;
                    direita--;
                } else if(tempSoma < 0) {
                    esquerda++;
                } else {
                    direita--;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}
