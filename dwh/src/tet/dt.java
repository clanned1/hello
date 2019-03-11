package tet;

class Animal {
public void eat(){
System.out.println("吃饭");
}
}
class Dog extends Animal {
public void eat() {
System.out.println("狗吃肉");
}
}
class Cat extends Animal {
public void eat() {
System.out.println("猫吃鱼");
}
}
class dt {
public static void main(String[] args) {
//定义为狗
Animal a = new Dog();
a.eat();
//还原成狗
Dog d = (Dog)a;
d.eat();
//变成猫
a = new Cat();
a.eat();
//还原成猫
Cat c = (Cat)a;
c.eat();
}
}
