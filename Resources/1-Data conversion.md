<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="120"/>
</p>
<h1 align="center">✨ Java Data Conversion Cheat Sheet ✨</h1>

<p align="center">
  Quick reference for converting between <b>Strings, Integers, Doubles, Floats, Booleans, and Chars</b> in Java. 🚀
</p>
<br>

---

## 🟢 String ↔ Integer


**String → Integer**
```java
Integer.valueOf("123");   // returns Integer object
Integer.parseInt("123");  // returns int primitive
```
**Integer → String**

```java
Integer.toString(123);
String.valueOf(123);
```
---

## 🟡 Char ↔ String

**Char → String**
```java
Character.toString('a');
```
**String → Char**

```java
String s = "hello";
char c = s.charAt(0); // 'h'
```
---

## 🔵 String ↔ Double

**String → Double**
```java
Double.parseDouble("3.14");
```
**Double → String**
```java
String.valueOf(3.14);
```
---

## 🟣 String ↔ Float

**String → Float**
```java
Float.parseFloat("3.14f");
```
**Float → String**
```java
Float.toString(3.14f);
```
---

## 🔴 String ↔ Boolean

**String → Boolean**
```java
Boolean.valueOf("true");      // Boolean object
Boolean.parseBoolean("true");  // boolean primitive

```
**Boolean → String**
```java
String.valueOf(true);
Boolean.toString(true);
```
---

<p align="center"> 💡 <b>Tip:</b> Always handle <code>NumberFormatException</code> when parsing numbers from Strings to avoid runtime errors. </p>
