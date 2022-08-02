/*************************************************************************************************
*  Database Pgm Using Java - ITC-5201-RNB – Assignment 2                                                                                                                            *

*  I declare that this assignment is my own work in accordance with Humber Academic Policy.        *

*  No part of this assignment has been copied manually or electronically from any other source       *

*  (including web sites) or distributed to other students/social media.                                                       *
                                                                                                                                                                             
*  Name:Abhi Hasmukhbhai Patel Student ID: N01421293      Date: June 14, 2021 
* 
*  Name: Harshil Hemantkumar Parmar Student ID: N01444692      Date: June 14, 2021

* *************************************************************************************************/

package method;

import java.util.HashMap;

public class ValidationMethod {

    public HashMap validateNameField(String name) {
        HashMap<String, String> validate = new HashMap();
        if (name.equals("")) {
            validate.put("isValid", "false");
            validate.put("msg", "Name is required.");
        } else {
            validate.put("isValid", "true");
            validate.put("msg", " ");
        }
        return validate;
    }

    public HashMap validatePhoneField(String phone) {
        HashMap<String, String> validate = new HashMap();
        if (phone.equals("")) {
            validate.put("isValid", "false");
            validate.put("msg", "Phone number is required.");
        } else if (phone.length() < 10) {
            validate.put("isValid", "false");
            validate.put("msg", "Phone number should be at least 10 digits long.");
        } else {
            validate.put("isValid", "true");
            validate.put("msg", " ");
        }
        return validate;
    }

    public HashMap validateEmailField(String email) {
        HashMap<String, String> validate = new HashMap();
        if (email.equals("")) {
            validate.put("isValid", "false");
            validate.put("msg", "Email is required.");
        }
        if (!email.matches("[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}")) {
            validate.put("isValid", "false");
            validate.put("msg", "Email is not valid.");
        } else {
            validate.put("isValid", "true");
            validate.put("msg", " ");
        }
        return validate;
    }

    public HashMap validatePostalCodeField(String postalCode) {
        HashMap<String, String> validate = new HashMap();
        if (postalCode.equals("")) {
            validate.put("isValid", "false");
            validate.put("msg", "Postal code is required.");
        } else if (postalCode.length() < 6) {
            validate.put("isValid", "false");
            validate.put("msg", "Postal code should be at least 6 characters long.");
        } else {
            validate.put("isValid", "true");
            validate.put("msg", " ");
        }
        return validate;
    }

}
