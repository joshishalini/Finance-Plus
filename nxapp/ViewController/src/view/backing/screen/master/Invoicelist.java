package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import java.util.Date;

import oracle.jbo.Row;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichChooseDate;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.SelectionEvent;

import view.TableData;

import view.backing.dbcon;

public class Invoicelist {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si5;
    private RichSelectItem si4;
    private RichSelectItem si6;
    private RichSelectItem si7;
    private RichInputText it1;
    private RichPopup pop2;
    private RichInputDate id1;
    private RichButton b3;

    public void setPop2(RichPopup pop2) {
        this.pop2 = pop2;
    }

    public RichPopup getPop2() {
        return pop2;
    }
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichSelectOneChoice soc2;
    private static List<TableData> adfTable = new ArrayList<TableData>();

    private RichInputText it2;
    private RichTable t1;
    private RichOutputLabel ol2;
    private RichMenu m1;
    private RichCommandMenuItem cmi1;
    private RichCommandMenuItem cmi2;
    private RichChooseDate cd1;
    private RichDialog d2;
    private RichOutputLabel ol3;
    private RichInputText it3;
    private RichDialog d3;
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;
    private RichOutputLabel ol7;
    private RichOutputLabel ol8;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichInputText it7;
    private RichSelectOneChoice soc3;
    private RichSelectItem si3;
    private RichSelectItem si8;
    private RichSelectItem si9;
    private RichPanelWindow pw1;
    private RichButton b1;
    private RichButton b2;
    private static int _update_flg = 0;

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

    public void setSi5(RichSelectItem si3) {
        this.si5 = si5;
    }

    public RichSelectItem getSi5() {
        return si5;
    }

    public void setSi6(RichSelectItem si1) {
        this.si6 = si6;
    }

    public RichSelectItem getSi6() {
        return si6;
    }

    public void setSi7(RichSelectItem si1) {
        this.si7 = si7;
    }

    public RichSelectItem getSi7() {
        return si7;
    }

    public void setSi4(RichSelectItem si4) {
        this.si4 = si4;
    }

    public RichSelectItem getSi4() {
        return si4;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void bphase(PhaseEvent phaseEvent) {

        try {
            if (_update_flg == 1) {
                getAdfTable().clear();
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice group by invoiceid");
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItax(rs.getString(6));
                    ex1.setItotal(rs.getString(3));

                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");

                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                    _update_flg = 0;

                }
            } else {
            }
            if (AdfFacesContext.getCurrentInstance().isPartialRequest(phaseEvent.getFacesContext())) {
            } else {
                getAdfTable().clear();
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice group by invoiceid");
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItax(rs.getString(6));
                    ex1.setItotal(rs.getString(3));

                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");

                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
            }

        } catch (Exception er) {
        }
    }

    public void setAdfTable(List<TableData> adfTable) {
        Invoicelist.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
    }

    public void setM1(RichMenu m1) {
        this.m1 = m1;
    }

    public RichMenu getM1() {
        return m1;
    }

    public void setCmi1(RichCommandMenuItem cmi1) {
        this.cmi1 = cmi1;
    }

    public RichCommandMenuItem getCmi1() {
        return cmi1;
    }

    public void setCmi2(RichCommandMenuItem cmi2) {
        this.cmi2 = cmi2;
    }

    public RichCommandMenuItem getCmi2() {
        return cmi2;
    }

    public void setCd1(RichChooseDate cd1) {
        this.cd1 = cd1;
    }

    public RichChooseDate getCd1() {
        return cd1;
    }

    public void ValChange(ValueChangeEvent valueChangeEvent) {
        if (getSoc2().getValue().equals("By name")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice where cust_name like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by invoiceid");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItax(rs.getString(6));
                    ex1.setItotal(rs.getString(3));
                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");
                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc2().getValue().equals("By id")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice where invoiceid like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by invoiceid");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItotal(rs.getString(3));
                    ex1.setItax(rs.getString(6));
                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");
                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                getIt2().setDisabled(false);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }

    }

    public void choiceChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...

        if (getSoc2().getValue().equals("Paid")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice where status ='" +
                                     1 + "' group by invoiceid");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItotal(rs.getString(3));
                    ex1.setItax(rs.getString(6));
                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");

                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                getIt2().setDisabled(true);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc2().getValue().equals("Due")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice where status ='" +
                                     0 + "' group by invoiceid");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setItax(rs.getString(6));
                    ex1.setItotal(rs.getString(3));
                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");

                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                getIt2().setDisabled(true);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc2().getValue().equals("By All")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select invoiceid,cust_name,sum(amount),status,term,sum(amount)-amtpaid from invoice group by invoiceid");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));

                    ex1.setItotal(rs.getString(3));
                    ex1.setItax(rs.getString(6));
                    if (rs.getString(4).equals("0")) {
                        ex1.setIqty("Due");
                    } else {
                        ex1.setIqty("Paid");

                    }
                    ex1.setIcode(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
                getIt2().setDisabled(true);
            } catch (Exception er) {
                er.printStackTrace();

            }
        }
        if (getSoc2().getValue().equals("By id")) {
            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
            getIt2().setDisabled(false);
        }
        if (getSoc2().getValue().equals("By name")) {
            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
            getIt2().setDisabled(false);
        }
    }


    public void paid() {
        // Add event code here...
    }

    public void selectionlist(SelectionEvent selectionEvent) {
        // Add event code here...
        RichTable t2 = (RichTable) selectionEvent.getSource();
        Row row = null;
        TableData rowData = null;
        for (Object FaceRowKey : t2.getSelectedRowKeys()) {
            t2.setRowKey(FaceRowKey);
            Object o = t2.getRowData();
            rowData = (TableData) o;
        }
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String Invoice_id = getAdfTable().get(getT1().getRowIndex()).getIunit();
        session.putValue("InvoiceId", Invoice_id);
        getIt5().setValue(rowData.getIunit());
        getIt4().setValue(rowData.getIname());
        getIt3().setValue(rowData.getItax());
    }

    public String payment() {
        // Add event code here...
        try {
            getIt6().setContentStyle("");

            getPop2().show(new RichPopup.PopupHints());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public String Edit(ActionEvent actionEvent) {
        // Add event code here...
        return "Invoice.jsf";

    }

    public String Edit() {
        // Add event code here...
        return "invoice.jsf";
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void Pay(ActionEvent actionEvent) {
        // Add event code here...


    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
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

    public void setOl8(RichOutputLabel ol8) {
        this.ol8 = ol8;
    }

    public RichOutputLabel getOl8() {
        return ol8;
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

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(RichSelectItem si3) {
        this.si3 = si3;
    }

    public RichSelectItem getSi3() {
        return si3;
    }

    public void setSi8(RichSelectItem si8) {
        this.si8 = si8;
    }

    public RichSelectItem getSi8() {
        return si8;
    }

    public void setSi9(RichSelectItem si9) {
        this.si9 = si9;
    }

    public RichSelectItem getSi9() {
        return si9;
    }

    public void setPw1(RichPanelWindow pw1) {
        this.pw1 = pw1;
    }

    public RichPanelWindow getPw1() {
        return pw1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void save() {
        // Add event code here...
        try {

            double _due_amount = Double.parseDouble(getIt3().getValue().toString());
            double _paid_amount = Double.parseDouble(getIt6().getValue().toString());
            if (_paid_amount > _due_amount) {
                getIt6().setValue("0");
                getIt6().setContentStyle("border:1px red solid;");
                getIt6().setShortDesc("Amount paid should not be greater than due amount");
                AdfFacesContext.getCurrentInstance().addPartialTarget(it6);

            } else {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                System.out.println("update invoice set amtpaid= amtpaid + " + getIt6().getValue() +
                                   " where invoiceid=" + getIt5().getValue());
                stt.execute("update invoice set amtpaid= amtpaid + " + getIt6().getValue() + " where invoiceid='" +
                            getIt5().getValue() + "'");
                if (_paid_amount == _due_amount) {
                    stt.execute("update invoice set status=1 where invoiceid='" + getIt5().getValue() + "'");
                    //creating vocherr

                    //stt.execute("insert into vocher values('"+getIt5().getValue()+"','"+trr+"','"+"17"+"','"+"Income"+"','"+0+"','"+dt.getIamount()+"','"+"1701"+"','"+"Sales"+"','"+getIt2().getValue()+"','"+dt.getIqty()+"','"+dt.getIprice()+"','"+"0"+"','"+"0"+"','"+"0"+"','"+dt.getIname()+"' )");

                }
                Date d1 = (Date) getId1().getValue();
                String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);
                stt.execute("insert into vocher values('" + getIt5().getValue() + "','" + trr + "','" + "14" + "','" +
                            "Current Assets" + "','" + 0 + "','" + getIt6().getValue() + "','" + "1401" + "','" +
                            "Sundary Debitors" + "','" + getIt4().getValue() + "','" + 0 + "','" + 0 + "','" + "0" +
                            "','" + "0" + "','" + "0" + "','" + getIt5().getValue() + " Payment" + "' )");

                //checking payment method
                if (getSoc3().getValue().equals("2")) {
                    stt.execute("insert into vocher values('" + getIt5().getValue() + "','" + trr + "','" + "14" +
                                "','" + "Current Assets" + "','" + getIt6().getValue() + "','" + 0 + "','" + "1401" +
                                "','" + "CASH IN HAND" + "','" + getIt4().getValue() + "','" + 0 + "','" + 0 + "','" +
                                "0" + "','" + "0" + "','" + "0" + "','" + getIt5().getValue() + " Payment" + "' )");
                } else {
                    stt.execute("insert into vocher values('" + getIt5().getValue() + "','" + trr + "','" + "14" +
                                "','" + "Current Assets" + "','" + getIt6().getValue() + "','" + 0 + "','" + "1401" +
                                "','" + "CURRENT A/C WITH BANK" + "','" + getIt4().getValue() + "','" + 0 + "','" + 0 +
                                "','" + "0" + "','" + "0" + "','" + "0" + "','" + getIt5().getValue() + " Payment" +
                                "' )");
                }
                con.close();
                getPop2().hide();
                _update_flg = 1;
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String cancel() {
        // Add event code here...
        getPop2().hide();
        return null;
    }

    public void paidValChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        getIt6().setContentStyle("");
        AdfFacesContext.getCurrentInstance().addPartialTarget(it6);
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public String newinvoice() {
        // Add event code here...
        return "invoice.jsf";
    }
}
