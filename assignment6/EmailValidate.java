package assignment6;

public class EmailValidate {

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false; 
        }

        int dotIndex = email.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex < atIndex || dotIndex == email.length() - 1) {
            return false;
        }

       

        return true;
    }

    public static void main(String[] args) {
        String[] emails = {"john.doe@example.com", "invalid@email", "@domain", "valid.email."};
        for (String email : emails) {
            System.out.println(email + " is valid: " + isValidEmail(email));
        }
    }
	}


    
