<%@page import="Classes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
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
            <label for="nomeCliente"> Nome </label><br>
            <input type="text" maxlength="40" id="nomeCliente" value = "<%out.write(cli.getNomeCliente());%>" name="nomeCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="foneCliente"> Telefone </label><br>
            <input type="text" maxlength="15" id="foneCliente" value = "<%out.write(cli.getFoneCliente());%>"name="foneCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="emailCliente"> E-mail </label><br>
            <input type="text" maxlength="50" id="emailCliente" value = "<%out.write(cli.getEmailCliente());%>" name="emailCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="nrcartaodebcred"> Número do Cartão (Débito/Crédito) </label><br>
            <input type="text" maxlength="12" id="nrcartaodebcred" value = "<%out.write(cli.getNrCartaoDebCred());%>"name="nrcartaodebcred"> <br>
            </div>
            
            <div class="campo">
            <label for="chavePix"> Chave Pix </label><br>
            <input type="text" maxlength="60" id="chavePix" value = "<%out.write(cli.getChavePix());%>"name="chavePix"> <br>
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
