package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import oracle.adf.view.rich.event.ItemEvent;

import oracle.jbo.Row;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichChooseDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.domain.Char;

import oracle.sql.CHAR;

import org.apache.myfaces.trinidad.event.AttributeChangeEvent;
import org.apache.myfaces.trinidad.event.SelectionEvent;

import view.TableData;

import view.backing.dbcon;

public class Detailssupp {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichOutputLabel ol4;
    private RichInputText it1;
    private RichInputText it2;

    private RichInputText it3;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichPanelTabbed pt1;
    private RichShowDetailItem sdi1;
    private RichTable t1;
    private RichPanelTabbed pt2;
    private RichShowDetailItem sdi2;
    private RichTable t2;
    private RichOutputLabel ol8;
    private RichOutputLabel ol9;

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
    private static List<TableData> adfTable = new ArrayList<TableData>();

    private static List<TableData> invoice_table = new ArrayList<TableData>();
    private static List<TableData> transaction_table = new ArrayList<TableData>();

    public void setInvoice_table(List<TableData> invoice_table) {
        Detailssupp.invoice_table = invoice_table;
    }

    public List<TableData> getInvoice_table() {
        return invoice_table;
    }

    public void setTransaction_table(List<TableData> transaction_table) {
        Detailssupp.transaction_table = transaction_table;
    }

    public List<TableData> getTransaction_table() {
        return transaction_table;
    }

    public void setAdfTable(List<TableData> adfTable) {
        Detailssupp.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
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

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void bphase(PhaseEvent phaseEvent) {
        if (AdfFacesContext.getCurrentInstance().isPartialRequest(phaseEvent.getFacesContext())) {
        } else {

            getInvoice_table().clear();
            getTransaction_table().clear();

            Connection conn = null;
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            if (session.getAttribute("idsupp") == null) {
            } else {
                try {
                    Connection con = dbcon.getConnection();
                    Statement st = con.createStatement();
                    System.out.print("select idsupp,name,concat(aline1,' 'aline2,' 'city,' 'pin,' 'state,' 'country),sum(amount)-amtpaid from supp where idsupp = '" +
                                     session.getAttribute("idsupp") + "'");
                    ResultSet rs =
                        st.executeQuery("select idsupp,name,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp where idsupp = '" +
                                        session.getAttribute("idsupp") + "'");
                    while (rs.next()) {
                        getOl5().setValue(rs.getString(1));
                        getOl6().setValue(rs.getString(2));
                        getOl7().setValue(rs.getString(3));
                        session.removeAttribute("idsupp");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                {
                    Connection connn = dbcon.getConnection();
                    Statement stt = connn.createStatement();
                    System.out.println("select supp_name,purid,total,amtpaid from pur where supp_name ='" +
                                       getOl6().getValue() + "'");
                    ResultSet rs =
                        stt.executeQuery("select purid,total,sum(amount)-amtpaid from pur where supp_name ='" +
                                         getOl6().getValue() + "' group by purid");
                    int i = 1;
                    while (rs.next()) {
                        TableData ex1 = new TableData();
                        ex1.setIunit(rs.getString(1));
                        ex1.setIamount(rs.getString(2));
                        ex1.setIname(rs.getString(3));
                        ex1.setIcode(Integer.toString(i));
                        i++;
                        getInvoice_table().add(ex1);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                {
                    Connection con = dbcon.getConnection();
                    Statement sttt = con.createStatement();
                    ResultSet rss =
                        sttt.executeQuery("select perticulers,cr,dr,rate from vocher where cname ='" +
                                          getOl6().getValue() + "' and accno=1301 order by date ,dr");
                    int i = 1;
                    double bal = 0;
                    while (rss.next()) {
                    System.out.println("tickk " + i);
                    TableData ex1 = new TableData();
                    System.out.println("in else ");
                    ex1.setIdr(Integer.toString(i));
                    ex1.setIprice(rss.getString(1));
                    ex1.setItotal(rss.getString(2));
                    ex1.setItax(rss.getString(3));
                    bal = bal + (Double.parseDouble(rss.getString(3)) - Double.parseDouble(rss.getString(2)));
                        ex1.setIqty(Double.toString(-bal));
                        getTransaction_table().add(ex1);
                        System.out.println("tickk " + i);
                        i++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
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

    public void setOl5(RichOutputLabel ol5) {
        this.ol5 = ol5;
    }

    public RichOutputLabel getOl5() {
        return ol5;
    }

    public void setOl6(RichOutputLabel ol6) {
        this.ol6 = ol6;
    }

    public RichOutputLabel getOl6() {
        return ol6;
    }

    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
    }

    public void setOl9(RichOutputLabel ol9) {
        this.ol9 = ol9;
    }

    public RichOutputLabel getOl9() {
        return ol9;
    }
}
