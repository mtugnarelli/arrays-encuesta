UNTreF - Algoritmos y Programación 1

# Práctica: Encuesta

## Arrays de Objectos

## Enunciado

Diseñar e implementar la clase `Encuesta` tal que:

 * Se construya a partir de un array `String` con las descripciones de las `Opciones`.

```java
        public Encuesta(String[] descripciones)
```

 * Permita sumar un voto a una `Opción` a partir de número de orden.

```java
        public void votarOpcion(int numero)
```

 * Permita conocer la descripción de una `Opción` a partir de su número de orden.

```java
        public String obtenerDescripcionDeLaOpcion(int numero)
```
 
 * Permita conocer la cantidad de votos de una `Opción` a partir de su número de orden.

 * Permita conocer la cantidad total de votos acumulados.

```java
        public int calcularVotosTotales()
```

 * Permita conocer la cantidad de votos que tiene la `Opción` más votada.


## Resolución

 * [`Encuesta`](src/Encuesta.java)
 
 * [`Opcion`](src/Opcion.java)
