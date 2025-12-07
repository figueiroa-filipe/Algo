/**
 * Problema: Reverse Word Order
 * Fonte: Codeintuition
 * Dificuldade: Medium
 * Padrão: Two Pointers (Direct Application)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given a string s, write a function that returns a string of words in reverse
 * order concatenated by a single space. The words of the input string are
 * separated by at least a single space. The string may contain leading or
 * trailing white spaces or multiple spaces between two words. The returned
 * string must only have one space between the words. Do not include any
 * leading or trailing whitespaces.
 * 
 * Restrições:
 * - Inverter a ordem das palavras (última vira primeira)
 * - Remover espaços extras do início/fim
 * - Manter apenas um espaço entre palavras
 * - Split considera múltiplos espaços
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre a string e o array
 * - Espaço: O(n) - para o array de palavras
 * 
 * Empresas: Microsoft, Apple, Amazon
 */

class Solution {
    public String reverseWordOrder(String s) {
        String[] arrayOfString = s.trim().split("[^a-zA-Z0-9.?]+");
        int esquerda = 0;
        int direita = arrayOfString.length - 1;
        
        while (esquerda < direita) {
            String tempString = arrayOfString[esquerda];
            arrayOfString[esquerda] = arrayOfString[direita];
            arrayOfString[direita] = tempString;
            esquerda++;
            direita--;
        }
        
        return String.join(" ", arrayOfString);
    }
}
