package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.util.Collection;

public class Program {

    public static  void main(String [] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
