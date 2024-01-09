import java.util.Scanner;

class inputScanner{        
        void rec(rectangle ab){
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the dimensions of the rectangle(Length and Breadth):");
                ab.a=input.nextInt();
                ab.b=input.nextInt();
        }

        void tri(triangle ab){

                Scanner input=new Scanner(System.in);
                System.out.println("Enter the dimensions of the triangle(base and height):");
                ab.a=input.nextInt();
                ab.b=input.nextInt();
        }

        void cir(circle ab){
                Scanner input=new Scanner(System.in);
                System.out.println("Enter the dimension of the circle(radius):");
                ab.a=input.nextInt();
        }

}


abstract class shape extends inputScanner{
        int a,b;        
        abstract void printArea();
}


class rectangle extends shape{
        rectangle(){
                rec(this);        
        }
        void printArea(){
                System.out.println("Area of Rectangle = "+(double)(a*b));
        }
}

class triangle extends shape{

        triangle(){tri(this);}
        void printArea(){
                System.out.println("Area of Triangle = "+(0.5*a*b));
        }
}

class circle extends shape{
        circle(){cir(this);}
        void printArea(){
                System.out.println("Area of Circle = "+(3.14*a*a));
        }

}


class calc{
        public static void main(String[] args){
                rectangle r=new rectangle();
                triangle t=new triangle();
                circle c=new circle();

                r.printArea();
                t.printArea();
                c.printArea();

        }

}
