/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;


public class Computer {

 protected int wordsize;
    protected int memorysize;
    protected int storagesize;
    protected int speed;
    public Computer(int wordsize,int memorysize,int storagesize,int speed)
    {
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
    public void dispaly(){
        System.out.println("Wordsize: " + wordsize+"bits " + " Memorysize: " + memorysize+"Mb " +" Storagesize: " + storagesize+"Mb "
        + " Speed: " + speed +"Gb ");
    }
}    

