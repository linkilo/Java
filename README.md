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

Getter和Setter无法生成静态成员变量的方法



![image-20230515100708828](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230515100708828.png)

学生类：

```java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)//链式调用(静态不会)
public class student {
    int stu_id;
    String name;
    String sex;
}
```

main类

```java
public class Main {
    public static void main(String[]args) {
        student student=new student();
        student
                .setName("")
                .setStu_id(1)
                .setSex("man");
    }
}
```

**ToString**

```java
import lombok.*;
import lombok.experimental.Accessors;
@Getter
@Setter
@Accessors(chain = true)
@ToString() //快速重写toString方法 ( @ToString （exclude "name")   exclude不包括 （将name属性排除开外）)
public class student {
    @ToString.Include(rank = 2 ,name = "学号")  //rank修改属性顺序，数字越大，顺序越靠前
    int stu_id;
    @ToString.Include(rank = 3 ,name = "姓名") //修改属性名称
    String name;
    @ToString.Include(rank = 1,name = "性别")
    String sex;

}
```

~~补充：label（标签）,感觉用处很大~~

```java
    public class Main {
        public static void main(String[]args) {
            label1:
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    break label1;//直接跳出外层循环
                }
            }
            label2:{
                
            }//同样可以给代码块定标签
        }
    }
```

**Builder(新建对象时，可以链式调用)**

~~花里胡哨~~

学生类：

```java
import lombok.*;
@Builder
public class Student {
    @ToString.Include(rank = 2 ,name = "学号")  //rank修改属性顺序，数字越大，顺序越靠前
    int stu_id;
    @ToString.Include(rank = 3 ,name = "姓名") //修改属性名称
    String name;
    @ToString.Include(rank = 1,name = "性别")
    String sex;

}
```

main类：

```java
    public class Main {
        public static void main(String[]args) {
            Student student= Student
                    .builder()
                    .sex("man")
                    .name("kkk")
                    .stu_id(1)
                    .build();

        }
    }
```



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

通过xml配置mybatis

注意文件名要改为：mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="MySQL的URL"/>
                <property name="username" value="MySQL用户（一般是root）"/>
                <property name="password" value="密码"/>
            </dataSource>
        </environment>
    </environments>
</configuration>
```

#### SqlsessionFactory



```java
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
        public static void main(String[]args) throws FileNotFoundException {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));//这里写M配置好的mybatis的文件名（要放在同一根目录下）
            try(SqlSession session= sqlSessionFactory.openSession(true)){ //开启自动提交 (用try结束之后就不用再手动关闭(自动调用close方法))
                
            }
        }
    }
```

![image-20230515210051531](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230515210051531.png)

通过SqlSessionFactoryBuilder的builder方法创建SqlSessionFactory（SqlSession工厂）通过这个工厂可以创建多个新的对话和SqllSession对象，

每个对话相当于不同地方登录一个账号去访问数据（会话之间相互隔离，没有关联）。而SQLSession可以完成数据库的所有操作，这个接口定义了大量的数据库操作方法，因此外面现在只需要一个对象就可以完成对数据库的所有操作。



读取实体类：

读取实体类需要一个映射规则，类中的哪个字段对应数据库的哪个字段，在查询语句返回结果后，Mybatis就会自动就对应的结果填入到对应对象的相应字段上。

首先编写实体类（直接使用Lombok）

在根目录下重新创建一个mapper文件夹，新建名为：TestMapper.xml 的文件作为我们的映射器

(mapper里面可以写无数的SQL语句，而且不需要释放资源或者连接数据库（可以避免用JDBC而写大量的代码）)

````xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DID Mapper 3.0//EN"
        "https//mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="testMapper"> <!--namespace  区分不同mapper-->
    <select id="selectStudent" resultType="student"> <!--resultype 返回值类型-->
        select * from student <!--select 語句-->
    </select>
</mapper>
````

通过mapper可以直接使用SQL语句将查询的结果映射到对应的实体类上

**操作流程**：

**1 .mapper :**

```xml
<?xml version="1.0" encoding="UTF-8" ?><!--mapper 映射器，通过映射器可以快速的通过SQL语句将查询的结果转化为对应的类-->
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="TestMapper"> <!--namespace 区分不同mapper-->
    <select id="selectStudent" resultType="Student"> <!--id: 名称  resultType:返回值类型，将返回的数据映射到哪一个类-->
        <!--SQL语句-->
        select * from student
    </select>
    <!--id 是要使用的关键词，resultType 对应要映射的类-->
</mapper>
```

**2.mybatis:**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="mysql的url"/>
                <property name="username" value="用户"/>
                <property name="password" value="密码"/>
            </dataSource>
        </environment>
    </environments>
    <mappers><!--加载mapper配置，才能正常使用SQL语句-->
        <mapper url="file:TestMapper.xml"/> <!--相对路径-->
    </mappers>
</configuration>
```

**要在Mybatis中写入加载mapper的语句(其他配置不变)：**



<mappers>
        <mapper url="file:TestMapper.xml"/>
    </mappers>

**3.实体类：**

```java
import lombok.*;
@Data
@Setter
@Getter
public class Student {
    int stu_id;
    String name;
    String sex;

}
```

**4.main：**

```java
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
        public static void main(String[]args) throws FileNotFoundException {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));//这里写M配置好的mybatis的文件名（要放在同一根目录下）
            try(SqlSession session= sqlSessionFactory.openSession(true)){ //开启自动提交 (用try结束之后就不用再手动关闭(自动调用close方法))
                List<Student> list = session.selectList("selectStudent");//通过list储存读取的数据
                list.forEach(System.out::println);
            }
        }
    }
```

这样就可以通过SQL语句将查询的结果映射的对应的实体类上，并打印出来

倘若要加选择条件：

在mapper中的select语句后加上where 

```xml
select * from student where stu_id = #{stu_id}
```

只查询学号

对应的main里的语句要改为

```java
 System.out.println((Student)session.selectOne("selectStudent", 3));//数据要转化为学生类才可以打印出来
```

只查询学号为3 的学生

#### 配置mybatis类

通过配置一个Mybatis工具的类，我们就不用每次都去通过调用builder去创建一个SqlSession工厂。

```java
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mybatis_tool {
    private  static  SqlSessionFactory sqlSessionFactory;
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis-config.xml"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    //通过封装一个方法实现判断是否自动提交
    static SqlSession getSession(boolean b){ //是否自动提交
        return sqlSessionFactory.openSession(b); //openSession 是factory里判断是否自动提交的方法
    }
}

```

main:

```java
import org.apache.ibatis.session.SqlSession;

import java.io.FileNotFoundException;

public class Main {
        public static void main(String[]args) throws FileNotFoundException {
            try(SqlSession session=Mybatis_tool.getSession(true)){
                System.out.println((Student)session.selectOne("selectStudent",1));
            }
        }
    }
```



还可以将mapper与接口绑定，通过接口可以直接明确返回值的类型（是哪一个实体类）

创建一个名为TestMapper的接口：

```java
package mapper;
import java.util.List;
//还要导入对应实体类的包（Student）
public interface TestMapper {
    List<Student> selectStudent();
}

```

mapper只需要将namespace改为对应的接口路径

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper"><!--改为要绑定的接口的路径-->
    <select id="selectStudent" resultType="Class.main.Student">
        select * from student
    </select>
</mapper>
```

main：

```java
package Class.main;

import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
        public static void main(String[]args) {
            try(SqlSession session= Mybatis_tool.getSession(true)){
               TestMapper mapper= session.getMapper(TestMapper.class);
               mapper.selectStudent().forEach(System.out::println);
            }
        }
}
```

tips：mapper可以直接映射到一个Map上，（如果属性太多），只需要将mapper.xml里的resultType改为Map，再在和mapper绑定的接口上定义对应的Map容器（List<Map> selectStudent()；）



当出现实体类的定义的属性名字和数据库的属性名字对应不上，可以在mapper里将resultType替换为resultMap ，在resultMap里可以定应实体类的属性名和数据库的属性名的映射

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <resultMap id="test" type="student">
        <result column="stu_id" property="学号"/> <!--column对应数据库的列 property对应实体类的属性名-->
        <result column="name" property="姓名"/>
        <result column="sex" property="性别"/>
    </resultMap>
    <select id="selectStudent" resultMap="test">
        select * from student
    </select>
</mapper>
```





倘若实体类里有了多个构造方法，~~虽然一般只有一个~~，如果直接执行程序会报错，因为在数据库的数据库的属性无法对应到实体类里的属性。

一个构造方法：

```java
public class Student {

   public Student (Integer stu_id ,String name ,String sex){
      System.out.print("stu_id："+ stu_id +"  ");
      System.out.print("name:" + name+"   ");
      System.out.println("sex:" + sex);
   }
   int stu_id;
   String name;
   String sex;

}
```

正常执行

```java
public class Student {
   public Student (Integer stu_id){
      System.out.println(stu_id);
   }
   public Student (Integer stu_id ,String name ){
      System.out.print("stu_id："+ stu_id +"  ");
      System.out.print("name:" + name+"   ");
      System.out.println("sex:" + sex);
   }
   int stu_id;
   String name;
   String sex;

```

报错，这种情况需要我们去mapper里设置一个构造器

```java
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <resultMap id="test" type="student">
        <constructor>
            <arg column="stu_id" javaType="Integer"/>
            <arg column="name" javaType="String"/>
        </constructor>
    </resultMap>
    <select id="selectStudent" resultMap="test">
        select * from student
    </select>s
</mapper>
```

将无法正常映射的数据里的属性，映射到在实体类里对应的数据类型，（注意：非对象的数据类型不行（列如：int）



#### 增删改查

只需要配置对应的mapper和与mapper绑定的接口的方法

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <select id="selectStudent" resultType="student">
        select * from student
    </select>
    <select id="getStudentByStu_id" resultType="student">
        select * from student where stu_id =#{stu_id} <!--通过#{} 来读取传入的数据-->
    </select>
</mapper>
```

接口：

```java
package mapper;
import Class.main.Student;
import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Student> selectStudent();
    Student getStudentByStu_id(int stu_id);
}
```

**插入：**

**mapper:**

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <select id="selectStudent" resultType="student">
        select * from student
    </select>
    <select id="getStudentByStu_id" resultType="student">
        select * from student where stu_id =#{stu_id} <!--通过#{} 来读取传入的数据-->
    </select>
    <insert id="addStudent" parameterType="student">
        insert into student(stu_id,name,sex) values(#{stu_id},#{name},#{sex})
    </insert>
</mapper>
```

**接口：**

```java
package mapper;
import Class.main.Student;
import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Student> selectStudent();
    Student getStudentByStu_id(int stu_id);
    int addStudent(Student s);
}

```

**实体类：**

```java
package Class.main;

import lombok.*;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

@Data
@Accessors(chain = true)
public class Student {
   int stu_id;
   String name;
   String sex;

}
```

**main:**

```java
package Class.main;

import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {        public static void main(String[]args) {
            try(SqlSession session= Mybatis_tool.getSession(true)){
               TestMapper mapper= session.getMapper(TestMapper.class);
                System.out.println(mapper.addStudent(new Student().setStu_id(9).setName("test").setSex("男")));
            }
        }
}
```

**删除：**

**mapper:**

```xml
 <delete id="deleteStudent" parameterType="student">
        delete from student where stu_id=#{stu_id}
    </delete>
```

**接口:**

```java
    int deleteStudent(int stu_id);
```

**修改：**

```xml
   <update id="updateStudent" parameterType="student">
        update student set sex='女',name='test' where stu_id=#{stu_id}
    </update>
```

接口：

```java
 int updateStudent(int stu_id);
```

#### 复杂查询

当我们要查询老师的数据时，还要将老师所教授的学生的信息一并查询出来，那该怎么做？

老师的实体类

```java
package Class.main;
import  java.util.List;
import lombok.Data;

@Data
public class Teacher {
    int tea_id;
    String name;
    List<Student> studentList;
}

```

我们需要将学生的信息一并映射为一个List表，这样做就是一对多的查询，需要我们自己去定义映射规则。

**一对多：（一个教师教授多个学生）**

xml:

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <select id="selectStudent" resultType="student">
        select * from student
    </select>
    <select id="getStudentByStu_id" resultType="student">
        select * from student where stu_id =#{stu_id} <!--通过#{} 来读取传入的数据-->
    </select>
    <insert id="addStudent" parameterType="student">
        insert into student(stu_id,name,sex) values(#{stu_id},#{name},#{sex})
    </insert>
    <delete id="deleteStudent" parameterType="student">
        delete from student where stu_id=#{stu_id}
    </delete>
    <update id="updateStudent" parameterType="student">
        update student set sex='女',name='test' where stu_id=#{stu_id}
    </update>
    <resultMap id="asTeacher" type="teacher">
        <id column="tea_id" property="tea_id"/> <!--id标签用于判断是否为同一对象的数据，如果不用会识别成多个教师数据（id可以当做key）-->
        <result column="tname" property="name"/>
        <collection property="studentList" ofType="student"> <!--collection:将以下的数据全部归为一个集合，全部存放在List里--><!--property（属性）；连接的对象，ofType:对象的类型-->
            <id property="stu_id" column="stu_id"/>
            <result column="name" property="name"/>
            <result column="sex" property="sex"/>
        </collection>
    </resultMap>
    <select id="getTeacherByTea_id" resultMap="asTeacher"> <!--注意老师的名字要起别名，不然分不清那个是老师的name，那个是学生的name-->
        select * ,teacher.name as tname from student inner join teach on student.stu_id=teach.stu_id
        inner join teacher on teach.tea_id = teacher.tea_id where teach.tea_id=#{tea_id}
    </select>
</mapper>
```

接口：

```java
    Teacher getTeacherByTea_id(int tea_id);
```

main：

```java
  try(SqlSession session= Mybatis_tool.getSession(true)){
               TestMapper mapper= session.getMapper(TestMapper.class);
                System.out.println(mapper.getTeacherByTea_id(1));
            }
```

**多对一：（多个学生对应一个老师）**

(通过老师编号来选择学生)

xml：

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="mapper.TestMapper">
    <resultMap id="test" type="Student">
        <id column="stu_id" property="stu_id"/>
        <result column="name" property="name"/>
        <result column="sex" property="sex"/>
        <association property="teacher" javaType="Teacher"><!--关联，将这个数据库里对应的属性映射到java里的对应的实体类-->
            <id column="tea_id" property="tea_id"/>
            <result column="tname" property="name"/>
        </association>
    </resultMap>
    <select id="selectStudent" resultMap="test">
        select *,teacher.name as tname from student left join teach on student.stu_id=teach.stu_id
        left join teacher on teacher.tea_id=teach.tea_id where teacher.tea_id=#{tea_id}
    </select>
</mapper>
```

接口：

```java
package mapper;
import Class.main.Student;
import java.util.List;
import java.util.Map;
import Class.main.Teacher;
public interface TestMapper {
    List<Student> selectStudent(int tea_id);
}

```

main：

```java
package Class.main;

import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {public static void main(String[]args) {
            try(SqlSession session= Mybatis_tool.getSession(true)){
               TestMapper mapper= session.getMapper(TestMapper.class);
                mapper.selectStudent(1).forEach(System.out::println);
            }
    }
}
```

#### 事务操作：

和JDBC的事务一样

```java
package Class.main;

import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {public static void main(String[]args) {
            try(SqlSession session= Mybatis_tool.getSession(false)){
               TestMapper mapper= session.getMapper(TestMapper.class);
                System.out.println(mapper.addStudent(new Student().setStu_id(9).setName("1").setSex("女")));
                session.rollback();
                session.commit();
            }
    }
}
```

将自动提交改为false，在手动commit之前，执行了一次rollback，相当于插入操作没有执行过。（概念和操作都和JDBC一样）

#### 动态SQL

![image-20230522210340679](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230522210340679.png)

## 缓存机制

缓存机制：默认一级缓存开启，当开启一个session后，每一条查询（select）的结果都会被保存起来（缓存），下一次在查询相同信息时（前提是该session没有结束）会直接在缓存里查询，只有当查询到缓存区没有的数据时才会再去向数据库请求数据。

**一级缓存无法被关闭**

一级缓存是在各自的session里，并不相通，只有在自己的session里才能查询到自己的一级缓存的数据

二级缓存是不管哪个session只要开启了二级缓存，二级缓存里的数据在不同的session里都是可以查询到的

添加了二级缓存后，会先从二级缓存里查询数据，当二级缓存里没有时，才会从一级缓存中查询，当一级缓存里没有数据时，才会向数据库请求数据。

每一次对数据库的数据进行修改时，缓存区都会被清空（保证查询到的数据时最新的数据）

而且只有当session结束后才会将自己的一级缓存的数据写入到二级缓存里

**![image-20230526191819994](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526191819994.png)**

这是一个session

![image-20230526192355984](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526192355984.png)

这是两个不同的session

![image-20230526192416342](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526192416342.png)



只开启一种select的二级缓存（通过usCache，flushCache：清空缓存）

![image-20230526193529478](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526193529478.png)

开启所有的二级缓存：

在Mybatis配置里通过setting开启

![image-20230526193738040](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526193738040.png)

现在有一个问题，如果在idea里开启了一个session，里面执行一个语句，可以每3秒钟查询同一个学生的信息，通过一级缓存的机制可以知道，只有第一次是向数据库里查询信息，之后的每一次都是向一级缓存查询信息，之后所得到的信息都是 一样的

```java
package Class.main;

import mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[]args) {
        try(SqlSession session=Mybatis_tool.getSession(true)){
            TestMapper mapper=session.getMapper(TestMapper.class);
            while(true){
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(mapper.getStudentByStu_id(6));
            }
        }
    }
}
```



![image-20230526194621215](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526194621215.png)

但是如果此时，我在其他地方（不是在该程序的session里执行的语句）对查询学生的数据进行修改，那么此时程序检测不到我已经对数据库进行了修改，还是从一级缓存里读取数据，那么就造成了数据的偏差。

例如：在上面的程序运行的时候，

![image-20230526195036660](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526195036660.png)

我对数据库进行修改：

![image-20230526195106928](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526195106928.png)

将查询学生的性别改成了女

但是程序查询的结果依然是男：

![image-20230526195145129](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526195145129.png)

这样就造成了数据的偏差。（同理二级缓存也会出现这个问题）

那么该如何解决这个问题？

如果我们不使用缓存，那么是不是永远都不会出现这种情况（~~从源头解决问题：），怎么可能不用缓存捏~~），但是一级缓存又是关闭不了的（此路不通？）

那么就该使用flushCache了！直接清空缓存，就相当于没有使用缓存！

![image-20230526195643869](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230526195643869.png)

每次都从数据库请求信息，数据就不会出现偏差！（~~那缓存机制造出来是干什么的？~~）

如果想要使用缓存机制又不出现这种问题，那么还有一种方法，那就是让所有的（本地可以修改数据库的）平台都使用同一个缓存，那么任何一个地方修改就清空缓存区，从数据库请求数据，这样就不会出现数据偏差的问题。

那么该怎么做呢？。。。。。。。。。。。。。

继续学吧0_0



## 使用注解开发

之前的学习通过mapper映射器可以很大程度的简化了我们的对数据库查询的操作，但是总不能都写一个mapper再写一个接口来和mapper绑定（还是有一点麻烦），那么有没有更好的方法呢？（肯定是有的，~~所以前面白雪了？~~），那就是使用注解开发，不用在去写xml（mapper映射器）（其实有一些大项目还是得用xml :( ）。

