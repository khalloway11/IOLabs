Lab #2 Instructions
======================================================
In step #2 of lab 1 you were asked to find the second
record in your contact list. Now we need to make that more 
flexible. Change the design of your program so that any record
can be found, using a numeric value for input. So if I input 3, the 
program would look for the third record; if I enter 4 the program 
would look for the 4th record, and so on. Also, using exception handling
make sure that your program does not crash and warns you if you enter
a record number that has no matching record. You should display something
like "Sorry, there are only 3 records." 
When you do find a record you should display that 
record by itself at the console.

records contained in 3 lines:
name
street address
city, state, zip

to get the desired record, the upper bound (city, state, zip line):
(n * 3)
and the lower bound:
(n * 3) - 2
where n is the number of the record being requested
ex: for record 1, the upper bound is (1*3) = line 3
the lower bound is (1*3) - 2 = line 1
return lines 1, 2, 3
for record 2, the upper bound is (2*3) = line 6
the lower bound is (2*3) - 2 = line 4
return lines 4, 5, 6