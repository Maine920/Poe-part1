/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapplication;

/**
 *
 * @author madondo
 */
import java.util.Scanner;
public class ChatApplication {

public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

// Username
System.out.print("Enter username:");
String username = input.nextLine();

// Password
System.out.print("Enter password:");
String password = input.nextLine();

// Phone number
System.out.print("Enter phone number:");
String phoneNumber = input.nextLine();
   

// Username check
if (username.contains("_") && username.length()<= 5){
System.out.println("Username successfully captured.");
}else {
System.out.println("Username is not correctly formatted;please ensure that your username contains an underscore and is no more than 5 characters.");
}
   
// Password check
boolean hasCapital = false;
boolean hasNumber = false;
boolean hasSpecial = false;


for (int i = 0; i< password.length(); i++) {
char ch = password.charAt(i);

if (Character.isUpperCase(ch)) {
hasCapital = true;
} else if(Character.isDigit(ch))
hasNumber = true;
}

// Password validator
if(password.length()>=8 && hasCapital && hasNumber && hasSpecial) {
System.out.println("Password successfully captured.");
} else {
System.out.println("Password is not correctly formatted;please ensure that the password contains at least eight characters, a capital letter, a number and a special character.");
}

// Phone validator 
String phoneNumber2 = "+27*********";
String result = validatePhoneNumber(phoneNumber2);
System.out.println(result);
}

public static String validatePhoneNumber(String phone) {
String countryCode = "\\+[0-9]{1,3}";
String numberPart = "[0-9]{7,10}";
String regex = "^" + countryCode + numberPart + "$";

if (phone.matches(regex)) {
return "Cell phone number successfully added.";
} else {
return "Cell phone number incorrectly formatted or does not contain international code.";
}
}
public class LoginApp {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//  user details
String savedUsername = "**_**";
String savedPassword = "********";
String firstName = "**********";
String lastName = "**********";

// user log in 
System.out.print("Enter username: ");
String enteredUsername = input.nextLine();

System.out.print("Enter password: ");
String enteredPassword = input.nextLine();

//  details match?
if (enteredUsername.equals(savedUsername) && enteredPassword.equals(savedPassword)) {
System.out.println("Welcome " + firstName + ", " + lastName + " it is great to see you again.");
} else {
System.out.println("Username or password incorrect, please try again.");
}

}
public class Login {

String username, password, cell;

public boolean checkUserName(String u) {
return u.contains("_") && u.length() <= 5;
}

public boolean checkPasswordComplexity(String p) {
boolean cap = false, num = false, spec = false;

if (p.length() < 8) return false;

for (char c : p.toCharArray()) {
if (Character.isUpperCase(c)) cap = true;
else if (Character.isDigit(c)) num = true;
else if (!Character.isLetterOrDigit(c)) spec = true;
}

return cap && num && spec;
}

public boolean checkCellPhoneNumber(String c) {
return c.startsWith("+27") && c.length() == 12;
}

public String registerUser(String u, String p, String c) {
if (!checkUserName(u)) return "Username incorrect";
if (!checkPasswordComplexity(p)) return "Password incorrect";
if (!checkCellPhoneNumber(c)) return "Cell number incorrect";

username = u;
password = p;
cell = c;

return "Registered successfully";
}

public boolean loginUser(String u, String p) {
return u.equals(username) && p.equals(password);
}

public String returnLoginStatus(boolean status) {
return status ? "Login successful" : "Login failed";
}

}
public class LoginTest {

    Login login = new Login();
    private void assertEquals(boolean checkPasswordComplexity, boolean checkUsername) {
        
    }
    
    // verify username
   
    public void testUsernameCorrect() {
        assertEquals(true, login.checkUserName("kyl_1"));
    }

    public void testUsernameIncorrect() {
        assertEquals(false, login.checkUserName("kyle!!!!!!!"));
    }

    // verify password
    
    public void testPasswordCorrect() {
        assertEquals(true, login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    public void testPasswordIncorrect() {
        assertEquals(false, login.checkPasswordComplexity("password"));
    }

    // verify CellPhone Number
    
    public void testCellCorrect() {
        assertEquals(true, login.checkCellPhoneNumber("+27838968976"));
    }
    public void testCellIncorrect() {
        assertEquals(false, login.checkCellPhoneNumber("08966553"));
    }
}
}
}
