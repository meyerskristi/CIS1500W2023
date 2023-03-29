package com.example.week12shop;

import java.io.*;
import java.util.Scanner;

public class Shop {
    public boolean addItem(Item item) throws IOException {
        File itemFile = getItemFile(item);

        if (itemFile.exists()) {
            return false;
        }

        writeItemFile(item, itemFile);
        return true;
    }

    private void writeItemFile(Item item, File itemFile) throws IOException {
        PrintWriter outputFile = new PrintWriter(new FileWriter(itemFile));
        outputFile.println(item.getQuantity());
        outputFile.println(item.getPrice());
        outputFile.close();
    }

    public boolean updateItem(Item item) throws IOException {
        File itemFile = getItemFile(item);

        if (!itemFile.exists()) {
            return false;
        }

        writeItemFile(item, itemFile);
        return true;
    }

    private File getItemFile(Item item) {
        File itemFile = new File(item.getName() + ".txt");
        return itemFile;
    }

    public boolean deleteItem(String itemName) {
        File itemFile = getItemFile(new Item(itemName, 0, 0));

        if (!itemFile.exists()) {
            return false;
        }

        itemFile.delete();
        return true;
    }

    public Item getItem(String itemName) throws FileNotFoundException {
        File itemFile = getItemFile(new Item(itemName, 0, 0));

        if (!itemFile.exists()) {
            return null;
        }

        Scanner fileReader = new Scanner(itemFile);
        int quantity = Integer.parseInt(fileReader.nextLine());
        double price = Double.parseDouble(fileReader.nextLine());
        // Item item = new Item(itemName, quantity, price);
        // return item;
        return new Item(itemName, quantity, price);
    }
}