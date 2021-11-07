Only reason for introducing static methods in the interface is that you can call those methods with just interface name. No Need to create a class and then its object.

Since Interface can never contain :
Constructors,
Static blocks,
Nothings are costly in terms of memory and performance.

Hence we don’t need to create an object and hence if you have everything static, then for interface rather than class

 ( You have this flexibility only after java 8, before that you need to create a class)


Q) Are Static Methods available to implementing classes by default?
Static methods are not available for implementing classes.

They are not default methods. They are static.

Hence you can call these methods using the Interface name explicitly from the implementing classes as implementing classes won't have access to these methods directly. (This is the disadvantage of static methods of interface that its not available to implementing classes.)

Java 8 New Features Predicate, Function, Consumer, Supplier, Streams, Parallel Stream's and many more topics.