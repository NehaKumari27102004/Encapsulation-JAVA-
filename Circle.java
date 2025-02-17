public class Circle {

        private static final int PI = 22/7;
                private double radius=1;
            
                //find the area of a circle
            
                public double getArea()
                {
                   return radius* radius * Math.PI;
                }
            
                // find the circumference of a circle
            
                public double getCircumference()
                {
                 
                    return 2*PI *radius;
        }

        public double getRadius()
        {
            return radius;
        }
        //create a  main method 

        public static void main(String [] args)
        {
            Circle circle=new Circle();

                System.out.println( "Radius is:" + circle.getRadius());

                System.out.println("Area of circle:"  + circle.getArea() );
                System.out.println("Circumference of a circle:" + circle.getCircumference());
        }     
}



