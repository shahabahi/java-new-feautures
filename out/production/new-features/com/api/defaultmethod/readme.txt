Default method is a way for adding  new methods to the interface without affecting the implementing classes. Hence with this new feature Java people defended many compile time errors that may arise due to unimplemented methods of interface.

The use of these default methods is “Backward Compatibility” which means if JDK modifies any Interface (without default method) then the classes which implement this Interface will break.

On the other hand, if you add the default method in an Interface then you will be able to provide the default implementation. This won’t affect the implementing classes.


Q) How to override default methods?

You can override the default method by keeping the same method signature (name + arguments)

Removing default keywords because in class default keyword is used in switch case to denote default case if no previous cases matched. So you cant use the Default keyword in Class

Adding Public as access modifier as in java 8, by default all methods are public so in child, u cant reduce the visibility of overridden default method.
Giving our own implementation.