<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenido</title>
    <style>
        .welcome-container { text-align: center; margin-top: 50px; }
        .welcome-message { font-size: 24px; margin-bottom: 30px; }
        .module-link { 
            display: inline-block; 
            margin: 10px; 
            padding: 15px 30px; 
            background-color: #4CAF50; 
            color: white; 
            text-decoration: none; 
            border-radius: 5px; 
        }
        .module-link:hover { background-color: #45a049; }
    </style>
</head>
<body>
    <div class="welcome-container">
        <div class="welcome-message">Bienvenido al sistema de gestión</div>
        <a href="../m/Producto" class="module-link">Productos</a>
        <a href="../m/Cliente" class="module-link">Clientes</a>
    </div>
</body>
</html>