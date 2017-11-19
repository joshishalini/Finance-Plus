package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import view.TableData;

import view.backing.dbcon;

public class Product {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichInputText it1;
    private RichOutputLabel ol3;
    private RichInputText it2;
    private RichOutputLabel ol4;
    private RichInputText it3;
    private RichOutputLabel ol5;
    private RichInputText it4;
    private RichOutputLabel ol6;
    private RichInputText it5;
    private RichOutputLabel ol7;
    private RichInputText it6;
    private RichOutputLabel ol8;
    private RichInputText it7;
    private RichOutputLabel ol9;
    private RichOutputLabel ol10;
    private RichInputText it8;
    private RichOutputLabel ol11;
    private RichInputText it9;
    private RichButton b1;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol12;
    private RichOutputLabel ol13;
    
    private RichInputText it10;
    private static List<TableData> adfTable = new ArrayList<TableData>();
            public void setAdfTable(List<TableData> adfTable) {
                this.adfTable = adfTable;
            }

            public List<TableData> getAdfTable() {
                return adfTable;
            }

 
    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setOl1(RichOutputLabel ol1) {
        this.ol1 = ol1;
    }

    public RichOutputLabel getOl1() {
        return ol1;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
    }

    public void setOl10(RichOutputLabel ol10) {
        this.ol10 = ol10;
    }

    public RichOutputLabel getOl10() {
        return ol10;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void save() {
        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            
                stt.execute("delete from product where idproduct='"+getIt1().getValue()+"'");
            stt.execute("insert into product values('" + getIt1().getValue() + "','" + getIt2().getValue() + "','" +
                        getIt3().getValue() + "','" + getIt4().getValue() + "','" + getIt5().getValue() + "','" +
                        getIt6().getValue() + "','" + getIt7().getValue() + "','" + getIt8().getValue() + "','" +
                        getIt9().getValue() +"','"+getIt10().getValue()+"')");
            getP1().show(new RichPopup.PopupHints());
        }
        catch(Exception e)
        {
             e.printStackTrace();
            }
        }
    

    public void bPhase(PhaseEvent phaseEvent) {
            if (AdfFacesContext.getCurrentInstance().isPartialRequest(phaseEvent.getFacesContext())) {
            } else {
            Connection con = null;
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            if (session.getAttribute("idproduct") == null) {
        try {
            con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs = stt.executeQuery("select * from product");
            int i = 0;
            while (rs.next()) {
                i = rs.getInt(1);
            }
            i = i + 1;
            getIt1().setValue(i);
            //rs.close();
            //con.close();
                con.close();
            } catch (Exception er)
            {
        }    }    
            else {
            try {
                Connection conn = dbcon.getConnection();
                Statement st = conn.createStatement();
                ResultSet rs =
                    st.executeQuery("select * from product where idproduct = '" + session.getAttribute("idproduct") +
                                    "'");
                while (rs.next()) {
                    getIt1().setValue(rs.getString(1));
                    getIt2().setValue(rs.getString(2));
                    getIt3().setValue(rs.getString(3));
                    getIt4().setValue(rs.getString(4));
                    getIt5().setValue(rs.getString(5));
                    getIt6().setValue(rs.getString(6));
                    getIt7().setValue(rs.getString(7));
                    getIt8().setValue(rs.getString(8));
                    getIt9().setValue(rs.getString(9));
                    getIt10().setValue(rs.getString(10));
                  session.removeAttribute("idproduct");
                    }}
             catch (SQLException e){
                e.printStackTrace();
            }
        }}}
    
    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void catechange(ValueChangeEvent valueChangeEvent) {
            String _val = valueChangeEvent.getNewValue().toString();
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                System.out.println("select idcate,name from cate where name='" +
                                   _val + "'");
                ResultSet rs =
                    stt.executeQuery("select idcate,name from cate where name='" +
                                   _val + "'");
                while (rs.next()) {
                    getIt9().setValue(rs.getString(2));
                    getIt8().setValue(rs.getString(1));
                    
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(it8);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it9);}
        catch (Exception er) {

        }}}

