README.txt
SISTEMA EDUSTREAM - MANUAL DE INSTALACION

1- DESCRIPCION
EduStream es una aplicacion desarrollada en Java con Apache
NetBeans y MySQL. Utiliza JDBC y el patron DAO para acceder
a la base de datos.

2- REQUISITOS
1. Java JDK 17 o superior
2. Apache NetBeans
3. MySQL Server 8.0
4. MySQL Workbench
5. mysql-connector-j.jar

3- BASE DE DATOS
1. Abrir MySQL Workbench.
2. Conectarse al servidor MySQL.
3. En la barra de menú seleccionar:
   Server -> Data Import
4. Seleccionar la opción:
   Import from Self-Contained File
5. Buscar y seleccionar el archivo SQL del proyecto en formato .sql
6. En la opción "Default Target Schema" seleccionar la
   base de datos:
   edu_stream
7. Presionar el botón:
   Start Import
8. Actualizar el panel de las SHEMAS
9. Confirmar que existan las tablas:
   usuarios
   cursos
   inscipciones

4- ABRIR EL PROYECTO
1. Abrir NetBeans.
2. File -> Open Project.
3. Seleccionar EduStream.
4. Confirmar que existen los paquetes:
   conexion
   modelo
   dao
   principal
5. Confirmar que existen los forms:
   formEstudiante
   formLogin
   formProfesor

5- AGREGAR JDBC
Libraries -> Add JAR/Folder
Agregar mysql-connector-j.jar.

6- CONFIGURAR CONEXION
Editar Conexion.java:
URL  : jdbc:mysql://localhost:3306/edu_stream
USER : root
PASS : contraseña de MySQL

7- EJECUTAR
1. Iniciar MySQL Server.
2. Ejecutar el proyecto.
3. Si NetBeans lo solicita, elegir:
   principal.Principal

8- VERIFICACION
La instalacion es correcta cuando:
- Compila sin errores.
- Muestra 'Conexion exitosa'.
- Consulta la base de datos.

9- ERRORES FRECUENTES
- Access denied: revisar usuario y contraseña.
- Unknown database: revisar el nombre de la base.
- No suitable driver: agregar mysql-connector-j.jar.
- Communications link failure: iniciar MySQL.

10- RECOMENDACIONES
- No modificar la estructura de paquetes.
- Mantener el nombre de la base de datos.
- Verificar que MySQL este en ejecucion antes de abrir el proyecto.
