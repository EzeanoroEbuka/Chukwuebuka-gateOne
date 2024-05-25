let userBuyList = [];
let perPiecesList = [];
let priceList = [];
let totalList = [];

let addItem = null;
 const date = new Date().toDateString();

const prompt = require("prompt-sync")();
let customerName = prompt("What is the Customer's Name: ");
	
let total = 0;
let repeatOrder = "";
	 
do{
	let itemName = prompt("What did the user buy?: ");
	
	let pieces  = prompt("How Many Pieces?: ");
	  
	if(pieces < 1)
		console.log("Invalid Quantity");

	let pricePerUnit = prompt("How much per unit?: ");
	if(pricePerUnit < 1)
		console.log("Invalid Price");

	total = pieces * pricePerUnit;

	userBuyList.push(itemName);
	perPiecesList.push(pieces);
	priceList.push(pricePerUnit);
	totalList.push(total);

		
	let addMoreItem = prompt("Add more items?: ");
	repeatOrder = addMoreItem;
	
	if(repeatOrder.toUpperCase()  === "NO"){
		break;}
	    
}
while(repeatOrder.toUpperCase()  === "YES");
	    
if(total < 1)
	console.log("Invalid Quantity");
		
let cashierName = prompt("What is your Name(Cashier's Name): ");
	 
let discount = prompt("How much Discount will customer get?: ");

console.log(`

SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
TEL: 03293828343
	`);
		
console.log(" DATE: " + date);
console.log(" Cashier: " + cashierName);
console.log(" Customer Name: " + customerName);

console.log(`
============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
	  `);
	  
let count = 0;

let subTotal = 0;

while(count < userBuyList.length) {
	console.log("\t" + userBuyList[count] + "\t" + perPiecesList[count] 
	   + "\t" + priceList[count] + "\t" + totalList[count]);
	   
	subTotal += totalList[count];
	count++;
	}
let discountInPercent = (discount / 100);
let discountedTotal = (subTotal * discountInPercent);
let vat = (subTotal * 17.5) / 100;
let bill = (subTotal - discountedTotal) + vat;
	
console.log(`

-------------------------------------------------------------------------------------------
	  		
		`);
	   
console.log(`\t\t  Sub Total: \t${subTotal}\n`);

console.log(`\t\t   Discount: \t${discountedTotal}\n`);

console.log(`\t\tVAT @ 17.50: \t${vat}\n`);

console.log(`

============================================================================================

		`);
	
console.log(`\t\tBill Total: \t${bill}\n`);

console.log(`

============================================================================================

		`);
	   
console.log(" THIS IS NOT A RECEIPT KINDLY PAY " + " " + bill);

console.log(`	

============================================================================================

	  	`);
	  		
let cashReceived = prompt("How much did the customer give to you?: ");
	
console.log(`	


SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULEY WAY,SABO YABA,LAGOS.
TEL: 03293828343
	`);
	  
console.log(" DATE: " + date);
console.log(" Cashier: " + cashierName);
console.log(" Customer Name: " + customerName);
	
		
		
console.log(`	

============================================================================
	ITEM	QTY	PRICE	TOTAL(NGN)
----------------------------------------------------------------------------
		`);
	
let counter = 0;

let subTotals = 0;

while(counter < userBuyList.length) {
	console.log("\t" + userBuyList[counter] + "\t" + perPiecesList[counter]
	   + "\t" + priceList[counter] + "\t" + totalList[counter]);
	subTotals += totalList[counter];
	counter++;
 }
let discountInPercent2 = (discount / 100);
let discountedTotal2 = (subTotals * discountInPercent);
let vat2 = (subTotals * 17.5) / 100;
let bill2 = (subTotals - discountedTotal2) + vat2;
let balance = (cashReceived - bill2);

	console.log(`

-------------------------------------------------------------------------------------------
	  		
			`);
			
	   console.log(`\t\t  Sub Total: \t${subTotals}\n`);

	   console.log(`\t\t   Discount: \t${discountedTotal2}\n`);

	   console.log(`\t\tVAT @ 17.50: \t${vat}\n`);

	  console.log(`

============================================================================================

			`);
	  

	   console.log(`\t\tBill Total: \t${bill2}\n`);

	   console.log(`\t\tDiscount: \t${cashReceived}\n`);

	   console.log(`\t\tBalance: \t${balance}\n`);

	  console.log(`

============================================================================================
		THANK YOU FOR YOUR PATRONAGE.....
			`);

	  console.log(`

============================================================================================

	  		`);
	   



