package lianxi;

import java.util.Scanner;

public class lx{
    public static void main(String[] args) {
      try {
    //
        String str = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯";
      
        char[] str1=str.toCharArray();
       for (int i = 0; i <str.length(); i++) {
        if(i%7==0) {
        String strarray=str.substring(i,i+7);
       
        if(i%2==0)
        System.out.print(strarray+",");
        else 
         System.out.print(strarray+"��\r\n");
        }//����+��/ż��+��
   
       }
       Scanner a=new Scanner(System.in);
       System.out.println("������һ���ַ���");
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