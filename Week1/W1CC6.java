//default and parameterized constructor demo with a method.

class ThreeDimensionShape{
    double width, height, depth;

    ThreeDimensionShape(){
    	double length = width = depth = 0;
        System.out.println("The length is:" +length);
    }
    ThreeDimensionShape(double length){
//    	System.out.println("Length is: " +length);
        height = length;
//        System.out.println("Length is: " +length);
//        System.out.println("height is: " +height);
        width = height;
        depth = width;
//        System.out.println("length: "+length +"height: " +height +"width: " +width + "Depth: " +depth);
    }
    ThreeDimensionShape(double w, double h, double d){
    	width = w;
    	height = h;
    	depth = d;
//        System.out.println("height: " +height +"width: " +width + "Depth: " +depth);
    }
    double volume(){
    	return width * height * depth;
    }

    public static void main(String[] args) {
        ThreeDimensionShape obj = new ThreeDimensionShape();
        ThreeDimensionShape obj1 = new ThreeDimensionShape(1.5d);
        ThreeDimensionShape obj2 = new ThreeDimensionShape(2.5d, 3.5d, 4.5d);

        double volume;
        volume = obj.volume();
        System.out.println("The volume of obj is: " +volume);

        volume = obj1.volume();
        System.out.println("The volume of obj1 is: " +volume);

        volume = obj2.volume();
        System.out.println("The volume of obj2 is: " +volume);
    }
}