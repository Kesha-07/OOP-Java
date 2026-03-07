class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, String shape) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator obj = new VolumeCalculator();

        double cubeVolume = obj.calculateVolume(5);
        System.out.println("Volume of Cube: " + cubeVolume);

        double rectVolume = obj.calculateVolume(4, 3, 2);
        System.out.println("Volume of Rectangular Cube: " + rectVolume);

        double sphereVolume = obj.calculateVolume(3, "sphere");
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}