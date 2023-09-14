<%@page import="Classes.Modelo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

     int       vCodTipo       = Integer.parseInt(request.getParameter("codTipo"));
     int       vCodMarca       = Integer.parseInt(request.getParameter("codMarca"));
     int       vCodModelo    = Integer.parseInt(request.getParameter("codModelo"));
     String    vdescModelo    = request.getParameter(" descModelo");

    
     Modelo mo = new Modelo();
     mo.setCodTipo(vCodTipo);
     mo.setCodMarca(vCodMarca);
     mo.setCodModelo(vCodModelo);
     mo.setDescModelo(vdescModelo);
       
   if (mo.incluirModelo()){
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Marca cadastrada com sucesso");
            } else {
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Problemas ao cadastrar a Marca");
            }
%>