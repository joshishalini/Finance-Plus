package view.backing.screen.master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.event.PhaseEvent;

import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectItem;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.render.ClientEvent;

import view.backing.dbcon;

public class Gnrlvoucher {
    private RichForm f1;
    private RichDocument d1;
    private RichOutputLabel ol1;
    private RichInputText it1;
    private RichOutputLabel ol2;

    public void setOl17(RichOutputLabel ol17) {
        this.ol17 = ol17;
    }

    public RichOutputLabel getOl17() {
        return ol17;
    }
    private RichOutputLabel ol17;
    private RichInputText it2;
    private RichOutputLabel ol3;
    private RichInputText it3;
    private RichOutputLabel ol4;
    private RichInputDate id1;
    private RichOutputLabel ol5;
    private RichInputText it4;
    private RichSelectOneRadio sor1;
    private RichSelectItem si1;
    private RichSelectItem si2;
    private RichButton b1;
    private RichOutputLabel ol6;
    private RichInputText it5;
    private static int _lcoa = 0;
    private RichPopup p1;
    private RichDialog d2;
    private RichOutputLabel ol7;

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

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setOl2(RichOutputLabel ol2) {
        this.ol2 = ol2;
    }

    public RichOutputLabel getOl2() {
        return ol2;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
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

    public void setOl4(RichOutputLabel ol4) {
        this.ol4 = ol4;
    }

    public RichOutputLabel getOl4() {
        return ol4;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
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

    public void setSor1(RichSelectOneRadio sor1) {
        this.sor1 = sor1;
    }

    public RichSelectOneRadio getSor1() {
        return sor1;
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

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void bphase(PhaseEvent phaseEvent) {
        // Add event code here...
        System.out.println("i  am here in bphase");

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

    public void getDetails(ClientEvent clientEvent) {
        // Add event code here...
        //getting details from he chart of account ....
        try {
            System.out.println("asdasdasd");
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();

            ResultSet rs = stt.executeQuery("select ctype, lname from coa where idcoa='" + getIt1().getValue() + "'");
            while (rs.next()) {
                getIt3().setValue(rs.getString(1));
                getIt2().setValue(rs.getString(2));
            }
            System.out.println("select * from lcoa where type='" + getIt2().getValue() + "'");
            rs = stt.executeQuery("select * from lcoa where type='" + getIt3().getValue() + "'");
            while (rs.next()) {
                _lcoa = rs.getInt(1);
            }
            rs.close();
            con.close();

            AdfFacesContext.getCurrentInstance().addPartialTarget(it2);
            AdfFacesContext.getCurrentInstance().addPartialTarget(it3);
        } catch (Exception er) {
            er.printStackTrace();
        }
    }

    public void save() {
        // Add event code here...
        try {
            Connection con = dbcon.getConnection();
            Statement stt = con.createStatement();
            Date d1 = (Date) getId1().getValue();
            String trr = new SimpleDateFormat("YYYY-MM-dd").format(d1);
            if (getSor1().getValue().toString().equals("Credit")) {
                stt.execute("insert into vocher values('" + getIt1().getValue() + "','" + trr + "','" + _lcoa + "','" +
                            getIt3().getValue() + "','" + 0 + "','" + getIt5().getValue() + "','" +
                            getIt1().getValue() + "','" + getIt2().getValue() + "','" + getIt2().getValue() + "','" +
                            0 + "','" + 0 + "','" + "0" + "','" + "0" + "','" + "0" + "','" + getIt4().getValue() +
                            "' )");
            } else {
                stt.execute("insert into vocher values('" + getIt1().getValue() + "','" + trr + "','" + _lcoa + "','" +
                            getIt3().getValue() + "','" + getIt5().getValue() + "','" + 0 + "','" +
                            getIt1().getValue() + "','" + getIt2().getValue() + "','" + getIt2().getValue() + "','" +
                            0 + "','" + 0 + "','" + "0" + "','" + "0" + "','" + "0" + "','" + getIt4().getValue() +
                            "' )");

            }
            getP1().show(new RichPopup.PopupHints());
        } catch (Exception er) {
er.printStackTrace();
        }
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

    public void setOl7(RichOutputLabel ol7) {
        this.ol7 = ol7;
    }

    public RichOutputLabel getOl7() {
        return ol7;
    }

    public static void setLcoa(int _lcoa) {
        Gnrlvoucher._lcoa = _lcoa;
    }

    public static int getLcoa() {
        return _lcoa;
    }
}
