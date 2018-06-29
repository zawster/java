//
//  Classes
//
/*
class Box
{
  private int length,width;
    Box(){
      System.out.println("Constructor is called");
      length=7;
      width=8;
    }
    public void setData(int l,int w){
        length=l;
        width=w;
    }
    public void Showdata(){
        System.out.println("Length is : "+length);
        System.out.println("Width is : "+width);
    }
    public static void main(String args[]){
        Box obj=new Box();
      //  obj.setData(12,15);
        obj.Showdata();

    }

}
*/
class Box{
    private int x,y;
    void setData(int a,int b){
      x=a;
      y=b;
    }
    void Showdata(){
      System.out.println("x="+x);
      System.out.println("y="+y);
    }
    void Sum(Box a,Box b){
      this.x=a.x + b.x;
      this.y=a.y + b.y;
    }
    public static void main(String args[]){
      System.out.println("Programe is now working :");
      Box obj1=new Box();
      Box obj2=new Box();

      obj1.setData(3,5);
      obj2.setData(4,6);

      Box obj3=new Box();
      obj3.Sum(obj1,obj2);
      obj3.Showdata();

    }

}