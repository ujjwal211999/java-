// public class Video {

// 	String videoName;
// 	boolean checkout;
// [p]	int rating;

// 	Video(String name){
// 		videoName=name;
// 	}

// 	String getName() {
// 		return videoName;
// 	}

// 	void doCheckout() {
// 		checkout = true;
// 	}

// 	void doReturn() {
// 		checkout = false;
// 	}

// 	void receiveRating(int rating) {
// 		this.rating = rating;
// 	}

// 	int getRating() {
// 		return rating;
// 	}

// 	boolean getCheckout() {
// 		return checkout;
// 	}

// }class video {
    
// }


// hello world k prograamm ################################

// class video{  
//     public static void main(String args[]){  
//      System.out.println("Hello world");  
//     }  
// }  


// VARIABLE (container which holds the value)


// a=10 (a is a variable )


// sum of 2 variable in 3rd###########################

// public class video{    
// 	public static void main(String[] args){    
// 	int a=5;    
// 	int b=10;    
// 	int c=a+b;    
// 	System.out.println(c);    
// 	}  
// 	}    

// OPERATORS   ( symbol that is used to perform operations.)


// UNARY OPERATOR ##############################

// public class video{  
// 	public static void main(String args[]){  
// 	int x=10;  
// 	System.out.println(x++);//10 (11)  
// 	System.out.println(++x);//12  
// 	System.out.println(x--);//12 (11)  
// 	System.out.println(--x);//10  
// 	}}  

// ARITHMETIC OPERATOR #################

// public class video{  
// 	public static void main(String args[]){  
// 	int a=10;  
// 	int b=10;  
// 	System.out.println(a+b); 
// 	System.out.println(a-b); 
// 	System.out.println(a*b); 
// 	System.out.println(a/b);
// 	System.out.println(a%b);
// 	}}  

//  All OPERATOR IN ONE #################

// public class OperatorExample{  
// 	public static void main(String args[]){  
// 	System.out.println(10+10/10*10-10*10/10);  
// 	}} 


// LEFT SHIFT OPERATOR( << is used to shift all of the bits 
// in a value to the left side of a specified number of times.) ########

// public class video{  
// 	public static void main(String args[]){  
// 	System.out.println(10<<2);//10*2^2=10*4=40  
// 	System.out.println(10<<3);//10*2^3=10*8=80  
// 	}} 


// RIGHT SHIFT OPERATOR( >> is used to move the value of the left operand to right
//  by the number of bits specified by the right operand.) ################


// public class video{  
// 	public static void main(String args[]){  
// 	System.out.println(10>>2);//10/2^2=10/4=2   
// 	System.out.println(20>>3);//20/2^3=20/8=2  
// 	}}  


// BITWISE operator ########l && operator doesn't check the second condition if the first
//  condition is false. It checks the second condition only if the first one is true.

// public class video{  
// 	public static void main(String args[]){  
// 	int a=20;  
// 	int b=10;  
// 	int c=30;   
// 	System.out.println(a<b&a<c);//false & true = false  
// 	}}  

// ASSIGNMENT OPERATOR(assign the value on its right to the operand on its left.)######

// public class video{  
// 	public static void main(String args[]){  
// 	int a=10;  
// 	int b=20;  
// 	a+=4;  
// 	b-=4;  
// 	System.out.println(a);  
// 	System.out.println(b);  
// 	}}  


// IF CONDITION 


// public class Student {    
// 	public static void main(String[] args) {    
// 	int a= 5;    
// 	int b = 7;    
// 	if(a+b > 15) {    
// 	System.out.println("a + b is greater than 15");    
// 	}    
// 	}      
// 	}    

// IF- ELSE CONDITION #############

// public class video {  
// 	public static void main(String[] args) {  
// 	int x = 20;  
// 	int y = 10;  
// 	if(x+y < 50) {  
// 	System.out.println("x + y is less than  10");  
// 	}   
// 	else 
// 	{  
// 	System.out.println("x + y is greater than 20");  
// 	}  
// 	}  
// 	}  

// IF - ELSE IF  - ELSE

// public class video {  
// 	public static void main(String[] args) {  
// 	String fruit = "Mango";  
// 	if(fruit == "lichi") {  
// 	System.out.println("fruit is lichi");  
// 	}else if (fruit == "Mango") {  
// 	System.out.println("fruit is mango");  
// 	}else if(fruit == "papaya") {  
// 	System.out.println("fruit is papaya");  
// 	}else {  
// 	System.out.println(fruit);  
// 	}  
// 	}  
// 	}  


// while condition 


// public class video {    
// 	public static void main(String[] args) {    
// 	int a = 0;    
// 	System.out.println("list of first 10 even numbers \n");    
// 	while(a<=10) {    
// 	System.out.println(a);    
// 	a = a + 2;    
// 	}    
// 	}    
// 	} 


// BREAK STATEMENT #############

// public class video{  
  
// 	public static void main(String[] args) 
// { 
// 	for(int i = 0; i<= 20; i++) {  
// 	System.out.println(i);  
// 	if(i==5) {  
// 	break;  
// 	}  
// 	}  
// 	}  
// 	}

// CONTINUE STATEMENT ###################

// public class video {  
  
// 	public static void main(String[] args) 
// 	{    
// 	for(int i = 0; i<= 2; i++) {  
	  
// 	for (int j = i; j<=5; j++) {  
	  
// 	if(j == 4) {  
// 	continue;  
// 	}  
// 	System.out.println(j);  
// 	}  
// 	}  
// 	}  
// 	}

// DO WHILE STATEMENT  ##################

// public class video {    
// 	public static void main(String[] args) {   
// 	int i = 0;    
// 	System.out.println("Print first 10 even numbers \n");    
// 	do {    
// 	System.out.println(i);    
// 	i = i + 2;    
// 	}while(i<=10);    
// 	}    
// 	}    

