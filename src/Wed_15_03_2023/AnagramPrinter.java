package Wed_15_03_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramPrinter {
    private static class Anagram {
        Map<Character, Anagram> children;
        String word;
        
        public Anagram() {
            children = new HashMap<>();
            word = null;
        }
    }
    
    private Anagram root;
    
    public AnagramPrinter() {
        root = new Anagram();
    }
    
    private String sortChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    public void insert(String word) {
        String sortedWord = sortChars(word);
        Anagram node = root;
        for (char c : sortedWord.toCharArray()) {
            node.children.putIfAbsent(c, new Anagram());
            node = node.children.get(c);
        }
        node.word = word;
    }
    
    private void getAnagrams(Anagram node, List<String> anagrams) {
        if (node.word != null) {
            anagrams.add(node.word);
        }
        for (Anagram child : node.children.values()) {
            getAnagrams(child, anagrams);
        }
    }
    
    public void printAnagrams() {
        List<String> anagrams = new ArrayList<>();
        getAnagrams(root, anagrams);
        for (String word : anagrams) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        String[] words = {"actors", "costar", "altered", "related", "auctioned", "education", "aspired", "despair", "mastering", "streaming"};
        AnagramPrinter printer = new AnagramPrinter();
        for (String word : words) {
            printer.insert(word);
        }
        printer.printAnagrams();
    }
}
