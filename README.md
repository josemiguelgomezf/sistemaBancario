# sistemaBancario
Descripción:

Este repositorio contiene el código fuente de una simulación de cajeros de banco en Java. La simulación permite modelar el comportamiento de un conjunto de 200 personas o clientes que pueden ingresar o extraer dinero de una serie de cajeros.

Características:

4 cajeros, cada uno de ellos con una capacidad inicial de 50.000€.
200 personas que ingresan o extraen dinero de forma aleatoria, con cantidades entre 5.000€ y 10.000€.
Los clientes esperan en una única cola y acuden al primer cajero que quede libre cuando les toque su turno.
Los operarios se encargan de dejar los cajeros a la mitad de su capacidad cuando se llenan, o de ingresar dinero en los cajeros que se quedan sin dinero.
El banco central dispone de 250.000€, y no tiene límite de capacidad.
El sistema se detiene si tanto el banco central como todos los cajeros están sin dinero.
Operaciones:

Las operaciones de los clientes se identifican de la siguiente manera:
"PersonaX-I+Y" para una operación de ingreso, donde X es el ID de la persona y Y es la cantidad ingresada.
"PersonaX-E-Y" para una operación de extracción, donde X es el ID de la persona y Y es la cantidad extraída.
Las operaciones de los operarios se identifican de la siguiente manera:
"IDOperario-Cx+Y" para una operación de ingreso en el banco central, donde X es el ID del cajero y Y es la cantidad ingresada.
"IDOperario-Cx-Y" para una operación de extracción del banco central, donde X es el ID del cajero y Y es la cantidad extraída.
Consideraciones:

Los tiempos de los clientes y los operarios se generan aleatoriamente mediante las funciones random de Java.
El comportamiento del sistema se guarda en un log (un fichero de texto llamado "evolucionCajeros.txt").
En cada línea del log se registra la marca de tiempo del evento (fecha, hora, minuto y segundo) y el evento en sí.
Se incluye un botón para pausar/reanudar toda la ejecución del programa, así como dos botones independientes para pausar/reanudar a cada uno de los operarios.
Instalación:

Para instalar el proyecto, clone el repositorio en su ordenador:

git clone https://github.com/[su-nombre]/simulacion-cajeros-banco.git
A continuación, abra el proyecto en su IDE favorito y compile y ejecute el programa.

Uso:

Una vez que el programa se esté ejecutando, puede interactuar con él de la siguiente manera:

Para pausar/reanudar toda la ejecución del programa, haga clic en el botón correspondiente.
Para pausar/reanudar un operador en concreto, haga clic en el botón correspondiente.
Para guardar el log de eventos, haga clic en el botón "Guardar log".


