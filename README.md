# Java（练习）

## 简单图书管理系统：

main类：

```java
package com.test.简单图书管理系统;
import java.io.*;
import java.util.*;
public class Main {
        public static void main(String[] args)  {
                LinkedList<Book> list=new LinkedList<>();
                FileIn(list);
                Scanner sc=new Scanner(System.in);
                System.out.println("+---------------------------------------+");
                System.out.println("|1:添加      2：删除     3：打印     4：查找|");
                System.out.println("|5:退出");
                System.out.println("+---------------------------------------+");
                int n;
                while((n=sc.nextInt())!=5){
                        int n1=1;
                        switch (n) {
                                case 1 -> {
                                        Book book = new Book();
                                        System.out.print("请输入书名：");
                                        String s = sc.next();
                                        book.setBookName(s);
                                        System.out.println();
                                        System.out.print("请输入图书编号：");
                                        String id = sc.next();
                                        book.setBookId(id);
                                        System.out.println();
                                        System.out.print("请输入图书作者：");
                                        String name = sc.next();
                                        book.setBookAuthor(name);
                                        System.out.println();
                                        list.add(book);
                                }
                                case 2 -> {
                                        System.out.print("请输入要删除的书名：");
                                        String bookName = sc.next();
                                        for (Book value : list) {
                                                if (Objects.equals(value.getBookName(), bookName)) {
                                                        System.out.println("书籍：" + value.getBookName() + "已被删除");
                                                        value.skip();
                                                        break;
                                                }
                                                System.out.println("不存在该书籍！");
                                        }
                                }
                                case 3 -> {
                                        for (Book value : list) {
                                                System.out.println(value);
                                        }
                                }
                                case 4 -> {
                                        System.out.print("请输入想要查询的书籍名字：");
                                        String findName = sc.next();
                                        for (Book value : list) {
                                                if (Objects.equals(value.getBookName(), findName)) {
                                                        System.out.println(value);
                                                        break;
                                                }
                                        }
                                }
                                default -> {
                                        System.out.println("命令输入错误");
                                        System.out.println("是否重新输入  1：yes/ 2：no");
                                        n1 = sc.nextInt();
                                }
                        }
                        if(n1==2) break;
                        System.out.println("+---------------------------------------+");
                        System.out.println("|1:添加      2：删除     3：打印     4：查找|");
                        System.out.println("|5:退出");
                        System.out.println("+---------------------------------------+");
                }
                FileOut(list);
        }
        public static void FileOut(List<Book> list){
                try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("A.txt"))){
                        for(Book value: list){
                                out.writeObject(value);
                        }
                }catch (IOException e){
                               e.printStackTrace();
                }
        }
        public static void FileIn(List<Book> list){
               File file=new File("A.txt");
               if(file.length()==0) return;
              Book book=new Book();
              try(ObjectInputStream in =new ObjectInputStream(new FileInputStream("A.txt"))){
                      boolean len = false;
                     while(true){
                             list.add((Book) in.readObject());
                     }
              }catch (IOException | ClassNotFoundException e){
                      e.printStackTrace();
              }
        }
}
```

图书类：

```java

import java.io.Serializable;

public class Book implements Serializable {
    private String bookName;
    private String bookId;
    private String bookAuthor;
   
    public void setBookName(String name){
        this.bookName=name;
       
    }
    public void setBookId(String id){
        this.bookId=id;
    }
    public void setBookAuthor(String name){
        this.bookAuthor=name;
     
    }
    public String getBookName(){
        return bookName;
    }
    public  String getBookId(){
        return bookId;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
    public void skip(){
        bookName="skip";
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}

```

