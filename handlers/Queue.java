package handlers;

public class Queue {

    public int[] array;
    private int tail = 0;

    public Queue(int i){
        this.array = new int[i];
    }

    public void add(int s){
        if(tail < array.length){
            array[tail] = s;
            tail++;
        }else{
            //free the space
            for(int i = 0; i < array.length - 1; i++){
                array[i] = array[i + 1];
            }
            array[tail - 1] = s;
        }
    }

    public boolean search(int s){
        for(int ele : array){
            if(ele == s){
                return true;
            } 
        }
        return false;
    }

}
