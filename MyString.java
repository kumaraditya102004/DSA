public class MyString {

    public static void main(String[] args) {

        
        String name = "Aditya Kumar";
        String city = "Delhi";
        String college = "IIMT College of Engineering";

    
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("College: " + college);

    
        System.out.println("Name Length: " + name.length());

    
        System.out.println("Uppercase: " + name.toUpperCase());

        
        System.out.println("Lowercase: " + name.toLowerCase());

        
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Second Character: " + name.charAt(1));

    
        System.out.println("Contains Aditya: " + name.contains("Aditya"));

        
        System.out.println("Starts with A: " + name.startsWith("A"));

        
        System.out.println("Ends with Kumar: " + name.endsWith("Kumar"));

    
        String name2 = "Aditya Kumar";
        System.out.println("Both are same: " + name.equals(name2));

        
        String name3 = "ADITYA KUMAR";
        System.out.println("Ignore Case: " + name.equalsIgnoreCase(name3));

        
        System.out.println("Substring: " + name.substring(0, 6));

    
        String newName = name.replace("Aditya", "Thakur");
        System.out.println("After Replace: " + newName);

        
        String message = "   Hello Java   ";
        System.out.println("Before Trim: " + message);
        System.out.println("After Trim: " + message.trim());

        
        String firstName = "Aditya";
        String lastName = "Kumar";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        
        String a = "Java";
        String b = "Java";

        System.out.println("Comparison: " + a.equals(b));

        
        String empty = "";

        System.out.println("Is Empty: " + empty.isEmpty());

        
        System.out.println("Index of 'i': " + name.indexOf("i"));

        
        System.out.println("Last Index of 'a': " + name.lastIndexOf("a"));

    
        char[] characters = name.toCharArray();

        System.out.println("Characters:");

        for (char ch : characters) {
            System.out.println(ch);
        }
    }
}