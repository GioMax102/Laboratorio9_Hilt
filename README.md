# Práctica 9 — Tareas con Hilt

Código de arranque de la Práctica 9 de TC2007B.

Es una app de tareas chica, con el sistema de diseño de la Práctica 7. Funciona:
al abrir, trae cuatro tareas de `ApiRemota`, un servidor simulado que tarda 1.5 s
y no necesita internet. Lo que tiene mal no se ve en la pantalla: el ViewModel
construye su repositorio y el repositorio construye su API. Por eso no hay forma
de darle otra fuente de datos sin reescribir código, y eso es el punto de partida.

Gradle todavía no tiene Hilt. Lo agregas tú, siguiendo la guía.

## Cómo empezar

1. Clona el repositorio y ábrelo en Android Studio.
2. Espera a que Gradle sincronice y corre la app: debes ver cuatro tareas.
3. Sigue la guía: https://startdroid.com/practicas/tareas-hilt.html

## Cómo trabajar

Haz un commit en cada checkpoint de la guía:

    git add -A ; git commit -m "checkpoint b4"

Si algo se rompe sin remedio, `git restore .` te regresa al último checkpoint bueno.

## Uso de IA

Todo commit con código generado por IA debe declararlo con un trailer
`Co-Authored-By`. Ver la política completa en la guía.

## Entrega

Ver la rúbrica en la guía.
