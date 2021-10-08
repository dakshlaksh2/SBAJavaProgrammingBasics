package org.perscholas;

public class ReverseArray {
    public static void reverseWords(char[] message) {
        //converting the array into string
        String message1 = String.copyValueOf(message);
        System.out.println(message1);
        //Splitiing the words to make as an word array
        String[] split = message1.split(" ");
        //Reversing the array
        for (int i = split.length - 1; i >= 0; i--) {
          String result =split[i];
            System.out.print(result+" ");

        }// End of for loop
    }//End of method

    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
        reverseWords(message);


    }

    }

