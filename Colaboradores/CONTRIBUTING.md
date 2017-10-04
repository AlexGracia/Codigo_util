## Contribuir a Codigo_util
En este documento se ofrecen pautas para contribuir con Codigo_util.

### Tipo de proyectos
Los proyectos representan programas, o fragmentos de programas, de consola o linea de comandos.
* Entrada datos: para pedir datos se utiliza el siguiente codigo
  ```java
  Scanner sc = new Scanner(System.in);
  String textoIntroducido = sc.next();
  ```
* Salida datos: para mostrar mensajes se utiliza el siguiente codigo
  ```java
  System.out.println("Mensaje a mostrar");
  ```

### Tareas
Para acordarnos de lo que queremos programar es bueno comentar el codigo usando la palabra reservada ```TODO```, en GitHub
tambien podemos crear un [issue](../../issues) con el label TODO.

Para abrir la ventana de las tareas en NetBeans, basta con pulsar las teclas <kbd>Ctrl</kbd>+<kbd>6</kbd>.
<br>O bien siguiendo los pasos de la siguiente imagen
<img src="Colaboradores/img/TareasNetBeans.png" width="640px" height="512px"/>

Para crear un comentario ```TODO``` en el codigo fuente, hay que escribir ```//TODO: ``` seguido de una descripcion de la tarea.

Quitar los comentarios ```TODO``` cuando ya no sean necesarios.

### Librerias
Si el proyecto necesita librerias, hay que crear una carpeta lib en el directorio del proyecto y guardar las librerias en dicha carpeta.
* NombreProyecto
  * src
  * lib
  * ...
