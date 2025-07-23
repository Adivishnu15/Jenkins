public class StudentDetails {
    public static void main(String[] args) {
        if(args.length < 3){
            System.out.println("Usage: java StudentDetails <Name> <RollNo> <Dept>");
            return;
        }

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + args[0]);
        System.out.println("Roll No: " + args[1]);
        System.out.println("Department: " + args[2]);
    }
}
