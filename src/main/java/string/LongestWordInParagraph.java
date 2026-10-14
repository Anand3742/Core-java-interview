package string;

public class LongestWordInParagraph {
	
	public static void main(String[] args) {
		
		String str = "a aa aassn aaasn aabdnnnsdbfs asasasasna asasj asas ";
		

        String[] words = str.split(" ");

        String longest = "";

        for (String word : words) {
        	
            if (word.length() > longest.length()) {
            	
                longest = word;
            }
        }

        System.out.println(longest);
    }

}