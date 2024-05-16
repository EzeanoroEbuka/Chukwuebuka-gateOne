`import java.util.Scanner;
 import java.util.Date;
 import java.util.ArrayList;

  public class SemicolonStore2 {
   public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	ArrayList<String> userBuyList = new ArrayList<>();
	ArrayList<Double> perPiecesList = new ArrayList<>();
	ArrayList<Double> priceList = new ArrayList<>();
	ArrayList<Double> totalList = new ArrayList<>();

        String addItem = null;
	 Date date = new Date();

	 System.out.println("What is the Customer's Name");
	 String cusName = scan.nextLine();
	 double total = 0;
	 
	 do{
	 Scanner scan2 = new Scanner(System.in);
	 System.out.println("What did the user buy?");
	 String itemName = scan2.next();
	
	 System.out.println("How Many Pieces?");
	  double pieces = scan.nextDouble();
	  if(pieces < 1)
		System.out.println("Invalid Quantity");

	  System.out.println("How much per unit?");
	  double perUnit = scan.nextDouble();
		if(perUnit < 1)
		System.out.println("Invalid Price");

	   total = pieces * perUnit;

	   userBuyList.add(itemName);
	   perPiecesList.add(pieces);
	   priceList.add(perUnit);
	   totalList.add(total);

	  Scanner input = new Scanner(System.in);	
	  System.out.println("Add more items?");
	  addItem = input.nextLine();
	    if(addItem.equalsIgnoreCase("no")){
		break;}
	    
	    }while(addItem.equalsIgnoreCase("yes"));
	  if(total < 1)
		System.out.println("Invalid Quantity");
		

	  Scanner scan3 = new Scanner(System.in); 
	  System.out.println("What is your Name(Cashier's Name:)");
	  String cashierName = scan3.nextLine();

	  System.out.println("How much Discount will customer get?");
	  double discount = scan.nextInt();

	  String prompt = """

	  SEMICOLON STORES
	  MAIN BRANCH
	  LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
	  TEL: 03293828343
		""";
	  System.out.print(prompt);
	  System.out.println(" DATE: " + date);
	  System.out.println(" Cashier: " + cashierName);
	  System.out.println(" Customer Name: " + cusName);
	

	  String prompt2 = """
============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
		""";
	  System.out.print(prompt2);
	  int count = 0;

	  double subTotal = 0;

	  while(count < userBuyList.size()) {
	  System.out.println("\t" + userBuyList.get(count) + "\t" + perPiecesList.get(count) 
	   + "\t" + priceList.get(count) + "\t" + totalList.get(count));
	  subTotal += totalList.get(count);
		count++;
		}
	  double discountInPercent = (discount / 100);
	  double discountedTotal = (subTotal * discountInPercent);
	  double vat = (subTotal * 17.5) / 100;
	  double bill = (subTotal - discountedTotal) + vat;


	
	  String display = """

-------------------------------------------------------------------------------------------
	  		
			""";
	   System.out.print(display);
	   
	   System.out.printf("\t\t  Sub Total: \t%.2f%n",subTotal);

	   System.out.printf("\t\t   Discount: \t%.2f%n",discountedTotal);

	   System.out.printf("\t\tVAT @ 17.50: \t%.2f%n",vat);

	   String display2 = """

============================================================================================

			""";
	   System.out.print(display2);

	   System.out.printf("\t\tBill Total: \t%.2f%n",bill);

	   String display3 = """

============================================================================================

			""";
	   System.out.print(display3);

	   System.out.println(" THIS IS NOT A RECEIPT KINDLY PAY " + " " + bill);

	   String display4 = """	

============================================================================================

	  		""";
	   System.out.print(display4);



	   System.out.println("How much did the customer give to you?");
	    double  received = scan.nextDouble();

	   String part2Line = """


	  SEMICOLON STORES
	  MAIN BRANCH
	  LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
	  TEL: 03293828343
		""";
	  System.out.print(part2Line);
	  System.out.println(" DATE: " + date);
	  System.out.println(" Cashier: " + cashierName);
	  System.out.println(" Customer Name: " + cusName);
	

	  String part2Line2= """
============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
		""";
	  System.out.print(part2Line2);
	  int counter = 0;

	  double subTotals = 0;

	  while(counter < userBuyList.size()) {
	  System.out.println("\t" + userBuyList.get(counter) + "\t" + perPiecesList.get(counter) 
	   + "\t" + priceList.get(counter) + "\t" + totalList.get(counter));
	  subTotals += totalList.get(counter);
		counter++;
		}
	  double discountInPercent2 = (discount / 100);
	  double discountedTotal2 = (subTotals * discountInPercent);
	  double vat2 = (subTotals * 17.5) / 100;
	  double bill2 = (subTotals - discountedTotal2) + vat2;
	  double balance = (received - bill2);

	
	  String displayLine = """

-------------------------------------------------------------------------------------------
	  		
			""";
	   System.out.print(displayLine);
	   
	   System.out.printf("\t\t  Sub Total: \t%.2f%n",subTotals);

	   System.out.printf("\t\t   Discount: \t%.2f%n",discountedTotal2);

	   System.out.printf("\t\tVAT @ 17.50: \t%.2f%n",vat2);

	   String displayLine2 = """

============================================================================================

			""";
	   System.out.print(displayLine2);

	   System.out.printf("\t\tBill Total: \t%.2f%n",bill2);

	   System.out.printf("\t\tDiscount: \t%.2f%n",received);

	   System.out.printf("\t\tBalance: \t%.2f%n",balance);

	   String displayLine3 = """

============================================================================================

			""";
	   System.out.print(displayLine3);

	   System.out.println("\t\tTHANK YOU FOR YOUR PATRONAGE");

	   String displayLine4 = """	

============================================================================================

	  		""";
	   System.out.print(displayLine4);
	}

	

}