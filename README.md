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

