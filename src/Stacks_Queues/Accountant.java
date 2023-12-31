/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks_Queues;

import java.util.LinkedList;


public class Accountant implements Runnable{
    LinkedList<String> queue;
    int duty;
    int count =0;   
public Accountant(int duty,LinkedList<String> queue){
    this.duty=duty;
    this.queue=queue;
}
    @Override
    public void run() {
        while(count<duty){
            try{
                if(!queue.isEmpty()){
                    count++;
                    String invoiceInfo="Invoice"+count+"/"+duty+": "
                            +queue.removeFirst();
                    System.out.println(invoiceInfo);
                    }
                }catch(Exception e){
                System.out.println(e);
            }
        }  
    }
}
