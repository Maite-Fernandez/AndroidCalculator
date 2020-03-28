package edu.upc.dsa.androidcalculator;
import android.widget.EditText;
public class IsEmptyException extends Exception {
    public IsEmptyException() {
        super("The list is empty! Cannot remove any more items.");
    }
}
