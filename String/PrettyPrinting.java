package DSA.String;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.5454f;
        //printf -> is formatted string printing method
        // % -> is a place-holder & .2f represents 2 decimal point after the (.)
        // ift alo rounds off after the decimal point
        System.out.printf("Formatted number a: %.2f",a);
        System.out.println();
        System.out.printf("Pie: %.3f",Math.PI);
        System.out.println();
        System.out.printf("Hello I am %s going %s next year.","Arup","Europe");
        /*Place-holder list
        * %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline
        * */
    }
}
