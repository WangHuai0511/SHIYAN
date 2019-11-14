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