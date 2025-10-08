public class markanalysis {
    public static void main(String args[]){
        String input = "Arum=75;Ajith=78;Raj=81";
        String[] parts=input.split(";");
        String[] names=new  String[parts.length];
        int[] marks= new int[parts.length];
        for(int i=0; i<parts.length;i++){
            String[] temp=parts[i].split("=");
            names[i]=temp[0];
            marks[i]=Integer.parseInt(temp[1]);
        }
java.util.Arrays.sort(marks);
for(String name:names){
    System.out.println(name);
}
for(int mark:marks){
    System.out.println(mark);
}
int sum=0;
for(int mark:marks){
    sum+=mark;
}
double average= (double)sum/marks.length;
}
    }
    

