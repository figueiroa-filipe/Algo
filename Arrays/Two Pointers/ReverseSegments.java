/**
 * Problema: Reverse Words
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Direct Application)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given a string s, write a function that reverses the words in the given string
 * while preserving the original word order. The string may contain leading or
 * trailing white spaces, and the words in the input string might be separated
 * by more than a single space character.
 * 
 * Restrições:
 * - Preservar a ordem das palavras
 * - Reverter apenas as letras dentro de cada palavra
 * - Pode haver múltiplos espaços entre palavras
 * - Pode haver espaços no início/fim
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre cada palavra
 * - Espaço: O(n) - para o array de palavras
 * 
 * Empresas: Facebook, Amazon, Google, Microsoft
 */

class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        
        for (int i = 0; i < strArr.length; i++) {
            int esquerda = 0;
            int direita = strArr[i].length() - 1;
            
            char[] letrasPalavra = strArr[i].toCharArray();
            
            while (esquerda < direita) {
                char tempChar = letrasPalavra[esquerda];
                letrasPalavra[esquerda] = letrasPalavra[direita];
                letrasPalavra[direita] = tempChar;
                esquerda++;
                direita--;
            }
            
            strArr[i] = String.valueOf(letrasPalavra);
        }
        
        return String.join(" ", strArr);
    }
}
