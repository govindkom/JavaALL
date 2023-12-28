package Operators;

import java.util.HashMap;

class MyClass {
private int x;
public MyClass(int x) {
this.x = x;
}
public int getX() {
return this.x;
}
}

class MyOtherClass {
public static void main(String[] args) {
MyClass obj1 = new MyClass(5);
MyClass obj2 = obj1;
obj2 = new MyClass(10);
System.out.println(obj1.getX());
}
}


