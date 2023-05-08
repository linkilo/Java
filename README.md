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
   </script>
```

