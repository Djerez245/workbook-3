package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    static ArrayList<Products> productsArray = new ArrayList<>();
    static ArrayList<Products> shoppingcart = new ArrayList<>();

    public Store(ArrayList<Products> productsArray, ArrayList<Products> shoppingcart) {
        this.productsArray = productsArray;
        this.shoppingcart = shoppingcart;
    }

    public static void createProducts() throws IOException {

        FileReader readProducts = new FileReader("products.csv");
        BufferedReader buffReader = new BufferedReader(readProducts);

        String input;
        buffReader.readLine();
        while ((input = buffReader.readLine()) != null) {
            String[] values = input.split("\\|");
            String sku = values[0];
            String productName = values[1];
            double price = Double.parseDouble(values[2]);
            String department = values[3];
            Products fullproduct = new Products(sku, productName, price, department);
            productsArray.add(fullproduct);
        }
    }

    public static void searchAddItem(){
        System.out.printf("""
                                    What item would you like to search for?
                                    (Name or SKU): """);
        String search = scanner.nextLine();
        for (Products product : productsArray) {
            if (product.getProductName().equalsIgnoreCase(search) || product.getSku().equalsIgnoreCase(search)) {
                System.out.println(product);
                System.out.println("Would you like to add to cart? Y/N");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("y")) {
                    shoppingcart.add(product);
                    System.out.println("\nITEM ADDED!\n");
                }
                if (response.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }

    public static void printPrompt(String p) {
        System.out.println(p);
    }

    public static String printPromptAndReturnString(String p){
        printPrompt(p);
        return scanner.nextLine();
    }


    private static String mainMenuText = """
                    
                    ==============================================
                             Welcome to Java online Store!
                    ==============================================
                    A) Display Products
                    B) Display Cart
                    C) EXIT - Leave the store
                    """;

    private static String displayMenuText =
      """
                                ==========================================
                                              Display Items
                                ==========================================
                                1. To search
                                2. add a product
                                3. go back to home page
                               """;
    private static String shoppingCartText = """
                                ==========================================
                                              SHOPPING CART
                                ==========================================
                                """;
    private static String getShoppingValuesText = """
                                
                                
                                1. Check-out
                                2. remove product
                                3. go back to home page
                                """;

    private static Scanner scanner;


    public static void main(String[] args) throws IOException {

       scanner  = new Scanner(System.in);


        boolean store = true;

        while (store) {

           createProducts();
            String userInput = printPromptAndReturnString(mainMenuText);

            switch (userInput.toLowerCase()) {
                case "a":
                    boolean displayPage = true;
                    while (displayPage) {
                        for (Products product : productsArray) {
                            System.out.println(product);
                        }

                        printPrompt( displayMenuText );

                        int userInput2 = scanner.nextInt();
                        scanner.nextLine();
                        if (userInput2 == 1) {
                            searchAddItem();
                        }

                        if (userInput2 == 2) {
                            System.out.println("\nEnter the product name that you would like to add to the cart: ");
                            String cartInput = scanner.nextLine();
                            for (Products products : productsArray) {
                                if (cartInput.toLowerCase().equals(products.getProductName().toLowerCase())) {
                                    shoppingcart.add(products);
                                    System.out.println("\nITEM ADDED TO CART!\n");
                                }
                            }
                        }
                        if (userInput2 == 3)
                            break;
                    }
                    break;
                case "b":
                    if (shoppingcart.isEmpty()) {
                        System.out.println("\nYour cart is empty\n");
                    }
                    else {
                        printPrompt(shoppingCartText);
                        for (Products item : shoppingcart) {
                            System.out.println("\n" + item);
                        }
                        printPrompt(getShoppingValuesText);
                        int cartResponse = scanner.nextInt();
                        if (cartResponse == 1) ;


                        if (cartResponse == 2) {
                            scanner.nextLine();
                            System.out.println("Enter the name or SKU of the item that you would like to remove");
                            String removeItem = scanner.nextLine();
                            for (Products products : shoppingcart) {
                                if (products.getProductName().equalsIgnoreCase(removeItem) || products.getSku().equalsIgnoreCase(removeItem)) {;
                                    shoppingcart.remove(products);
                                    System.out.println("\nITEM REMOVED FROM CART!\n");
                                }
                            }
                        }
                    }
                    break;
                case "c":
                    System.out.println("\nThank you come back soon");
                    store = false;
                    break;

                default:
                    System.out.println("Sorry that was an invalid input, try again!");


            }
        }
    }
}


















