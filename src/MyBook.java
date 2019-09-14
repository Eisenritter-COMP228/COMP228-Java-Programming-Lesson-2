import java.util.Scanner;
public class MyBook {

    //instance variables
    private String  title;
    private int pubYear;
    private double price;

    //class variable
    public static int count = 0;

    //constructor
    public MyBook(){

    }
    public MyBook(String title, int pubYear, double pri){
        this.title = title;
        this.pubYear = pubYear;
        this.price = pri;
        count++;
    }

    //getters and setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getPubYear(){
        return pubYear;
    }
    public void setPubYear(int year){
        this.pubYear = year;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //custom static method
    public static int countCheck(){
        return count;
    }

    //custom non-static method
    public double totalBill(int num, double price){
        return num*price;
    }

    //built-in method
    public static void main(String[] args) {
	// write your code here
        MyBook MyFirstOne = new MyBook();
        Scanner input = new Scanner(System.in);
        MyBook mySecondOne = new MyBook("My ABC", 1999, 65.00);
        System.out.println("Title: " + mySecondOne.getTitle() + " Year of publication: "+ mySecondOne.getPubYear() + "\nPrice: " +mySecondOne.getPrice());
        mySecondOne.setTitle("My ABC ED.2");
        mySecondOne.setPubYear(2019);
        mySecondOne.setPrice(85.00);
        System.out.println("Title: " + mySecondOne.getTitle() + " Year of publication: "+ mySecondOne.getPubYear() + "\nPrice: " +mySecondOne.getPrice());
        System.out.println("How many copies you sold??");
        int totalNum = input.nextInt();
        double totalIncome = mySecondOne.totalBill(totalNum,mySecondOne.price);
        System.out.println("Your total income is " + totalIncome);
    }
}
