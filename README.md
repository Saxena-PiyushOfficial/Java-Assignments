# Java-Assignments

Java Assignment 01------------------------------------------------------------------------------------------------------------

Solve (Hands on)

1.1  Food Bill 
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.

1.2 Calculator
Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.

1.3 Testing HasDouble and nextDouble 
Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.

Java Assignment 02-03-----------------------------------------------------------------
3.1 Solve Tank assignment.

What will be the output?

3.2. Hands-on

Create a  class Point2D   for representing a point in x-y coordinate system.

3.2.1 Create a parameterized constructor to accept x & y co-ords.

3.2.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}

3.2.3 (Optional work)
Add a nonstatic, isEqual method to Point2D class: boolean returning method: must return true if both points have having same x,y co-ords or false otherwise.

How will you invoke it from the tester 
A Hint : 

eg : p1.isEqual(p2); 
OR
p2.isEqual(p1)

3.2.4 (Optional work)
Add a nonstatic method , calculate distance , to calc distance between 2 points
Hint: use the distance formula.

eg : In Tester :
double distance=p1.calculateDistance(p2);

3.2.5  Create a driver  class(for UI )  , "TestPoint" , with main(..)

3.2.6  Accept x,y co-ordinates for 2 points n store the co-ordinates
3.2.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
3.2.8  (Optional work)
Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.

Java Assignment 04-------------------------------------------------------------------
4 Continue with Box class n TestBox , from previous's code.
Solve :  
 4.1 Double box width for all boxes having volume > 100.(Can you use for-each & solve this) 


4.2. Solve (can be solved in IDE)
Continue with Day 2' Point2D class.

4.2.1  Create a driver  class(for UI)  , in the "tester" package "TestPoints" , with main(..)

1. Prompt user , how many points to plot? 
Create suitable array. (Hint : array of references)



2. Show following options

Options
1. Plot a point
Inputs : array index , x  ,y
Check boundary conditions  , check if some point is already plotted at the same index , if not then store the point details.
In case of any errors , display suitable error message.

2.   Display x,y co-ordinates of all the points plotted so far ,using for-each loop.

3.   Accept 2 indices from user .
Find out if the points at these indices are same or different (Hint : isEqual)
Print the message accordingly. 
If points are not same , display distance between these 2 points.
(Draw mem diagram for your clarity, if needed/)

Java Assignment05  ----------------------------------------------------------------------

5. Read complete assignment n then only solve.

5.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
Use tight encapsulation.

5.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean

5.3 Add suitable constructor

5.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )

5.5 Add a taste() method : public String taste()

For Fruit : Can you identify taste of any general fruit ? NO
So add a taste() with this definition : returns "no specific taste" 

Apple : should return  "sweet n sour"
Mango : should return  "sweet"
Orange : should return  "sour"

5.6 Add specific functionality , in the sub classes
In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}

5.7 Add all of above classes under the package "com.app.fruits"
5.8 Create java application FruitBasket , with main method , as a tester
5.9 Prompt user for the basket size n create suitable data structure

5.10 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be ALWAYS adding a fresh fruit in the basket , in all of above options.

4. Display names of all fruits in the basket.

5. Display name,color,weight , taste of all fresh fruits , in the basket.


6. Mark a fruit in a basket , as stale(=not fresh)
i/p : index 
o/p : error message (in case of invalid index) or mark it stale

7. Mark all sour fruits stale 
Hint : Use equals() method of the String class.

8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

9. Exit
    
Java Assignment06-07------------------------------------------------------------------------

(Main objective :Run time polymorphism achieved using interfaces)
Create Java application for fixed stack & growable stack based on Stack i/f , for storing customer details

Customer has : id(int), name (string) , address(string)
Provide suitable constructor n toString

Steps
6.1  Create Customer class
6.2 Stack interface -- push & pop functionality for Customer refs. & declare STACK_SIZE as a constant. 
6.3 Create implementation class of Stack i/f -- FixedStack (array based)
6.4 Create another implementation class of Stack i/f-- GrowableStack (array based)

6.5 
Create Tester class ()
Display Menu
Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.

1 -- Choose Fixed Stack

2 -- Choose Growable Stack

3 -- Push data 
I/P : Accept customer details & store these details in the earlier chosen stack or give error mesg : NO stack chosen !!!
In case user has chosen fixed stack , n stack is full give err mesg. 
In case of growable stack , should be able to save customer details w/o getting err.

4 --- Pop data & display the same (from the earlier chosen stack or give error mesg : NO stack chosen !!!)
No inputs are required : pop customer details from the top of the stack

5 -- Exit

 Java Assignment08-09-10------------------------------------------------------------------------------------
8.1 Add speed Validation rule for a vehicle in which speed exceeding 100 will show overspeed errMsg and below 30 low speed errMsg.

8.2Add another validation rule,  (in addition to speed checking) , in VehicleValidationRules class
Check Driving license expiry
I/p : License expiry date (in string form, using scanner)
O/P : in case of success , Valid License OR throw custom exception with suitable err mesg .
Now modify TestSpeed tester , to validate both rules

Java Assignment09-10-11-------------------------------------------------------------------------------------------
9.1 Customer management system
Supply Options
1. Sign up (customer registration)
2. Sign in (login)
i/p : email n password
3. Change password
i/p : email n old password n new password
4. Un subscribe customer
i/p : customer email

5. Display all customers.
0. Exit 

Design 
Identify the core classes/enums involved
1. Customer class (core class)
state  : customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
idGenerator : static 
Must generate customer ids automatically : auto increment)
PK(UID) : email

ctors 
1. all args ctor
2. PK based ctor

Will you need to override toString n equals ?


2. ServicePlan : enum
ServicePlan charges : 
SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000


3. custom exception class

4. validation rules
4.1 no dup customers 
(i.e if the customer tries to register using existing email , throw exception)

4.2 Validate plan
plan must be of supported types

4.3 reg amount must match with the plan


5. Tester, with UI, scanner
Create a template as discussed and test the functionality

9.2 Complete earlier Customer management assignment

Add these options to Customer management system 
Sort customer details as per email (use natural ordering)
Sort customer details as per dob and last name (use custom ordering)
Remove all those customer details whose subscription is pending for last 6 months?
