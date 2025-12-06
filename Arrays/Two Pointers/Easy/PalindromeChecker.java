/**
 * Problema: Palindrome Checker
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Direct Application)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given a string s, write a function that returns true if it is a palindrome
 * or false otherwise.
 * 
 * A palindrome is a string that reads the same forward and backward after
 * converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters.
 * 
 * Alphanumeric characters include letters and numbers - [a, z], [A, Z], [0, 9]
 * 
 * Restrições:
 * - Converter para lowercase
 * - Remover caracteres não alfanuméricos
 * - Considerar apenas letras e números
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre a string uma vez
 * - Espaço: O(n) - para a string processada (ou O(1) com two pointers direto)
 * 
 * Empresas: Facebook, Apple, Google, Microsoft
 */

class Solution {
    public boolean palindromeChecker(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int esquerda = 0;
        int direita = s.length() - 1;
        
        while (esquerda < direita) {
            if (s.charAt(esquerda) != s.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        
        return true;
    }
}
