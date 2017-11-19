package view.backing.screen.master;

import java.sql.Connection;
import java.sql.Statement;

import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import java.sql.*;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;

import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

import oracle.adf.view.rich.context.AdfFacesContext;

import view.TableData;

import view.backing.*;

public class Cust {
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
    private RichInputText it8;
    private RichOutputLabel ol10;
    private RichInputText it9;
    private RichOutputLabel ol11;
    private RichInputText it10;
    private RichOutputLabel ol12;
    private RichInputText it11;
    private RichOutputLabel ol13;
    private RichOutputLabel ol14;
    private RichInputText it12;

    private RichInputText it13;
    private RichOutputLabel ol15;
    private RichInputText it14;
    private RichOutputLabel ol16;
    private RichInputText it15;
    private RichOutputLabel ol17;
    private RichInputText it16;
    private RichOutputLabel ol18;
    private RichInputText it17;
    private RichOutputLabel ol19;
    private RichInputText it18;
    private RichButton b1;
    private RichButton b2;
    private RichSelectBooleanCheckbox sbc1;
    private RichSelectOneChoice soc1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichSelectItem si3;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol20;

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

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setOl10(RichOutputLabel ol10) {
        this.ol10 = ol10;
    }

    public RichOutputLabel getOl10() {
        return ol10;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setOl11(RichOutputLabel ol11) {
        this.ol11 = ol11;
    }

    public RichOutputLabel getOl11() {
        return ol11;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
    }

    public void setOl14(RichOutputLabel ol14) {
        this.ol14 = ol14;
    }

    public RichOutputLabel getOl14() {
        return ol14;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }


    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setOl15(RichOutputLabel ol15) {
        this.ol15 = ol15;
    }

    public RichOutputLabel getOl15() {
        return ol15;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setOl16(RichOutputLabel ol16) {
        this.ol16 = ol16;
    }

    public RichOutputLabel getOl16() {
        return ol16;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setOl17(RichOutputLabel ol17) {
        this.ol17 = ol17;
    }

    public RichOutputLabel getOl17() {
        return ol17;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setOl18(RichOutputLabel ol18) {
        this.ol18 = ol18;
    }

    public RichOutputLabel getOl18() {
        return ol18;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setOl19(RichOutputLabel ol19) {
        this.ol19 = ol19;
    }

    public RichOutputLabel getOl19() {
        return ol19;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
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

        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            stt.execute("delete from cust where idcust='"+getIt1().getValue()+"'");
            stt.execute("insert into cust value('" + getIt1().getValue() + "','" + getIt2().getValue() + "','" +
                        getIt11().getValue() + "','" + getIt9().getValue() + "','" + getIt3().getValue() + "','" +
                        getIt4().getValue() + "','" + getIt5().getValue() + "','" + getIt6().getValue() + "','" +
                        getIt7().getValue() + "','" + getIt8().getValue() + "','" + getIt10().getValue() + "','" +
                        getIt12().getValue() + "','" + getIt13().getValue() + "','" + getIt14().getValue() + "','" +
                        getIt15().getValue() + "')");
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        Connection conn = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("idcust") == null) {
            try {
                conn = dbcon.getConnection();
                Statement stt = conn.createStatement();
                ResultSet rs = stt.executeQuery("select * from cust");
                int i = 1;
                while (rs.next()) {
                    i = rs.getInt(1);
                }
                i = i + 1;
                getIt1().setValue(i);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {

                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }}
        }
         else {
            try {
                Connection con = dbcon.getConnection();
                Statement st = con.createStatement();
                ResultSet rs =
                    st.executeQuery("select * from cust where idcust = '" + session.getAttribute("idcust") +
                                    "'");
                while (rs.next()) {
                    getIt1().setValue(rs.getString(1));
                    getIt2().setValue(rs.getString(2));
                    getIt11().setValue(rs.getString(3));
                    getIt9().setValue(rs.getString(4));
                    getIt3().setValue(rs.getString(5));
                    getIt4().setValue(rs.getString(6));
                    getIt5().setValue(rs.getString(7));
                    getIt6().setValue(rs.getString(8));
                    getIt7().setValue(rs.getString(9));
                    getIt8().setValue(rs.getString(10));
                    getIt10().setValue(rs.getString(11));
                    getIt12().setValue(rs.getString(12));
                    getIt13().setValue(rs.getString(13));
                    getIt14().setValue(rs.getString(14));
                    getIt15().setValue(rs.getString(15));
                  session.removeAttribute("idcust");
                    }}
             catch (SQLException e) {
            }
         }}
    public void setSbc1(RichSelectBooleanCheckbox sbc1) {
        this.sbc1 = sbc1;
    }
    

    public RichSelectBooleanCheckbox getSbc1() {
        return sbc1;
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

    public void chkAdd(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        if (getSbc1().isSelected()) {
            getIt12().setValue(getIt3().getValue());
            getIt13().setValue(getIt4().getValue());
            getIt14().setValue(getIt5().getValue());
            getIt15().setValue(getIt6().getValue());
            //disabling input text
            getIt12().setDisabled(true);
            getIt13().setDisabled(true);
            getIt14().setDisabled(true);
            getIt15().setDisabled(true);
        } else {
            getIt12().setValue("");
            getIt13().setValue("");
            getIt14().setValue("");
            getIt15().setValue("");
            getIt12().setDisabled(false);
            getIt13().setDisabled(false);
            getIt14().setDisabled(false);
            getIt15().setDisabled(false);
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(it12);
        AdfFacesContext.getCurrentInstance().addPartialTarget(it13);
        AdfFacesContext.getCurrentInstance().addPartialTarget(it14);
        AdfFacesContext.getCurrentInstance().addPartialTarget(it15);
    }

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

    public void setOl20(RichOutputLabel ol20) {
        this.ol20 = ol20;
    }

    public RichOutputLabel getOl20() {
        return ol20;
    }
}
