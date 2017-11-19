package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;

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
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.SelectionEvent;

import view.TableData;

import view.backing.dbcon;

public class Suppdetail {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichPanelGroupLayout pgl2;
    private RichOutputLabel ol1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichSelectItem si4;
    private RichOutputLabel ol2;
    private RichInputText it1;
    private RichTable t1;
    private RichButton b3;
    private RichOutputLabel ol3;

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

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    private static List<TableData> adfTable = new ArrayList<TableData>();

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public void setAdfTable(List<TableData> adfTable) {
        Suppdetail.adfTable = adfTable;
    }

    public List<TableData> getAdfTable() {
        return adfTable;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
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

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void selectionlist(SelectionEvent selectionEvent) {
        // Add event code here...
       // RichTable t2 = (RichTable) selectionEvent.getSource();
        //Row row = null;
      //  TableData rowData = null;
       // for (Object FaceRowKey : t2.getSelectedRowKeys()) {
         //   t2.setRowKey(FaceRowKey);
           // Object o = t2.getRowData();
          //  rowData = (TableData) o;
        }
      

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        try {
            if (AdfFacesContext.getCurrentInstance().isPartialRequest(phaseEvent.getFacesContext())) {
            } else {
                getAdfTable().clear();
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select idsupp,name,email,phno,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp group by idsupp");
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setIprice(rs.getString(3));
                    ex1.setIqty(rs.getString(4));
                    ex1.setItax(rs.getString(5));
                    getAdfTable().add(ex1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void choicechange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        if (getSoc1().getValue().equals("By All")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select idsupp,name,email,phno,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp group by idsupp");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setIprice(rs.getString(3));
                    ex1.setIqty(rs.getString(4));
                    ex1.setItax(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
                AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
                getIt1().setDisabled(true);
            } catch (Exception er) {
                er.printStackTrace();
            }
            }
        
         if (getSoc1().getValue().equals("By Id")) {
                AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
              getIt1().setDisabled(false);}
        if (getSoc1().getValue().equals("By Name")) {
              AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            getIt1().setDisabled(false);}
        if (getSoc1().getValue().equals("By Mobile NO")) {
              AdfFacesContext.getCurrentInstance().addPartialTarget(it1);
            getIt1().setDisabled(false);}
    }
    

    public void valchange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        if (getSoc1().getValue().toString().equalsIgnoreCase("By name")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select idsupp,name,email,phno,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp where name like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by idsupp");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setIprice(rs.getString(3));
                    ex1.setIqty(rs.getString(4));
                    ex1.setItax(rs.getString(5));
                    getAdfTable().add(ex1);
                }
                AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc1().getValue().equals("By Mobile NO")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select idsupp,name,email,phno,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp where phno like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by idsupp");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setIprice(rs.getString(3));
                    ex1.setIqty(rs.getString(4));
                    ex1.setItax(rs.getString(5));
                    getAdfTable().add(ex1);
                }
              AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        if (getSoc1().getValue().equals("By Id")) {
            try {
                Connection con = dbcon.getConnection();
                Statement stt = con.createStatement();
                ResultSet rs =
                    stt.executeQuery("select idsupp,name,email,phno,concat(aline1,' ',aline2,' ',city,' ',state,' ' ,country,' ',pin) from supp where idsupp like" +
                                     "'%" + valueChangeEvent.getNewValue().toString() + "%'" + " group by idsupp");
                getAdfTable().clear();
                while (rs.next()) {
                    TableData ex1 = new TableData();
                    ex1.setIunit(rs.getString(1));
                    ex1.setIname(rs.getString(2));
                    ex1.setIprice(rs.getString(3));
                    ex1.setIqty(rs.getString(4));
                    ex1.setItax(rs.getString(5));
                    getAdfTable().add(ex1);
                }
               AdfFacesContext.getCurrentInstance().addPartialTarget(t1);
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
    }

    public String edit() {
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String idsupp = getAdfTable().get(getT1().getRowIndex()).getIunit();
        session.putValue("idsupp", idsupp);
        return "supp.jsf";
    }

    public String detsils() {
        // Add event code here...
        // Add event code here...
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String idsupp = getAdfTable().get(getT1().getRowIndex()).getIunit();
        session.putValue("idsupp", idsupp);
        return "detailssupp.jsf";
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public String newsupp() {
        // Add event code here...
        return "supp.jsf";
    }

    public void setOl3(RichOutputLabel ol3) {
        this.ol3 = ol3;
    }

    public RichOutputLabel getOl3() {
        return ol3;
    }
}
