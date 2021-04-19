
package computer;


public class Laptop extends Computer{
    private int length;
        private int width;
        private int height;
        private int weight;
        public Laptop(int wordsize,int memorysize,int storagesize,int speed, int length, int width,int height,int weight)
        {
            super(wordsize, memorysize, storagesize, speed);
            this.length = length;
            this.width = width;
            this.height = height;
            this.weight = weight;
        }
    public void Display()
    {
        System.out.println("Wordsize: " + wordsize+"bits " + " Memorysize: " + memorysize+"Mb " +" Storagesize: " + storagesize+"Mb "
        + " Speed: " + speed +"Gb "+ " Length: "+ length +"feet "+" Width: "+ width +"feet "+" Height: "+ height +"feet "+" Weight: "+ weight+"feet ");
    }
}