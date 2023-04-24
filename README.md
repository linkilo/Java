**0.o**    

**o.0**  

**Java is a piece of shit**   

**0.o**

**o.0**

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

（使用较为麻烦）

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

如果一个接口中有且只有一个待实现的抽象方法（接口内用default已经实现的方法可以不管），那么我吗可以将匿名内部类简写成Lambda表达式：

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

**这些函数接口都在 java.util.function 这个包里面**

### Supplier供给型函数式接口

这个接口专门用于供给使用的，这个接口里只有一个未实现的get方法用于获取需要的对象

```java
@FunctionalInterface //函数式接口
public interface Supplier<T>{
	T get(); //该方法用于实现供给功能
}
```

```java
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        Supplier<student> studentSupplier = new Supplier<student>() {
            @Override
            public student get() {
                return new student();//返回一个学生对象
            }
        };
        studentSupplier.get().test();//需要调用get方法
        Supplier<student> studentSupplier1=()->new student();//Lambda表达式
        studentSupplier1.get().test();
        Supplier<student> studentSupplier2=student::new;//方法引用
        studentSupplier2.get().test();
    }

    public static class student{//在Main类里需为static静态类才能供main使用

        public void test(){
            System.out.println("我是学生");
        }
    }
}
```

通过Supplier里的get方法，制造出了一个学生制造器，当我们想得到一个新的学生对象时，直接可以调用Supplier里的get 方法 get一个新对象

### Consumer消费型函数式接口(还需加强理解)

这个接口专门用于消费某个对象

```java
@FunctionalInterface
public interface Consumer<T>{
    void accept(T t); //这个方法就是用于消费，没有返回值(消费传入的参数)
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }//该方法可以让我们多次使用Consumer()
}
```

```java
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        Consumer<student> studentConsumer= student -> System.out.println("我是"+student.getName()+"是一名学生");
        student s=new student();
        s.setName("kilo");
        studentConsumer.accept(s);
    }

    public static class student{
         private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
}
// 执行结果：我叫kilo是一名学生
```

### Function函数型函数式接口

这个接口消费一个对象，然后再向外供给一个对象~~（相当于前两个的结合体）~~

```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
    
     default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
     static <T> Function<T, T> identity() {
        return t -> t;
    }
}
```

#### compose

可以将指定函数式的结果作为当前函数式的实参。

```java
import java.util.function.Function;

public class Main {
    public static void main(String[] args){

        Function<Integer,String> integerStringFunction=Object::toString;
        //调用toString将Integer类型转化为String类型
        String s=integerStringFunction.apply(10);
        System.out.println(s);


        Function<student,String> studentStringFunction=Object::toString;
        String s1=studentStringFunction.apply(new student());
        System.out.println(s1);


        //如果传入参数为String类型，要实现Integer->String,就要先将String变为Integer再实现Integer->toString
        //String->Integer就需要用到Function 内的 .compose 实现参数转化
        Function<Integer,String> integerStringFunction1=Object::toString;
        String s2=integerStringFunction1
                .compose(String::length)//将此函数的返回值作为当前实现的实参
                .apply("kilo");
        System.out.println(s2);
        //String->Integer->String
        //第一步：.apply传入参数
        //第二步：.compose 通过引用String里的.length方法将String类型变为Integer类型（实际上求的字符串长度，在将该函数的返回值（Integer）作为当前实现的实参）
        //第三步：之后再实现Object里的toString方法 将Integer变为String类型
    }

    public static class student{

        private String name;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    }
}
```

#### andThen

~~后置操作~~

和compose相反的andThen可以将当前实现的返回值进行进一步处理，得到其他类型的值。

```java
public class Main {
    public static void main(String[] args){
        boolean str =integerStringFunction1
                .andThen(String::isEmpty)//判断是否为空
                .apply(10);
        System.out.println(str);
    }

    public static class student{

        private String name;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    }
}
```

### Predicate断言型函数式接口

接收一个参数，然后进行自定义判断并返回一个**boolean**结果

```java
@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);// 这是我们要实现的方法
	
    default Predicate<T> and(Predicate<? super T> other) {//同时满足返回true
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }
    
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }
    
    default Predicate<T> or(Predicate<? super T> other) {//只要有真返回true
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
    
    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }
    
    static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return (Predicate<T>)target.negate();
    }
}
```



```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        Predicate<student> studentPredicate=student -> student.score>=60;
        //通过这个断言表达式，我们可以判断一个学生的成绩是否大于60
        student s=new student();
        s.score=90;
        if(studentPredicate.test(s)){
            System.out.println("成绩合格");
        }
        else{
            System.out.println("成绩不合格");
        }
    }

    public static class student{
        int score =100;

    }
}
```

```java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        Predicate<student> studentPredicate=student -> student.score>=60;
        student s=new student();
        s.score=90;
        boolean b=studentPredicate
                .and(stu -> stu.score>=90)//除了满足大于60还要满足大于90
                .test(s);

        if(b){
            System.out.println("成绩不错");
        }
        else{
            System.out.println("emmm...");
        }
    }

    public static class student{
        int score =100;

    }
}
```

### 判空包装

很有效的处理空指针问题

列如：

```java
public class Main {
    public static void main(String[] args){
           
    }
    private  static void test(String s){
        if(!s.isEmpty())
            System.out.println(s.length());//如果不为空则打印长度
    }
}
```

这个方法如果字符串不为空则打印长度

那如果我们传进一个null进去

```java
public class Main {
    public static void main(String[] args){
           test(null);
    }
    private  static void test(String s){
        if(!s.isEmpty())
            System.out.println(s.length());//如果不为空则打印长度
    }
}

//会直接报错
/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "s" is null
	at com.test.Main.test(Main.java:14)
	at com.test.Main.main(Main.java:10)

*/
//直接传null(不引用任何对象)进去会报错，null不引用任何对象，所以不能调用isEmpty判断，所以传null会导致空指针异常
```

所以要在之前加一个判空处理

```java
public class Main {
    public static void main(String[] args){
            test(null);
    }
    private  static void test(String s){
        if(s==null) return ;//如果为空直接返回
        if(!s.isEmpty())
            System.out.println(s.length());
    }
}
//这样就不会报错
```

~~而Optional类可以更加**优雅**的处理这种问题~~

```java
import java.util.Optional;

public class Main {
    public static void main(String[] args){
            test(null);
    }
    private  static void test(String s){
        Optional
                .ofNullable(s)
                .ifPresent(s1 -> {//判断是否存在，只有不为空才执行
                    if(!s.isEmpty())
                        System.out.println(s.length());
                });

    }
}
```

# 数据结构

数据结构是数据值的集合，可以体现数据值之间的关系，一家对数据进行应用的函数或操作

## 线性表

有两种实现方式：**顺序储存/链式储存**

是由同一类型的数据元素构成的有序序列的线性结构。线性表的元素个数就是线性表的长度，

起始位置是表头，结束位置是表尾。当一个线性表中没有元素时，称为空表。

功能：
**获取指定位置元素**

**插入**

**删除**

**获取长度**

### 顺序表（顺序储存）：

存放数据还是用数组，但是可以使用额外的操作来强化为线性表。

像这样底层依然采用顺序储存实现的线性表，称为顺序表。

```java
public class ArrayList<E> {//定义为范型
    public int size=0;//表示表里有几个元素
    private int capacity=10;//表的容量
    private Object[] array =new Object[capacity];//底层数组

    //插入（将插入位置后的元素全部向后移动一位）
    public void add(int index,E element){ //index 插入位置
        if(index<0||index>size){//判断是否合法
            System.out.println("非法位置"); //只能在0~size之间插入
        }
        if(size>=capacity){//扩容
            int newCapacity = capacity+(capacity>>1);//扩容为1.5倍
            Object[] newArray =new Object[newCapacity];
            System.arraycopy(array,0,newArray,0,size);//拷贝
            //从array数组的0号下标开始复制，复制到 newArray数组的0到size号下标
            array=newArray;
        }
        //从后往前遍历
        for(int i=size;i>index;i--){//插入操作
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }

    //删除元素
    public E remove(int index){//要删除元素的下标
        if(index<0||index>size-1){
            throw  new IndexOutOfBoundsException("删除位置非法");
        }
        E e=(E)array[index];
        for(int i=index;i<size;i++){
            array[i]=array[i+1];
        }
        size--;
        return e;
    }

    public  E get(int index){//获取指定位置的元素
        if(index<0||index>size)
            throw  new IndexOutOfBoundsException("获取位置非法");
        return (E)array[index];
    }
    public void getArray(){
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }

}

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0,1);
        l.add(0,2);
        l.getArray();
    }
}

```



### 链表：

```java
public class LinkList <E>{
    private  Node<E> head =new Node<>(null);//头结点
    private int size;//长度
    private static class Node<E>{//节点
        private E element;
        private Node<E> next;
        public Node(E e){
            this.element=e;
        }
    }

    //插入
    public void add(E element,int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("插入位置非法");
        }
        Node<E> prv=head;
        for(int i=0;i<index;i++){
            prv=prv.next;
        }
        Node<E> n=new Node<>(element);
        n.next=prv.next;
        prv.next=n;
        size++;
    }


    //删除
    public E delete(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("删除位置非法");
        }
        Node<E> prv=head;
        for(int i=0;i<index;i++){
            prv=prv.next;
        }
        E e=(E) prv.element;
        prv.next=prv.next.next;
        return e;
    }

    public E get(int index){//获取对应位置元素
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("删除位置非法");
        }
        Node<E> n=head;
        while(index-->=0){
            n=n.next;
        }
        return n.element;
    }
    @Override
    public String toString(){//重写toString方法（System.out.print会调用toString方法），可以直接用System.out.print直接打印数组
        StringBuilder builder=new StringBuilder();
        Node<E> n=head.next;
        while(n!=null){
            builder.append(n.element).append(" ");
            n=n.next;
        }
        return builder.toString();
    }
}

```



### 栈：

特殊的线性表

只能在表尾进行操作

**pop：出栈**

**push：入栈**

~~(这是用链表实现的栈)~~

```java
public class Stack<E> {
    private Node<E> head=new Node<>(null);
    private class Node<E>{
        private E element;
        private Node<E> next;
        private Node(E e){
            this.element=e;
        }
    }

    public void push(E element){//加入
        Node<E> n=new Node<>(element);
        n.next=head.next;
        head.next=n;
    }
    public E pop(){//删除
        if(isEmpty()){
            throw  new IndexOutOfBoundsException("栈已经为空，不可再删除");
        }
        E e=head.next.element;
        head.next=head.next.next;
        return e;
    }
    public boolean isEmpty(){//判断栈是否为空
        return head.next==null;
    }
    
}

```

### 队列：

~~特殊线性表+1~~

**队尾插入**

**队首出队**

```java
public class Queue <E>{
    private Node head=new Node<>(null);

    private class Node<E>{
        private E element;
        private Node<E> next;
        private Node(E e){
            this.element=e;
        }

    }

    public void offer(E element){//入队
        Node<E> end=head;
        while(end.next==null){
            end=end.next;
        }

        Node<E> n=new Node<>(element);
        end.next=n;
    }

    public E poll(){//出队
        if(isEmpty()){
            throw new IndexOutOfBoundsException("队列以空，不可执行出队操作");
        }
        E e =(E)head.next.element;
        head.next=head.next.next;
        return e;
    }

    public E peek(){//仅获取队首元素
        if(isEmpty()){
            throw new IndexOutOfBoundsException("队列以空，不可执行出队操作");
        }
        return (E)head.next.element;
    }

    public boolean isEmpty(){
        return head.next==null;
    }
}
```



## 树



### 二叉树：

```java
public class Main {
    public static void main(String[] args){
        TreeNode<Integer> a=new TreeNode<>(1);
        TreeNode<Integer> b=new TreeNode<>(2);
        TreeNode<Integer> c=new TreeNode<>(3);
        TreeNode<Integer> d=new TreeNode<>(4);
        TreeNode<Integer> e=new TreeNode<>(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        System.out.println(a.left.left.element);
    }

    public static class TreeNode<E>{
        public E element;
        public TreeNode<E> left,right;
        public TreeNode(E e){
            this.element=e;
        }
    }

```

### 二叉树的遍历

前序：

中->左->右

中序

后序

层序:用队列完成

```java
import com.test.empty.LinkQueue;


public class Main {
    public static void main(String[] args){
        TreeNode<Integer> a=new TreeNode<>(1);
        TreeNode<Integer> b=new TreeNode<>(2);
        TreeNode<Integer> c=new TreeNode<>(3);
        TreeNode<Integer> d=new TreeNode<>(4);
        TreeNode<Integer> e=new TreeNode<>(5);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;

        pre(a);
        System.out.println("");
        mid(a);
        System.out.println("");
        aft(a);
        System.out.println("");
        levelOrder(a);
    }

    public static void pre(TreeNode<Integer> root){//前序
        if(root==null) return ;
        System.out.print(root.element+" ");
        pre(root.left);
        pre(root.right);

    }

    public static void mid(TreeNode<Integer> root){//中序
        if(root==null) return ;
        mid(root.left);
        System.out.print(root.element+" ");
        mid(root.right);
    }

    public static void aft(TreeNode<Integer> root){//后序
        if(root==null){
            return ;
        }
        aft(root.left);
        aft(root.right);
        System.out.print(root.element+" ");
    }

    public static void levelOrder(TreeNode<Integer> root){
        LinkQueue<TreeNode<Integer>>  q=new LinkQueue<>();
        q.offer(root);
        while(!q.isEmpty()){//队列不空，则不断取出来
            TreeNode<Integer> node=q.poll();
            System.out.print(node.element);//打印
            if(node.left!=null) q.offer(node.left);//左右孩子不空则入队
            if(node.right!=null) q.offer(node.right);
        }
    }

    public static class TreeNode<E>{
        public E element;
        public TreeNode<E> left,right;
        public TreeNode(E e){
            this.element=e;
        }
    }
}

public class LinkQueue <E>  {//层序遍历使用的队列
    private Node<E> head=new Node<>(null);
    public class Node<E>{
        E element;
        Node<E> next;
        public Node(E e){
            this.element=e;
        }
    }

    public void offer(E element){//入队
        Node<E> end=head;
        while(end.next!=null);
        end=end.next;
        Node<E> n=new Node<>(element);
        end.next=n;
    }

    public E poll(){
        if(isEmpty()){
            throw  new IndexOutOfBoundsException("队列以空");
        }
        E e=head.next.element;
        head.next=head.next.next;
        return e;
    }

    public boolean isEmpty(){
        return head.next==null;
    }
}

```



### 二叉查找树和平衡二叉树：

#### 二叉查找树：

二叉搜索树

左子树所有节点的值均小于其根节点的值

右子树所有节点的值均大于其根节点的值

二叉搜索树的子树也是二叉搜索树

#### 平衡二叉树

平衡二叉一定是一棵二叉查找树

任意节点的左右子树也是一平衡二叉树

**从根节点开始，左右子树的高度差不能超过1，否则视为不平衡**

这些性质规定了平衡二叉树需要保持高度的平衡，这样查找效率不会降低。

二叉树的节点的左子树高度减去右子树高度的结果为该节点的平衡因子。

通过平衡因子，可以快速判断是否失衡（是否超过1）

~~待补充~~

### 红黑树：

红黑树是二叉查找树的一种

~~待补充~~~

## 哈希表

散列（Hashing）通过散列函数（哈希函数）将要参与检索的数据与散列值（哈希值）关联起来。

现在我们需要将一对数据保存起来，这些数据会通过哈希函数计算，得到与其对应的哈希值，下次

要去查找这些数据时，只需要再次计算哈希值就可以快速找到对应的元素。

保存的数据是无序的

~~待补充~~

# 集合类与IO

## 集合类（Collection）：

**非常重要**

集合和数组一样，可以表示同样的一组元素

### 集合根接口

Collection：提供了各种操作

```java
public interface Collection<E> extends Iterable<E> {
	//-----以下是查询相关的操作
    
    //获取当前集合中的元素数量
    int size();
    
    //查看当前集合是否为空
    boolean isEmpty();
    
    //擦护心当前集合中是否包含某个元素
    boolean contains(Object o);
    
    //返回当前集合的迭代器
    Iterator<E> iterator();
    
    //将集合转化为数组的形式
    Object[] toArray();
    
    //支持范型的数组转化，同上
    <T> T[] toArray(T[] a);
    
    //——----以下是修改相关的操作
    
    //向集合添加元素，不同的集合类具体实现可能会对插入的元素有要求
    boolean add(E e);
    //这个操作并不是一定会添加成功，成功添加会返回true，失败返回false
    
    //从集合中移除某个元素，成功返回true，失败false
    boolean remove(Object o);
    
    
    //----以下是批量执行的操作
    
    //查询当前集合是否包含给定集合的所有元素(给定集合是否为当期集合的子集)
    //求子集
    boolean containsAll(Collection<?> c);
    
    //添加给定集合的所有元素
    //求并集
    //成功返回true ，失败返回false
    boolean addAll(Collections<? extends E> c);
    
    //移除给定集合的所有元素，如果有元素在当前集合不存在则忽略这个元素
    //成功返回true,失败返回false
    //求差集
    boolean removeAll(Collection<?> c);
    
    //根据给定的Predicate条件进行元素移除
    dafault boolean removeIf(Predicate<? super E> filter){
        Objects.requireNonNull(filter);
        boolean removed =false;
        final Iterator<E> each = iterator();
        while(each.hasNext()){
            if(filter.test(each.next())){
                each.remove();
                removed=true;
            }
        }
    }
    
    
    //只保留当前集合中在给定集合中出现的元素，其他元素移除，成功返回true，失败返回false
    //求交集
    boolean retainAll(Collection<?> c);
    
    //清空整个集合
    void clear();
    
    
    //----以下是比较以及哈希计算相关的操作
    
    //判断两个集合是否相等
    boolean equals(Object o);
    
    //计算当前整个集合对象的哈希值
    int hashCode();
    
    //与迭代器作用相同，但是是并行执行的（多线程）
    @Override
    default Spliterator<E> spliterator(){
        return Spliterator.spliterator(this,0);
    }
    
    //生成当前集合的流
    default Stream<E> stream(){
        return StreamSupport.stream(spliterator(),false);
    } 
    
    //生成当前集合的并行流（多线程）
   	default Stream<E> parallelStream(){
        return StreamSupport.stream(spliterator(),true);
    }

}
```

**无论是哪个集合类都支持以上操作**

### List列表

List是集合类型的一个分支

List列表就是线性表，功能更加强大。

List：

是一个有序的集合，插入元素默认插入到尾部，按顺序从前往后存放，每一个元素都有一个下标

允许存在重复元素

在List接口中，定义了列表类型需要支持的全部操作

List直接继承于Collection接口，很多地方重新定义了Collection接口中的方法。

```java
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        //使用集合类时，一般使用它的接口(方便后续修改)
        //顺序表
        List<String> list = new ArrayList<>();
        list.add(0,"AAA");
        System.out.println(list.get(0));
        System.out.println(list.equals("AAA"));
        System.out.println(list.contains("AAA"));
        System.out.println(list.isEmpty());
        Object[] arr=list.toArray();
        System.out.println(arr[0]);
        list.remove("AAA");
        System.out.println(list);
        list.add(0,"AAA");
        list.add(0,"BBB");
        // ...
    }
}
```

```java
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        //使用集合类时，一般使用它的接口(方便后续修改)
        //(双向)链表
        List<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
    }
}//待补充
```



### 迭代器(还需加深理解)

```java
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list=new LinkedList<>(Arrays.asList("a","b","c"));
        for(int i=0;i<list.size();i++){//链表同样可以用for循环遍历
            System.out.println(list.get(i));
        }
        System.out.println("");
        //或者
        for(String s :list){//这里使用了迭代器
            System.out.println(s);
        }
        /*
        编译后的代码是：
          Iterator var4 = list.iterator();//迭代器

        while(var4.hasNext()) {
        //hasNext：（boolean类型）判断是否有下一个元素
        //如果有下一个元素，就调用next方法，返回当前元素，并向下一位移动
            String s = (String)var4.next();
            System.out.println(s);
        }
        */
    }
}
```

因为集合类的实现方法有很多，可能是链式储存，可能是数组储存，不同实现有不同的遍历方式，而迭代器可以将多种不同的遍历方式进行同一，只需要各个集合类根据自己的情况进行对应的实现

迭代器接口：

```java
public interface Iterator<E> {
  
    //判断是否还有下一个元素
    boolean hasNext();

	//遍历当前元素，并将下一个元素作为待遍历元素
    E next();
	
    //移除上一个被遍历的元素
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

	//对剩下的元素进行自定义操作
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
```

迭代器的使用：

```java
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list=new LinkedList<>(Arrays.asList("a","b","c"));
        Iterator<String> iterator= list.listIterator();
        while(iterator.hasNext()){//这样遍历效率更高
            System.out.println(iterator.next());
        }
    }
}
```

**迭代器只能用一次**，还想用就必须重新去生成一个新的迭代器

遍历操作还可以使用forEach（基本通用）

~~其实forEach内部也是迭代器实现的~~

```java
public class Main {
    public static void main(String[] args){
        List<String> list=new LinkedList<>(Arrays.asList("a","b","c"));
        list.forEach(System.out::println);
    }
}
```

### Queue与Deque

队列接口（Queue）：

#### Queue

```java
public interface Queue<E> extends Collection<E> {
    
    //入队，向队尾插入元素
    //但是如果插入失败，会抛出异常
    boolean add(E e);

    //入队，同样的插入操作，但是失败不会抛出异常(一般用offer)
    boolean offer(E e);


    //出队，移除对首元素，队列为空会抛出异常
    E remove();

    //出队，同样移除对首元素，但是队列为空会返回null
    E poll();

    //仅获取对首元素，不进行出队操作，队列为空会抛出异常
    E element();

    //同样仅获取对首元素，但是队列为空仅返回null
    E peek();
}

```

LinkedList内一共实现了List，Deuqe,Cloneable,java.io.Serializable接口,而Deque接口继承于Queue接口，所以用Queue实现的LinkeList对象，既可以有队列的性质，也有链表的性质（可以使用队列的方法和链表的方法)

可以直接将LinkedList当做一共队列来使用（比较方便，精简）

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();//Queue实现的LinkedList对象
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }


}
```

#### Deque

双端队列

两端都可以出队，入队**（可以当做栈和普通队列用）**

```java
public interface Deque<E> extends Queue<E> {
    
    //对首入队（失败抛出异常）
    void addFirst(E e);

    //队尾入队
    void addLast(E e);

    //对首入队（失败不抛出异常）
    boolean offerFirst(E e);

    //队尾入队
    boolean offerLast(E e);

    //对首出队（失败抛出异常）
    E removeFirst();

    //队尾出队
    E removeLast();

    //对首出队（失败返回null）
    E pollFirst();
    
    //队尾出队
    E pollLast();

    //获取对首元素(有出队操作)
    E getFirst();

    //获取队尾元素
    E getLast();

    //获取对首元素（不出队）
    E peekFirst();

    //获取队尾元素
    E peekLast();

   	//从队列中删除第一个出现的指定元素
    boolean removeFirstOccurrence(Object o);

    //从队列中删除最后一个出现的指定元素
    boolean removeLastOccurrence(Object o);

    //--------------------------------------------------------//
    //和继承的Queue一样的方法
    boolean add(E e);

    boolean offer(E e);
    
    E remove();

    E poll();

    E element();
    
    E peek();

    boolean addAll(Collection<? extends E> c);
    //-------------------------------------------------------//

    //------------------------------------------------------//
    //继承自栈的方法
    
    //入栈
    void push(E e);

   //出栈
    E pop();


    boolean remove(Object o);

    
    boolean contains(Object o);

    int size();

    Iterator<E> iterator();


    Iterator<E> descendingIterator();

}

```



```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Deque<String> stack=new LinkedList<>();
       stack.push("a");
       stack.push("b");
        System.out.println(stack);

       Queue<Integer> queue=new PriorityQueue<>();//优先队列
        queue.offer(1);
        queue.offer(0);
        queue.offer(9);
        queue.offer(8);
        queue.offer(6);
        System.out.println(queue);
    }
}
```

### Set集合

**不允许重复元素**

**不支持随机访问**

```java
package java.util;

public interface Set<E> extends Collection<E> {
   
    int size();

    boolean isEmpty();

    //是否包含某些元素
    boolean contains(Object o);

    Iterator<E> iterator();

    Object[] toArray();

    <T> T[] toArray(T[] a);


    //添加，只有在当前集合中不存在该元素才会添加成功
    boolean add(E e);


    //删除指定元素
    boolean remove(Object o);

    

    boolean containsAll(Collection<?> c);

    
 	//添加（前提是没有重复）
    boolean addAll(Collection<? extends E> c);

    boolean retainAll(Collection<?> c);

  
    boolean removeAll(Collection<?> c);

  
    void clear();

    boolean equals(Object o);

    int hashCode();

    //多线程
    @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, Spliterator.DISTINCT);
    }


```

#### HashSet

底层哈希表实现

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();//因为HashSet不支持随机访问，所以存放元素位置不一定是插入顺序
        set.add("b");
        System.out.println(set.add("a"));//重复添加失败
        set.add("c");
        set.add("a");
        for(String s:set){
            System.out.println(s);
        }//a b c
        //LinkedHashSet 则可以维护顺序，与插入顺序相同
        Set<String> set1=new LinkedHashSet<>();
        set1.add("b");
        set1.add("c");
        set1.add("a");
        System.out.println(set1);
		// b c a
        
         //TreeSet 则可以对插入的元素进行排序
            Set<Integer> set2=new TreeSet<>();//从小到大排
            set2.add(2);
            set2.add(3);
            set2.add(1);
            System.out.println(set2);// 1 2 3
        Set<Integer> set2=new TreeSet<>((a,b) ->b-a);//从大到小排
    }
}
```



### Map映射

1-> a

2-> b

3-> c

..-> ..

..-> ..

**一对一匹配，键不允许重复**

这些映射关系称为键值对

```java
public interface Map<K,V> {//K :键的类型   V:值的类型
    //--------------
    //查询操作
    
    //获取当前储存的键值对数量
    int size();
    
    //是否为空
    boolean isEmpty();
    
    //查看Map中是否包含指定键
    boolean containsKey(Object key);
    
    //查看Map中是否包含指定值
    boolean containsValue(Object value);
    
    //通过给定的键，返回其映射的值
    V get(Object key);
    
    
    //-------------
   	//修改操作
    
    //向Map中添加新的映射关系，新的键值对
    V put(K key, V value);
    
    //根据给定的键，移除其映射关系，移除对应的键值对
    V remove(Object key);
    
    
    //------------
    //批量操作
    
    //将另一个Map中的所有键值对添加到当前的Map中
     void putAll(Map<? extends k, ? extends V> m);
    
    //清空整个Map
    void clear();
    
    //-----------
    //视图操作
    
    //以Set的形式返回Map中存放的所有键
    Set<k> keySet();
    
    //将Map中所有的的value返回
    Collection<V> values();
    
    //返回所有的键值对(用内部类Entry表示)
    Set<Map.Entry<K,V>> entrySet();
    
    interface Entry<K, V> {//内部（类）接口Entry
       
        // 获取键值对的键
        K getKey();

        // 获取键值对的值
        V getValue();

       //修改键值对的值
        V setValue(V value);

        //判断两个键值对是否相等
        boolean equals(Object o);

       
        int hashCode();

       
        public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K, V>> comparingByKey() {
            return (Comparator<Map.Entry<K, V>> & Serializable)
                (c1, c2) -> c1.getKey().compareTo(c2.getKey());
        }

       
        public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue() {
            return (Comparator<Map.Entry<K, V>> & Serializable)
                (c1, c2) -> c1.getValue().compareTo(c2.getValue());
        }

      
        public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
            Objects.requireNonNull(cmp);
            return (Comparator<Map.Entry<K, V>> & Serializable)
                (c1, c2) -> cmp.compare(c1.getKey(), c2.getKey());
        }

       
        public static <K, V> Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp) {
            Objects.requireNonNull(cmp);
            return (Comparator<Map.Entry<K, V>> & Serializable)
                (c1, c2) -> cmp.compare(c1.getValue(), c2.getValue());
        }

       
        @SuppressWarnings("unchecked")
        public static <K, V> Map.Entry<K, V> copyOf(Map.Entry<? extends K, ? extends V> e) {
            Objects.requireNonNull(e);
            if (e instanceof KeyValueHolder) {
                return (Map.Entry<K, V>) e;
            } else {
                return Map.entry(e.getKey(), e.getValue());
            }
        }
    }
}
```



```java
   import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Map<Integer,String> map=new HashMap<>();
            map.put(1,"信息1");
            map.put(2,"信息2");
            System.out.println(map.size());
            System.out.println(map.get(1));
            System.out.println(map.containsKey(2));
            map.remove(1);
            System.out.println(map.size());//1
            System.out.println(map.containsKey(1));//false
            map.put(3,"kilo");
            System.out.println(map.keySet());
            System.out.println(map.values());

            System.out.println(map.entrySet());

            map.entrySet().forEach(entry->{
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            });
        }
    }
```

HashMap底层实现：
底层采用哈希表，但是有哈希冲突问题（一个key对应多个值）

此时采用连地址法可以解决该问题（将key相同的值连接成一个链表，之后可以优化成二叉搜索树）

哈希表中每一个key 都对应一个没有头结点的链表

关键代码：

```java
public class HashMap<k,V> extends AbstractMap<k,V> implements Map<k,v>, Cloneable, Serializable{
    ...
        static class Node<k,v> implements Map.Entry<k,v>{//内部使用节点，存放映射关系(键值对)
            final int hash; //计算后的哈希值
            final  K key; 
            V value;
            Node<k,v> next;//指向下一个节点
            ...
            
        }
    ...
        
        transient Node<k,v>[] table;//哈希表本体，头结点数组，不过HashMap中没有设计头结点（类似于没有头结点的链表）
    final float loadFactor;//负载因子，决定HashMap扩容效果
    
    public HashMap(){
        this.loadFactor = DEFAULT_LOAD_FACTOR;//创建对象是=时，会默认使用负载因子，值为：0.75
    }
    
    ...
        
}
```

**HashMap支持自动扩容**

**HashMap并不会一直使用连地址法，当链表长度达到一定限制时，会转化为效率更高的红黑树**

HashMap中put方法：

```java
public V put(K key, V value) {
    	//hash（key）：计算哈希值
    	//计算哈希值后，调用另一个方法进行映射关系存放
        return putVal(hash(key), key, value, false, true);
    }

    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)//如果底层哈希表没有初始化，先初始化
            n = (tab = resize()).length;//通过resize方法初始化底层哈希表，初始容量为16，后序会更具情况自动扩容，底层哈希表的长度永远数2的n次方
        if ((p = tab[i = (n - 1) & hash]) == null)//因为hash值可能会很大，这里进行取余操作  （n-1）&hash等价于hash%n 这里的i就是得到的最终下标位置
            tab[i] = newNode(hash, key, value, null);//如果这个位置上什么都没有，就直接放一个新的节点
        else {//如果这个位置上有其他值，就是hash冲突了
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                 e = p;//如果第一个节点的键的hash值相同，进行覆盖，将插入节点等于冲突节点，将其覆盖
            else if (p instanceof TreeNode)//如果p是TreeNode则表示已经是红黑树
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);//在红黑树插入新节点
           
            else {//普通链表直接在尾部插入
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);//找到尾部，创建新节点
                        if (binCount >= TREEIFY_THRESHOLD - 1) 
                            treeifyBin(tab, hash);//如果链表长度很长那么转换成红黑树
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;//如果在链表向下查找的过程发现了相同的键值对，那么直接结束，覆盖原来的值
                    p = e;//进入下一次循环
                }
            }
            if (e != null) { // 如果e不为空，说明前面有相同键的情况，其他情况e都为null
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)//如果size超出阈值，用resize进行扩容
            resize();
        afterNodeInsertion(evict);
        return null;
    }

```

LinkedHashMap可以维护插入顺序



TreeMap：可以对元素进行排序（底层是二叉查找树（红黑树））



HashSet（底层套用Map）



LinkedHashSet（底层套用LinkedHashMap）



同理 TreeSet



...关于map中的方法使用待补充



### Stream流：

可以方便处理集合类

**逻辑更加清晰***

 

```java
 import java.util.*;
    import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>(Arrays.asList("aaaa","aaaa", "Sasa", "xx", "bad", "aaa", "Lmin"));

            list=list.stream()
                    .filter(str -> str.length()>3) //过滤器(不过滤条件满足的)
                    .filter(str -> str.charAt(0)>='A'&&str.charAt(0)<='Z')
                    .distinct()//去除重复
                    .collect(Collectors.toList());//将剩余的元素收集起来收变回List
            System.out.println(list);
        }
    }
```



```java
 import java.util.*;
    import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
           List<Integer> list=new ArrayList<>();
           list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list=list.stream()
                    .distinct()//去重
                    .sorted((a,b)->b-a)//排序(从大到小)
                    .map(e->e+1) //每个元素执行加1
                    .limit(2)//只放行前两个元素
                    .collect(Collectors.toList());
            System.out.println(list);
        }
    }
```



### Collections：工具类

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Integer> list=new ArrayList<>(Arrays.asList(1,3,5,7,8,3,2));
            System.out.println(Collections.max(list));//求最大值
            System.out.println(Collections.min(list));
            Collections.sort(list);//排序
            Collections.binarySearch(list,5);//二分查找
            Collections.emptyList();//快速生成一个空集
            System.out.println(Collections.indexOfSubList(list, Arrays.asList(2, 3)));
            //快速寻找子集开始位置
            list=Collections.checkedList(list,Integer.class);//在运行时检查类型
        }
    }
```
