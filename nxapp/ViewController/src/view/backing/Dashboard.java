package view.backing;

import java.awt.Toolkit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichInlineFrame;
import oracle.adf.view.rich.component.rich.output.RichOutputLabel;
import oracle.adf.view.rich.context.AdfFacesContext;

public class Dashboard {
    private RichGridCell gc2;
    private RichGridRow gr2;
    private RichPanelGroupLayout pgl1;
    private RichPanelSplitter ps1;
    private RichGridCell gc1;
    private RichGridRow gr3;
    private RichGridCell gc3;
    private RichGridRow gr1;
    private RichPanelGridLayout pgl2;
    private RichForm f1;
    private RichDocument d1;
    private RichPanelAccordion pa1;
    private RichShowDetailItem sdi1;
    private RichInlineFrame if1;
        private RichLink l22;

    public void setL22(RichLink l22) {
        this.l22 = l22;
    }

    public RichLink getL22() {
        return l22;
    }
    private RichLink l1;
    private RichLink l2;
    private RichLink l3;
    private RichLink l4;
    private RichShowDetailItem sdi2;
    private RichLink l5;
    private RichLink l6;
    private RichLink l7;
    private RichLink l8;
    private RichShowDetailItem sdi3;
    private RichLink l9;
    private RichLink l10;
    private RichLink l11;
    private RichLink l19;
    private RichLink l20;
    private RichLink l21;
    private RichLink l18;

    public void setL19(RichLink l19) {
        this.l19 = l19;
    }

    public RichLink getL19() {
        return l19;
    }

    public void setL20(RichLink l20) {
        this.l20 = l20;
    }

    public RichLink getL20() {
        return l20;
    }

    public void setL21(RichLink l21) {
        this.l21 = l21;
    }

    public RichLink getL21() {
        return l21;
    }

    public void setL18(RichLink l18) {
        this.l18 = l18;
    }

    public RichLink getL18() {
        return l18;
    }


    private RichOutputLabel ol1;
    private RichOutputLabel ol2;
    private RichOutputLabel ol3;
    private RichLink l12;
    private RichButton b1;
    private RichImage i1;
   
    private RichOutputLabel ol4;
    private RichOutputLabel ol5;
    private RichOutputLabel ol6;

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setPgl2(RichPanelGridLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGridLayout getPgl2() {
        return pgl2;
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

    public void setPa1(RichPanelAccordion pa1) {
        this.pa1 = pa1;
    }

    public RichPanelAccordion getPa1() {
        return pa1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setIf1(RichInlineFrame if1) {
        this.if1 = if1;
    }

    public RichInlineFrame getIf1() {
        return if1;
    }

    public void setL1(RichLink l1) {
        this.l1 = l1;
    }

    public RichLink getL1() {
        return l1;
    }

    public void setL2(RichLink l2) {
        this.l2 = l2;
    }

    public RichLink getL2() {
        return l2;
    }

    public void setL3(RichLink l3) {
        this.l3 = l3;
    }

    public RichLink getL3() {
        return l3;
    }

    public void setL4(RichLink l4) {
        this.l4 = l4;
    }

    public RichLink getL4() {
        return l4;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setL5(RichLink l5) {
        this.l5 = l5;
    }

    public RichLink getL5() {
        return l5;
    }

    public void setL6(RichLink l6) {
        this.l6 = l6;
    }

    public RichLink getL6() {
        return l6;
    }

    public void setL7(RichLink l7) {
        this.l7 = l7;
    }

    public RichLink getL7() {
        return l7;
    }

    public void setL8(RichLink l8) {
        this.l8 = l8;
    }

    public RichLink getL8() {
        return l8;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setL9(RichLink l9) {
        this.l9 = l9;
    }

    public RichLink getL9() {
        return l9;
    }

    public void setL10(RichLink l10) {
        this.l10 = l10;
    }

    public RichLink getL10() {
        return l10;
    }

    public void setL11(RichLink l11) {
        this.l11 = l11;
    }

    public RichLink getL11() {
        return l11;
    }

    public void cust() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/custdetail.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
    }

    public void supp() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/suppdetail.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
    }

    public void product() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/prodlist.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
    }

    public void proc() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/catelist.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
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

    public void setL12(RichLink l12) {
        this.l12 = l12;
    }

    public RichLink getL12() {
        return l12;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }
    public void bphase(PhaseEvent phaseEvent) {
        CheckStatus();

               Toolkit tool = Toolkit.getDefaultToolkit();
               int width = tool.getScreenSize().width;
               width = width-300;
               getIf1().setInlineStyle(getIf1().getInlineStyle()+" width:"+width+"px;");
           }
           public String CheckStatus(){
               System.out.println("i am here in check status");
               HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
               System.out.println("i am here in check status session "+session.getAttribute("comp"));
               if(session.getAttribute("name")!=null&&session.getAttribute("comp")!=null)
               { 
               
                   ol1.setValue(session.getAttribute("comp"));
                   getL22().setText(session.getAttribute("name")+" "+"Logout");
                   }
               else {
                   System.out.println("i am here in check status else" );
                   try {
                   FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()+"/faces/login.jsf");
                   }
                   catch(Exception er){
                       er.printStackTrace();}
               }
               return "";
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

    public String customer() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/cust.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
            return null;
    }

    public String supplier() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/supp.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
            return null;
    }

    public String prod() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/prodlist.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        return null;
    }

    public String cate() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/cate.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        return null;
    }

    public String general() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/gnrlvoucher.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        return null;
    }

    public String pur() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/purlist.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        return null;
    }

    public String invoice() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/invoicelist.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        return null;
    }

    public String prodt() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/product.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        
        return null;
    }

    public void logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
               session.removeAttribute("comp");    
               session.removeAttribute("name");
               session.invalidate();
               try {
               FacesContext.getCurrentInstance().getExternalContext().redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()+"/faces/login.jsf");
           }
               catch(Exception er){}
           }

    public String sales() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/tbal.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        
        return null;
    }

    public String pl() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/placc.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        
        return null;
    }

    public String bl1() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/bsheet.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        
        return null;
    }

    public String purr() {
        // Add event code here...
        getIf1().setSource("/faces/screen/master/gl.jsf");
            AdfFacesContext.getCurrentInstance().addPartialTarget(if1);
        
        return null;
    }
}
