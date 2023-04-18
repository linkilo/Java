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

**所以的类都继承于object类**

## 继承:extends

```java
public class person {
public person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }//若父类使用了该构造方法则子类也应该继承该构造方法，子类用super来调用该方法
}

public class Students extends person{
    //在类名后面加上 extends 被继承的类名 
//表示Students 类继承了person类
//
	public Students (String name,int age,String sex){
        super(name,age ,sex);//super表示父类的构造
    }
    /*
    子类可以通过super来调用父类的关键字
    super.后加父类的成员方法或者成员变量
    但是在static中不能调用父类的方法或变量
    */

}

```



## 重写:@Override

方法的重载是为某个方法提供更多的种类，而方法的重写则是覆盖掉原来的方法。

重写格式：

@Override

方法的格式应该与要被重写的方法格式相同



如果不想让任何子类再去重写这个方法 则只需要加上final 表示为最终不可再次被重写 public final void test(){}

同理对于成员变量 在成员变量前加上final 则只有在构造时给该变量赋值，而如果该变量已经有初始值了，则构造时也不能给该成员变量赋值

~~final String name;~~

同理 对于类 ，在类前加上final 则表明该类不能被继承
~~public final class person~~

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

//toString 和 equals 都是Object类的方法 而所有的类都默认继承于Object 所以可以不用写 extends Object
```

## 抽象类:abstract

在（类）class前加上 abstract 也可以在成员变量和成员方法前加abstract， 抽象方法可以看做一个函数但是这个函数没有任何内容，只有函数名和参数，这个抽象方法可以被他的子类（重写）调用，抽象方法在不同的子类，重写方式不同，故运行结果不同，~~这就是多态~~。

**抽象方法没有主体**

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

## 接口:interface

接口只代表某个确切的功能，是一种只包含方法的定义，严格来说不能算作一个类。~~但是为了方便理解可以将接口看做一个抽象类，而且这个接口里面只有抽象方法。~~

**简单来说接口就是将类所具有的某些行为（方法）抽象出来，将这些方法放在接口中，如果有类要使用该方法，就可以直接继承（调用）这个接口，然后再使用这个方法，每个类可以通过不同的重写以此来实现相同的方法在不同的类，所实现目标不同**

**注意：抽象方法不能有主体，在某个类继承接口后必须在这个类里面实现这个方法**

```java
public interface Study{//名为Study的接口
    void study();
    /*
    本来应该写为 public abstract void study();
    但接口内默认为 public abstract 所可以省略
    */
    //如果想在接口内实现一个方法，则只需要在前加上default
    default void study_1(){
        System.out.println("我学习能力很好");
    }
}
public class sutdnets implements Study{
    //类通过 implements 加接口名来调用一个接口
    //可以在这里加上 @Override 看做重写
    public void study(){//实现接口 
        System.out.println("我学习能力很好");
    }
}
```

**接口可以相互继承，一个接口可以多继承**

倘若一个**类(接口)**继承了另一个接口并且实现了接口里面的一个方法，那么在另一个类(接口)继承这个**类（接口）**时可以不用再去实现这个方法。**简单来说一个(同名)方法只要在某个类（接口）实现了一次（前提是这些类之间有继承关系），那么其他类可以不用再去实现，除非要实现不同的目标。**

```java
public class Main{//main类
    public static void main(String[],args){
        Test1 t =new Test1();
        t.test();
    }
}

public interface A{//A接口
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

~~**由此可以看出，一个类的父类和接口都有一个方法，并且父类已经实现该方法，则该类的对象优先使用父类的实现方法。（类大于接口）**~~

## 枚举：enum

```java
public class Main {//main
    public static void main(String[] args) {
        Students s=new Students();
        s.setStatus(Status.running);
        System.out.println(s.getStatus());
    }
}

public class Students{//学生类
        private Status status;//封装，只能在该类里面调用这个成员变量

    public Status getStatus() {//通过getStatus函数可以将封装好的成员变量传出去，但是外部只能获得这个值，并没有改变这个变量的能力
        return status;
    }

    public void setStatus(Status status) {//通过setStatus外部可以实现对封装好的成员变量赋值的操作
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
        //i=10 作为对象的一个i
    }
}
/*Integer的类里面有 public Integer(int value){
		this.value=value;
}*/
//所以可当做类去new一个对象使用
```

**包装类型支持自动封装**

所以我们可以直接将一个对应的基本类型值作为对应包装类型应用变量的值（简单来说就不用再去new 一个对象了）

```java
public static void main(String[] args){
    Integer i=10;
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

**有了这种自动装箱和拆箱的机制，才可以让包装类型轻松的参与到基本类型的运算。**

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

```java
//装箱调用 Integer i=Integer.valueOf(value);
//拆箱调用 int a=i.intValue();
```



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
//待补充

```

### 特殊包装类

~~了解？~~

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
    //可以简写为：int[] b={1,2,3,4};
    int cl=b.clone();//克隆
    //cl={1,2,3,4};
    /*
    与c语言不同的是有String
    类型数组
    */
    String[] c=new String[2];
    c[0]="hello";
    c[1]="world";
    System.out.println(c[0]+" "+c[1]);// 输出hello world。
}
```

### 多维数组

```java
public static void main(String[]args){
    	int[][] a=new int[10][10];
    	int[][] arr={//静态初始化
            {1,2},
            {2,3},
            {3,4},
        };
    
}
```

### 可变长参数

**可变长参数实质上就是数组**

只要输入几个参数，就可以传入几个参数

基本数据类型+“...”

```java
public class Main{
    public static void main(String[] args){
        test("hello","world");
    }
    
    public static void test(String... s){
       System.out.println(s.length);//数组长度
        for(String i :s){
            System.out.print(i+" ");
        }
    }
    
    /*
    运行结果：
	2         (数组长度)
	hello world 
    */
    //int... float... 等基础类型都可以
    public static void test1(int a,String... s){
        //如果要传入其他参数，可变长参数必须放在最后
    }
}
```

**注意：一个方法只能有一个可变长参数**

```java
public static void main(String[] args){
    /*
    对于String[] args
    这是我们要执行java程序时，输入的命令行参数（很少使用）
    就是一个空数组
    */
}
```

## 字符串

```java
public static void main(String[]args){
    String s="hello world";
    //字符串内容比较用equals
    String s1="hello world";
     System.out.println(s.equals(s1));//true
    //s.length 字符串长度
 	String s2=s.substring(0,5);//裁剪字符串 从下标0到5不包含5
    String s3=s.replace("hello","1");//将hello替换成1
    
    
    //reverse 反转
    //待补充
}
```

### StringBuilder

一个存字符串的容器

可对字符串进行许多操作

**在String可用的方法在StringBuilder同样可用**

```java
public static void main(String[]args){
    StringBuilder s=new StringBuilder;
    s.append("aaa")//append 方法在s后加上aaa
    s.delete(1,3)//删除1到3之间的字符串
        s.
        append("111");
    	append("222");//链式操作
    //待补充
}
```

### 正则表达式

```java
  public static void main(String[] args) {
            String s="oooaaa";
            System.out.print(s.matches("o*a+"));
      /*
      通过matches来匹配
      
      */
    }

```

~~详细规则图表见菜鸟~~

## 内部类

### 成员内部类

~~（使用较为麻烦）~~

```JAVA
  public static void main(String[] args) {
          Students s=new Students();
          Students.Inner inner= s.new Inner();
    }

public class Students{
   public class Inner {//成员内部类,属性与普通类相同
        //成员类需要父类的对象来创建
    }
}
```

```java
public static void main(String[] args) {
        Students s=new Students();
        Students.Inner inner=s.new Inner();
        inner.test("我传进参数的name");
    }


public class Students{
    String name="我是Students类的对象name";
   public class Inner {//成员内部类,属性与普通类相同
       String name="我是内部类的name";
       public void test(String name){
           System.out.println(name);//传进参数的name
           System.out.println(this.name);//this指向该类的name
           System.out.println(Students.this.name);//指向Students类的name
       }
    }
```

### 静态内部类

**不需要依附任何对象可以直接创建内部类的 对象**

```java
public class Main {
    public static void main(String[] args) {
        Students.Inner inner=new Students.Inner();
        //直接创建内部类的对象
        inner.test();
    }

}

public class Students{
    private final String name;
    public Students(String name){
        this.name=name;
    }

    public static class Inner{//静态内部类
        public void test(){
            System.out.println("我时静态内部类");
        }
    }
}
```

### 局部内部类

**局部内部类可以再方法中定义**

但是作用范围只能在这个方法里面

（基本用不到）

```java
public class Students{

    public void test(){
        class Inner{

        }
        Inner inner=new Inner();
        
    }
}
```

### 匿名内部类

（使用率高）

```java
public class Test {
    static{//静态代码块
        System.out.println("外部类初始化");
    }

    public  static class Inner{
        static {
            System.out.println("内部类初始化");
        }

        public void test()
        {
            System.out.println("我是静态内部类");
        }
    }
} 

public class Main {
    public static void main(String[] args) {
        Test.Inner t=new Test.Inner();
        t.test();
    }

}

/*
执行结果:

内部类初始化
我是静态内部类

在这个过程值只初始化了静态内部类
因为不管是什么类，系统都给每个类生成了一个class文件独立存放
执行时只会执行需要用的类
*/
```

**匿名内部类是局部内部类的简化版**

```java
public  abstract class Students{//抽象类
        public abstract void test();//抽象方法
    }


public class Main {
    public static void main(String[] args) {
        //正常情况下，要创建一个抽象类的实例对象，只能通过继承的方式，来实现方法，然后再创建实例对象
            Students s =new Students(){
                //在new的时候 直接将方法实现
                @Override
                public void test(){
					System.out.println("我是匿名内部类");
                }
            };//这样写就是匿名内部类，就可以不用再去继承
        s.test();
        /*
        这里的s对象，就是一个已经实现了抽象方法的对象
        而这个抽象类就已经定义好了，没有名字就可以创建出对象
        */
    }

}
```

**同样的接口也可以通过这种匿名内部类的形式，直接创建一个匿名的接口实现类。**

```java
public class Main {
    public static void main(String[] args) {
            Students s =new Students(){//在new的时候 直接将方法实现
                @Override
                public void test() {
                    System.out.println("我是匿名内部类"+name);
                }
            };//匿名内部类
        s.test();
        Study s1=new Study(){
          @Override
          public void study(){
              System.out.println("我是匿名接口类");
          }
        };
        s1.study();
    }

}
public interface Study {//Study接口
    void study();//抽象方法
}
 public  abstract class Students{//抽象类
        protected String name;
        public abstract void test();//抽象方法
    }
```

普通类，抽象类，接口都可以创建匿名内部类。

### Lambda表达式

**Lambda表达式只支持接口**

通过匿名内部类，我们可以创建一个临时的实现子类

如果一个接口中有且只有一个待实现的抽象方法，那么我吗可以将匿名内部类简写成Lambda表达式：

```java
public interface Study {
    void study(int a);
}


public class Main {
    public static void main(String[] args) {
        Study s=new Study() {//匿名内部类
            @Override
            public void study(int a) {
                System.out.println("hello");
            }
        };
        Study s1= (int a) -> System.out.println("hello");
        //Lambda 表达式
        
        Study s2=(int a) -> {
            System.out.println("hello");
            System.out.println("world");
        }
        
        /*
        public interface Study {
    		String study(int a);
		}
        如果实现的方法力只需要return 一个值
        Study s=(int a)->{
   			return "hello";
        }
        那可以简写为：
		Study s = a->"hello";
        */
    }
}

```

### 方法引用

**方法引用就是讲一个已经实现的方法直接作为接口中抽象方法的实现**

**任何方法都可以通过方法引用作为实现**

实现格式： 对象+“::”+方法名

```java
public interface A {
    int sum(int a,int b);
}

public class Main {
    public static void main(String[] args) {
        A s= (a,b)-> a+b;
        //接口的求和方法
        A s1=(a,b)->Integer.sum(a,b);
        //Integer的求和方法
        A s2=Integer::sum;
        //引用Integer的求和方法
        System.out.println(s.sum(10,20));
        System.out.println(s1.sum(10,20));
        System.out.println(s2.sum(10,20));
    }
}

    /*
    Integer中已经存在了一个求和方法，且定义和返回类型和 A接口中的一样，，那么就可以直接将该方法作为接口中抽象方法的实现
    */
}
```

```java
public interface Study {//Study接口
    String study();
}

public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        /*
        要使用test方法必须先创建一个Main类的对象CIA能使用Main类的方法
        */
        Study s=m::test;
        /*
        通过 Main类里的 test方法来作为 Study接口抽象方法的实现
        */
        System.out.println(s.study());
    }
    public String test(){//成员方法
        return "kilo";
    }
}
//执行结果：kilo

```

## 异常机制

异常类型：

1：运行时异常（继承于：RuntimeExceptiomn）

2：编译时异常(继承于：Exception)

### 抛出异常

实际上是将异常对象抛出

主动抛出异常:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(test(1,0));
    }
    public static int test(int a,int b){
        // ArithmeticException:（算数异常）运行时异常
        // Exception：编译时异常
        // ArithmeticException Exception =new ArithmeticException("除数不能为0);
        if(b==0)
            throw new ArithmeticException("除数不能为0");//创建异常对象
        return a/b;
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: 除数不能为0
	at com.test.Main.test(Main.java:14)//指明错误位置
	at com.test.Main.main(Main.java:9)


*/
```

### 异常处理

//待补充

## 常用工具类

### 数学工具类

```java
public class Main {
    public static void main(String[] args) {
        //Math是java。lang包下的类，所以默认可以直接使用
        Math.abs(-1);//求绝对值
        Math.max(1,2);//求最大值
        Math.min(1,2);
        Math.sqrt(9);//算数平方根
        Math.pow(5,3);//5的3次方
        //Math.PI=π
        Math.sin(Math.PI/2);//求π/2的正弦值
        //同理有Math.cos Math.tan
        Math.asin(1);//反三角函数 求arcsin1的值
        //同理 Math.acos Math.atan;
        Math.log(4)/Math.log(2);//以2为底4的对数
        
    }
}
/

```

### 数组工具类

```java
public class Main {
    public static void main(String[] args) {
      int [] a=new int[]{1,0,2,3,4,5,7};
        System.out.println(Arrays.toString(a));//打印数组
        Arrays.sort(a);//排序
        int [] b=new int[10];
        Arrays.fill(b,5);//用5填充数组
        int[] c=Arrays.copyOfRange(a,0,3);//复制a数组0到3之间的数
        System.out.println(Arrays.toString(c));
    }
}
//待补充
```

## 范型

```java
public class Score {
    String name;
    String id;
    Object value;//Object为父类可以存放各种类型的变量
    public Score(String name,String id,Object value){
        this.name=name;
        this.id=id;
        this.value=value;
    }

    public Object getValue() {
        return value;
    }
}

public class Main{
    public static void main(String[] args){
        Score s=new Score("math","1",90);
        Score s1=new Score("eng","2","A");
        int n=(int)s.getValue();
        String d=(String)s1.getValue();
    }
}
```

但是直接使用Object存变量时，如果工程量大，可能会弄混Object内存的

变量类型。

### 范型类

**范型仅仅是在编译阶段进行类型检查**

范型就是一个待定类型，可以使用一个特殊的名字表示范型，范型在定义的时候并不明确是什么类型，而是在需要用到是才会确定对应的范型类型。

```java
public class Score<T> {//在类名后加一个<> <>内起名字（推荐大写字母）
    String name;
    String id;
    T value;//将Object替换为T
    public Score(String name,String id,T value){
        this.name=name;
        this.id=id;
        this.value=value;
    }

    public T getValue() {
        return value;
    }
}

public class Main{
    public static void main(String[] args){
        Score<Integer> s=new Score<Integer("math","1",90);
       	//注意类型实参不能是int(不能是基元参数)
        //Score<int> 错误
        //如果是数组用int[]
        //Score<int[]>
        Score<String> s1=new Score<String>("eng","2","A");
        //在定义时明确变量类型
//可以简写为Score<Integer> s = newScore<>("math","1",90);
        //<?>:通配符：可以传任何类型变量
    }
}
```

在范型没有确定时，默认为Object。

<u>静态内容不能使用范型变量</u>

如果使用多个范型变量

```java
public class Score<T,U> {
    String name;
    U id;
    T value;//Object 为父类可以存放各种类型的变量
    public Score(String name,U id,T value){
        this.name=name;
        this.id=id;
        this.value=value;
    }

    public T getValue() {
        return value;
    }
}
public class Main{
    public static void main(String[] args){
      Score<Integer,Integer> s = newScore<Integer,Integer("math",1,90);
        Score<Integer,String>s1=newScore<Integer,String("eng","2,1);
        //在定义时明确变量类型
        int n= s.getValue();
        int f= s1.getValue();
        System.out.println(n);
        System.out.println(f);
    }
}
```

### 范型与多态

范型可以应用于类，抽象类，接口

```java
public interface Study<E> {
    E test();
}
public class Main{
    public static void main(String[] args){
        b s1=new b();
        s1.test();
        a<String> s =new a<>();
        s.test();
    }

    static class b implements Study<String>{//实现Study
        @Override
        public String test() {
            return null;
        }
    }
    static class a<T> implements Study<T>{
        @Override
        public T test() {
            return null;
        }
    }
}
```

### 范型方法

```java
public class Main{
    public static void main(String[] args){
        String s=test("xxx");
        int n=test(1);
        System.out.println(s);
        System.out.println(n);
    }
    public static<T> T test(T t){//范型方法
        return t;
    }
}
```

Arrays.sort 排序 

```java
public class Main{
    public static void main(String[] args){
        Integer[] a={2,3,4,5,6,7};
        Arrays.sort(a,(o1,o2)->o1-o2);
        //（不能是基元类型数组：int）
        //Lambda表达式
        //o1-o2从小到大排序
        //o2-o1从大到小排序
        /*
        原型：
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        */
        System.out.println(Arrays.toString(a));
    }
}
```

### 范型界限

#### 范型上界

如果我们不想让某个变量是除数字类型以外的其他类型，就可以使用范型的上界定义

```java
public class Score<T extends Number> {//通过继承的方法 使这个类型实参继承于NUmber类，就可以限定这类型实参只能是数字类型
        String name;
        int id;
        T value;

        public Score(String name,int id, T value){
                this.name=name;
                this.id=id;
                this.value=value;
        }
}

public class Main {
    public static void main(String[] args){
            Score s=new Score("math",1,1);
    }
}
```

**通过给范型设定上限，我们就可以更加灵活地控制范型的具体类型**

#### 范型下界

**范型下界只能用在通配符<?>**

```java
public class Score<T extends Number> {//通过继承的方法 使这个类型实参继承于NUmber类，就可以限定这类型实参只能是数字类型
        String name;
        int id;
        T value;

        public Score(String name,int id, T value){
                this.name=name;
                this.id=id;
                this.value=value;
        }
}
public class Main {
    public static void main(String[] args){
          Score<? super Integer> s =new Score("math",1,1);
          //用super 设置下界，该类型实参只能使用NUmber的子类和Integer的父类

    }
}
```

## 类型擦除(p78)

范型的实现：

```java
public abstract class A <T>{//抽象类 范型
    abstract T test(T t);
}
```

如果没有设定界限那么编译后

```java
public abstract class A <T>{
    abstract Object test(Object t);//默认是Object
}
```

如果设定了上限

```java
public abstract class A <T extends Number>{
    abstract T test(T t);
}
```

编译后

```java
public abstract class A <T>{
    abstract Number test(Number t);//上界为Number，只能为Number或者Number的子类
}
```

所以说**范型仅仅是在编译阶段进行类型检查**。

```java
public class Score<T> {//通过继承的方法 使这个类型实参继承于NUmber类，就可以限定这类型实参只能是数字类型
        String name;
        int id;
        T value;
        public void setValue(T value){
                this.value=value;
        }
        public Score(String name,int id, T value){
                this.name=name;
                this.id=id;
                this.value=value;
        }

        public T getValue(){
                return value;
        }
}

public class Main {
    public static void main(String[] args){
        Score<Integer> s=new Score<Integer>("math",1,1);
        Score s1=new Score<Integer>("math",1,2);
        /*
        （原始引用）类型擦除 :这样写就不会进行类型检查，所以就算我给s1
        传一个String类型的变量也不会报错
        相当于跳过了编译时的类型检查
        */
        s1.setValue("我是String类型");
        System.out.println(s1.getValue());
    }
}
```

## 函数式接口

函数式接口：用于Lambda表达式的接口，这些接口可以直接使用Lambda表达式
