# 计G191 2019322051 王槐
# 实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
# 实验内容与要求
## 内容：
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
## 要求：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
# 实验过程
将长恨歌转为字符串数组，用FOR循环和IF对长恨歌做分组，7个字为一组，与2做余数判断实现奇数时加“，”，偶数时加“。”。获取输入字符转换为字符数组，与长恨歌字符串数组每个字做判等运算，统计输入字符出现次数，最后做异常处理。
```java
package lianxi;

import java.util.Scanner;

public class lx{
    public static void main(String[] args) {
      try {
    //
        String str = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝";
      
        char[] str1=str.toCharArray();
       for (int i = 0; i <str.length(); i++) {
        if(i%7==0) {
        String strarray=str.substring(i,i+7);
       
        if(i%2==0)
        System.out.print(strarray+",");
        else 
         System.out.print(strarray+"。\r\n");
        }//奇数+，/偶数+。
   
       }
       Scanner a=new Scanner(System.in);
       System.out.println("请输入一个字符：");
       String s=a.next();
       char str2=s.charAt(0);
   	  int k = 0;
       for(int j=0;j<str.length();j++) {
        String strarray=str.substring(j,j+1);
        if(str2==str1[j]) {
  
         k=k+1;
       //  System.out.println(str.substring(j,j+1));
        }
        
       
       }
       System.out.println(k);   
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
```
# 流程图
![](https://github.com/WangHuai0511/SHIYAN/blob/master/流程图.png)
# 实验结果
![](https://github.com/WangHuai0511/SHIYAN/blob/master/结果.png)
# 实验感想
通过本次Java编程实验课，让我掌握了一些Java基本语法，虽然以前没咋学过Java，但有一些c语言基础，所以通过努力实验，进一步培养我们利用Java语言进行编程和调试程序的能力，掌握字符串String及其方法的使用和异常处理结构。但在整个实验过程中还是出现了一些错误，通过老师和同学的帮助让我逐渐完善了程序，将课本的理论知识与生活中的实践知识相结合，不断提高自己文化知识和实践能力。
