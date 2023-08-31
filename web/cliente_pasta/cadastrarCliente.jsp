<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <link href="../styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <span class="outer">
            <div class="title-form">
                <h1>
                    Clientes
                </h1>
            </div>

            <div class="operation-selector">
                
                <a class="operation selected">
                    Incluir
                </a>
                
                <a href="excluirCliente.jsp" class="operation">
                    Excluir
                </a>

                <a href="alterarCliente.jsp" class="operation">
                    Alterar
                </a>
                
                <a href="consultaCliente.jsp" class="operation">
                    Consultar
                </a>
                
            </div>
        </span>
           <form action="incluir_cliente.jsp" method="post" class="tela"> 
            <h1>Cadastre o Cliente</h1>
            
            <div class="campo"> 
            <label for="cpfCliente"> CPF </label><br>
            <input type="text" maxlength="14" id="cpfCliente" name="cpfCliente"> <br>
            </div>
            
            <div class="campo"> 
            <label for="nomeCliente"> Nome </label><br>
            <input type="text" maxlength="40" id="nomeCliente" name="nomeCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="foneCliente"> Telefone </label><br>
            <input type="text" maxlength="15" id="foneCliente" name="foneCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="emailCliente"> E-mail </label><br>
            <input type="text" maxlength="50" id="emailCliente" name="emailCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="nrcartaodebcred"> Número do Cartão (Débito/Crédito) </label><br>
            <input type="text" maxlength="12" id="nrcartaodebcred" name="nrcartaodebcred"> <br>
            </div>
            
            <div class="campo">
            <label for="chavePix"> Chave Pix </label><br>
            <input type="text" maxlength="60" id="chavePix" name="chavePix"> <br>
            </div>
            
            <div class="campo">
            <button type="submit">Incluir</button>
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
            <a class="voltar" href="../index.html">Voltar</a>
    </body>
</html>
