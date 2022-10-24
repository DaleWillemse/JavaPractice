class strings {
    public static void main(String[] args) {
        String greeting = "hello";

        System.out.println("The length of the string = " + greeting.length());
        System.out.println(greeting.toUpperCase());
        // toLowerCase() also works.

        System.out.println(greeting.indexOf("e"));

        String secondGreeting = "World!";

        System.out.println(greeting.concat(" " + secondGreeting));
    }
}