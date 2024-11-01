package com.example.demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoTestConnection {
    public static void main(String[] args) {
        String uri = "mongodb+srv://ismailouali:mongo@cluster0.osyxt.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Pigeon");
            System.out.println("Connection to MongoDB successful!");
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}