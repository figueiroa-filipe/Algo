/**
 * Problema: Duplicate Aware Two Sum
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Reduction)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given an integer array arr and an integer target, write a function to check if
 * two numbers exist in the array that sum up to the target. If such pairs exist,
 * return all of them, if not return an empty array. You can return the answer in
 * any order.
 * 
 * Tradução:
 * Dado um array de inteiros arr e um inteiro target (alvo), escreva uma função
 * para verificar se dois números existem no array que somam até o alvo. Se tais
 * pares existirem, retorne todos eles, se não retorne um array vazio. Você pode
 * retornar a resposta em qualquer ordem.
 * 
 * Restrição Importante:
 * You must not return the same pair more than once i.e. all pairs should be unique.
 * (Você não deve retornar o mesmo par mais de uma vez, ou seja, todos os pares
 * devem ser únicos)
 * 
 * Objetivo:
 * - Encontrar TODOS os pares que somam target
 * - Evitar pares duplicados
 * - Retornar lista de listas
 * 
 * Restrições:
 * - Pode haver múltiplos pares
 * - Pares não devem se repetir
 * - Array pode conter duplicatas
 * 
 * Complexidade:
 * - Tempo: O(n log n) - sort + O(n) para two pointers
 * - Espaço: O(k) - onde k é o número de pares encontrados
 * 
 * Empresas: Amazon, Apple, Google, Facebook, Microsoft, Adobe
 */

import java.util.*;

class Solution {
    public List<List<Integer>> duplicateAwareTwoSum(
        int[] arr,
        int target
    ) {
        List<List<Integer>> lista = new ArrayList<>();
        int esquerda = 0;
        int direita = arr.length - 1;
        Arrays.sort(arr);

        while (esquerda < direita) {
            int soma = arr[esquerda] + arr[direita];

            if (soma == target){
                int first = arr[esquerda];
                int second = arr[direita];
                List<Integer> tempList = Arrays.asList(first, second);

                if (!lista.contains(tempList))
                {
                    lista.add(tempList);
                }
                direita--;
                esquerda++;
            }
            else 
            {
                if (soma < target) esquerda++;
                else direita--;
            }
        }

        return lista;
    }
}
