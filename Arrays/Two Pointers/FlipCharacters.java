/**
 * Problema: Flip Characters
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Direct Application)
 * Tempo estimado: 10min
 * 
 * Descrição:
 * Given an array of characters arr, write a function that reverses the given
 * array by swapping equidistant elements from the start and the end.
 * 
 * Restrições:
 * - Your function must do it by modifying the input string in-place
 * - O(1) space complexity
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre metade do array
 * - Espaço: O(1) - apenas variáveis auxiliares
 * 
 * Empresas: Apple, Amazon, Microsoft
 */

class Solution {
    public void flipCharacters(char[] arr) {
        if (arr.length == 0) return;
        
        int size = arr.length;
        int esquerda = 0;
        int direita = size - 1;
        
        while (esquerda < direita) {
            char tempChar = arr[esquerda];
            arr[esquerda] = arr[direita];
            arr[direita] = tempChar;
            
            esquerda++;
            direita--;
        }
    }
}
