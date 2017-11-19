package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.component.html.HtmlCommandButton;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPanelWindow;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import view.backing.dbcon;

public class Placc {
    private RichForm f1;
    private RichPopup p1;
    private RichPanelWindow pw1;
    private RichInlineFrame if1;
    private RichDocument d1;
    private RichInputDate id1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichInputDate id2;
    private HtmlCommandButton cb1;
    private RichOutputLabel ol3;
    private HtmlCommandButton cb2;
    private HtmlCommandButton cb3;

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

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
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

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setCb1(HtmlCommandButton cb1) {
        this.cb1 = cb1;
    }

    public HtmlCommandButton getCb1() {
        return cb1;
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }

    public void setCb2(HtmlCommandButton cb2) {
        this.cb2 = cb2;
    }

    public HtmlCommandButton getCb2() {
        return cb2;
    }

    public void setCb3(HtmlCommandButton cb3) {
        this.cb3 = cb3;
    }

    public HtmlCommandButton getCb3() {
        return cb3;
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

    public void action() {
        // Add event code here...
    try{
        System.out.println("ddxfcgbjmkl");
           Connection con = dbcon.getConnection();
           Statement stt = con.createStatement();
           HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
               
           Date d1=(Date) getId1().getValue();
           session.putValue("da1", d1);
           String trr=new SimpleDateFormat("YYYY-MM-dd").format(d1);
          
           Date d2=(Date) getId2().getValue();
           session.putValue("da2", d2);
           String tr=new SimpleDateFormat("YYYY-MM-dd").format(d2);
           boolean b=stt.execute("delete from pl");

           boolean b1=stt.execute("insert into pl select accname,sum(cr),0,'profit' from vocher where date between'"+trr+"' and '"+tr+"' and ledgercode in ('17','10') group by accno");
           boolean b2=stt.execute("insert into pl select accname,0,sum(dr),'loss' from vocher where date between'"+trr+"' and '"+tr+"' and ledgercode in ('15','11','8') group by accno");
           getP1().show(new RichPopup.PopupHints());
           
       }
           catch(Exception e){
               e.printStackTrace();
               }       
}}
