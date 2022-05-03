package com.revature.dao;

import com.revature.models.Account;
import com.revature.models.Transactions;

import java.sql.SQLException;
import java.util.List;

public interface DaoInterface {

    //Create a new account
    public void CreateUserAccount (Account newAcc);

    /*Determine if a value exists from a given column in a given table(directory OR Transactions
    Used to set a unique account id, transfer money, delete account*/
    public boolean checkDatabase (String checkValue, int columnIndex, String table);
    public boolean checkDatabase (String email, String password);
    public boolean checkDatabase (String email, double id);

    /*should only be possible if user is logged in, determines if accountID matches with the username
    of the current session*/
    public void withdrawDb (double amt, double accountId) throws SQLException;

    /*removes an account from the Db, no questions asked*/
    public void deleteAccountDb (double accountId) throws SQLException;

    public void depositDb (double amt, double accountId) throws SQLException;

    /*Display*/
    public String displayAll (String requestType) throws SQLException;

    /*retrieve account balance given account ID*/
    public double getBalance (double accountID);

    /*Persist changes onto the transaction database*/
    public void updateTransactionDB (Transactions addTransaction) throws SQLException;

    public boolean isManager(String email) throws SQLException;
}
