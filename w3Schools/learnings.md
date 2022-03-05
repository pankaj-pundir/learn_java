# Java rules
- Class name should start from Caps
- Case sensitive
- The name of the java file must match the class name. 
- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String)
- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
- static means that the method belongs to the Main class and not an object of the Main class.

# Use of Static Keyword
https://www.geeksforgeeks.org/static-keyword-java/#:~:text=The%20static%20keyword%20in%20Java,an%20instance%20of%20the%20class.

When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. 
If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded. 


# Code tips
- Character.toString(s.charAt(1))