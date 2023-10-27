# Java-Assignments

Java Assignment 01------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Solve (Hands on)

1  Food Bill 
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.

2 Calculator
Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.

3 Testing HasDouble and nextDouble 
Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.

Java Assignment 02-03-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Solve Tank assignment.

What will be the output?

2. Hands-on

Create a  class Point2D   for representing a point in x-y coordinate system.

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}

4.3 (Optional work)
Add a nonstatic, isEqual method to Point2D class: boolean returning method: must return true if both points have having same x,y co-ords or false otherwise.

How will you invoke it from the tester 
A Hint : 

eg : p1.isEqual(p2); 
OR
p2.isEqual(p1)

4.4 (Optional work)
Add a nonstatic method , calculate distance , to calc distance between 2 points
Hint: use the distance formula.

eg : In Tester :
double distance=p1.calculateDistance(p2);

4.5  Create a driver  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points n store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
4.8  (Optional work)
Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.

Java Assignment 04------------------------------------------------------------------------------------------------------------------------------------
1 Continue with Box class n TestBox , from previous's code.
Solve :  
 Double box width for all boxes having volume > 100.(Can you use for-each & solve this) 


2. Solve (can be solved in IDE)
Continue with Day 2' Point2D class.

2.1   Create a driver  class(for UI)  , in the "tester" package "TestPoints" , with main(..)

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

