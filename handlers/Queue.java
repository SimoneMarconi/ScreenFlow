package handlers;

public class Queue {

    public int[] array;
    private int tail = 0;

    public Queue(int i){
        if(i == 0){
            this.array = null;
        }else{
            this.array = new int[i];
        }
    }

    public void add(int s){
        if(this.array == null){
            return;
        }
        if(tail < array.length){
            this.array[tail] = s;
            tail++;
        }else{
            //free the space 
            for(int i = 0; i < array.length - 1; i++){
                this.array[i] = this.array[i + 1];
            }
            this.array[tail - 1] = s;
        }
    }

    public boolean search(int s){
        if(this.array == null){
            return false;
        }
        for(int ele : array){
            if(ele == s){
                return true;
            } 
        }
        return false;
    }

}
