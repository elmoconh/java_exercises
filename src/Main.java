import java.util.Scanner;

import aabbPatron.PatronValidator;
import arrWork.ArrString;
import binaryEspaces.BinaryEspaces;
import cutToFirstUpper.CutToFirstUpper;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.print("Elija una opción ");


        option = sc.nextInt();

        switch (option) {
            case 1:
                BinaryEspaces.getNumber();
            case 2:
                PatronValidator.getValue();
            case 3:
                CutToFirstUpper.getString();

        }
        ArrString.getNames();
    }
}