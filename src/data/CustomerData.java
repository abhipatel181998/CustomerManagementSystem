/*************************************************************************************************
*  Database Pgm Using Java - ITC-5201-RNB – Assignment 2                                                                                                                            *

*  I declare that this assignment is my own work in accordance with Humber Academic Policy.        *

*  No part of this assignment has been copied manually or electronically from any other source       *

*  (including web sites) or distributed to other students/social media.                                                       *
                                                                                                                                                                             
*  Name:Abhi Hasmukhbhai Patel Student ID: N01421293      Date: June 14, 2021 
* 
*  Name: Harshil Hemantkumar Parmar Student ID: N01444692      Date: June 14, 2021

* *************************************************************************************************/

package data;

import java.io.Serializable;

public class CustomerData implements Serializable {

    private int customerId;
    private String name;
    private String phone;
    private String email;
    private String postalCode;

    public CustomerData() {

    }

    public CustomerData(int customerId, String name, String phone, String email, String postalCode) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.postalCode = postalCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPostalCode() {
        return postalCode;
    }

}
