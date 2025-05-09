/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.99
 * Generated at: 2025-03-01 09:31:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.PatientModel;

public final class Patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Model.PatientModel");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"fr\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Gestion des Patients</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Style de fond */\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url('https://i.pinimg.com/736x/49/74/4a/49744aaf943c929ba87357f8fd8f59d3.jpg'); /* Image de fond */\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-attachment: fixed;\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Conteneur principal */\r\n");
      out.write("        .container {\r\n");
      out.write("            background: rgba(255, 255, 255, 0.9); /* Fond semi-transparent */\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Boutons stylés */\r\n");
      out.write("        .btn-add {\r\n");
      out.write("            background-color: #28a745;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-add:hover {\r\n");
      out.write("            background-color: #218838;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-delete {\r\n");
      out.write("            background-color: #dc3545;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-delete:hover {\r\n");
      out.write("            background-color: #c82333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Style du tableau */\r\n");
      out.write("        table {\r\n");
      out.write("            background: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Titre centré */\r\n");
      out.write("        h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h2 class=\"my-4\">Espace Patient</h2>\r\n");
      out.write("\r\n");
      out.write("    <!-- Formulaire d'ajout de patient -->\r\n");
      out.write("    <div class=\"card p-4 mb-4 shadow\">\r\n");
      out.write("        <h5 class=\"text-center\">Ajouter Votre Formations</h5>\r\n");
      out.write("        <form action=\"PatientServlet\" method=\"POST\" class=\"row g-3\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"nom\" placeholder=\"Nom\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"telephone\" placeholder=\"Téléphone\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-1\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-add w-100\">Ajouter</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Table des patients -->\r\n");
      out.write("    <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-bordered table-striped\">\r\n");
      out.write("            <thead class=\"table-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>Nom</th>\r\n");
      out.write("                    <th>Email</th>\r\n");
      out.write("                    <th>Téléphone</th>\r\n");
      out.write("                    <th>Action</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("                ");

                    List<PatientModel> patients = (List<PatientModel>) request.getAttribute("patients");
                    if (patients != null && !patients.isEmpty()) {
                        for (PatientModel p : patients) {
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print( p.getId() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( p.getNom() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( p.getEmail() );
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print( p.getTelephone() );
      out.write("</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"PatientServlet\" method=\"POST\" onsubmit=\"return confirm('Voulez-vous supprimer ce patient ?');\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( p.getId() );
      out.write("\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-delete btn-sm\">Supprimer</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                        }
                    } else {
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"5\" class=\"text-center text-muted\">Aucun patient trouvé.</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JS -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
