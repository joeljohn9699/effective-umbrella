class Customer{
    int age;
    String fullName;
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.age = 23;
        customer1.fullName = "Joel John";

        System.out.println("The age of customer is " +customer1.age);
        System.out.println("The name of customer is " +customer1.fullName);
    }
}