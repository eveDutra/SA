<%@page import="Classes.Marca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

     String vcodTipo       = request.getParameter("codTipo");
     int vcodMarca         = Integer.parseInt(request.getParameter("codMarca"));
     String vdescMarca     = request.getParameter("descMarca");
    
     Marca ma = new Marca();
     ma.setCodTipo(vcodTipo);
     ma.setCodMarca(vcodMarca);
     ma.setDescMarca(vdescMarca);
       
   if (ma.incluirMarca()){
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Marca cadastrada com sucesso");
            } else {
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Problemas ao cadastrar a Marca");
            }
%>