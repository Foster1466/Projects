package com.assignment.task5;

public class Exercise5 {
    public static void main(String[] args) {
        String s = "Eenie Meenie Miney Mo".toLowerCase();
        int vowels = 0, consonants=0;

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels+=1;
            } else if(c!=' ') {
                consonants+=1;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
