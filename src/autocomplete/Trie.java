/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocomplete;

/**
 *
 * @author devtakle
 */
public class Trie {

    TrieNode root;

    public Trie() {
        this.root = new TrieNode(' ');
    }

    public void add(String word) {
        char arr[] = word.toCharArray();
        TrieNode temp = root;
        TrieNode second = null;
        int i = 0;
        do {
            second = temp.children[arr[i] - 'A'];// gives the index of stored
            if (second != null) {
                temp = second;
                i++;
                if (i >= word.length()) //word already in trie {
                {
                    temp.check = true; //word ends here
                    temp.word = word;
                    return;
                }
                temp.word = word;
            }
        } while (second != null);
        
        //if word is not already present second will be null, and temp will 
        //be the last possible character that matches with the word to be added
        for(;i<arr.length;i++) {
            temp.children[arr[i] - 'A'] = new TrieNode(arr[i]);
            temp = temp.children[arr[i] - 'A'];
        }
        //word has been added
        temp.check = true;
        temp.word = word;
    }
}

