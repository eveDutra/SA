/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-09-06 12:11:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cliente_005fpasta;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import Classes.Cliente;

public final class alterarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Classes.Cliente");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Cadastro</title>\r\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("            ");

                String vCpfCliente = request.getParameter("cpfcliente");
                Cliente cli = new Cliente();
                cli.setCpfCliente(vCpfCliente);
                cli = cli.consultarCliente();
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("           <form action=\"incluir_cliente.jsp\" method=\"post\" class=\"tela\"> \r\n");
      out.write("            <h1>Cadastre o Cliente</h1>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\"> \r\n");
      out.write("            <label for=\"cpfCliente\"> CPF </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"14\" id=\"cpfCliente\" value = \"");
out.write(vCpfCliente);
      out.write("\" readonly=\"true\" name=\"cpfCliente\">  <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\"> \r\n");
      out.write("            <label for=\"nomeCliente\"> Nome </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"40\" id=\"nomeCliente\" value = \"");
out.write(cli.getNomeCliente());
      out.write("\" name=\"nomeCliente\"> <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\">\r\n");
      out.write("            <label for=\"foneCliente\"> Telefone </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"15\" id=\"foneCliente\" value = \"");
out.write(cli.getFoneCliente());
      out.write("\"name=\"foneCliente\"> <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\">\r\n");
      out.write("            <label for=\"emailCliente\"> E-mail </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"50\" id=\"emailCliente\" value = \"");
out.write(cli.getEmailCliente());
      out.write("\" name=\"emailCliente\"> <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\">\r\n");
      out.write("            <label for=\"nrcartaodebcred\"> Número do Cartão (Débito/Crédito) </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"12\" id=\"nrcartaodebcred\" value = \"");
out.write(cli.getNrCartaoDebCred());
      out.write("\"name=\"nrcartaodebcred\"> <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\">\r\n");
      out.write("            <label for=\"chavePix\"> Chave Pix </label><br>\r\n");
      out.write("            <input type=\"text\" maxlength=\"60\" id=\"chavePix\" value = \"");
out.write(cli.getChavePix());
      out.write("\"name=\"chavePix\"> <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"campo\">\r\n");
      out.write("            <button type=\"submit\">Alterar</button>\r\n");
      out.write("            <button type=\"reset\">Cancelar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <label>\r\n");
      out.write("                <div class=\"mensagem\">\r\n");
      out.write("                ");
 String mensagem = request.getParameter("pMensagem");

                   if (mensagem != null){
                       out.write("<p>" + mensagem + "</p>");
                   }
                
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </label>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("            <div class=\"vertical\"></div>\r\n");
      out.write("            <a class=\"voltar\" href=\"index.html\">Voltar</a>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
