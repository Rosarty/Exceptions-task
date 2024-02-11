package app.view;

import java.util.Scanner;

public class DataProvider {
    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        return scanner.nextLine().trim();
    }
}
