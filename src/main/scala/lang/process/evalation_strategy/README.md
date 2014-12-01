http://en.wikipedia.org/wiki/Evaluation_strategy


## call by reference
 
a.k.a call-by-address(or pass-by-address), &var in C language.


[ ] whats the different between call by sharing and pass by reference?
    A: pass by reference can reassign the reference, but sharing cannot resign object reference


## call by sharing
 aka "call be object" or "call by object-sharing'.
 However, the term "call by sharing" is not in common use; 
 the terminology is inconsistent across different sources. 
 For example, in the Java community, they say that Java is pass-by-value, whereas in the Ruby community, 
 they say that Ruby is pass-by-reference, even though the two languages exhibit the same semantics.

- It is used by languages such as Python, Java (for object references), Ruby, JavaScript, Scheme, and many others.
- For immutable objects, there is no real difference between call by sharing and call by value, except for the object identity.


## call by name

the arguments to a function are not evaluated before the function is called -- rather, the are substituted directly into
a function body,

- def f(x: R) vs.   call-by-value
- def f(x: => R)    call-by-name (lazy parameters)
- (x:R) => x*x      anonymous function
