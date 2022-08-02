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

import data.CustomerData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerMethod {

    File dataFile = new File("customerData.dat");

    ArrayList<CustomerData> customerList;

//  Author: Abhi Patel
    public void addCustomer(CustomerData customer) {

        try {

            if (dataFile.length() != 0) {

                ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile));
                customerList = (ArrayList) in.readObject();

                in.close();
            } else {
                customerList = new ArrayList();
            }

            customerList.add(customer);

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dataFile));
            out.writeObject(customerList);

            out.close();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CustomerMethod.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//  Author: Abhi Patel
    public int lastCustomerId() {
        int lastCustomerId = 0;
        try {
            if (dataFile.length() != 0) {

                ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile));
                customerList = (ArrayList) in.readObject();

                lastCustomerId = ((CustomerData) customerList.get(customerList.size() - 1)).getCustomerId();
            } else {
                lastCustomerId = 0;
            }
        } catch (NullPointerException | IndexOutOfBoundsException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(CustomerMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastCustomerId + 1;
    }

//  Author: Abhi Patel
    public ArrayList retriveAllCustomer() {
        try {
            if (dataFile.length() != 0) {

                ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile));
                customerList = (ArrayList) in.readObject();

                in.close();
            } else {
                customerList = new ArrayList();
            }
        } catch (IOException ex) {
            Logger.getLogger(CustomerMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customerList;
    }

// Author: Abhi Patel    
  public void addAllCustomer(ArrayList<CustomerData> customer) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dataFile));
            out.writeObject(customer);
            out.close();

        } catch (IOException ex) {
            Logger.getLogger(CustomerMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
