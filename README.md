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
        String word1 = "ana", word2 = "Ana";
        System.out.println("Is the word " + word1 + " is palindrome?: " + isPalindrome(word1));
        System.out.println("Is the word " + word2 + " is palindrome?: " + isPalindrome(word2));
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
Output:
```
Is the word ana is palindrome?: true
Is the word Ana is palindrome?: false
```

**Project #3** - Write a function that takes in an array of numbers and prints the
combinations that add up to 10.

```java
import java.util.List;

public class CombinationApp {
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
Output:
```
1 + 9 = 10
2 + 8 = 10
3 + 7 = 10
4 + 6 = 10
```

**Project #4** – Write a fully functioning java application that takes an integer as a command line argument
n, and outputs the nth hexagonal number for the input?

```java
import java.util.Scanner;

public class HexagonalNumber {
    public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.println(number + "th hexagonal number is: " + getHexagonalNumber(number));
        }
    }

    public static int getHexagonalNumber(int n) {
        return n * (2 * n - 1);
    }
}
```
Output:
```
Enter a number: 7
7th hexagonal number is: 91

Enter a number: 3
3th hexagonal number is: 15

Enter a number: 2
2th hexagonal number is: 6
```

## Additional Practical Interview Questions:

**1. How would you make an application testable, what do you do to ensure code quality?**


*To make an application testable and ensure the quality, I would use the following practices:*

- Clean Code and SOLID principles: Write code that is easy to understand and maintain. Use descriptive variable and method names, keep functions short and focused, and use meaningful comments to explain what the code is doing.
- Use a Linter if is possible: This will help to maintain a consistent style across the codebase and catch common coding mistakes.
- Write Unit Test: Write small, isolated tests for individual components or methods of the application, this will help to catch bugs early in the development process.
- Code Reviews: Have other developers review with the code before it is merged into the main branch.
- Use Automated Build and Deployment: Use tools such as Jenkins to automate the build and deployment process.

**2. From a software development perspective, what steps might you take, on an ongoing basis, to continually improve your skillset?**

- Keep Learning: Take online courses, attend workshops and conferences, read books among others.
- Practice: Participate in coding challenges, make personal projects and experiment with new technologies.
- Mentor Others: Mentoring others is a great way to reinforce our own skills and knowledge.
- Collaborate with Others: Collaborate with other developers and learn from their experiences.
- Stay Motivated: Stay motivated by setting goals and focusing on what you enjoy about software development.

**3. Provide an example of a time when you just couldn’t complete all of your work on time to meet a deadline. What did you do? What was the result?**

Several years ago, I took on a project with a relatively tight deadline and in a technology in a technology that he did not master and with a learning curve. To get the work done as soon as possible, I decided to skip some of the testing process in that time we haven’t a QA team either.

Instead of testing after every step, I waited to apply the changes until the code was finished. As a result, many problems came up and I had to start to fix all those bugs.

I missed my deadline and had to change the delivery window. Luckily the client understood and gave the extra time I needed.


