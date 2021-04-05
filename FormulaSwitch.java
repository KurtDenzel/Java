package ConditionElseIf;
import java.util.*;
import java.text.DecimalFormat;
public class FormulaSwitch {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Character Variable
        char Geometry;
        
        System.out.println("Select a geometry and calculate for the Volume (cubic meter) "
                + "or Area (square meter)"
                + "\n[ A ] Rectangle \n[ B ] Parallelogram \n[ C ] Triangle \n[ D ] Trapezoid"
                + "\n[ E ] Circle \n[ F ] Rectangular Solid \n[ G ] Prisms \n[ H ] Cylinder"
                + "\n[ I ] Pyramid \n[ J ] Cone \n[ K ] Sphere \n[ L ] Torus");
        //Scanner input of Character
        Geometry = input.next().charAt(0);  
        
        /*Switch Case Statement*/
        char operation = Geometry; 
        switch (operation)
        {   //Case A Area of Rectangle
            case 'A':
                int RectangleWidth;
                int RectangleLength;
                
                System.out.println("Enter Width: ");
                RectangleWidth = input.nextInt();
                
                System.out.println("Enter Length: ");
                RectangleLength = input.nextInt();
                
                int RectangleArea;
                RectangleArea = RectangleWidth * RectangleLength;
                
                System.out.println("The width of the rectangle is " + RectangleWidth);
                System.out.println("The lenght of the rectangle is " + RectangleLength);
                System.out.println("The Area of the rectangle is " + RectangleArea + " sq. meters");
                return;
            //Case B Area of Parallelogram
            case 'B':
                int ParallelogramBase;
                int ParallelogramHeight;
                
                System.out.println("Enter base: ");
                ParallelogramBase = input.nextInt();
                
                System.out.println("Enter height: ");
                ParallelogramHeight = input.nextInt();
                
                int ParallelogramArea;
                ParallelogramArea = ParallelogramBase * ParallelogramHeight;
                
                System.out.println("The base of the Parallelogram: " + ParallelogramBase);
                System.out.println("The height of the Parallelogram: " + ParallelogramHeight);
                System.out.println("The Area of the Parallelogram: " + ParallelogramArea + " sq. meters");
                return;
            //Case C Area of Triangle
            case 'C':
                int TriangleBase;
                int TriangleHeight;
                
                System.out.println("Enter base: ");
                TriangleBase = input.nextInt();
                
                System.out.println("Enter height: ");
                TriangleHeight = input.nextInt();
                
                int TriangleArea;
                TriangleArea = (TriangleBase * TriangleHeight) / 2;
                
                System.out.println("The base of the Triangle: " + TriangleBase);
                System.out.println("The height of the Triangle: " + TriangleHeight);
                System.out.println("The Area of the Triangle: " + TriangleArea + " sq. meters");
                return;
            //Case D Area of Trapezoid
            case 'D':
                int TrapezoidBase1;
                int TrapezoidBase2;
                int TrapezoidHeight;
                
                System.out.println("Enter the first base: ");
                TrapezoidBase1 = input.nextInt();
                
                System.out.println("Enter the second base: ");
                TrapezoidBase2 = input.nextInt();
                
                System.out.println("Enter height: ");
                TrapezoidHeight = input.nextInt();
                
                int TrapezoidArea;
                TrapezoidArea = (TrapezoidBase1 + TrapezoidBase2)/ 2 * TrapezoidHeight;
                
                System.out.println("The first base of the Trapezoid: " + TrapezoidBase1);
                System.out.println("The second base of the Trapezoid: " + TrapezoidBase2);
                System.out.println("The height of the Trapezoid: " + TrapezoidHeight);
                System.out.println("The Area of the Trapezoid: " + TrapezoidArea + " sq. meters");
                return;
            //Case E Area of Circle
            case 'E':
                int CircleRadius;
                
                System.out.println("Enter radius: ");
                CircleRadius = input.nextInt();
                
                double CircleArea;
                CircleArea = Math.PI * CircleRadius * CircleRadius;
                
                System.out.println("The area of the circle is : " + Math.round(CircleArea) + " sq. meters");
                return;
            //Case F Volume of Rectangular Solid    
            case 'F':
                int RectangularSolidLength;
                int RectangularSolidWidth;
                int RectangularSolidHeight;
                
                System.out.println("Enter lenght: ");
                RectangularSolidLength = input.nextInt();
               
                System.out.println("Enter width: ");
                RectangularSolidWidth = input.nextInt();
                
                System.out.println("Enter height: ");
                RectangularSolidHeight = input.nextInt();

                int RectangularSolidVolume;
                RectangularSolidVolume = RectangularSolidLength * RectangularSolidWidth * RectangularSolidHeight;
                
                System.out.println("The volume of Rectangular Solid is " + RectangularSolidVolume + " cubic meters");
                return;
            //Case G Volume of Prism    
            case 'G':
                int PrismBase;
                int PrismLength;
                
                System.out.println("Enter base: ");
                PrismBase = input.nextInt();
                
                System.out.println("Enter length: ");
                PrismLength = input.nextInt();
                
                int PrismVolume;
                PrismVolume = PrismBase * PrismLength;
                
                System.out.println("The volume of Prisms is " + PrismVolume + " cubic meters");
                return;
            //Case H Volume of Cylinder
            case 'H':
                int CylinderRadius;
                int CylinderHeight;
                
                System.out.println("Enter radius: ");
                CylinderRadius = input.nextInt();
                
                System.out.println("Enter height: ");
                CylinderHeight = input.nextInt();
                
                double CylinderVolume;
                CylinderVolume = Math.PI * CylinderRadius * CylinderRadius * CylinderHeight;
                
                System.out.println("The radius of the Cylinder is " + CylinderRadius );
                System.out.println("The height of the Cylinder is " + CylinderHeight );
                System.out.println("The volume of the Cylinder is " + new DecimalFormat("0.00").format(CylinderVolume) + " cubic meters" );
                return;
            //Case I Volume of Pyramid
            case 'I':
                int PyramidBase;
                int PyramidHeight;
                
                System.out.println("Enter base: ");
                PyramidBase = input.nextInt();
                
                System.out.println("Enter height: ");
                PyramidHeight = input.nextInt();
                
                int PyramidVolume;
                PyramidVolume = (PyramidBase * PyramidHeight) / 3;
                
                System.out.println("The base of the Pyramid is " + PyramidBase );
                System.out.println("The height of the Pyramid is " + PyramidHeight );
                System.out.println("The volume of the Pyramid is " + PyramidVolume + " cubic meters");
                return;
            //Case J Volume of Cone
            case 'J':
                int ConeRadius;
                int ConeHeight;
                
                System.out.println("Enter radius: ");
                ConeRadius = input.nextInt();
                
                System.out.println("Enter height: ");
                ConeHeight = input.nextInt();
                
                double ConeVolume;
                ConeVolume = (Math.PI * ConeRadius * ConeRadius * ConeHeight) / 3;
                
                System.out.println("The radius of the Cone is " + ConeRadius );
                System.out.println("The height of the Cone is " + ConeHeight );
                System.out.println("The volume of the Cone is " + new DecimalFormat("0.00").format(ConeVolume) + " cubic meters");
                return;
            //Case K Volume of Sphere
            case 'K':
                int SphereRadius;
                
                System.out.println("Enter radius: ");
                SphereRadius = input.nextInt();
                
                double SphereVolume;
                SphereVolume = (4 * Math.PI * SphereRadius * SphereRadius * SphereRadius) / 3;
                
                System.out.println("The radius of the Sphere is " + SphereRadius);
                System.out.println("The volume of the Sphere is " + new DecimalFormat("0.00").format(SphereVolume) + " cubic meters");
                return;
            //Case L Volume of Torus
            case 'L':
                int TorusRadius;
                int R;
                
                System.out.println("Enter radius: ");
                TorusRadius = input.nextInt();
                
                System.out.println("Enter R(bigger circle): ");
                R = input.nextInt();
                
                double TorusVolume;
                TorusVolume = 2 * Math.PI * Math.PI * R * TorusRadius * TorusRadius;
                
                System.out.println("The radius of the Torus is " + TorusRadius );
                System.out.println("The R(bigger circle) of the Torus is " + R );
                System.out.println("The volume of the Torus is " + new DecimalFormat("0.00").format(TorusVolume) + " cubic meters");
                return;
        }
    }
}