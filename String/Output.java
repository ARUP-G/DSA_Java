
public class Output {
    public static void main(String[] args){
        System.out.println(88);
        int a = 22;
        // not possible as primitive data are pass by value
        // that's why we need wrapper class to change primitive data to objects
        //System.out.println(a.toString);
        Integer num = new Integer(99); // wrapper  class
        System.out.println(num);
        System.out.println(num.toString());
        String str = "nsidssoi324*@^*#^";
        // changing the string {creates new string not modifies the previous str object}
        System.out.println(str.replace("ss","LL")); // gives a new string
        System.out.println(str);

        System.out.println(str.replaceAll("@","")); // new string
        System.out.println(str);
        //System.out.println(str.rever);


    }
}
