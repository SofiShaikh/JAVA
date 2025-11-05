class Vehical{
    void vehical(){
        System.out.println("this is vehical");
    }
}
class TowWheeler extends Vehical{
    void twowheeler(){
        System.out.println("This vehical is two wheeler");
    }
}
class FourWheeler extends Vehical{
    void fourwheeler(){
         System.out.println("this vehical is four wheeler");

    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        TowWheeler tw= new TowWheeler()
;
tw.vehical();
tw.twowheeler();

FourWheeler fw=new FourWheeler();
fw.vehical();
fw.fourwheeler();
    } 
}
