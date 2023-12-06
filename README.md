# sistemaBancario
Se desea modelar el comportamiento de un conjunto de 200 personas o clientes que pueden ingresar o extraer dinero de una serie de cajeros de banco. 
ENUNCIADO
Se desea modelar el comportamiento de un conjunto de 200 personas o clientes que pueden ingresar o extraer dinero de una serie de cajeros de banco. 

Existen 4 cajeros, cada uno de ellos dispone de una cantidad inicial de 50.000€, y tiene una capacidad máxima de 100.000€. 
La operación (ingresar o extraer) y el importe que cada persona ingresará o extraerá serán determinados aleatoriamente, siendo siempre una cantidad entre 5.000€ y 10.000€, con números redondos, es decir, que sean múltiplos de millares.
El tiempo que tardará en ingresar puede variar, aleatoriamente, entre 2 y 4 segundos; mientras que en extraer dinero se tardará entre 2,5 y 4,5 segundos. 

Obviamente, cuando hay una persona operando con un cajero determinado, ninguna otra persona puede hacerlo a la vez en el mismo cajero. 

Las personas esperarán en una única cola y acudirán al primer cajero que quede libre cuando les toque su turno. Cuando un cajero se llena, habrá unos operarios que se encargarán de dejarlo a la mitad de su capacidad, es decir, dejarán 50.000€ en el cajero y extraerán los otros 50.000€, que llevarán al banco central. Si un cajero se queda sin dinero, entonces alguno de los operarios traerá 50.000€ del banco central y lo ingresará en dicho cajero. Existen 2 operarios. Los operarios tardan 3 segundos en traer el dinero del banco central e ingresarlo en el cajero; y 2 segundos en extraerlo del cajero para llevarlo al banco central. Inicialmente, el banco central dispone de 250.000€, y no tiene límite de capacidad, pero, llegado el caso, sí puede quedarse a cero (sin dinero). Si se llegara a dar el caso de que tanto el banco central como todos los cajeros estuvieran sin dinero, el sistema debería detener la simulación e informar al usuario.
CLASES
Clientes
ID único: “Persona x”, llegarán de forma escalonada (no todos a la vez)
200 personas o clientes que pueden ingresar o extraer dinero de una serie de cajeros
Cada persona ingresará o extraerá serán determinados aleatoriamente, siendo siempre una cantidad entre 5.000€ y 10.000€
El tiempo que tardará en ingresar puede variar, aleatoriamente, entre 2 y 4 segundos; mientras que en extraer dinero se tardará entre 2,5 y 4,5 segundos.
personas esperarán en una única cola y acudirán al primer cajero que quede libre cuando les toque su turno
Cajeros
4 cajeros, cada uno de ellos dispone de una cantidad inicial de 50.000€, y tiene una capacidad máxima de 100.000€. 
Cuando un cajero se llena .- Operarios extraen dinero
Si un cajero se queda sin dinero - Operarios ingresan dinero
Operarios
Operarios - ID unico: “Operario x”, nunca acaban su ejecución (a excepción de que el banco central y los cajeros se queden sin dinero), pueden esperar si no tienen que hacer nada.
Cuando un cajero se llena, habrá unos operarios que se encargarán de dejarlo a la mitad de su capacidad, es decir, dejarán 50.000€ en el cajero y extraerán los otros 50.000€, que llevarán al banco central.
Si un cajero se queda sin dinero, entonces alguno de los operarios traerá 50.000€ del banco central y lo ingresará en dicho cajero.
Los operarios tardan 3 segundos en traer el dinero del banco central e ingresarlo en el cajero; y 2 segundos en extraerlo del cajero para llevarlo al banco central

Banco central
 Inicialmente, el banco central dispone de 250.000€, y no tiene límite de capacidad, pero, llegado el caso, sí puede quedarse a cero (sin dinero). Si se llegara a dar el caso de que tanto el banco central como todos los cajeros estuvieran sin dinero, el sistema debería detener la simulación e informar al usuario.

OPERACIONES
Operaciones identificadas de tal manera: Si la “Persona5” ingresa una cantidad de 7.000€, tendrá como identificador: “Persona5-I+7000”; y si la “Persona3” extrajera una cantidad de 6.000€, tendrá como identificados “Persona3-E-6000”.
Operaciones de operarios identificadas:: “IDdelOperario-Cx+y” (en caso de ingreso en el banco central) o “IDdelOperario-Cx-y” (en caso de extracción del banco central), donde “x” es el ID del cajero, e “y” es la cantidad trasladada

CONSIDERACIONES
Tiempos de los clientes y los operarios se generarán aleatoriamente mediante las funciones random de Java
El comportamiento del sistema se guardará en un log (un fichero de texto llamado “evolucionCajeros.txt”
En la línea de dicho log deberá constar la marca de tiempo (incluyendo la fecha, la hora, el minuto y el segundo determinado en el que tuvo lugar el evento) y el evento en sí.
Se deberá incluir un botón para pausar/reanudar toda la ejecución del programa, así como dos botones independientes para pausar/reanudar a cada uno de los operarios.


