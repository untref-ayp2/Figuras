# Figuras con Excepciones

Es un ejemplo de implementación del ejercicio  04. Figuras Geométricas, parte 3

## Consigna
Crear e implementar una jerarquía de excepciones para el ejercicio de las Figuras​ ​ parte 2,con el siguiente comportamiento:
- Los constructores deben lanzar excepciones si los parámetros que reciben son
incorrectos y no pueden crear la figura.
- Realizar el diagrama de clases correspondiente y adjuntarlo junto con la resolución del ejercicio.
- Escribir un programa (usando ​ main​ ) que lea un archivo de texto, donde cada línea corresponde a una figura, con el siguiente formato:

`circulo: <valor_del_radio>,<centro_x>,<centro_y>`

`cuadrado: <vértice_izquierdo_x>,<vértice_izquierdo_y>,<valor_lado>`

`rectangulo: <vértice_izquierdo_x>,<vértice_izquierdo_y>,<valor_base>,<valor_altura>`

`elipse: <radio_menor>, <radio_mayor>,<centro_x>,<centro_y>`

`triangulo: <vértice_a_x>,<vértice_a_y>,<vértice_b_x>,<vértice_b_y>,<vértice_c_x>,<vértice_c_y>`

- El programa debe crear todas las figuras y guardarlas en un arreglo.
- En el caso del triángulo se debe validar que los tres vértices recibidos permitan trazar un
triángulo.
- Se deberán manejar todas las excepciones que puedan ocurrir en el manejo del archivo
de entrada y se debe asegurar que el archivo se cierra al finalizar.

##Implementación
El sistema se estructuró en 4 paquetes:

**figuras: ** Contiene las clases que son parte del dominio del problema.

**demo: ** Contiene un programa de ejemplo según la consigna.

**pruebas: ** Pruebas unitarias del paquete figuras.

**util: ** Paquete con herramientas útiles utilizadas en la resolución. En este caso sólo un método de ordenamiento.

##Documentación
La documentación del código fuente se encuentra en la carpeta  __doc__

