import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        BinSearch(0,9,list,7);
        System.out.println(BinSearch(0,10,list,7));
    }
    public static <T extends Comparable> int BinSearch(int left, int right, ArrayList<T> list, T data){
        while(right-left>1){
            int mid = (left+right)/2;
            if(list.get(mid).compareTo(data)>0){
                right=mid;
            }
            else if(list.get(mid).compareTo(data)<0){
                left=mid;
            }
            else{
                return mid;
            }
        }
        if(list.get(left)!=data) return -1;
        return left;
    }
}