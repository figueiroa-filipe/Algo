/**
 * Problema: Valid Anagram
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Hash Table
 * Tags: Company Tags
 * 
 * Descrição:
 * Given two strings s and t, return true if the two strings are anagrams of
 * each other, otherwise return false.
 * 
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * 
 * Tradução:
 * Dados duas strings s e t, retorne true se as duas strings são anagramas uma
 * da outra, caso contrário retorne false.
 * 
 * Um anagrama é uma string que contém exatamente os mesmos caracteres de outra
 * string, mas a ordem dos caracteres pode ser diferente.
 * 
 * Estratégia:
 * - Verificar se têm o mesmo tamanho (se não, não podem ser anagramas)
 * - Usar dois HashMaps para contar a frequência de cada caractere
 * - Comparar se os dois maps são iguais
 * 
 * Exemplo:
 * Input:  s = "anagram", t = "nagaram"
 * mapS = {a:3, n:1, g:1, r:1, m:1}
 * mapT = {a:3, n:1, g:1, r:1, m:1}
 * Output: true (mesmos caracteres, mesma frequência)
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre ambas strings uma vez + comparação dos maps
 * - Espaço: O(k) - onde k é o número de caracteres únicos (no máximo 26 para lowercase)
 * 
 * Empresas: Company Tags (não especificadas)
 */

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        return mapS.equals(mapT);
    }
}
