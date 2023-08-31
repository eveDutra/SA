<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagamento</title>
        <link href="../styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="vertical"></div>
        <form action="incluir_pagamento.jsp" method="post" class="tela"> 
            <h1>Pagamento</h1>
            
            <div class="campo"> 
            <label for="idAluguel"> ID aluguel </label><br>
            <input type="text" id="idAluguel" name="idAluguel"> <br>
            </div>
            
            <div class="campo"> 
            <label for="idPagamento"> ID Pagamento </label><br>
            <input type="text" id="idPagamento" name="idPagamento"> <br>
            </div>
            
            <div class="campo">
            <label for="dataPagamento"> Data do Pagamento </label><br>
            <input type="text" id="datapagamento" name="datapagamento"> <br>
            </div>
            
            <div class="campo">
            <label for="tipoPagamento"> Tipo do Pagamento </label><br>
            <input type="text" id="tipoPagamento" name="tipoPagamento"> <br>
            </div>
            
            <div class="campo">
            <label for="valorPagamento"> Valor do Pagamento </label><br>
            <input type="text" id="valorPagamento" name="valorPagamento"> <br>
            </div>
            
            <div class="campo">
            <button type="submit">Incluir</button>
            <button type="reset">Cancelar</button>
           
            </div>
            
        </form>
            <div class="vertical"></div>
            <a class="voltar" href="../index.html">Voltar</a>
            
    </body>
</html>
