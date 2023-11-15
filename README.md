# bddMobilTestYape
Reto de automatización de APP mobile para Yape

## Introducción 🚀

Pruebas automatizadas mobile de la aplicación Booking.com.

## Plan de Pruebas 📋
#1- Se diseño un escenarios en donde se le pueden modificar los parámetros, con respecto a las fechas y la información adicional para la acomodación que prefiera el cliente, la información del usuario se manejo por medio de "Examples", de está forma se puedan agregar más registro (Filas) 
con el finde de tener más cobertura, con esto se cubre varios escenarios Happy Paths y UnHappy Paths.

#2- Se logró una gran cobertura de pruebas, ya que los escenarios permiten modificar la gran mayoría de la información de entrada.

#3- RECOMENDACIONES:
  - Se debe instalar una dispositivo virtual de Android Studio para realizar la prueba, si se desea utilizar un dispositivo fisico solo basta con agregar la información en el archivo serenity.properties (Pixel 5 o superior)
  - El distema operativo de Adroid debe ser 8.1 o superior.
  - Se recomienda instalar la aplicación primero en el dispositivo antes de iniciar las pruebas, con el fin de ahorrar tiempo de ejecución. (https://drive.google.com/file/d/1ruY_5qcqWlsE3-W3rgXpFyyMiO59wFUc/view?usp=sharing)

4- Las herramientas y técnicas utilizadas para realizar la automatización de la funcionalidad se describen a continuación:

## Prerequisitos para la ejecución 📋

Java version 1.8, update 361 or higher and JDK (set of environment variables).
IntelliJ IDEA (version 2023 or higher).
Gradle version 8.0 or higher (set of environment variables).
Cucumber for Java Plugin (updated version).
Gherkin plugin (updated version).

## Instalación 🔧

Para clonar este repositorio localmente, se debe ejecutar el siguiente comando: git clone https://github.com/HugoCaVe/bddMobilTestYape
IntelliJ IDE bajo la estructura de un proyecto Gradle existente.
Configurar la librería del sistema JRE con JavaSE-1.8.

## Compilar el proyecto 🔨

Para construir el proyecto se debe ejecutar el comando: gradle clean build -x test

## Comando para la ejecución 💻

El proyecto se puede ejecutar desde la consola con el siguiente comando: gradle clean test aggregate

## Construido con 🛠

POM - Page Object Model
BDD - Development strategy
Gradle - Dependency manager
Cucumber - Framework to automate BDD tests
Serenity BDD - Open source library for report generation
Gherkin - Business Readable DSL Language (Business-readable domain specific language)

## Versionamiento 📌

Se utilizó Git para el control de versiones 🔀

## Autor 👨

Hugo Cardenas - hugolp8@gmail.com

