class employee{
    float salary=40000;
}
class programmer extends employee
{
    int bonus=10000;
}
class test
{
    public static void main(String args[]){
        programmer p=new programme();
        System.out.println("Programmer salary is: ",+p.salary);
        System.out.println("Bonus of programmer is: ",+p.bonus);
    }
}