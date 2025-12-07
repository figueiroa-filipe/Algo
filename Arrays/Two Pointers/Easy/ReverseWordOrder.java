/**
 * Problema: Reverse Segments
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Subproblem)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given a string s and an integer k, write a function that reverses k characters
 * of the string for every 2k characters from the start of the string and returns
 * the new string.
 * 
 * Explicação:
 * - A cada 2k caracteres, reverte os primeiros k
 * - Se sobrarem menos de k caracteres, reverte todos os restantes
 * - Se sobrarem entre k e 2k caracteres, reverte apenas os primeiros k
 * 
 * Restrições:
 * - 1 ≤ k ≤ s.length
 * - Processar em blocos de 2k
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre a string uma vez
 * - Espaço: O(n) - para o char array
 * 
 * Empresas: Apple
 */

class Solution {
    public String reverseSegments(String s, int k) {
        char[] charArray = s.toCharArray();
        int sizeArray = charArray.length;
        
        for(int i = 0; i < sizeArray; i+=(2*k)) {
            int esquerda = i;
            int direita = (k > (sizeArray - i))? sizeArray - 1 : i + k - 1;
            
            while (esquerda < direita) {
                char temp = charArray[esquerda];
                charArray[esquerda] = charArray[direita];
                charArray[direita] = temp;
                esquerda++;
                direita--;
            }
        }
        
        return new String(charArray);
    }
}
