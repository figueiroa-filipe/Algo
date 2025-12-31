/**
 * Problema: Longest Common Prefix
 * Fonte: Codeintuition
 * Dificuldade: Easy
 * Padrão: String Manipulation
 * Tags: Company Tags
 * 
 * Descrição:
 * You are given an array of strings strs. Return the longest common prefix
 * of all the strings.
 * 
 * If there is no longest common prefix, return an empty string "".
 * 
 * Tradução:
 * Você recebe um array de strings strs. Retorne o maior prefixo comum de todas
 * as strings.
 * 
 * Se não houver prefixo comum mais longo, retorne uma string vazia "".
 * 
 * Estratégia:
 * - Usar a primeira string como prefixo inicial
 * - Para cada string seguinte, comparar caractere por caractere
 * - Parar quando encontrar diferença
 * - Reduzir o prefixo até onde todas as strings concordam
 * - Usar Math.min() para não ultrapassar o tamanho de nenhuma string
 * 
 * Exemplo 1:
 * Input:  ["bat", "bag", "bank", "band"]
 * 
 * prefix = "bat" (primeira string)
 * Compara com "bag":
 *   'b' == 'b' ✅
 *   'a' == 'a' ✅
 *   't' != 'g' ❌ → prefix = "ba"
 * 
 * Compara "ba" com "bank":
 *   'b' == 'b' ✅
 *   'a' == 'a' ✅
 *   prefix continua "ba"
 * 
 * Output: "ba"
 * 
 * Exemplo 2:
 * Input:  ["dog", "racecar", "car"]
 * Output: "" (nenhum prefixo comum)
 * 
 * Complexidade:
 * - Tempo: O(n * m) - n strings, m comprimento mínimo
 * - Espaço: O(m) - para armazenar o prefixo (usa substring)
 * 
 * Empresas: Company Tags (não especificadas)
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            int j = 0;
            while (j < Math.min(prefix.length(), strs[i].length())) {
                if (prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        
        return prefix;
    }
}
