package view.backing.screen.master;

import javax.faces.event.PhaseEvent;

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

import view.backing.*;

public class Supp {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichInputText it1;
    private RichOutputLabel ol3;
    private RichInputText it2;
    private RichOutputLabel ol4;
    private RichButton b1;
    private RichOutputLabel ol11;
    private RichInputText it9;
    private RichOutputLabel ol12;
    private RichInputText it10;
    private RichOutputLabel ol13;
    private RichInputText it11;
    private RichInputText it3, it4, it5, it6, it7, it8;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol14;

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

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
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
            stt.execute("insert into supp value('" + getIt2().getValue() + "','" + getIt1().getValue() + "','" +
                        getIt11().getValue() + "','" + getIt10().getValue() + "','" + getIt3().getValue() + "','" +
                        getIt4().getValue() + "','" + getIt5().getValue() + "','" + getIt6().getValue() + "','" +
                        getIt7().getValue() + "','" + getIt8().getValue() + "','" + getIt9().getValue() + "')");
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void setOl12(RichOutputLabel ol12) {
        this.ol12 = ol12;
    }

    public RichOutputLabel getOl12() {
        return ol12;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setOl13(RichOutputLabel ol13) {
        this.ol13 = ol13;
    }

    public RichOutputLabel getOl13() {
        return ol13;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void bPhase(PhaseEvent phaseEvent) {
        // Add event code here...
        Connection conn = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("idsupp") == null) {
            try {
                conn = dbcon.getConnection();
                Statement stt = conn.createStatement();
                ResultSet rs = stt.executeQuery("select * from supp");
                int i = 1;
                while (rs.next()) {
                    i = rs.getInt(1);
                }
                i = i + 1;
                getIt2().setValue(i);
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
                    st.executeQuery("select * from supp where idsupp = '" + session.getAttribute("idsupp") +
                                    "'");
                while (rs.next()) {
                    getIt2().setValue(rs.getString(1));
                    getIt1().setValue(rs.getString(2));
                    getIt3().setValue(rs.getString(5));
                    getIt4().setValue(rs.getString(6));
                    getIt5().setValue(rs.getString(7));
                    getIt6().setValue(rs.getString(8));
                    getIt7().setValue(rs.getString(9));
                    getIt8().setValue(rs.getString(10));
                    getIt9().setValue(rs.getString(11));
                    getIt10().setValue(rs.getString(4));
                    getIt11().setValue(rs.getString(3));
                  session.removeAttribute("idsupp");
                    }}
             catch (SQLException e) {
            }
         }}

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

    public void setOl14(RichOutputLabel ol14) {
        this.ol14 = ol14;
    }

    public RichOutputLabel getOl14() {
        return ol14;
    }
}
