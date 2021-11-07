Functional interfaces are those interfaces which can have only one abstract method .
It can have static method, default methods.
There are many functional interfaces already present in java such as  eg : Comparable, Runnable

To create our own Functional interface, You can do following steps:
Create An interface
Annotate that with @FunctionalInterface.
Define exactly one Abstract method.
There is no restriction on number of static and default methods defined in such and interface.

Java can implicitly identify functional interface but still you can also annotate it with @FunctionalInterface . It just give you the security that in case if u by mistake add 2 abstract methods then Compiler will throw compile time error.
