class ArthemeticOperation{
    int num1,num2;
    void addition (int num1,int num2){
        this.num1=num1;
        this.num2=num2;
        System.out.println("Sum is "+(num1+num2));
    }

     int subtract(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
            return num2-num1;
        }
    int multiply(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
            return num2*num1;
        }
    float division(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
            return num1/num2;
        }
    
    public static void main(String[] args){
     ArthemeticOperation a= new ArthemeticOperation();
     a.addition(10, 30);   
     int b=a.subtract(40,50);
     int c=a.multiply(40,50);
     float d=a.division(100,50);
     System.out.println("Difference is "+b);
     System.out.println("Multiplication  is "+c);
     System.out.println("Division is "+d);
    }
}