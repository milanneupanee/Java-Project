 class Grandfather{
    int cash = 10;
    int assets =20;

}
class Father extends Grandfather{
    void Fatherproperty() {
        cash += 5;
        assets += 22;
    }
}
class Son extends Father{
    void property(){
        int expenduture=20;
        if(cash>=20){
            System.out.println("Sufficient cash");
        }
        else {
            System.out.println("You have to sold assets of "+(expenduture-cash)+" Lakhs");
        }
        System.out.println("Remaining assets is "+(assets-(expenduture-cash))+" Lakhs");
    }

    }


public class Inheritance {
    public static void main(String[] args) {
        Son s= new Son();
        s.Fatherproperty();
        s.property();
    }
}
