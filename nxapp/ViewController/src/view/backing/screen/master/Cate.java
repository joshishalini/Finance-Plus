package view.backing.screen.master;

import javax.faces.event.PhaseEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;

import java.sql.*;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import view.backing.*;

public class Cate {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichInputText it1;
    private RichOutputLabel ol3;
    private RichInputText it2;
    private RichButton b1;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol4;

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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
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

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void save() {
        // Add event code here...
        try {
            Connection conn = dbcon.getConnection();
            Statement stt = conn.createStatement();
            stt.execute("insert into cate value('" + getIt1().getValue() + "','" + getIt2().getValue() + "')");
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void bphase(PhaseEvent phaseEvent) {
        Connection conn = null;
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        if (session.getAttribute("idcate") == null) {
            try {
                conn = dbcon.getConnection();
                Statement stt = conn.createStatement();
                ResultSet rs = stt.executeQuery("select * from cate");
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
                    st.executeQuery("select * from cate where idcate = '" + session.getAttribute("idcate") +
                                    "'");
                while (rs.next()) {
                    getIt1().setValue(rs.getString(1));
                    getIt2().setValue(rs.getString(2));
                  session.removeAttribute("idcate");
                    }}
             catch (SQLException e) {
            }
    }
}}
