package org.example.entity;

import lombok.Data;

import javax.management.loading.MLet;
import javax.swing.*;

@Data
public class Hangman {

    private WordGenerator wordGenerator;
    private String winnerWord;
    private String mask;

    public  String getMask() {
        return mask;
    }

    public Hangman(WordGenerator wordGenerator) {
        this.wordGenerator = wordGenerator;
    }

    public boolean tryChar(char c) {

        for(int i = 0; i < this.winnerWord.length(); i++)
            if(winnerWord.charAt(i) == c){
                updateMask(i, c);
                return true;
            }
        return false;
    }

    public void makeMask() {
        this.winnerWord = wordGenerator.getRandomWord();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i < this.winnerWord.length(); i++) {
            builder.append("_");
        }
        this.mask = builder.toString();
    }

    public void updateMask(int i, char c){
        StringBuilder maskBuilder = new StringBuilder(mask);
        maskBuilder.setCharAt(i, c);
        this.mask = maskBuilder.toString();
    }

}
