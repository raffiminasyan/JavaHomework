public class Main {
    public static void main(String[] args) {
        Author author = new Author("hayk","@gmail", 'm');
        System.out.println(author.toString());


        Cylinder cylinder = new Cylinder(3,9);
        System.out.println( cylinder.getArea());
       Time time = new Time(22,2,60);
       System.out.println(time.toString());

    }
}
