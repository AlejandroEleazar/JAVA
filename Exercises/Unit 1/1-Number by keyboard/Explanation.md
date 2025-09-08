<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java Logo" width="200"/>
</p>

<br>


<h1 align="center">Number by keyboard</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge&logo=starship&logoColor=white" alt="difficulty"/>
</p>

<p align="center">
  ⭐☆☆☆☆
</p>

---


# Statement

**Description**

Design a program that asks the user to enter a number and then displays it.

**Example**

```
Enter a number: 7 // Input
You enter: 7 // Output
```
---

# Explanation

Este problema tiene varias formas de resolverse, ya que el enunciado es muy ambiguo y da paso a multiples interpretaciones segun los conocimientos de programación que uno tenga. Al ser un ejercicio basico podriamos seguir al pie de la letra y hacer un programa que pida una entrada y luego la muestro sin tener encuenta excepciones. En este ejemplo lo voy a realizar tanto manejando excepciones como sin manejarlas.

**Sin manejo de excepciones**

En este caso como no vamos a manejar excepciones solo tendremos que dividir el problema en dos partes: 
1. Perdir el input al usuario
2. Mostrarlo

En java tenemos dos librerias principales para pedir inputs `Scanner` y `JOptionPane`. En este ejemplo para simplificarlo aun mas voy a usar Scanner para hacer todo a traves de la terminal. 

>[!Tip]
>Libreria Scanner: Java.util.scanner

***1-Pedir input***

1. Importaremos la libreria
```
Import Java.util.scanner;
```
2. Inicializamos el Scanner
```
Scanner sc = new Scanner(System.in);
```
3. Pedimos al usuario que introduzca un numero
```
System.out.print("Enter a number: ");
```
4. Almacenamos el input
```
int num = sc.nextInt();
```

***2-Mostrar***

1. Lo mostramos por pantalla
```
System.out.println("Your number: " + num);
```

>[!Warning]
>En caso de que el usuario introduzca un caracter que no sea un numero dara una excepcion

**Con manejo de excepciones**

---
