package com.example.week12shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button addItemButton;
    @FXML
    private TextField itemNameTextField;
    @FXML
    private TextField itemQuantityTextField;
    @FXML
    private TextField itemPriceTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private Button lookupItemButton;
    @FXML
    private Button updateItemButotn;

    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) throws IOException {
        Shop shop = new Shop();
        try {
            Item item = new Item(itemNameTextField.getText(),
                    Integer.parseInt(itemQuantityTextField.getText()),
                    Double.parseDouble(itemPriceTextField.getText()));
            try {
                if (!shop.addItem(item)) {
                    errorLabel.setText("Unable to add item, update item instead");
                } else {
                    errorLabel.setText("");
                    itemNameTextField.setText("");
                    itemQuantityTextField.setText("");
                    itemPriceTextField.setText("");
                }
            } catch (IOException ex) {
                errorLabel.setText(ex.toString());
            }
        } catch (NumberFormatException ex) {
            errorLabel.setText("Unable to read quantity or price\n" + ex.toString());
        }

    }

    @FXML
    public void lookupItemButtonClicked(ActionEvent actionEvent) throws FileNotFoundException {
        String itemName = itemNameTextField.getText();

        Shop shop = new Shop();

        Item item = shop.getItem(itemName);

        if (item == null) {
            errorLabel.setText("Item not found!");
        } else {
            itemPriceTextField.setText(Double.toString(item.getPrice()));
            itemQuantityTextField.setText(Integer.toString(item.getQuantity()));
        }
    }

    @FXML
    public void updateItemButtonClicked(ActionEvent actionEvent) throws IOException {
        Shop shop = new Shop();

        try {
            Item item = new Item(itemNameTextField.getText(),
                    Integer.parseInt(itemQuantityTextField.getText()),
                    Double.parseDouble(itemPriceTextField.getText()));

            if (!shop.updateItem(item)) {
                errorLabel.setText("Unable to update item, add item");
            } else {
                errorLabel.setText("");
                itemNameTextField.setText("");
                itemQuantityTextField.setText("");
                itemPriceTextField.setText("");
            }
            // NumberFormatException OR IOException
        } catch (NumberFormatException ex) {
            errorLabel.setText("Unable to read quantity or price\n" + ex.toString());
        } catch (IOException | IllegalPriceArgumentException ex) {
            // this is ugly, sorry
            if (ex.getClass() == IOException.class || ex.getClass() == IllegalPriceArgumentException.class) {
                errorLabel.setText(ex.toString());
            } // this else will never run, the only other type was NumberFormatException which would have been caught above
            else {
                errorLabel.setText("Unable to read quantity or price\n" + ex.toString());
            }
        }

        // bad form to catch Exception
        // catch (Exception e)

    }
}