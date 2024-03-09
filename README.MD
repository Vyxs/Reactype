# Reactive-Type
La librairie Reactive-Type est une bibliothèque Kotlin qui fournit des types réactifs pour gérer les valeurs mutables et immuables de manière réactive. Elle permet de créer des objets dont la valeur peut être mise à jour de manière dynamique et de réagir aux changements de ces valeurs.

## Description
La librairie Reactive-Type fournit une infrastructure pour gérer des valeurs mutables et immuables de manière réactive. Elle propose une abstraction autour des valeurs qui peuvent être mises à jour et réagir à ces mises à jour.

Elle permet de créer des types de données réactifs, où la valeur peut être modifiée dynamiquement. Ces valeurs réactives peuvent être utilisées dans divers scénarios, tels que la programmation réactive et la mise en œuvre de flux de données.

## Fonctionnalités Principales
**Création de types réactifs**

La bibliothèque permet de créer des types réactifs à l'aide des classes MutableReactiveType et ImmutableReactiveType. Les valeurs de ces types peuvent être mises à jour dynamiquement.

```kotlin
// Création d'un type réactif mutable pour un entier
val reactiveInt = int(5)

// Création d'un type réactif mutable pour une chaîne de caractères
val reactiveString = string("Hello, World!")

```

**Opérations arithmétiques sur les types réactifs**

Elle offre des opérations arithmétiques sur les types réactifs tels que l'addition, la soustraction, la multiplication et la division. Ces opérations sont réactives et répercutent les changements de valeur sur les résultats.

```kotlin
// Addition de deux valeurs réactives
val result = reactiveInt + 10

// Soustraction de deux valeurs réactives
val result = reactiveInt - 3

// Multiplication de deux valeurs réactives
val result = reactiveInt * 2

// Division de deux valeurs réactives
val result = reactiveInt / 3

// Cas un peu plus complexe
val a = int(5)
val b = string("Hello")
val c = b * c // c est de type ReactiveType<String> et sa valeur est "HelloHelloHelloHelloHello"
```

**Réaction aux changements de valeurs**

La librairie permet de réagir aux changements de valeurs des types réactifs. Les valeurs réactives peuvent être surveillées pour détecter les changements et déclencher des actions en conséquence.

```kotlin
// Définir une réaction à un changement de valeur
reactiveInt.subscribe { newValue ->
    println("La nouvelle valeur de reactiveInt est : $newValue")
}

// Modifier la valeur réactive, déclenchant ainsi la réaction
reactiveInt.value = 10


// Autre exemple
val a = vec(2f, 2f)
val b = vec(1f, 1f)
val c = a + b

// c est de type ReactiveType<Vec2> et sa valeur est Vector(3f, 3f)
println(c) 

a.x = 3f

// La valeur de c a changé et est maintenant Vector(4f, 3f)
println(c) 
```

Types réactifs pour différents types de données

Elle propose une variété de types réactifs pour différents types de données, tels que les entiers, les flottants, les chaînes de caractères, les vecteurs, les couleurs, etc. Ces types réactifs peuvent être utilisés dans divers contextes pour faciliter la gestion dynamique des données.

```kotlin
// Création d'un type réactif mutable pour un vecteur de coordonnées
val reactiveVector = vec(3.0, 4.0)

// Opérations arithmétiques sur les vecteurs réactifs
val sum = reactiveVector + vec(1.0, 2.0)
val difference = reactiveVector - vec(1.0, 2.0)
val scaled = reactiveVector * 2.0
val divided = reactiveVector / 2.0
```

Ceci est une description générale de la bibliothèque Reactive-Type et de ses fonctionnalités principales. Pour des détails sur l'utilisation de la bibliothèque, consultez la documentation.


Generated with AutoReadme-1.1.0