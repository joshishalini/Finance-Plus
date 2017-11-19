package view.backing.screen.master;

import javax.faces.event.PhaseEvent;

import java.util.Date;

import javax.faces.event.ValueChangeEvent;

import view.backing.*;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.context.AdfFacesContext;

import java.text.SimpleDateFormat;

import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichPanelWindow;

import oracle.adf.view.rich.component.rich.output.RichInlineFrame;

import view.TableData;

public class Invoice {
    private RichForm f1;
    private RichDocument d1;
    private RichInputText it1;
    private RichInputDate id1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichSelectOneChoice soc2;
    private RichSelectItem si5;
    private RichSelectItem si6;
    private RichSelectItem si7;
    private RichTable t1;
    private RichButton b1;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichInputText it18;
    private RichButton b2;
    private RichButton b3;
    private RichInputText it19;
    private RichTable t2;
    private static List<TableData> adfTable = new ArrayList<TableData>();
    private RichPopup p1;
    private RichPanelWindow pw1;
    private RichInlineFrame if1;

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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(RichSelectItem si1) {
        this.si1 = si1;
    }

    public RichSelectItem getSi1() {
        return si1;
    }

    public void setSi2(RichSelectItem si2) {
        this.si2 = si2;
    }

    public RichSelectItem getSi2() {
        return si2;
    }

    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi5(RichSelectItem si5) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setSi6(RichSelectItem si6) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
    }

    public void setSi7(RichSelectItem si7) {
        this.si7 = si7;
    }

    public RichSelectItem getSi7() {
        return si7;
    }

    public void setT1(RichTable t1) {

        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }

    public void bphase(PhaseEvent phaseEvent) {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if(session.getAttribute("InvoiceId")==null)
        {                try {
                    Connection con = dbcon.getConnection();
                    Statement stt = con.createStatement();
                    ResultSet rs = stt.executeQuery("select distinct invoiceid from invoice");
                    int i = 1;
                    while (rs.next()) {
                        i++;
                    }
                    if (i <= 9) {
                        getIt1().setValue("INV-0000" + i);
                    }
                    if (i > 9 && i <= 99) {
                        getIt1().setValue("INV-000" + i);
                    }
                    if (i >= 100 && i <= 999) {
                        getIt1().setValue("INV-00" + i);
                    }
                    if (i >= 1000 && i <= 9999) {
                        getIt1().setValue("INV-0" + i);
                    }
                    if (i >= 10000) {
                        getIt1().setValue("INV-" + i);
                    }
                } catch (Exception er) {
                    er.printStackTrace();
                }}
        else{
                try{
                    getAdfTable().clear();
                    Connection con = dbcon.getConnection();
                    Statement st=con.createStatement();
                        ResultSet rs = st.executeQuery("select * from invoice where invoiceid = '"+session.getAttribute("InvoiceId")+"'");
                    while(rs.next())
                    {
                            getIt1().setValue(rs.getString(1));                
                            getIt2().setValue(rs.getString(2));
                           Date d1 = rs.getDate(3);
                            String trr = new SimpleDateFormat("dd/MM/yyyy").format(d1);
                             getId1().setValue(trr);
                            getIt3().setValue(rs.getString(4));
                            getIt4().setValue(rs.getString(5));
                            getIt5().setValue(rs.getString(6));
                            getIt6().setValue(rs.getString(7));
                            getSoc1().setValue(rs.getString(8));
                            getSoc2().setValue(rs.getString(9));
                            TableData ex1=new TableData();
                            ex1.setIcode(rs.getString(10));
                            ex1.setIname(rs.getString(11));
                            ex1.setIqty(rs.getString(12));
                            ex1.setIunit(rs.getString(13));
                            ex1.setIprice(rs.getString(14));
                            ex1.setIamount(rs.getString(15));
                            ex1.setItotal(rs.getString("total"));
                            session.removeAttribute("InvoiceId");
                            adfTable.add(ex1);
                        
                        }
                    } catch (SQLException e) {
                }
            }
    }
    
    public void custValChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String _val = valueChangeEvent.getNewValue().toString();
        try {
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin),concat(sline1,' ',sline2,' ',scity,' ',sstate),mobile,email from cust where name='" +
                                 _val + "'");
            while (rs.next()) {
                getIt3().setValue(rs.getString(1));
                getIt4().setValue(rs.getString(2));
                getIt5().setValue(rs.getString(3));
                getIt6().setValue(rs.getString(4));
            }
            AdfFacesContext.getCurrentInstance().addPartialTarget(it3);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it4);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it5);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it6);
            TableData ex1 = new TableData();
            TableData ex2 = new TableData();
            TableData ex3 = new TableData();
            TableData ex4 = new TableData();
            TableData ex5 = new TableData();
            adfTable.add(ex1);
            adfTable.add(ex2);
            adfTable.add(ex3);
            adfTable.add(ex4);
            adfTable.add(ex5);
            AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
        } catch (Exception er) {

        }

    }

    public void productval(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        try {
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            ResultSet rs =
                stt.executeQuery("select idproduct , unit,price from product where name='" + valueChangeEvent.getNewValue() +
                                 "'");
            String _icode = "";
            String _unit = "";
            String _price = "";
            while (rs.next()) {
                _icode = rs.getString(1);
                _unit = rs.getString(2);
                _price = rs.getString(3);
            }
            //trying to get current row index ....
            int _current_row_index = 0;
            _current_row_index = getT1().getRowIndex();
            getAdfTable().get(_current_row_index).setIcode(_icode);
            getAdfTable().get(_current_row_index).setIunit(_unit);
            getAdfTable().get(_current_row_index).setIprice(_price);
            AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
        }

        catch (Exception er) {

        }
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void qtyChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        int _current_row_index = 0;
        _current_row_index = getT1().getRowIndex();
        getAdfTable().get(_current_row_index).setIprice(getAdfTable().get(_current_row_index).getIprice());
        System.out.println("price value:---- > " + getAdfTable().get(_current_row_index).getIprice());
        //trying to get and check that if current row's price null or not...
        try {
            if (Double.parseDouble(getAdfTable().get(_current_row_index).getIprice()) > 0) {
                //if price is not null then we do qty*price...
                double price = Double.parseDouble(getAdfTable().get(_current_row_index).getIprice().toString());
                double qty = Double.parseDouble(valueChangeEvent.getNewValue().toString());
                double amount = qty * price;

                getAdfTable().get(_current_row_index).setIamount(Double.toString(amount));
                getAdfTable().get(_current_row_index).setItotal(Double.toString(amount));
                getAdfTable().get(_current_row_index).setIprice(getAdfTable().get(_current_row_index).getIprice());
            } else {
                getAdfTable().get(_current_row_index).setIamount("0");
                getAdfTable().get(_current_row_index).setItotal("0");
            }
        } catch (Exception er) {
            er.printStackTrace();
            getAdfTable().get(_current_row_index).setIamount("0");
            getAdfTable().get(_current_row_index).setItotal("0");
        }
        try {
            TableData dt = null;
            for (int i = 0; i < getAdfTable().size(); i++) {
                dt = getAdfTable().get(i);
                if (i == 0) {
                    getIt16().setValue(dt.getIamount());
                    getIt18().setValue(dt.getIamount());
                } else {
                    getIt18().setValue(Double.parseDouble(dt.getIamount()) +
                                       Double.parseDouble(getIt18().getValue().toString()));
                    getIt16().setValue(Double.parseDouble(dt.getIamount()) +
                                       Double.parseDouble(getIt16().getValue().toString()));
                }

                AdfFacesContext.getCurrentInstance().addPartialTarget(it18);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it16);
            }
        } catch (Exception er) {
            er.printStackTrace();
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(t1);

    }

    public void priceChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        System.out.print("i m in methode");
        int _current_row_index = 0;
        _current_row_index = getT1().getRowIndex();
        //        getAdfTable().get(_current_row_index).setIprice(getAdfTable().get(_current_row_index).getIprice());
        System.out.println("price value:---- > " + getAdfTable().get(_current_row_index).getIprice());
        //trying to get and check that if current row's price null or not...
        try {
            if (Double.parseDouble(valueChangeEvent.getNewValue().toString()) > 0) {
                //if price is not null then we do qty*price...
                double price = Double.parseDouble(valueChangeEvent.getNewValue().toString());
                double qty = Double.parseDouble(getAdfTable().get(_current_row_index).getIqty().toString());
                double amount = qty * price;
                getAdfTable().get(_current_row_index).setIamount(Double.toString(amount));
                getAdfTable().get(_current_row_index).setItotal(Double.toString(amount));
                getAdfTable().get(_current_row_index).setIprice(getAdfTable().get(_current_row_index).getIprice());
            } else {
                getAdfTable().get(_current_row_index).setIamount("0");
                getAdfTable().get(_current_row_index).setItotal("0");
            }
        } catch (Exception er) {
            er.printStackTrace();
            getAdfTable().get(_current_row_index).setIamount("0");
            getAdfTable().get(_current_row_index).setItotal("0");
        }
        try {
            TableData dt = null;
            for (int i = 0; i < getAdfTable().size(); i++) {
                dt = getAdfTable().get(i);
                if (i == 0) {
                    getIt18().setValue(dt.getIamount());
                    getIt16().setValue(dt.getIamount());
                } else {
                    getIt18().setValue(Double.parseDouble(dt.getIamount()) +
                                       Double.parseDouble(getIt18().getValue().toString()));
                    getIt16().setValue(Double.parseDouble(dt.getIamount()) +
                                       Double.parseDouble(getIt16().getValue().toString()));
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(it18);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it16);
            }
        } catch (Exception er) {
            er.printStackTrace();
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(t1);

    }

    public void save() {

        try {
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            Date d1 = (Date) getId1().getValue();
            String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);
            TableData dt = null;
            stt.execute("delete from invoice where invoiceid='"+getIt1().getValue()+"'");
            for (int i = 0; i < getAdfTable().size()-1; i++) {
                dt = getAdfTable().get(i);
                if (dt.getIname() != null) {
                    stt.execute("insert into invoice value('" + getIt1().getValue() + "','" + getIt2().getValue() +
                                "','" + trr + "','" + getIt3().getValue() + "','" + getIt4().getValue() + "','" +
                                getIt5().getValue() + "','" + getIt6().getValue() + "','" + getSoc1().getValue() +
                                "','" + getSoc2().getValue() + "','" + dt.getIcode() + "','" + dt.getIname() + "','" +
                                dt.getIqty() + "','" + dt.getIunit() + "','" + dt.getIprice() + "','" +
                                dt.getIamount() + "','" + dt.getItax() + "','" + dt.getItotal() + "','" + 0 + "','"+0+"')");
                    stt.execute("insert into vocher values('"+getIt1().getValue()+"','"+trr+"','"+"17"+"','"+"Income"+"','"+0+"','"+dt.getIamount()+"','"+"1701"+"','"+"Sales"+"','"+getIt2().getValue()+"','"+dt.getIqty()+"','"+dt.getIprice()+"','"+"0"+"','"+"0"+"','"+"0"+"','"+dt.getIname()+"' )");
                                 stt.execute("insert into vocher values('"+getIt1().getValue()+"','"+trr+"','"+"14"+"','"+"Current Assets"+"','"+dt.getIamount()+"','"+0+"','"+"1401"+"','"+"Sundary Debitors"+"','"+getIt2().getValue()+"','"+dt.getIqty()+"','"+dt.getIprice()+"','"+"0"+"','"+"0"+"','"+"0"+"','"+dt.getIname()+"' )"); 
                }
                
            }
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            session.putValue("ind", getIt1().getValue());
            getAdfTable().clear();
            AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            getIt1().setValue("");
            getIt2().setValue("");
            getIt3().setValue("");
            getIt4().setValue("");
            getIt5().setValue("");
            getIt6().setValue("");
            getId1().setValue("");
            getIt16().setValue("");
            getIt17().setValue("");
            getIt18().setValue("");
            getIt19().setValue("");
            getSoc1().setValue("");
            getSoc2().setValue("");
            AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it3);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it4);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it5);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it6);
            AdfFacesContext.getCurrentInstance().addPartialTarget(id1);
            AdfFacesContext.getCurrentInstance().addPartialTarget(soc1);
            AdfFacesContext.getCurrentInstance().addPartialTarget(soc2);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it16);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it18);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it19);
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void cancel() {
        getAdfTable().clear();
        AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
    }

    public void add() {
        TableData td = new TableData();
        getAdfTable().add(td);
        AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }

    public void setIf1(RichInlineFrame if1) {
        this.if1 = if1;
    }

    public RichInlineFrame getIf1() {
        return if1;
    }

}