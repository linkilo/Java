# 数据库基础(MySQL)

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



limit 限制查询行数

````mysql
mysql> select name from student limit 3;
````

只查询前3行的学生数据

```mysql
mysql> select name from student limit 0,3;
```

从第0行开始查询3行

```mysql
mysql> select name from student limit 3,3;
```

从第3行开始查询3行

这样做limit可以达到分页的效果，



sum: 求一列（属性）的和（必须是数字）

avg:平均值

max/min：最大最小

**多表查询**



```mysql
mysql> select * from student,teacher;
```

这样同时查询老师和学生的表，得到的是两张表的笛卡尔积（每一个学生和老师都有一一对应的关系）

同样可以再后面加上where 来限制查询条件



```mysql
mysql> select * from student,teacher where teacher.tea_id=1;
```

这样只会查询教师编号为1的教师



**自身连接查询：**

```mysql
mysql> select t1.name from student t1,student t2 where t1.stu_id=t2.stu_id;
```



**外连接查询**

专门用于联合数据查询

假如有两张表，一个是学生的大致信息，一个是学生的详细信息，可以通过 inner join 将两张表联合起来。

```mysql
mysql> select * from student inner join teach on student.stu_id=teach.stu_id;
```

inner join 查询两张表有交集的部分。

left join 如果左边有的数据右边没有则右边没有的数据用null代替

```mysql
 select * from student left join teach on student.stu_id=teach.stu_id;
```

同理right join。

通过这种方法可以查询多张表的数据

```mysql
mysql> select * from student t1 left join teach t2 on t1.stu_id=t2.stu_id left join teacher t3 on t3.tea_id=t2.tea_id;
```



```mysql
mysql> select * from student t1 left join teach t2 on t1.stu_id=t2.stu_id left join teacher t3 on t3.tea_id=t2.tea_id
    -> where t3.tea_id=1;
```

查询教师编号为1的学生对哪些学生授课



**嵌套查询**

将查询的结果作为另一个查询的条件

通过select 嵌套

```mysql
mysql> select * from student where stu_id in (select stu_id from teach where tea_id in (select tea_id from teacher where tea_id=1));
```

查询教师编号为1的教师所授课的学生。

同理：

```mysql
mysql> select * from student t1 left join teach t2 on t1.stu_id=t2.stu_id where t2.tea_id = (select tea_id from teacher where tea_id=1);
```

所以说嵌套和外联结是相通的

### 数据库控制语言（DCL）

通过更多的用户来管理整个数据库

**创建用户：**

create user 用户名 identified by 密码

或者不带密码

create user 用户名

新建后再cmd（命令提示符）登录

设置的用户可以看见的数据库：

![image-20230505175805376](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230505175805376.png)

而root用户可以看见的数据库：

![image-20230505175829030](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230505175829030.png)

通过grant给用户授权

grant all (权限1，权限2...)（列1，列2...） on 数据库.表 to 用户 with grant option（ with grant option 可以使该用户可以授予其他用户权限）

![image-20230506112644432](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506112644432.png)

all 是所以权限

![image-20230506113125087](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506113125087.png)

授予用户对student中的name属性有select和update权限

![image-20230506113445868](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506113445868.png)

![image-20230506113457264](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506113457264.png)



revoke回收权限

revoke all (权限1，...) (列1...) on数据库.表 from 用户

![image-20230506112854039](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506112854039.png)

## 视图

视图本身是一个查询结果，是一张不存在的虚表。

视图将select查询保存起来。

视图可以当做一张表来操作



通过 create view 视图名称 as 子查询语句  with check option

```mysql
mysql> create view test as select * from student where sex='男' with check option;
```

创建一个名为‘’test‘ 的视图，储存性别为男的学生。

```mysql
mysql> select * from test;
```

可以直接对视图进行查询

```mysql
mysql> update test set name ='小刚' where name ='小强';
```

可以直接对视图进行更新，但是更新结果会直接影响到原表

with check option 会对之前的限定条件进行检查（where后的限定条件），即不能对限定的条件进行更新。

![image-20230506165952393](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506165952393.png)

**drop view 视图名 删除**

**如果视图是有两个以上的表导出（或者视图的字段来自集函数，**

**或视图定义有GROUP BY 语句，**

**或视图含有DISTINCT短语），则该视图不允许更新**

**一个从不允许更新的视图定义的视图也不允许更新**

## 索引

当数据量非常庞大的时候，通过创建所以，可以大大提高查询效率。（所以能够像hash表一样快速定位元素存放的位置）

创建索引：

create index 索引名称 on 表名(列名) 

```mysql
mysql> create index i on student(name);
```



查看表中的索引：

show index from 表名

![image-20230506172054653](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506172054653.png)



删除索引：

drop index 索引名称 on 表名

![image-20230506172311947](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230506172311947.png)

## 触发器

在某种情况下会自动触发，在select/update/delete时会自动执行我们事先设定的内容，触发器通常用于检查内容的安全性（相比于直接添加约束，触发器更加安全）



触发器所一幅的表称为基本表，当触发器表上发生select/update/delete等操作时，会自动生成两个临时表，（new表和old表，只能由触发器使用）

比如在insert操作时，新的内容会被插入到new表中，在delete操作中，旧的内容会被移到old表中，我们仍然可以在old表中拿到已经被删除的数据，在update操作中，旧的数据会被移到old表中，新的数据会出现在new表中。

create trigger 触发器名称名称 [before/after] [insert/update/delete] on 表名/视图名 for each row delete from 表名 where  条件

for each row 会对每一行都生效，无论哪行执行操作都会执行触发器

![image-20230507083136021](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507083136021.png)

创建一个删除的触发器，这样在删除学生信息的时候会一并将授课表中有关学生的信息一起删除，（before指在我们执行删除操作之前，触发器会先一步自动执行删除授课表里的有关学生的信息 after则指在我们执行操作之后，触发器再自动执行我们后面所设定的操作），（ where old.stu_id=teach.stu_id; 

因为这里是删除操作，所以条件是old表里和授课表（teach）里的学号一样。总流程就是： 我们先执行删除一个学生的操作，然后这个学生的信息被移到了old表，之后触发器自动执行我们设定好的删除操作，而删除条件就是要删除的学生学号和old表里的学生学号一致，这样我们就达到了删除学生表里的数据且一并将授课表里相关的学生数据删除）

查看触发器：

show triggers 

删除触发器：
drop trigger 触发器名称

触发器使用得当会使操作数据库更加方便（不用再去一个表一个表的操作）

## 事务

当我们要进行的操作十分多时（列如依次删除很多个表里的数据），我们就需要执行大量的SQL语句来完成，这些数据库操作语句就可以构成一个事务（只有Innodb引擎支持，可以通过show engines 来查看支持的引擎）

![image-20230507091031392](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507091031392.png)

![image-20230507091042355](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230507091042355.png)



事务有以下特性：

**原子性：**一个事务中的所有操作，要么全部完成，要么全部未完成，不会结束在中间的某个环节。如果事务在执行过程中发生错误，会被回滚（Rollback)到事务开始前的状态（就像这个事务没有被执行过一样）。

**一致性:**在事务开始之前和事务结束之后，数据库的完整性没有被破坏，这表示写入的资料必须完全符合所以的预设规则，这包含资料的精确度，串联性以及后序数据库可以自发性的完成预定的内容。

**隔离性：**数据库允许多个并发事务同时对其数据进行读写和修改的能力，隔离性可以防止多个事务并发执行时由于交叉执行而导致数据不一致。事务隔离分为不同级别： 读未提交（Read uncommitted），读提交（Read committed），可重复读（repeatable read）和串行化（Serializable）

**持久性：**

事务处理结束后，对数据的修改就是永久的，即便系统故障也不会丢失。



```mysql
begin; #开始事务
...
rollback; #回滚事务
savepoint 回滚点; #添加回滚点
rollback to 回滚点; #回滚到指定回滚点
...
commit;#提交事务
 -- 一旦提交，就再也无法进行回滚！
```

(在开始和提交事务之间是单独创建了一个back文件储存了事务中的操作，并不会立刻修改原表中的数据（隔离），只有到提交了事务之后，原表的数据才会被修改)

```mysql
mysql> begin; #开始事务
Query OK, 0 rows affected (0.00 sec)

mysql> select * from teach; #查询
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      1 |      1 |
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
|      1 |      3 |
+--------+--------+
8 rows in set (0.00 sec)

mysql> delete  from teach where stu_id=1 ;#将学号等于1的学生删除
Query OK, 2 rows affected (0.00 sec)

mysql> select * from teach; #查询
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
+--------+--------+
6 rows in set (0.00 sec)

mysql> rollback;#回滚
Query OK, 0 rows affected (0.00 sec)

mysql> select * from teach; #再次查询
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      1 |      1 |
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
|      1 |      3 |
+--------+--------+
8 rows in set (0.00 sec)
#此时的数据已经回滚到修改之前了
```



```mysql
mysql> begin;
Query OK, 0 rows affected (0.00 sec)

mysql> select * from teach;
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      1 |      1 |
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
|      1 |      3 |
+--------+--------+
8 rows in set (0.00 sec)

mysql> delete from teach where stu_id=1;
Query OK, 2 rows affected (0.00 sec)

mysql> select * from teach;
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
+--------+--------+
6 rows in set (0.00 sec)

mysql> savepoint test;#创建回滚点
Query OK, 0 rows affected (0.00 sec)
mysql> delete from teach where stu_id=2;
Query OK, 1 row affected (0.00 sec)

mysql> select * from teach;
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
+--------+--------+
5 rows in set (0.00 sec)

mysql> rollback to test;#回滚到指定回滚点
Query OK, 0 rows affected (0.00 sec)

mysql> select * from teach;
+--------+--------+
| stu_id | tea_id |
+--------+--------+
|      2 |      1 |
|      3 |      1 |
|      4 |      2 |
|      5 |      3 |
|      6 |      3 |
|      7 |      3 |
+--------+--------+
6 rows in set (0.00 sec)

```

通过事务，可以更加安全的操作数据。

# maven

用于管理和构建Java项目的工具

**依赖管理**：方便快捷管理项目依赖的资源（jar包），避免版本冲突问题。（不用手动从网上导入jar包）

**统一项目结构**：

![image-20230508100515861](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508100515861.png)

可以通用各种开发工具

![image-20230508100547726](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508100547726.png)

pom.xml 核心配置文件

**项目构建**：

标准跨平台的自动化项目构建方式（window，Linux，macOS）

![image-20230508100755043](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508100755043.png)

![image-20230508101127282](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508101127282.png)

![image-20230508101245718](C:\Users\kilok\AppData\Roaming\Typora\typora-user-images\image-20230508101245718.png)

