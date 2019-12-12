# StudentLibraryReentrantLocks
A multi-threading approach to implement the student library problem using Reentrant locks

Problem statement :
We have multiple students with ids s1,s2,s3...
We have multiple books and we are going to assign every book with an id b1,b2,b3...
There might be a situation when two students want to read the same book at the same time.
Hence to maintain concurrency we are using Re-entrant locks to avoid two students reading the same book at the same time.
