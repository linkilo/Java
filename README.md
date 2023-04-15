# Java 
# Java 基础语法

一个Java程序可以认为是一系列对象的集合

```java

public class person {
   public String name;//默认为null;
   public int age;//默认为0
    String sex;
    public static String info="text";
    /*
    加了static表明该成员变量是静态变量，属于该类，不属于任何一个对象
    这表示，任何一个对象调用该静态变量都是同一个值，而如果任何一个对象
    修改该静态变量，则其他对象调用该静态变量都是修改后的值。
    同理静态方法也是一样的属性,静态方法和静态变量可以不需要去new一个对象
    可以直接通过类名调用.
    静态方法中无法获得成员变量和成员方法.只能调用静态的方法和变量。
    */

   public static void jin(){
        System.out.println("我是静态方法");
    }
   public void hello(){
        System.out.println("我叫"+name+"今年"+age+"岁");
    }
   public int sum(int a,int b){
        int c=a+b;
        return c;
    }

   public double sum(double a,double b){//sum的重载可以输入double类型进行计算
        double c=a+b;
        return c;
    }
    {
        System.out.println("我是代码块");
    }

   static {
        //只用在访问是会使用该方法
        //在类加载时就会执行该方法，所以静态优先于成员执行(不论位置先后)
        System.out.println("我是静态代码块");
    }

   public void setName(String name){
        this.name=name;
    }

   public void test(){//方法可以相互调用
        hello();
    }

   public person(){//构造方法 在new的时候运行
        //如果不输入参数就执行该方法
        name="kilo";
        age=10;
        sex="男";
    }

   public person(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
}

```

所以的类都继承于object类

## 继承

```
public class person {
public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }//若父类使用了该构造方法则子类也应该继承该构造方法，子类用super来调用该方法
}
public class Students extends person{
public Students (String name,int age,String sex)	{
        super(name,age ,sex);//super表示父类的构造
    }
    /*
    子类可以通过super来调用父类的关键字
    super.后加父类的成员方法或者成员变量
    但是在static中不能调用父类的方法或变量
    */

}
//在类名后面加上 extends 被继承的类名 
//表示Students 类继承了person类
//

```



## 重写

方法的重载是为某个方法提供更多的种类，而方法的重写则是覆盖掉原来的方法。

重写格式：

@Override

方法的格式应该与要被重写的方法格式相同



如果不想让任何子类再去重写这个方法 则只需要加上final 表示为最终不可再次被重写 public final void test(){}

同理对于成员变量 在成员变量前加上final 则只有在构造时给该变量赋值，而如果该变量已经有初始值了，则构造时也不能给该成员变量赋值
final String name;

同理 对于类 ，在类前加上final 则表明该类不能被继承
public final class person

```java
public class person {
    String name;
    int age;
    String sex;

    public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }//若父类使用了该构造方法则子类也应该继承该构造方法，子类用super来调用该方法

    public void test(){

    }
    /*
    如果不想让任何子类再去重写这个方法 则只需要加上final 表示为最终
    不可再次被重写 public final void test(){}
    同理对于成员变量 在成员变量前加上final 则只有在构造时给该变量赋值
    而如果该变量已经有初始值了，则构造时也不能给该成员变量赋值
    final String name;

    同理 对于类 ，在类前加上final 则表明该类不能被继承
    public final class person
     */

    @Override//对equals的重写
    public boolean equals(Object obj){
        if(obj==null) return false;//比较不能为空
        if(obj instanceof person){//比较必须是用一类或者为该类的子类
            person p=(person) obj;//将obj强制转化为person类并用p代替
            return this.name.equals(p.name)&&
                    this.age==age&&
                    this.sex.equals(p.sex);
        }
        return false;
    }

    @Override//对tostring的重写
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
```

## 抽象类

在class前加上 abstract 也可以在成员变量和成员方法前加abstract 抽象方法可以看做一个函数但是这个函数没有任何内容，只有函数名和参数，这个抽象方法可以被他的子类（重写）调用，抽象方法在不同的子类，重写方式不同，故运行结果不同，这就是多态。。

```java
public abstract class person{//抽象类
    public abstract void exam();//抽象方法 没有主体
        
    
    
}

public class student1 extends person{
    @Override//如果父类是一个抽象类，则子类必须重写
    public void exam(){//通过子类重写
        System.out.println("我成绩很好");
    }
}
```

**抽象类无法创建对象**

**抽象类只用于继承，抽象类的子类也可以是抽象类**

**抽象方法的访问权限不能为private**
