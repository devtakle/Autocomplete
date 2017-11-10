
package autocomplete;

/**
 *
 * @author devtakle
 */
public class TrieNode {
    TrieNode[] children; // child nodes of the trie node
    char stored; // the char at this tree node
    boolean check; // check if word ends at this tree node
    private static int MAX_CHILDREN = 26;
    String word;
    public TrieNode() {
        this.children = new TrieNode[MAX_CHILDREN];
    }
    public TrieNode(char stored) {
        this();
        this.stored = stored;
        
    }
}
