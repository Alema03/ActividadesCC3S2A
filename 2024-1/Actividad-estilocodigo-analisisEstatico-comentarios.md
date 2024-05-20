# Estilo de código

Selecciona tres elementos de la guía de estilo con los que estés de acuerdo y, para cada uno, explica por
qué. Si no hay suficientes elementos con los que estés de acuerdo, da tu mejor estimación sobre la
razón detrás de la selección (con tus propias palabras) y los beneficios que proporciona. Nota: "No hay
razón" y "No hay beneficios" no son respuestas aceptables aquí.

### **Java Style Guide (Google)**

**Elementos de la guía de estilo con los que estoy de acuerdo**

**1. Uso de indentación consistente**

Guía: En la Guía de Estilo de Google para Java, se recomienda usar dos espacios por nivel de indentación.
Razón: Una indentación consistente mejora la legibilidad del código y facilita su mantenimiento.

**Código:**
```
public class HelloWorld {
  public static void main(String[] args) {
    String greeting = "Hello, world!";
    System.out.println(greeting);
  }
}
```
**2. Longitud de línea máxima**

Guía: La Guía de Estilo de Google para Java sugiere que las líneas no deben exceder los 100 caracteres.
Razón: Mantener las líneas cortas hace que el código sea más fácil de leer y evita la necesidad de desplazamiento horizontal.

**Código:**
```
public class Rectangle {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int calculateArea() {
    return width * height;
  }
}
```
**3. Comentarios y Javadoc**

Guía: La Guía de Estilo de Google para Java enfatiza la importancia de usar Javadoc para documentar clases y métodos.
Razón: Los comentarios y Javadoc bien escritos ayudan a otros desarrolladores a entender la funcionalidad del código, lo cual es crucial para el mantenimiento y la colaboración.

**Código:**
```
/**
 * Esta clase representa un rectángulo y permite calcular su área.
 */
public class Rectangle {
  private int width;
  private int height;

  /**
   * Constructor que inicializa el ancho y alto del rectángulo.
   *
   * @param width Ancho del rectángulo.
   * @param height Alto del rectángulo.
   */
  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Calcula el área del rectángulo.
   *
   * @return El área del rectángulo.
   */
  public int calculateArea() {
    return width * height;
  }
}
```
**Elementos de la guía de estilo con los que no estoy de acuerdo**

1. **Uso obligatorio de Javadoc para cada método**
   
Guía: La Guía de Estilo de Google para Java requiere Javadoc para cada método.
Razón: Aunque Javadoc es útil, obligar su uso en métodos triviales puede ser redundante y aumentar innecesariamente el volumen de comentarios. En métodos simples, los nombres de las funciones y variables pueden ser suficientes.

**Código:**

```
public class MathUtils {
  // Método simple sin Javadoc porque su propósito es claro por el nombre y los parámetros.
  public int add(int a, int b) {
    return a + b;
  }
}
```

**2. Nombres de variables muy largos y descriptivos**

Guía: La Guía de Estilo de Google para Java recomienda nombres de variables muy descriptivos.
Razón: Nombres excesivamente largos pueden hacer que el código sea difícil de leer y manipular. En algunos casos, un nombre más corto pero significativo es preferible.

**Código:**
```
// Nombre demasiado largo y descriptivo
int numberOfElementsInTheList = list.size();

// Nombre más corto y claro
int listSize = list.size();
```
**3. Uso estricto de llaves en bloques de una sola línea**

Guía: La Guía de Estilo de Google para Java requiere siempre usar llaves, incluso para bloques de una sola línea.
Razón: En algunos casos, no usar llaves para bloques de una sola línea puede hacer que el código sea más limpio y menos voluminoso. Sin embargo, es cierto que el uso de llaves puede prevenir errores durante la expansión del código.

**Código:**
```
// Sin llaves para una sola línea
if (condition)
  doSomething();

// Con llaves, aunque sea una sola línea
if (condition) {
  doSomething();
}
```

# Análisis de código estático

Selecciona una herramienta de análisis estático bien establecida que tenga documentación en línea de
sus capacidades. Selecciona una función de la herramienta. Explica brevemente el propósito de la
función, cómo usarla y por qué es importante tener esta capacidad de análisis.
Utiliza la misma herramienta de análisis estático seleccionada para el mensaje anterior. Selecciona otra
característica de la herramienta. Explica brevemente el propósito de esta característica, cómo usarla y
por qué es importante tener esta capacidad de análisis.

### **Veracode**
![image](https://github.com/Alema03/ActividadesCC3S2A/assets/137519831/4f4f7178-ec60-42da-8bf4-121508d13923)

Documentacion: https://docs.veracode.com/
 
 - ## **Revisar fallas estáticas**
   La tarea de clasificación de fallas le permite revisar fallas estáticas en el contexto de su copia local del código fuente de la aplicación.
   
 - ## **¿Cómo usarla?**
     
   - En la pestaña Defectos de la página Defectos de clasificación, la columna Fuente contiene el prototipo de función que contiene el defecto y la ubicación aproximada en el cuerpo de la función, por porcentaje,donde ocurre el defecto.

Seleccionar uno de los defectos le permite abrir un archivo fuente como referencia. Veracode le solicita el nombre de la ruta de clase que contiene la falla.

 - ## **¿Por qué es importante?**
   
   Esta funcion es util porque nos permite mediante el análisis estático encontrar rutas de código potencialmente peligrosas en una aplicación.
   En términos generales, se dividen en dos categorías: vulnerabilidades y vulnerabilidades potenciales.
   - **Vulnerabilidades:**

     Las vulnerabilidades son debilidades explotables en la aplicación, con una ruta de código que un atacante puede encontrar y explotar para afectar la confidencialidad, la integridad o la disponibilidad de la aplicación.
     
   - **Vulnerabilidades potenciales:**

     Las vulnerabilidades potenciales representan debilidades en el código de la aplicación que pueden no ser explotadas por un atacante en este momento, ya sea porque la ruta del código es inalcanzable o porque existe algún factor mitigante en la base del código.

![image](https://github.com/Alema03/ActividadesCC3S2A/assets/137519831/2f077a11-08e5-4a5d-adb4-567429761e48)




# Comentarios y documentación

**Proyecto:** Simplex Method Implementation

**Propósito del archivo:** Este archivo contiene la implementación del método Simplex, que es un algoritmo para resolver problemas de programación lineal.

**Enlace al archivo:** https://github.com/shakil-t/Simplex-Method/blob/master/SimplexMethod.java

**¿Sigue un estándar de estilo de código?**

El archivo parece seguir algunos estándares de estilo de código comunes, pero también hay áreas donde no sigue consistentemente las mejores prácticas. No hay evidencia de un estándar formal específico (como Google Java Style Guide), pero algunos elementos sugieren que se sigue una convención general.

**Ejemplos de que no sigue un estándar de estilo de código**

**1. Falta de Espacios en los Operadores:**

Los operadores de asignación y comparación a menudo no están rodeados de espacios, lo que puede dificultar la legibilidad.
```
this.rows=numberOfConstraints+1;  // Mejorar: this.rows = numberOfConstraints + 1;
```
**2. Bloques de Código sin Llaves:**

En algunos casos, los bloques de código condicionales no usan llaves, lo cual puede conducir a errores si se agregan más líneas de código en el futuro.
```
if(this.A[i][column]>0){
    positiveValues[i]=this.A[i][column];
} else {
    positiveValues[i]=0;
    negativeCount++;
}
```
**3. Comentarios Javadoc Incompletos:**

Aunque se utilizan comentarios Javadoc, no se aplican de manera consistente a todos los métodos, y a veces son incompletos o ausentes.
```
/**
 * Calcula las razones para el pivoteo.
 *
 * @param column la columna que está entrando en la base
 * @return un array de razones
 */
private double[] ratio(int column){
    // ...
}
```
