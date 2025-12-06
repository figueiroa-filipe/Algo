/**
 * Problema: Vowel Exchange
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Direct Application)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given a string s, write a function to reverse the vowels in the string and
 * return the updated string.
 * 
 * For this problem, consider only the vowels in the English alphabet: a, e, i, o, u,
 * including both uppercase and lowercase forms.
 * 
 * Restrições:
 * - Reverter apenas as vogais (a, e, i, o, u)
 * - Considerar maiúsculas e minúsculas
 * - Manter as consoantes nas posições originais
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre a string
 * - Espaço: O(n) - converte para char array
 * 
 * Empresas: Apple, Uber
 */

class Solution {
    public String vowelExchange(String s) {
        char[] arr = s.toCharArray();
        
        String vogais = "aeiouAEIOU";
        
        int esquerda = 0;
        int direita = arr.length - 1;
        
        while (esquerda < direita) {
            if (vogais.indexOf(arr[esquerda]) == -1) {
                esquerda++;
            }
            
            if (vogais.indexOf(arr[direita]) == -1) {
                direita--;
            }
            
            if (vogais.indexOf(arr[esquerda]) != -1 && vogais.indexOf(arr[direita]) != -1) {
                char c = arr[esquerda];
                arr[esquerda] = arr[direita];
                arr[direita] = c;
                esquerda++;
                direita--;
            }
        }
        
        return new String(arr);
    }
}
