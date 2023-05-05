# 数据库(MySQL)

数据库是数据管理的有效技术，是由一批数据构成的有序集合，这些数据被存放在结构化的数据表里。数据表之间相互关联，反映客观事物间的本质联系。数据库能够有效的帮助一个组织或企业科学地管理各类信息资源。

简而言之，我们的数据可以交个数据库来帮助我们进行管理，同时数据库能过为我们提供高效的访问性能。



## 数据模型

数据模型是对现实数据特征的一种抽象（和类同理）

<u>属性不可再分</u>

<u>一个实体的属性可以有很多个</u>

<u>用于区分不同实体的属性是key</u>

<u>属性可以有一定的约束</u>

实体或属性具有一定的联系

MySQL就是一种关系型数据库,通过这种数据库可以存储一些具有一定联系的数据。

## 数据库的创建

创建一个数据库，并在数据库中添加存放数据的表，每一张表代表一种实体的数据

例如：学生表：存放所以学生的数据（<u>学号</u>，姓名，性别）

​			教师表：用于存放所有教师的数据（<u>教师号</u>，姓名）

​			授课表：存放教师与学生的授课关系（学号，教师号）

....

标有下划线的属性就是该实体数据的key，用于区分其他实体数据的为由标记。



### 数据库的规范化

**第一范式（1NF）**

第一范式指数据库的每一列(每一列都是一个属性)都是不可分割的基本数据项

（一个属性不能再向下细分到其他属性）

![image-20230503200454728](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230503200454728.png)

**第二范式（2NF）**

第二范式要求表中必须存在主键（<u>key</u>），而且其他属性必须完全依赖主键

key是区分一个实体中不同数据的唯一标志，不同的主键对应不同的数据。

**第三范式（3NF）**

在满足第二范式的情况下，所以的属性都不传递依赖于主键

（一个表里面的属性不能再拆分为另一个表）

## SQL语句

（起别名：

​	在属性后加上  '别名'

​	列如：

 	select  name '姓名'  from student;

）

SQL：Structured Query Language 结构化查询语言，专门用于数据库操作。

学习以下4种类型SQL语言

数据查询语言（Data Query Language ） DQL

基本结构是由SELECT子句，FROM子句WHERE子句组成的查询块

数据操纵语言（Date Maniputation Language） DML

是SQL语言中负责对数据库运行数据访问工作的指令集，以INSERT，UPDATE，DELETE三种指令为核心（插入，更新，删除），是开发以数据为中心的应用程序必定会用到的指令

数据库定义语言（Data Definition Language我） DDL

用于描述数据库中要储存的现实世界实体的语言

数据库控制语言（Data Control Language） DCL

是用来设置或更改数据库用户或角色权限的语句。包括（grant，deny，revoke等）。在默认状态下，只有sysadmin，dbcreator，db_owner或db_securityadmin等人员才有权利执行DCl

### 数据库定义语言（DDL）

用于建立和删除数据库和表以及表中的属性

数据库操作

通过 CREATE DATABASE 数据库名 来创建数据库

通过 DROP DATABASE 数据库名 来删除数据库

创建表

首先要知道SQL数据类型：
**用于字符串储存的：**

char(n) 可以储存任意字符串，但是固定长度为n，如果插入的唇膏的小于n则用空格填充

varchar(n)可以储存任意字符串，长度为n，但是不会用空格填充

**用于储存数字：**

smallint 用于储存小的整数，（-32768,23767）

int一般整数 

bigint 大型整数

float 单精度小数

double 双精度小数

**储存时间：**

date 储存日期

time储存时间

year储存年份

datetime用于混合储存日期+时间

**列级约束条件：**

有6种：

主键： Primary key

外键： foreign key

唯一： unique

检查：check（MySQL不支持）

默认：default

非空/空值： not null/null

**表级余数条件：**

有4种：

主键，外键，唯一，检查。



通过 use 数据库名 来切换到对应的数据库（一定要切换）

![image-20230504093926225](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504093926225.png)

[CONSTRAINT <外键名>] FOREIGN KEY 字段名 [,字段2，...] REFERENCES <主表名> 主键列1 [，主键2, ...]

create table   表名（列名 数据类型[列级约束条件],

​										列名 数据类型[列级约束条件],

​										.....

​										[,表级约束条件])



```mysql
mysql> create table student(sid int primary key,
    -> name varchar(10) not null,   //
    -> sex enum('男','女') not null default '男'); 
    //enum枚举，只能为’男‘ 或’女‘ 默认为’男‘
    //not null 不能为空
Query OK, 0 rows affected (0.01 sec)
```

![image-20230504095419506](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504095419506.png)

添加外键(表示相应的数据只能是对应的表里的并且存在的数据)：

```mysql
mysql> CREATE TABLE `study`.`teach`  (
    ->   `tid` int NOT NULL,
    ->   `sid` int NOT NULL,
    ->   CONSTRAINT `f_tid` FOREIGN KEY (`tid`) REFERENCES `study`.`teacher` (`tid`),
    ->   CONSTRAINT `f_sid` FOREIGN KEY (`sid`) REFERENCES `study`.`student` (`sid`)
    -> );
```

**整体流程：**

1：建库

```mysql
mysql> CREATE DATABASE study;
```

2:切换

```mysql
mysql> use study;
```

3：建表

学生表：

```mysql
mysql> CREATE TABLE student(stu_id int primary key,
    -> name varchar(10) not null,
    -> sex enum('男','女') not null default '男');
```

![image-20230504145041421](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504145041421.png)

教师表：

```mysql
mysql> CREATE TABLE teacher(tea_id int primary key,
    -> name varchar(10) not null);
```

![image-20230504145052093](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504145052093.png)

授课表：

```mysql
 CREATE TABLE teach(
    -> stu_id int not null,
    -> tea_id int not null,
    -> CONSTRAINT f_stu_id FOREIGN KEY (stu_id) REFERENCES student (stu_id),
    -> CONSTRAINT f_tea_id FOREIGN KEY (tea_id) REFERENCES teacher (tea_id)
    -> );
```

![image-20230504145100936](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504145100936.png)

**修改表：**

通过 ALTER TABLE 修改

向教师表中添加sex属性

```mysql
mysql> ALTER TABLE teacher add sex enum('男','女') not null default '男';
```

**删除**

通过DROP TABLE  表名

```mysql
DROP TABLE TEST;
```

删除名为TEST的表

### 数据库操纵语言（DML）

插入，修改，删除数据

**插入**

通过insert into 插入数据

INSERT INTO 表名 VALUES(值1，值2，值3) ;

```mysql
mysql> INSERT INTO student VALUES(1,'小明','男');
```

向学生表中插入小明的数据

添加指定数据，在表名后指定要添加的属性

INSERT INTO 表名(属性1，属性2)  VALUES(值1，值2);

```mysql
mysql> INSERT INTO student(stu_id,name) values(2,'小强');
```

向学生表中添加小强的数据，指定添加学号和名字，性别默认男。

一次性添加多个数据：

INSERT INTO 表名  VALUES(值1，值2) ,(值1，值2)，.....;

```mysql
mysql> INSERT INTO student VALUES(3,'小红','女'),(4,'小绿','女');
```

向学生表添加小红，小绿两名同学。

**修改**

update

UPDATE 表名 SET  属性=值,... WHRER 条件

```mysql
mysql> UPDATE student SET SEX='女' WHERE stu_id=1;
```

将学号为1的同学的性别改为女

如果不加WHERE

```mysql
UPDATE student SET SEX='女' ;
```

将所有同学的性别改为女。

**删除**

通过delete删除表中的数据

DELETE FROM 表名   （这是删除全部数据）

DELETE FROM 表名  WHERE 条件（这是删除指定数据）

```mysql
mysql> DELETE FROM student WHERE stu_id=4;
```

删除学生表中学号为4的同学的数据

### 数据库查询语言（DQL）

**<u>重点</u>**

**单表查询**

在一张表中查询

通过select 查询

SELECT  属性

查询表中的所有数据：

```mysql
mysql> select * from student
```

查询指定属性的数据：

```mysql
mysql> select name,sex from student;
```

只查询表中所有数据的name和sex属性



```mysql
mysql> select distinct  sex from student;
```

只查询所有数据的sex属性并且去重（distinct）

结果：

![image-20230504160245419](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230504160245419.png)

还可以通过WHERE来限定查询目标：


```mysql
mysql> select * from student where sex='男';
```

查询学生表中所有性别为男的数据



**常用查询条件**

比较： =,<,>,>=,<=,!=

是否在集合：in，not in

字符模糊匹配： like ，not like

多重条件连接查询： add,or, not



```mysql
mysql> select * from student where name not in ('小明');
```

 小明不会被查询

模糊查询：

%： 表示任何内容

查询以学号以03结尾的学生，

```mysql
mysql> select * from student where stu_id like '%03';
```

查询学号包含有03的学生

```mysql
mysql> select * from student where stu_id like '%03%';
```

查询姓名中包含有“小” 的学生

```mysql
mysql> select * from student where name like '小%';
```

查询名字包含“小”的学生或者 性别为男的学生

```mysql
mysql> select * from student where name like '小%' or sex='男';
```

查询名字包含“小”且性别为男的学生 

```mysql
mysql> select * from student where name like '小%' && sex='男';
```

**排序查询**

通过 order by



通过学号的降序排列查询（desc：降序）

````mysql
mysql> select * from student order by stu_id desc;
````

默认是升序（asc）

先通过性别升序排序，再按照性别排好序的内部按照学号降序排序

````mysql
mysql> select * from student order by sex asc,stu_id desc;
````

**聚集函数**

count：统计行数

```mysql
mysql> select count(*) from student;
```

统计学生表里所有数据有多少行



```mysql
mysql> select count(distinct sex) from student;
```

统计学生表里性别去重后有多少行（两行）



```mysql
mysql> select count(name ) from student where name like '小%';
```

查询学生表中姓名由“小” 开头的有多少行（个）



sum: 求一列（属性）的和（必须是数字）

