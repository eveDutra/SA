<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Veículo</title>
        <link href="../styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="vertical"></div>
        <form action="incluir_veiculo.jsp" method="post" class="tela"> 
            <h1>Cadastre o Veículo</h1>
            
             <div class="campo"> 
            <label for="idVeiculo"> ID Veículo </label><br>
            <input type="number" id="idVeiculo" name="idVeiculo"> <br>
            </div>
            
            <div class="campo"> 
            <label for="marcaVeiculo"> Marca </label><br>
            <input type="text" maxlength="30" id="marcaVeiculo" name="marcaVeiculo"> <br>
            </div>
            
            <div class="campo"> 
            <label for="modeloVeiculo"> Modelo </label><br>
            <input type="text" maxlength="30" id="modeloVeiculo" name="modeloVeiculo"> <br>
            </div>
            
            <div class="campo">
            <label for="placaVeiculo"> Placa </label><br>
            <input type="text" maxlength="12" id="placaVeiculo" name="placaVeiculo"> <br>
            </div>
            
            <div class="campo">
            <label for="corPredominante"> Cor Predominante </label><br>
            <input type="text" maxlength="12" id="corPredominante" name="corPredominante"> <br>
            </div>
            
            <div class="campo">
            <label for="anoFabricacao"> Ano </label><br>
            <input type="number" id="anoFabricacao" name="anoFabricacao"> <br>
            </div>
            
            <div class="campo">
            <label for="disponivel"> Disponível </label><br>
            <input type="checkbox" id="disponivel" name="disponivel"> <br>
            </div>
            
            <div class="campo">
            <label for="temArCondicionado"> Ar-Condicionado </label><br>
            <input type="checkbox" id="temArCondicionado" name="temArCondicionado"> <br>
            </div>
            
            <div class="campo">
            <label for="temDirHidraulica"> Direção Hidráulica </label><br>
            <input type="checkbox" id="temDirHidraulica" name="temDirHidraulica"> <br>
            </div>
            
            <div class="campo">
            <label for="revisado"> Revisado </label><br>
            <input type="checkbox" id="revisado" name="revisado"> <br>
            </div>
            
            <style>
            input[type=number]::-webkit-inner-spin-button,
            input[type=number]::-webkit-outer-spin-button {
            -webkit-appearance: none;
            margin: 0;
               }
            </style>
            
            <div class="campo">
            <button type="submit">Incluir</button>
            <button type="reset">Cancelar</button>
           
            </div>
            
        </form>
            <div class="vertical"></div>
            <a class="voltar" href="../index.html">Voltar</a>
            
    </body>
</html>
