<%@page import="Classes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 

     String vcpfCliente      = request.getParameter("cpfCliente");
     String vnomeCliente     = request.getParameter("nomeCliente");
     String vfoneCliente     = request.getParameter("foneCliente");
     String vemailCliente    = request.getParameter("emailCliente");
     String vnrCartaoCredDeb = request.getParameter("nrcartaodebcred");
     String vchavePix        = request.getParameter("chavePix");
     
     Cliente cli = new Cliente();
     cli.setCpfCliente(vcpfCliente);
     cli.setNomeCliente(vnomeCliente);
     cli.setFoneCliente(vfoneCliente);
     cli.setEmailCliente(vemailCliente);
     cli.setNrCartaoDebCred(vnrCartaoCredDeb);
     cli.setChavePix(vchavePix);
     
   if (cli.alterarCliente()){
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Cliente alterado com sucesso");
            } else {
                response.sendRedirect("cadastrarCliente.jsp?pMensagem=Problemas ao alterar o Cliente");
            }
%>