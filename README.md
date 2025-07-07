# 🏨 Prueba Técnica QA Engineer Back

Este repositorio contiene la automatización de pruebas para la prueba técnica QA Engineer **Regres.in**. Utiliza **SerenityBDD**, **Selenium** con **Cucumber** y el patrón de diseño **Screenplay** para garantizar pruebas robustas y mantenibles.

## 📌 Tecnologías Usadas

- **Java 21**
- **SerenityBDD**
- **CucumberBDD**
- **SerenityRest**
- **Screenplay Pattern**
- **Gradle 8.14**

## 📁 Estructura del Proyecto

```
📦 PTQAE_SSer
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/com/certification/SergueiBack/app
|   |   |   ├── 📂 controller
│   │   │   ├── 📂 helpers
│   │   │   ├── 📂 page
│   ├── 📂 test
│   │   ├── 📂 java/com/certification/SergueiBack/runners
│   │   ├── 📂 resources/features
├── 📜 build.gradle
├── 📜 serenity.conf
├── 📜 README.md
```

## 🚀 Instalación y Configuración

### 1️⃣ Clonar repositorio
```sh
git clone git
main: CI/CD logic
```

### 2️⃣ Configurar dependencias con Gradle
```sh
gradle clean build
```

### 3️⃣ Ejecutar Pruebas

Para ejecutar pruebas desde terminal:
```sh
gradle clean test
```
Para generar reporte de Serenity:
```sh
gradle aggregate
```

## 🧪 Ejecutando Pruebas desde Tags
Puedes ejecutar pruebas especificas usando tags:
```sh
gradle test -Dcucumber.options="--tags @SampleApp"
```

## 📜  Escenarios Implementados
- **Ingreso exitoso al portal AppianCloud**
- **Acceder a la sección de desarrollo del proyecto**

Una vez son ejecutados los casos, Serenity automáticamente genera el reporte detallado de pruebas. Para ver reporte, abrir:
```sh
target/site/serenity/index.html
```

## 🛠 Mantenimiento y Contribución
1. **Crea una nueva rama para tu mejora**: `git checkout -b feature/nueva-mejora`
2. **Realiza cambios y haz commit**:`git commit -m 'Añadir nueva funcionalidad'`
3. **Sube los cambios**: `git push origin feature/nueva-mejora`
4. **Abre un Pull Request** 🛠

---

📌 **Contacto:** Para inquietudes, enviar a [serguei.arellano@gmail.com](mailto:tu.email@example.com)
