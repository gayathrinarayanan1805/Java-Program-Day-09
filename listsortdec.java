import java.util.*;
class listsortdec{
public static void main(String[] args){
ArrayList<Integer> list = new ArrayList<>();
list.add(40);
list.add(10);
list.add(20);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
}
}