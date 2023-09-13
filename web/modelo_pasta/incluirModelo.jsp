<%@page import="Classes.Modelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

     String    vcodTipo      = request.getParameter("codTipo");
     String    vcodModelo       = request.getParameter("codModelo");
     String    vdescModelo      = request.getParameter("nomeModelo");
     String    vcodMarca     = request.getParameter("tipoModelo");

    
     Modelo mo = new Modelo();
     mo.setcodTipo(vcodTipo);
     mo.setCodModelo(vcodModelo);
     mo.setNomeModelo(vnomeModelo);
     mo.setTipoModelo(vtipoModelo);
       
   if (mo.incluirModelo()){
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Marca cadastrada com sucesso");
            } else {
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Problemas ao cadastrar a Marca");
            }
%>