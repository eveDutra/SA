<%@page import="Classes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

     String vcpfCliente      = request.getParameter("cpfCliente");
     
     Cliente cli = new Cliente();
     cli.setCpfCliente(vcpfCliente);
     
    if (cli.excluirCliente()){
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Cliente excluido com sucesso");
            } else {
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Problemas ao excluir o Cliente");
            }
%>