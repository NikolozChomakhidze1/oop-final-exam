package oop.finalexam.t3;

import java.io.IOException;
import java.util.Scanner;

public class ChatBot {
    private String url;
    private String botName;
    private Scanner scanner = new Scanner(System.in);

    public ChatBot(String configFilePath) throws IOException {
        ConfigReader config = new ConfigReader(configFilePath);
        url = config.getUrl();
        botName = config.getBotName();
    }

    public void start() {
        System.out.println(botName + ": Hello! Welcome to the Chat Bot.");

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Create new blog post");
            System.out.println("2. View all blog posts");
            System.out.println("3. View general statistics");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    createBlogPost();
                    break;
                case "2":
                    viewAllBlogPosts();
                    break;
                case "3":
                    viewStatistics();
                    break;
                case "4":
                    System.out.println(botName + ": Goodbye!");
                    return;
                default:
                    System.out.println(botName + ": Invalid option, please try again.");
            }
        }
    }

    private void createBlogPost() {
        System.out.println(botName + ": Creating a new blog post.");
        System.out.print("Enter post title: ");
        String title = scanner.nextLine();

        System.out.print("Enter post content: ");
        String content = scanner.nextLine();

        try {
            String response = RestApiHelper.createBlogPost(url, title, content);
            System.out.println(botName + ": Server response:\n" + response);
        } catch (IOException e) {
            System.out.println(botName + ": Error creating post: " + e.getMessage());
        }
    }

    private void viewAllBlogPosts() {
        System.out.println(botName + ": Fetching all blog posts...");
        try {
            String response = RestApiHelper.getAllBlogPosts(url);
            System.out.println(botName + ": Blog posts:\n" + response);
        } catch (IOException e) {
            System.out.println(botName + ": Error fetching posts: " + e.getMessage());
        }
    }

    private void viewStatistics() {
        System.out.println(botName + ": Fetching general statistics...");
        try {
            String response = RestApiHelper.getStatistics(url);
            System.out.println(botName + ": Statistics:\n" + response);
        } catch (IOException e) {
            System.out.println(botName + ": Error fetching statistics: " + e.getMessage());
        }
    }
}
