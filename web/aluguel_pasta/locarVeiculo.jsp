<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aluguel</title>
        <link href="../styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="vertical"></div>
        <form action="incluir_aluguel.jsp" method="post" class="tela"> 
            <h1>Aluguel</h1>
            
            <div class="campo"> 
            <label for="idAluguel"> ID Aluguel </label><br>
            <input type="text" id="idAluguel" name="idAluguel"> <br>
            </div>
            
            <div class="campo"> 
            <label for="idVeiculo"> ID Veiculo </label><br>
            <input type="text" id="idVeiculo" name="idVeiculo"> <br>
            </div>
            
            <div class="campo">
            <label for="cpfCliente"> CPF </label><br>
            <input type="text" id="cpfCliente" name="cpfCliente"> <br>
            </div>
            
            <div class="campo">
            <label for="dataAluguel"> Data de Aluguel </label><br>
            <input type="text" id="dataAluguel" name="dataAluguel"> <br>
            </div>
            
            <div class="campo">
            <label for="dataDevolucao"> Data de Devolução </label><br>
            <input type="text" id="dataDevolucao" name="dataDevolucao"> <br>
            </div>
            
            <div class="campo">
            <label for="dataEstimadaDevolucao"> Data Estimada de Devolução </label><br>
            <input type="text" id="dataEstimadaDevolucao" name="dataEstimadaDevolucao"> <br>
            </div>
            
            <div class="campo">
            <label for="pagamento"> Pagamento </label><br>
            <input type="text" id="pagamento" name="pagamento"> <br>
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
