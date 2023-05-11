# JavaWeb

## 前端开发

****



### html,css

![屏幕截图 2023-05-07 104642](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 104642.png)

![屏幕截图 2023-05-07 105437](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 105437.png)

![屏幕截图 2023-05-07 105446](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 105446.png)

![屏幕截图 2023-05-07 105425](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 105425.png)

![屏幕截图 2023-05-07 105817](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 105817.png)

![屏幕截图 2023-05-07 105923](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 105923.png)

![屏幕截图 2023-05-07 110110](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 111332.png)

![屏幕截图 2023-05-07 111412](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 111412.png)

![屏幕截图 2023-05-07 111431](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-07 111431.png)

![image-20230507153701223](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507153701223.png)

![image-20230507153921915](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507153921915.png)	![image-20230507154828940](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507154828940.png)

![image-20230507155338986](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507155338986.png)

![image-20230507160845835](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507160845835.png)

定义一个红色矩形：
![image-20230507161558433](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507161558433.png)

![image-20230507163535713](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507163535713.png)

![image-20230507165002871](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507165002871.png)

![image-20230507165721851](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507165721851.png)

![image-20230507165750032](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507165750032.png)

### **Js**

![image-20230508102431976](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508102431976.png)

![image-20230508102455534](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508102455534.png)

```javascript
<!--内部脚本-->
<script>
        alert('????'); //警告框
 </script>
```

![image-20230508103128442](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508103128442.png)

![image-20230508103302705](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508103302705.png)

```javascript
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <script>
        window.alert("JS");
        document.write("hello");
        console.log("???");
   </script>
</body>
</html>
```

![image-20230508103545761](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508103545761.png)

```javascript
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <script>
        var a=10;
        a="kilo";
        document.write(a);
    
   </script>
</body>
</html>
```

**var作用域比较大（全局变量）**

****

**var可以重复定义**



````javascript
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <script>
        var a=10;
        a="kilo";
        document.write(a);
    
   </script>
</body>
</html>
````

最后定义的会将之前的覆盖掉。

![image-20230508104021584](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508104021584.png)

```javascript
   <script>
      {
        let x=1; //局部变量
      }
      const p=3;//常量,不能改变
   </script>
```





![image-20230508104712166](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508104712166.png)

![image-20230508104753813](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508104753813.png)

![image-20230508104903708](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508104903708.png)

![image-20230508104952318](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508104952318.png)

"===" 全等运算符

![image-20230508105026666](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105026666.png)

![屏幕截图 2023-05-08 105122](C:\Users\kilok\Pictures\Screenshots\屏幕截图 2023-05-08 105122.png)

```javascript
  <script>
        parseInt("12k23") //12
        parseInt("a12") //NAN
   </script>
```

![image-20230508105353583](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105353583.png)

![image-20230508105426432](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105426432.png)

![image-20230508105509002](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105509002.png)

![image-20230508105552494](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105552494.png)

**函数**

![image-20230508105613756](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508105613756.png)

```javascript
  <script>
        function add( a,b){
            return a+b;
        }
        var a;
        a=add(10,20);
   </script>
```

![image-20230508110006330](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508110006330.png)

```javascript
 <script>
       var add=function(a,b){
        return a+b;
       }
       var a=add(10,20);
   </script>
```



**对象**

![image-20230508110213077](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508110213077.png)

BOM：浏览器对象

DOM：文档对象





![image-20230508110321567](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508110321567.png)

```javascript
<script>
        var b =new Array(1,2,3,4);
       var a=[1,2,3,4];
   </script>
```

**js中数组长度可变，类型可变**

```javascript
 <script>
        var a=[1,2,3,4];
        a[10]=10;

   </script>
```

arr[1]=1,arr[10]=10,arr[5~9]=undefined

```javascript
 <script>
        var a=[1,2,3,4];
        a[10]="kilo";

   </script>
```



![image-20230508110936235](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508110936235.png)

![image-20230508111014142](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508111014142.png)

```javascript
  <script>
        var a=[1,2,3,4];
        a.forEach(function(e){
            document.write(e);
        })
        a.forEach((e)=>{
            document.write(e);
        })
   </script>
```

添加：

```javascript
  <script>
        var a=[1,2,3,4];
        a.push(5,6,7);
   </script>
```

删除：

```javascript
  <script>
        var a=[1,2,3,4];
        a.splice(2,2);//从元素2开始删除，删除2个数
   </script>
```



![image-20230508150317001](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508150317001.png)

![image-20230508150344985](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508150344985.png)

字符串创建：

```javascript
<script>
       var s= "kilo";
       var a=new String("hello");
   </script>
```



```javascript
<script>
       var s= "kilo";
        document.write(s.charAt(0));//获得指定位置的字符
        document.write(s.indexOf(i));//检索字符在字符串的位置
        var a= "   ll    ";
        a=a.trim;//去除字符串两端的空格
        var b= s.substring(1,4);//截取s字符串从0开始到3结束
   </script>
```



自定义对象

![image-20230508150759939](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508150759939.png)

```javascript
 <script>
        //自定义对象
        var user = {
            name :"kilo",
            age:124678,
            eat : function(){
                alert("eeeee");
            }
        }
        document.write(user.age);
        user.eat;
   </script>
```



![image-20230508151301216](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508151301216.png)

![image-20230508151204457](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508151204457.png)



![image-20230508151346754](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508151346754.png)

```javascript
<script>
       //JSON
        var  user = '{"name":"kilo","age":18,"addr":[a,b,c,d]}';
   </script>
```

与自定义不同的是，JSON中的属性要用 “ ”括起来

![image-20230508152812535](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508152812535.png)

**BOM**

![image-20230508153657568](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508153657568.png)

![image-20230508153732788](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508153732788.png)

```javascript
 <script>
        //获取
        window.alert("hello");
        alert("hello"); //效果一样


        //方法
        //confoirm - 对话框
        confirm("是否删除此记录？")
   </script>
```



![image-20230508154058836](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508154058836.png)

confirm有一个返回值。

确定：true  取消： false



```javascript
<script>
       //方法
       //定时器 - setInterval -- 周期性执行某函数
       var a=0;
       setInterval(function(){
        a++;
        console.log("定时器执行了"+a+"次");
       },2000)//每隔两秒执行一次该函数
   </script>
```



![image-20230508154558376](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508154558376.png)

```javascript
 <script>
       //方法
       //定时器 - setTimeout -- 延迟指定时间执行一次
       setTimeout(function(){
        alert("只执行一次")
       },2000)
   </script>
```

**地址栏（Location）**

![image-20230509152110691](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509152110691.png)

**DOM**

![image-20230509153935764](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509153935764.png)





![image-20230509153747861](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509153747861.png)

DOM树：

![image-20230509153828776](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509153828776.png)

![image-20230509154115207](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509154115207.png)

**DOM将每一个标签都封装成了各自的对象**

![image-20230509154252935](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509154252935.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-对象-DOM</title>
    <style>
        .cls{
            color: #000;
        }
    </style>
</head>
<body>
    <img id="h1" src="img\20.jpg"> <br><br>

    <div class="cls">Js</div> <br>
    <div class="cls">DOM</div> <br>
    
    <input type="checkbox" name="test"> t1
    <input type="checkbox" name="test"> t2
    <input type="checkbox" name="test"> t3
    <br><br>
    <script>
        //1.获取element元素
        //1.1获取元素-根据ID获取
        var img=document.getElementById('h1');
        document.write(img);
        //1.2根据标签获取
        var divs =document.getElementsByTagName('div');
        for(let i=0;i<divs.length;i++){
            document.write(divs[i]);
        }
        //1.3根据name属性获取
        var ins=document.getElementsByName('test');
        for(let i=0;i<ins.length;i++){
            document.write(ins[i]);
        }
        //1.4根据class属性获取
        var divs1=document.getElementsByClassName('cls');
        for(let i=0;i<divs1.length;i++){
            document.write(divs1[i]);
        }
    </script>
</body>
</html>
```



```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-对象-DOM</title>
    <style>
        .cls{
            color: #000;
        }
    </style>
</head>
<body>
    <img id="h1" src="img\20.jpg"> <br><br>

    <div class="cls">Js</div> <br>
    <div class="cls">DOM</div> <br>
    
    <input type="checkbox" name="test"> t1
    <input type="checkbox" name="test"> t2
    <input type="checkbox" name="test"> t3
    <br><br>
    <script>
        //2改变元素
        //改变图像
        var img=document.getElementById('h1');
        img.src="img\5.jpg";
        //在div标签加上 0.0
        var divs=document.getElementsByTagName('div');
        for(let i=0;i<divs.length;i++){
            const div=divs[i];
            div.innerHTML+=" <font color='red'>0.0</font>";//将颜色修改为红色
        }
        //使所有的复选框呈现选中状态
        var ins=document.getElementsByName('test');
        for(let i=0;i<ins.length;i++){
            const check=ins[i];
            check.checked=true;
        }
    </script>
</body>
</html>
```

**Js事件监听**

![image-20230509162711061](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509162711061.png)

![image-20230509163312852](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509163312852.png)

![image-20230509163550570](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509163550570.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-事件-事件绑定</title>
</head>
<body>
    <input type="button" id="btn1" value="事件绑定1" onclick="on()">
    <input type="button" id="btn2" value="事件绑定2">

    <script>
        function on(){
            alert("按钮1被点击")
        }

        document.getElementById('btn2').onclick=function(){
            alert("按钮2被点击")
        }
    </script>
</body>
</html>
```

![image-20230509164044685](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509164044685.png)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JS-常见事件</title>
</head>
<body onload="load()">
    <form action="" style="text-align: center;" onsubmit="subfn()">
    <input type="text" name="username" onblur="bfn()" onfocus="ffn()" onkeydown="kfn()">

    <input id="b1" type="submit" value="q提交">

    <input id="b1" type="button" value="单击事件" onclick="fn1()">
    </form>

    <br><br><br>

    <table  width="800px" border="1" cellspacing="0" align="center" onmouseover="over()" onmouseout="out()">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>分数</th>
            <th>评语</th>
        </tr>

        <tr align="center">
            <td>001</td>
            <td>张三</td>
            <td>90</td>
            <td>优秀</td>
        </tr>

        <tr align="center">
            <td>002</td>
            <td>李四</td>
            <td>99</td>
            <td>优秀</td>
        </tr>
    </table>

    <script>
        //onload:页面/元素加载完成触发
        function load(){
            console.log("页面加载完成...")
        }

        //onclick:鼠标点解事件
        function fn1(){
            console.log("我被点击了...")
        }

        //onblur：失去焦点事件
        function bfn(){
            console.log("失去焦点...")
        }

        //onfocus：元素获得焦点
        function ffn(){
            console.lof("获得焦点")
        }
    </script>
</body>
</html>
```

### Vue

![image-20230509172309833](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509172309833.png)

![image-20230509172431524](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509172431524.png)

![image-20230509172532390](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230509172532390.png)

~~前端不想学了直接干maven~~

## 后端开发

### Socket技术：

是计算机进行通讯的一种方式（套接字），是操作系统底层提供的一项通讯技术，支持TCP和UDP，java已经对socket底层支持进行了一套完整的封装，可以通过java来实现socket通讯。

服务端：

```java
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try( ServerSocket server=new ServerSocket(8080);){
            System.out.println("等待客户端连接");
            Socket socket=server.accept();
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

```

客户端：

```java
import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args){
        try(Socket socket=new Socket("localhost",8080)){
            System.out.println("已连接到服务端");
        }catch (IOException e){
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
        }
}

```



<u>**使用socket进行数据传输**</u>

通过Socket对象，我们就可以获取到对应的I/O进行网络传输：

服务端

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try( ServerSocket server=new ServerSocket(8080);){
            System.out.println("等待客户端连接");
            Socket socket=server.accept();
            socket.setSoTimeout(3000);//设定超时界限（超过3秒则断开连接）
            System.out.println("客户端已连接，IP地址为："+socket.getInetAddress().getHostAddress());
            System.out.println("读取客户端数据....");

            BufferedReader  reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
            OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
            writer.write("数据已接收\n");
            writer.flush();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

```



客户端

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Socket socket=new Socket("localhost",8080); Scanner sc =new Scanner(System.in)){
            System.out.println("已连接到服务端");
            OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
            writer.write(sc.nextLine()+"\n");//注意要加换行符不然服务端（BufferedInputStream，一行一行的读取）无法读取
            writer.flush();
            socket.shutdownOutput();//手动关闭输出流（到最后系统会自动关闭）
            System.out.println("数据已发送");
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        }catch (IOException e){
            System.out.println("服务端连接失败！");
            e.printStackTrace();
        }
        }
}

```

<u>文件传输：</u>

服务端

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try(ServerSocket server=new ServerSocket(8080)){
            Socket socket=server.accept();
            InputStream stream=socket.getInputStream();
            FileOutputStream fileOutputStream=new FileOutputStream("net/data.txt");
            byte[] bytes=new byte[1024];
            int i;
            while((i=stream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

```

客户端：

```java
import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try(Socket socket=new Socket("localhost",8080)){
            new File("test.txt");
            FileInputStream fileInputStream=new FileInputStream("test.txt");
            OutputStream stream=socket.getOutputStream();
            byte[] bytes=new byte[1024];
            int i;
            while((i=fileInputStream.read(bytes))!=-1){
                stream.write(bytes,0,i);
            }
            fileInputStream.close();
            stream.flush();
        }catch (IOException e){
            System.out.println("服务器连接失败");
            e.printStackTrace();
        }
    }
}

```

<u>使用浏览器访问socket服务器</u>
服务端：

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
       try(ServerSocket server=new ServerSocket(8080)){
           System.out.println("等待客户端连接");
           Socket socket= server.accept();
           System.out.println("客户端以连接，ip地址为："+socket.getInetAddress().getHostAddress());
           InputStream in=socket.getInputStream();
           System.out.println("接受客户端数据...");
           while(true){
               int i=in.read();
               if(i==-1) break;
               System.out.print((char)i);
           }
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}

```

浏览器访问：

![image-20230510103046241](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230510103046241.png)

此时需要我们在服务端去支持响应http请求

![image-20230510103720439](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230510103720439.png)

```java
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
       try(ServerSocket server=new ServerSocket(8080)){
           System.out.println("等待客户端连接");
           Socket socket= server.accept();
           System.out.println("客户端以连接，ip地址为："+socket.getInetAddress().getHostAddress());
           /*InputStream in=socket.getInputStream();
           System.out.println("接受客户端数据...");
           while(true){
               int i=in.read();
               if(i==-1) break;
               System.out.print((char)i);
           }
           */
           OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
           writer.write("HTTP/1.1 200 Accepted\r\n"); //200是响应码，Http协议规定了200为接受请求，400为错误的请求，404为找不到资源
           writer.write("\r\n"); //在请求头写完后还要进行一次换行，然后写入我们的响应实体（展示在浏览器上）
           writer.write("kilo");
           writer.flush();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}

```

### JDBC

JDBC（Java Data Base Connectivity）java数据库连接，它是Java编程语言和广泛数据库之间独立于数据库的连接标准的Java API，JBDC就是一种规范，所提供的接口，一套完整的，允许便捷访问底层数据库。可以用Java来编写不同类型的可执行文件：java应用程序，Java Applets，Java Servlet，JSP等，不同可执行文件都能通过JDBC访问数据库，又兼备储存的优势。简单来说，JDBC就是Java与数据库的连接的桥梁或插件，使用Java代码就能操作数据库的增删改查，储存过程，事务等。



![image-20230510165633379](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230510165633379.png)



使用JDBC连接数据库

```java
import java.sql.*;

public class Main {
    public static void main(String[]args){
        //1.通过DriveManager来获得数据库连接
        try(Connection connection= DriverManager.getConnection("数据库的URl","用户名","密码");
            //2.创建一个用于执行SQL的statement对象
            Statement statement=connection.createStatement()){//注意前两部都要在try中，最后要释放资源
            //3.执行sql语句
            ResultSet set=statement.executeQuery("select  * from student");
            //4.查看结果
            while(set.next()){
                System.out.println(set.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        //5.释放资源
    }
}
```

**Drivermanager:**

用于管理数据库的驱动

**Connection和Statement：**

Connection是数据库连接对象，可以通过连接对象来创建一个Statement用于执行SQL语句

![image-20230511080123288](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511080123288.png)

Statement

statement.execute可以执行SQL语句，他会返回一个boolean来表示执行结果是一个ResultSet还是一个int，我们可以通过使用getResultSet（）或者getUpdateCount（）来获取。

#### 执行SQL语句：

**DML**

插入：

```java
import java.sql.*;

public class Main {
    public static void main(String[]args){
        try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
       Statement statement=connect.createStatement()){//创建用于将 SQL 语句发送到数据库的 SQLServerStatement 对象。

        int i = statement.executeUpdate("insert into student values(8,'小嘎','男')");//返回值是一个int（生效了几行）
           System.out.println("生效了"+i+"行");

       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

同理与其他操作

**DQl（查询）**

![image-20230511083509989](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511083509989.png)

```java
import java.sql.*;

public class Main {
    public static void main(String[]args){
       try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
       Statement statement=connect.createStatement()){
           ResultSet set= statement.executeQuery("select  * from student");
           while (set.next()){
               System.out.println(set.getString(1));//set.get 读取第一列（第一列的属性类型是int也可以将set.getString 替换为：set.getInt）
               System.out.println(set.getString(2));//读取第二列
               System.out.println(set.getString(3));
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

#### 批处理：

![image-20230511084006724](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511084006724.png)

和事务差不多，通过addBatch来分多条执行SQL语句最后在用executeBatch来最后提交所以的操作。

```java
import java.sql.*;

public class Main {
    public static void main(String[]args){
       try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
       Statement statement=connect.createStatement()){
            
            statement.addBatch("insert into student values(9,'2','男')");
            statement.addBatch("insert into student values(10,'2','男')");
            statement.addBatch("insert into student values(11,'2','男')");
            statement.addBatch("insert into student values(12,'2','男')");
            statement.addBatch("insert into student values(13,'2','男')");
            statement.executeBatch();

       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

#### 将查询结果映射为对象

直接新建一个对应的Java类，列如：
学生类：

```java
public class student {
    int id;
    String name;
    String sex;

    public student(int id, String name, String sex) {
        this.id=id;
        this.name=name;
        this.sex=sex;
    }

    public void say(){
        System.out.println("我叫"+name+"学号为："+id);
    }
}

```

主函数：

```java
import java.sql.*;

public class Main {
    public static void main(String[]args){
         try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
       Statement statement=connect.createStatement()){
           ResultSet set=statement.executeQuery("select * from student");
           while(set.next()){
               student student=new student(set.getInt(1),set.getString(2),set.getString(3));
               student.say();
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

还有一种方法使用反射，可以创建一个通用的对象（之后再补）

#### 实现登录与SQL注入攻击

模拟用户登录：

首先要建立一个user用户表（name，pwd（密码））

````java
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
       Statement statement=connect.createStatement()){
           Scanner scanner=new Scanner(System.in);

           ResultSet set=statement.executeQuery("select * from user where username='"+scanner.nextLine()+"'and pwd='"+scanner.nextLine()+"';");
           while(set.next()){
               String username= set.getString(1);
               System.out.println("登陆成功");
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
````

![image-20230511091605144](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511091605144.png)

这样的写法就是一种SQL的注入攻击。

那应该用什么方法来有效方法来限制这种攻击？

#### PreparedStatement

![image-20230511091830205](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511091830205.png)

``````````java
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
        PreparedStatement statement=connect.prepareStatement("select * from user where username=? and pwd=?;")){
           Scanner scanner=new Scanner(System.in);
           statement.setString(1,scanner.nextLine());//将上面的？替换为相应的参数
           statement.setString(2,scanner.nextLine());

           ResultSet set=statement.executeQuery();
           while(set.next()){
               String username=set.getString(1);
               System.out.println("登陆成功");
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
``````````

有效预防SQL注入攻击

#### 管理事务：

![image-20230511093352801](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511093352801.png)

```java
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
        Statement statement=connect.createStatement()){
            connect.setAutoCommit(false);//将自动提交关闭

           int i=statement.executeUpdate("delete  from student where name='2'");
           System.out.println(i);
           connect.commit();//手动提交（如果不手动提交那么之前的操作全部作废）
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

利用事务可以对数据进行更加安全的操作

```java
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       try(Connection connect=DriverManager.getConnection("数据库URL","用户","密码");//连接数据库
        Statement statement=connect.createStatement()){
            connect.setAutoCommit(false);//将自动提交关闭

           statement.executeUpdate("insert into user values (1,2)");
           statement.executeUpdate("insert into user values (2,2)");
           
           Savepoint savepoint=connect.setSavepoint();//设置回滚点
           statement.executeUpdate("insert into user values (3,2)");
           statement.executeUpdate("insert into user values (4,2)");
          connect.rollback(savepoint);//回到指定回滚点，中间操作作废
           connect.commit();//手动提交
       }catch (SQLException e){
           e.printStackTrace();
       }
    }
}
```

### LomBok(小辣椒)

![image-20230511101403894](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511101403894.png)

![image-20230511101421505](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511101421505.png)

![image-20230511101443669](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511101443669.png)



### Mybatis

![image-20230511102847305](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511102847305.png)

#### XML：

![image-20230511103022870](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511103022870.png)

**xml主要是存放数据**

xml规范：

**1.必须存在一个根节点，将所有的字标签全部包括**

**2.可以但不必须包含一个头部声明（定义编码格式）**

**3.所有标签碧玺成对出现，可以嵌套但是不能交叉嵌套**

**4.区分大小写**

**5.标签中可以存在属性，type.....**

**注释： <!-- 内容-->**

```xml
<outer>
   <name>阿伟</name>
    <desc>阿伟又在打电动</desc>
<!--  我是注释  -->
</outer>
```

![image-20230511104214133](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230511104214133.png)

