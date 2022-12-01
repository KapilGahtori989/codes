public class Tries{
    static class Node{
        Node[] children =new Node[26];///'a'-'z'
        boolean eow=false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    //INSERTING
    private static void insert(String word){
        Node curr = root;
        for(int level =0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }
    private static Node root = new Node(); 

    //SEARCHING
    private static boolean search(String key){
        Node curr = root;
        for(int level =0;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow ==true;
    }
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        //SEARCHING FOR TRIE
        System.out.println(search("thee"));
        System.out.println(search("thor"));

    }
}