import java.io.*;
import java.util.*;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();
    //This var "input" be the first word that its string should be used to compare with the rest words

    ArrayList<String> wordList = new ArrayList<String>();
    //Use ArrayList to make sure I can iterate and compare each word with some characters
    
    String s = null;
    while ((s=br.readLine())!=null)
    {
      String[] tokens = s.split(" ");
      // Read all word inputs separated by space

      for(int i=0; i < tokens.length; i++){
        if(!wordList.contains(tokens[i])){
          wordList.add(tokens[i]);
        }
        //Make sure there is no duplicates in the wordList
      }
    }
    
    char[] firstStringChar = input.toCharArray();
    //Convert the first string into char list

    Set<Character> firstStringCharSet = new TreeSet<>();
    
    for(char c : firstStringChar){
      firstStringCharSet.add(c);
    }
    //Convert the char array to treeSet for comparing with the rest words
    
    int count = 0;
    
    for(int j = 0; j < wordList.size(); j++){
      char[] currentCharArrayFromWord = wordList.get(j).toCharArray();
      
      boolean judgeContain = true;
      
      for(int k = 0; k < currentCharArrayFromWord.length; k++){
        judgeContain = firstStringCharSet.contains(currentCharArrayFromWord[k]) && judgeContain;
        //Check if the word contains all the characters in firstStringCharSet
      }
      
      if(judgeContain == true){
        count++;
        //if true, plus 1
      }
      
      judgeContain = true;
      //reset the judgeContain 
    }
    
    System.out.println(count);
    //print out the final result
  }
}