# Figuras con Excepciones

## Algoritmos y Programación II - Universidad Nacional de Tres de Febrero

## Consigna
Crear e implementar una jerarquía de excepciones para el ejercicio de las Figuras parte 2, con el siguiente comportamiento:
- Los constructores deben lanzar excepciones si los parámetros que reciben son incorrectos y no pueden crear la figura.
- Realizar el diagrama de clases correspondiente y adjuntarlo junto con la resolución del ejercicio. 
- Escribir un programa (usando main)  que lea un archivo de texto, donde cada línea corresponde a una figura, con el siguiente formato:

 `circulo: <valor_del_radio>,<centro_x>,<centro_y>`
 `cuadrado: <vértice_izquierdo_x>,<vértice_izquierdo_y>,<valor_lado>`
 `rectángulo: <vértice_izquierdo_x>,<vértice_izquierdo_y>,<valor_base>, <valor_altura>`
 `elipse:<radio_menor>, <radio_mayor>,<centro_x>,<centro_y>`
 `triangulo:,<vértice_a_x>,<vértice_a_y>,<vértice_b_x>,<vértice_b_y>,<vértice_c_x>,<vértice_c_y>`
 
- El programa debe crear todas las figuras y guardarlas en un arreglo.
- En el caso del triángulo se debe validar que los tres vértices recibidos permitan trazar un triángulo.
- Se deberán manejar todas las excepciones que puedan ocurrir en el manejo del archivo de entrada y se debe asegurar que el archivo se cierra al finalizar.

## Implementación
La implementación propuesta está dividida en 4 paquetes:

**demo: ** paquete con el main y rutinas para leer y parsear el archivo de entrada.

**figuras: **paquete con las clases bases para manejar figuras en el plano cartesiano.

** pruebas: **paquete con las pruebas unitarias de las clases del módulo figuras.

**util: **paquete con métodos y rutinas de uso general. En este caso solo contiene un método genérico que ordena por burbujeo cualquier objeto *Comparable*.

## Documentación
En la carpeta **doc** se encuentra la documentación completa del código fuente generada para javadoc a partir de lso comentarios del código fuente
