## REPORT

### 1. Multiplication Investigation

Java uses two's complement arithmetic, which uses the most significant bit to signify that a number is negative. If two big numbers are multipluied the result may be aa number that's so big it sets that highest bit, and the result ends up negative.

There are 2 ways to handle this:

  1. throw an exception and return a error code when the resultant number is greater than the range of integer
  2. return a long.

I have taken approach 2 and an returning a long. This may lead to some change in some clients which now should expect long (-2^63 to 2^63 - 1 ) .

### 2. Subtraction Service
added endpoint /sub with test cases
The README documentation has been updated to reflect the changes

### 3. Division Service Enhancement
for the enhancement of division service the response contract will need to be modified.
The division service now returns
```
{
  "quotient": 2,
  "remainder": 2
}
```
The README documentation has been updated to reflect the changes

### 4. Intersect Performance
To improve the performance of the Intersect service , I have used the aprroach to reduce the size of the comapring set everytime a comparison is met. I have replaced the comapare method with remove method, which will remove the element from the copy of the right list as soon as a mathch is found.

This should provide a significant performance boost as the size of the input data set grows.

### 5. Logging
Since initail spring logging is done by commons-logging till the time the spring context is loaded.
To remove the logging 
I have defined a commons-logging.properties and a supporting simplelog.properties which sets defaultlog=warn for commons.logging

