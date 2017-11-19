package view;

import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;

public class auto {

    public auto() {
        super();
    }

    public List<SelectItem> autoCust(String string) {
        // Add e000vent code here...
        List<SelectItem> item = new ArrayList();
        try {

            java.sql.Connection con = view.backing.dbcon.getConnection();
            java.sql.Statement stt = con.createStatement();
            java.sql.ResultSet rs = stt.executeQuery("select name from cust where name like '"+string+"%'");
            while (rs.next()) {
                item.add(new SelectItem(rs.getString(1)));
            }
        } catch (Exception er) {
        }
        return item;
    }

    public List<SelectItem> autoProduct(String string) {
        // Add event code here...
       
            List<SelectItem> item = new ArrayList();
            try {

                java.sql.Connection con = view.backing.dbcon.getConnection();
                java.sql.Statement stt = con.createStatement();
                java.sql.ResultSet rs = stt.executeQuery("select name from product where name like '"+string+"%'");
                while (rs.next()) {
                    item.add(new SelectItem(rs.getString(1)));
                }
            } catch (Exception er) {
            }
            return item;
        }
    
            public List<SelectItem> autoSupp(String string) {
                // Add e000vent code here...
                List<SelectItem> item = new ArrayList();
                try {

                    java.sql.Connection con = view.backing.dbcon.getConnection();
                    java.sql.Statement stt = con.createStatement();
                    java.sql.ResultSet rs = stt.executeQuery("select name from supp where name like '"+string+"%'");
                    while (rs.next()) {
                        item.add(new SelectItem(rs.getString(1)));
                    }
                } catch (Exception er) {
                }
                return item;
            }
      


       public List<SelectItem> autoCate(String string) {
        // Add event code here...
       
            List<SelectItem> item = new ArrayList();
            try {

                java.sql.Connection con = view.backing.dbcon.getConnection();
                java.sql.Statement stt = con.createStatement();
                java.sql.ResultSet rs = stt.executeQuery("select name from cate where name like '"+string+"%'");
                while (rs.next()) {
                    item.add(new SelectItem(rs.getString(1)));
                }
            } catch (Exception er) {
            }
            return item;
        }
}