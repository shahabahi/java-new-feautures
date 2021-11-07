Q) What are predicates?
Predicate is a predefined Functional Interface (Having only 1 abstract method).
The only abstract method of predicate is test(T t):
public boolean test(T t);
Whenever we want to check some boolean condition then you can go for Predicates.

Q) How to use Predicates?
Say if you need to test if the length of the given string is greater than or equal to 5. Then in such situations where you need to test conditions, use test() method of predicate.

Q) Type parameter and return types of Predicates?
Input to predicate can be anything like
Hence only 1 type argument is required which is input type in predicate.
Return type is not required as its always Boolean only.

Q) Advantages of Predicates?
Code Reusability

If you have same conditions being used 100 times in a prgram then you can write once and just use 100 times with checkLength.test(different string to be tested).

Conditional checks are holded by Functional interfaces.

Q) What is Predicate joining?
You can combine predicates in serial predicate

Three ways to join :
And
Or
Negate

Eg if you want to test 2 conditions:
To check length of string
To check if length is even.