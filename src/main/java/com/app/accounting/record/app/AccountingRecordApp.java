/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.app.accounting.record.app;

import java.sql.Connection;

/**
 *
 * @author naya
 */
public class AccountingRecordApp {

    public static void main(String[] args) {
        ConnectionBD connection = new ConnectionBD();
        try(Connection conn = connection.get_connection()){  
        }
        catch(Exception e) {
            System.out.println(e);
        }
}
}
