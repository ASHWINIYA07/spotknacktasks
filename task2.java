import java.util.Scanner;
class task2{
    double tax;
    double finalbill;
    int idli;
    int vada;
    int dosa;
    int total;
    int quantity=0;
    double taxamount;
    int qtyidly=0,qtydosa=0,qtyvada=0;

    task2(){
     this.tax =0.05;
     this.idli=5;
     this.dosa=10;
     this.vada=5;
     this.total=0;
     this.finalbill=0;
     
    }
    void calculatebill(int quantity,String item){
      if(item.equals("idli"))
       { this.qtyidly+=quantity;
        this.total+=quantity*idli;
       }
      else if(item.equals("dosa")){
        this.qtydosa+=quantity;
        this.total+=quantity*dosa;
       }
      if (item.equals("vada")){
         this.qtyvada+=quantity;
         this.total+=quantity*vada;
       }
       
       this.taxamount=total*tax;
       this.finalbill=taxamount+total;
        
    }
    void display(){
        System.out.println("---bill---");
        System.out.println("quantity of idly:"+qtyidly);
        System.out.println("quantity of dosa:"+qtydosa);
        System.out.println("quantity of vada:"+qtyvada);
        System.out.println("taxamount:"+taxamount);
        System.out.println("final bill:"+finalbill);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        task2 t1=new task2();
      
      for(int i=0;i<3;i++){
       System.out.print("enter item(idli/dosa/vada):");
       String item = sc.nextLine();
       System.out.print("enter  quantity");
       int quantity =sc.nextInt();
       sc.nextLine();
       t1.calculatebill(quantity,item);
        }       
    
  t1.display();
  }
  }