package Wed_15_03_2023;

import java.util.HashMap;
import java.util.Map;



public class TrieNode
{
    // each node stores a map to its child nodes
    Map<Character, TrieNode> child = new HashMap<>();
 
    // keep track of the total number of times the current node is visited
    // while inserting data in Trie
    int freq = 0;
}
 
class Main
{
    // Function to insert a given string into a Trie
    public static void insert(TrieNode root, String word)
    {
        // start from the root node
        TrieNode curr = root;
        for (char c: word.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.child.putIfAbsent(c, new TrieNode());
 
            // increment frequency
            curr.child.get(c).freq++;
 
            // go to the next node
            curr = curr.child.get(c);
        }
    }
 
    // Function to recursively traverse the Trie in a preorder fashion and
    // print the shortest unique prefix for each word in the Trie
    public static void printShortestPrefix(TrieNode root, String word_so_far)
    {
        if (root == null) {
            return;
        }
 
        // print `word_so_far` if the current Trie node is visited only once
        if (root.freq == 1)
        {
            System.out.println(word_so_far);
            return;
        }
 
        // recur for all child nodes
        for (Map.Entry<Character, TrieNode> child: root.child.entrySet()) {
            printShortestPrefix(child.getValue(), word_so_far + child.getKey());
        }
    }
 
    // Find the shortest unique prefix for every word in a given array
    public static void findShortestPrefix(String[] words)
    {
        // construct a Trie from the given items
        TrieNode root = new TrieNode();
        for (String s: words) {
            insert(root, s);
        }
 
        // Recursively traverse the Trie in a preorder fashion to list all prefixes
        printShortestPrefix(root, "");
    }
 
    public static void main(String[] args)
    {
        String[] words = { "AND", "BONFIRE", "BOOL", "CASE", "CATCH", "CHAR" };
        findShortestPrefix(words);
    }
}

