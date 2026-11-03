class add {
    public int addNumbers(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String []args){
        int num1=25;
        int num2=15;
        add obj=new add();
        int result=obj.addNumbers(num1,num2);
        System.err.println("Sum is "+result);
    }}