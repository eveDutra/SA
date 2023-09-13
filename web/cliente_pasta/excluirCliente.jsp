<%@page import="Classes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <%
                String vCpfCliente = request.getParameter("cpfcliente");
                Cliente cli = new Cliente();
                cli.setCpfCliente(vCpfCliente);
                cli = cli.consultarCliente();
            %>
            
           <form action="incluir_cliente.jsp" method="post" class="tela"> 
            <h1>Cadastre o Cliente</h1>
            
            <div class="campo"> 
            <label for="cpfCliente"> CPF </label><br>
            <input type="text" maxlength="14" id="cpfCliente" value = "<%out.write(vCpfCliente);%>" readonly="true" name="cpfCliente">  <br>
            </div>
            
            
            
            <div class="campo">
            <button type="submit">Alterar</button>
            <button type="reset">Cancelar</button>
            </div>
            <label>
                <div class="mensagem">
                <% String mensagem = request.getParameter("pMensagem");

                   if (mensagem != null){
                       out.write("<p>" + mensagem + "</p>");
                   }
                %>
                </div>
            </label>
            
        </form>
            <div class="vertical"></div>
            <a class="voltar" href="index.html">Voltar</a>
    </body>
</html>
