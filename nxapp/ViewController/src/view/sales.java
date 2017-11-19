package view;

import java.io.IOException;

import java.io.InputStream;

import java.sql.Connection;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;

import javax.servlet.http.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import java.util.Date;

import view.backing.dbcon;

import javax.servlet.annotation.WebServlet;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.util.JRLoader;


public class sales extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Date pl1 = (Date) session.getAttribute("da1");
        Date pl2 = (Date) session.getAttribute("da2");
        Map m = new HashMap();
        m.put("da1", pl1);
        m.put("da2", pl2);
        m.put("p1", session.getAttribute("comp").toString());
        ServletOutputStream out = response.getOutputStream();
        response.setHeader("Content-disposition", "inline");
        response.setContentType("application/pdf");
        ServletContext context = getServletContext();
        InputStream fs = context.getResourceAsStream("/rpt/" + "salesrpt.jasper");
        JasperReport template = null;
        try {
            template = (JasperReport) JRLoader.loadObject(fs);
        } catch (JRException e) {
        }
        template.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
        Connection conn = (Connection) dbcon.getConnection();
        JasperPrint print = null;
        try {
            print = JasperFillManager.fillReport(template, m, conn);
        } catch (JRException e) {
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            JasperExportManager.exportReportToPdfStream(print, response.getOutputStream());
        } catch (JRException e) {
        }
        out.write(baos.toByteArray());
    }
}

