# Práctica: [Título de la Práctica]

## Datos del Estudiante
- **Nombre:** Bryam Carchi
- **Curso:** Grupo 3 (de la tarde)
- **Fecha:** 01-07-2026

---

## 1. [Realizacion de simulacion de prueba] 
## Método A: filtrarYOrdenar
Implementación que se uso : Se utilizo un TreeSet.

Por qué se eligió: Se eligio TreeSet porque es un Set que nos ayuda a poder ordenar ya que a diferencia de del HashSet y LinkedHashSet este nos permite que no haya duplicados y poder ordenar mediante un comparador que nosotros mismos programamos.

Cómo se garantiza la unicidad: En un TreeSet al tener el comparador que al hacer las comparaciones nos dara como resultado 0 ya sea porque tengan el mismo nombre o misma edad lo tomo como duplicado y no ve la necesidad de volverlo ha añadir.

Cómo se conserva o define el orden: El orden está definido el comparador que va hacer por edad descendente y si el comparador diera como resultado 0 , pasara a ordenar de forma alfabetica

Cómo funciona la lógica: El método recibe la lista completa de numeros que tendra de umbral de edad de 20 y se ira recorriendo por el bucle for. El TreeSet se encargara de agregar cada valor y tambien se encargara de ver si es duplicado.

Método B – agruparPorRangoEdad
Implementaciones utilizadas: Se utilizó un TreeMap  y un LinkedHashSet para almacenar los nombres dentro de cada clave.

Por qué se eligieron:Ya que el ejercicio nos pide poder ordenar alfabeticamente las Claves y el TreeMap nos permite ordenar

LinkedHashSet: Porque se requeria que no haya duplicados y al mismo tiempo que se respete el orden de llegada que es una de las caracteristicas del LinkedHashSet

Cómo se garantiza la unicidad: Se encarga de verificar el `primerNombre` para asi poder insertar si ya existe no lo agrega y asi cumple con la condicion de nombre unicos.

Cómo se conserva o define el orden: El TreeMap usa el orden natural de los String y asi haciendo que las claves se ordenen en orden alfabetico

Para los valores: El LinkedHashSet mantiene una lista donde se mantiene el orden de lllegada

Cómo funciona la lógica: Primero se crea el TreeMap en donde se introduce las claves y luego se inserta las listas y se estrae del String el `primerNombre` usando el `.split` y para poder agrupar se usa las condiciones del bloque del `if`
