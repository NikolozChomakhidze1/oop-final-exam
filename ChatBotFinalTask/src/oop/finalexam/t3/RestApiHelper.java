package oop.finalexam.t3;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class RestApiHelper {

    public static String createBlogPost(String urlString, String title, String content) throws IOException {
        URL url = new URL(urlString + "?action=createPost");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);

        String postData = "title=" + URLEncoder.encode(title, "UTF-8")
                + "&content=" + URLEncoder.encode(content, "UTF-8");

        try (OutputStream os = con.getOutputStream()) {
            os.write(postData.getBytes());
            os.flush();
        }

        return readResponse(con);
    }

    public static String getAllBlogPosts(String urlString) throws IOException {
        URL url = new URL(urlString + "?action=getPosts");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        return readResponse(con);
    }

    public static String getStatistics(String urlString) throws IOException {
        URL url = new URL(urlString + "?action=getStats");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        return readResponse(con);
    }

    private static String readResponse(HttpURLConnection con) throws IOException {
        int status = con.getResponseCode();
        InputStream inputStream = (status < 400) ? con.getInputStream() : con.getErrorStream();

        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder();

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine).append("\n");
        }
        in.close();

        return response.toString();
    }
}
