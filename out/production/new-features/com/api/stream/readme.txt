Stream :
If we want to process bulk objects of collection then go for streams concept.
Way to operate on collection in java 8 is Stream.
Its a special iterator class that allows processing collections of objects in a functional manner.

Eg : fetch all objects from collection of list whose value is greater than 15

Why streams were introduced in java 8 if we already had java.io.stream?

Java io streams is a sequence of characters or binary data which is used to be written to a file or to read data from a file.
While streams java 1.8 is no where related to files, its related to collection object.
Java io streams related to file whereas java 8 streams are related to collection object.
Hence if we need to perform some operations on collection there we should go for streams.

To represent group of collection as single entity then we should use collection concept.

If we want to perform operation on bulk objects in collection then we should go for Streams.

We can get stream object by :

Stream s = collectionObject.stream();
Once we get stream object we can process the object of collection.
Processing of stream consists of 2 steps/ stages
Configuration of stream
Processing that configuration
Configuration can be done by
Map
Filter

Stream s = collectionObject.stream().filter(i 🡪 i % 2 ==0);

What if we don’t want to filter out.
We rather want to create new object against each existing stream object based on some function.

EG in given stream create new object by squaring  its value

If we want to fetch / filter objects from collection like eg : filter only even numbers from array list collection the use Filter for configuration of stream.

 If we want to perform some operation on each objects of the collection then create another mapped object with different value(after operation is performed ) for each object of that collection, then use map.

In filter, because of filtering, number of objects in filtered list is less than original list While in Map  same number of objects are there in both new and original list created.