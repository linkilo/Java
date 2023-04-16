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

## 接口

接口只代表某个确切的功能，是一种只包含方法的定义，严格来说不能算作一个类。但是为了方便理解可以将接口看做一个抽象类，而且这个接口里面只有抽象方法。

**简单来说接口就是将类所具有的某些行为（方法）抽象出来，将这些方法放在接口中，如果有类要使用该方法，就可以直接继承（调用）这个接口的方法，每个类可以通过不同的重写以此来实现相同的方法在不同的类，实现目标不同**

**注意：抽象方法不能有主体，在继承接口后必须在类里面实现这个方法**

```java
public interface Study{//名为Study的接口
    void study();
    /*
    本来应该写为 public abstract void study();
    但接口内默认为 public abstract 所可以省略
    */
    //如果想在接口内实现一个方法，则只需要在前加上default
    default void study(){
        System.out.println("我学习能力很好");
    }
}
public class sutdnets implements Study{
    //类通过 implements 加接口名来调用一个接口
    //可以在这里加上 @Override 看做重写
    public void study(){//实现接口 
        
    }
}
```

**接口可以相互继承，接口可以多继承**

倘若一个类(接口)继承了另一个接口并且实现了一个方法，那么在另一个类(接口)继承这个类（接口）时可以不用再去实现这个方法。**简单来说一个(同名)方法只要在某个地方实现了一次（前提之间有继承关系），那么其他地方可以不用再去实现，除非要实现不同的目标。**

```java
public class Main{//main类
    public static void main(String[],args){
        Test1 t =new Test1();
        t.test();
    }
}

public interface A{
    void test();
}
public class Test{
    public void test(){
        System.out.println("我是父类实现");
    }
}

public class Test1 extends Test implements A{
    //Test1 继承Test 实现 A;
    /*
    由于Test1 继承的Test类已经将test方法实现，所以即使Test1调用了 A 也不需要再将test方法实现。
    同时在main 类里执行程序所得结果是“我是父类实现”，这表示Test类里实现的test方法已经将A接口里的test方法覆盖掉了，所以Test1的对象所执行的test方法是继承于Test类里实现的test方法。
    */
    /*
    同时如果将A接口类的test方法，在接口内实行默认实现
    即为： default void test(){
    	System.out.println("我是接口中的实现");
    }
    执行结果同样为"我是父类实现".
    解释：父类对test的实现将A接口类的默认实现覆盖，父类优先级大于接口。
    */
}
```

**由此可以看出，一个类的父类和接口都有一个方法，并且父类已经实现该方法，则该类的对象优先使用父类的实现方法。（类大于接口）**

## 枚举

```java
public class Main {//main
    public static void main(String[] args) {
        Students s=new Students();
        s.setStatus(Status.running);
        System.out.println(s.getStatus());
    }
}

public class Students{//学生类
        private Status status;//封装

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

public enum Status {//枚举类
    running,study,sleep;//枚举类可以设置多个状态
    //在main类里调用setStatus方法时可以直接选择已经设定好的状态，不用再去输入。
}

```

## 基本类型包装类

int->Integer

short->Short

byte->Byte

long->Long

float->Float

double->Double

char->Character

boolean->Boolean

**包装类就是将基本数据类型封装成一个类**

```java
public class Main{
    public static void main(String[] args){
        Integer i=new Integer(10);//Integer类
        //i=10 作为对象的一个int
    }
}
/*Integer的类里面有 public Integer(int value){
		this.value=value;
}*/所以可当做对象去使用
```

**包装类型支持自动封装**

所以我们可以直接将一个对应的基本类型值作为对应包装类型应用变量的值（简单来说就不用再去new 一个对象了）

```java
public static void main(String[] args){
    Integer i=10;//将int类型值作为包装类型使用
    /*
    自动装箱实际上隐式调用了 Integer i=Integer.valueOf（10);
   	其中Integer.valueOf(10)直接简化成了10
    */
    
}
```

**自动拆箱**

将一个对象类型变成了对应的普通基本类型

```java
public static void main(String[]args){
    Integer i=10
    int a=i;
    //a=10
    /*
    自动拆箱实际上调用了
    int a=i.intValue();这个方法
    
    public int intValue(){
    	return value;
    }该方法在Integer类里面
    */
}
```

有了这种自动装箱和拆箱的机制，才可以让包装类型轻松的参与到基本类型的运算。

```java
public static void main(String[]args){
    //用自动装箱 在 -128的127 的值都相同
    Integer a=10;
    Integer b=10;
    //(a==b) true;
    Integer c=128;
    Integer d=128;
    //(c==d) false;
}
```

（以上同理其他基本数据类型）

### 数据类型转换

```java
public static void main(String[args]){
    String s="10";
    Integer i=new Integer(s);//快速将string转换为int
    //i=10;
    /*
    Integer i= Integer.parseInt(s);
    Integer i=Integer.valueOf(s);
    效果相同
    */

	Integer a=Integer.decode("0xAA");//16进制
    //a=170;
}


```

### 特殊包装类

用于计算超大类型数字的BigInteger（没有限制）

但只能调用方法来进行计算

```java
public static void main(String[]args){
    BigInteger i=BigInteger.valueOf(100);
    BigInteger a=i.multiply(BigInteger.TEN);//乘以10
    //add(加)，divide（除）pow（次方）
    /*
   	这里乘以10 得出来的是新的对象，必须要一个新的对象来存
    */
}
```

BigDecimal 可以小数的精确计算

用法与BigInteger相似

```java
BigDecimal i=BigDecimal.valueOf(10);
i=i.divide(BigDecimal.valueOf(3),100,RoundingMod.CEILING) //10除以3 ，精确到小数点100位 向上取整
```



## 数组

**数组本身也是一个类，继承于Object**

普通数组不支持装箱和拆箱

### 一维数组

int a=10;

int[] a ={...};

```java
public static void main(String[]args){
    int[] a =new int[10];//长度为10的数组
    int [] b=new int[]{1,2,3,4};//静态初始化
    //int[] b={1,2,3,4};
    int cl=b.clone();
    cl={1,2,3,4};
    /*
    与c不同的是有String
    类型数组
    */
    String[] c=new String[10];
    c[0]="hello ,world";
}
```

### 多维数组

