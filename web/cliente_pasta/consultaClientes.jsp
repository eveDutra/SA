
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Classes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Consulta Clientes</title>
    </head>
    <body>
        <h4>Consulta Clientes</h4>
        
        <table class="table table-striped">
            <thead>
                <th>CPF</th>
                <th>Nome</th>
                <th>Fone</th>
                <th>eMail</th>
                <th>Cartão</th>
                <th>Chave PIX</th>
                <th>Alterar</th>
                <th>Excluir</th>
            </thead>
            
            <tbody>
            <%
                Cliente cli = new Cliente();    
                List<Cliente> listaCliente = new ArrayList<>();
                listaCliente = cli.consultarClientes();
                for (Cliente cliente : listaCliente) {   
                %>
                <tr>
                    <td><%out.write(cliente.getCpfCliente()); %></td>
                    <td><%out.write(cliente.getNomeCliente()); %></td>
                    <td><%out.write(cliente.getFoneCliente()); %></td>
                    <td><%out.write(cliente.getEmailCliente()); %></td>
                    <td><%out.write(cliente.getNrCartaoDebCred()); %></td>
                    <td><%out.write(cliente.getChavePix()); %></td>
                    <td><%out.write("<a href=alterarCliente.jsp?cpfcliente="  + "" + cliente.getCpfCliente() + ">" + "<i class='material-icons' style='color:red'>border_color</i>" + "</a>");%></td>
                    <td><%out.write("<a href=excluirCliente.jsp?cpfcliente="  + "" + cliente.getCpfCliente() + ">" + "<i class='material-icons' style='color:red'>delete_sweep</i>" + "</a>");%></td>
                <%
                    }                                                                                                
                %>
            </tbody>
            
        </table>
    </body>
</html>
