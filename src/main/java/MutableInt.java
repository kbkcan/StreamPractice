public class MutableInt {
    MutableInt(){
        this.value = 1;
    }
    int value = 1;
    public int get(){
        return value;
    }
    public void increment(){
        value++;
    }
}
