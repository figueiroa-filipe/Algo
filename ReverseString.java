/**
 * Problema: 344. Reverse String
 * Fonte: LeetCode / Codeintuition
 * Dificuldade: Easy
 * Padrão: Two Pointers (Direct Application)
 * Tags: Topics, Companies, Hint
 * 
 * Descrição:
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Tradução:
 * Escreva uma função que reverte uma string. A string de entrada é dada como
 * um array de caracteres s.
 * 
 * Você deve fazer isso modificando o array de entrada in-place com O(1) de
 * memória extra.
 * 
 * Estratégia - Two Pointers:
 * - Ponteiro esquerda começa no início (índice 0)
 * - Ponteiro direita começa no fim (índice length-1)
 * - Trocar elementos nas posições dos ponteiros
 * - Mover ponteiros em direção ao centro
 * - Parar quando se encontram (esquerda >= direita)
 * 
 * Exemplo:
 * Input:  s = ["h","e","l","l","o"]
 * 
 * Passo 1: troca s[0] ↔ s[4]  →  ["o","e","l","l","h"]
 * Passo 2: troca s[1] ↔ s[3]  →  ["o","l","l","e","h"]
 * Passo 3: s[2] (meio, não troca)
 * 
 * Output: ["o","l","l","e","h"]
 * 
 * Complexidade:
 * - Tempo: O(n) - percorre metade do array
 * - Espaço: O(1) - apenas variáveis temporárias (in-place)
 * 
 * Empresas: Companies (não especificadas)
 */

class Solution {
    public void reverseString(char[] s) {
        int esquerda = 0;
        int direita = s.length - 1;
        
        while (esquerda < direita) {
            char temp = s[esquerda];
            s[esquerda] = s[direita];
            s[direita] = temp;
            esquerda++;
            direita--;
        }
    }
}
