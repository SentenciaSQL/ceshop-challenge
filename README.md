# Practical Interview Project

**Project #1.** 

***Backend:***

Inside the backend folder is the project theceshopChallenge is a REST API in Java/SpringBoot. Here you can find both the source code, some unit test cases as well as a generated war file inside the target folder.

For the database you can use both the import.sql file inside the SQL folder, or also the import.sql file inside the project resources since the application.properties the DDL is set to "create-drop".

***Frontend:***

Dentro de la carpeta frontend se encuentra el proyecto theceshop, es un proyecto frontend en Angular que se encarga de consumir el API REST de java y mostrar la informacion requerida. 

Dentro de la carpeta dist se encuantra el proyecto compilado. en caso de querer ejecutar el codigo fuente debe ejecutar primero el comando npm install.
  

**Project #2** - Write a Java Program that determines if a string is a palindrome.

```java
public class PalindromeApp {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("Ana"));
    }

    public static boolean isPalindrome(String str) {
        int legth = str.length();
        for (int i = 0; i < legth / 2; i++) {
            if (str.charAt(i) != str.charAt(legth - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
```

**Project #3** - Write a function that takes in an array of numbers and prints the
combinations that add up to 10.

```java
import java.util.List;

public class CombunationApp {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printConbination(numbers);
    }

    public static void printConbination(List<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == 10) {
                    System.out.println(numbers.get(i) + " + " + numbers.get(j) + " = 10");
                }
            }
        }
    }
}

```

**Project #4** – Write a fully functioning java application that takes an integer as a command line argument
n, and outputs the nth hexagonal number for the input?

```java
import java.util.List;

public class CombunationApp {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printConbination(numbers);
    }

    public static void printConbination(List<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = i + 1; j < numbers.size(); j++) {
                if(numbers.get(i) + numbers.get(j) == 10) {
                    System.out.println(numbers.get(i) + " + " + numbers.get(j) + " = 10");
                }
            }
        }
    }
}

```
