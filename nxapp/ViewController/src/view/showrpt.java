package view;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import java.sql.Connection;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.type.WhenNoDataTypeEnum;
import net.sf.jasperreports.engine.util.JRLoader;

import view.backing.dbcon;



@WebServlet(name = "showrpt", urlPatterns = { "/showrpt" })
public class showrpt extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession() ;
              String _invoice_id = session.getAttribute("ind").toString();
              Map m = new HashMap();
              m.put("iid", _invoice_id);
              ServletOutputStream out = response.getOutputStream();
              response.setHeader("Content-disposition", "inline");
              response.setContentType("application/pdf");
              ServletContext context = getServletContext();
              InputStream fs = context.getResourceAsStream("/rpt/" + "nxap.jasper");
              JasperReport template=null;
              try {
                  template = (JasperReport) JRLoader.loadObject(fs);
              } catch (JRException e) {
              }
              template.setWhenNoDataType(WhenNoDataTypeEnum.ALL_SECTIONS_NO_DETAIL);
              Connection conn = dbcon.getConnection();
              JasperPrint print=null;
              try {
                  print = JasperFillManager.fillReport(template, m, conn);
              } catch (JRException e) {
              }
              ByteArrayOutputStream baos = new ByteArrayOutputStream();
              try {
                  JasperExportManager.exportReportToPdfStream(print,
                                                              response.getOutputStream());
              } catch (JRException e) {
              }
              out.write(baos.toByteArray());
          }

    }

