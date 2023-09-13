<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marca</title>
        <link href="../styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <span class="outer">
            <div class="title-form">
                <h1>
                    Marca
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
           <form action="incluir_marca.jsp" method="post" class="tela"> 
            <h1>Cadastre a Marca</h1>
            
            <div class="campo"> 
            <label for="codTipo"> Código do Tipo </label><br>
            <input type="text" maxlength="50" id="codTipo" name="codTipo" required> <br>
            </div>
            
            <div class="campo"> 
            <label for="codMarca"> Código da Marca </label><br>
            <input type="text" maxlength="50" id="codMarca" name="codMarca" required> <br>
            </div>
            
            <div class="campo">
            <label for="descMarca"> Descrição </label><br>
            <input type="text" maxlength="100" id="descMarca" name="descMarca" required> <br>
            </div>
            
            
            <div class="campo">
            <button type="submit">Confirmar</button>
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
