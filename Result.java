import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    //find and print the meal's total cost.  round to nearest integer
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = meal_cost*tip_percent/100;
        double tax = meal_cost*tax_percent/100;
        int total_meal_cost = (int)Math.round(meal_cost+tip+tax);
        System.out.print(total_meal_cost);

    }

}

