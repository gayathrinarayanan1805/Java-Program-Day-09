import java.util.LinkedList;
class linkadd{
public static void main(String[] args){
LinkedList<Integer> list = new LinkedList<>();
list.add(40);
list.add(10);
list.add(20);
list.addFirst(25);
list.addLast(50);
System.out.println(list);
}
}