Q) What are Functions
Function is also a predefined Functional Interface (Having only 1 abstract method).

The only abstract method of Function is   apply(T t);

 R apply(T t);

Given some input perform some operation on input and then produce / return result (not necessary a boolean value).

This takes 1 input and returns one output.
In predicate we used to take 1 input and return type is always boolean.
In function return type is not fixed hence we declare both input type and return type.

Q) What is Functional chaining

We can combine / chain multiple functions together with andThen .

There are two ways to combine functions:
 f1.andThen(f2).apply(Input);  - first f1 then f2
f1.compose(f2).apply(Input)  - first f2 then f1


Multiple functions can be chained together like :
f1.andThen(f2).andThen(f3).andThen(f4).apply(Inputs);