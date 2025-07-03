package oop.finalexam.t3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ChatBot bot = new ChatBot("src/oop/finalexam/t3/config.txt");
            bot.start();
        } catch (IOException e) {
            System.out.println("Error loading configuration: " + e.getMessage());
        }
    }
}
