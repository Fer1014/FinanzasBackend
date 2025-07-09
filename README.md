markdown
# Finanzas Backend

Proyecto backend desarrollado en **Java** con **Spring Boot** y **Maven** para la gestión de instrumentos financieros como bonos, monedas, tasas de interés, frecuencias de cupón, entre otros.

## Características

- API REST para la administración de entidades financieras.
- Arquitectura basada en controladores, servicios, repositorios y DTOs.
- Integración con base de datos relacional (PostgreSQL).
- Uso de Lombok para reducir código repetitivo.
- Control de errores y validaciones básicas.

## Estructura del Proyecto

- `controllers`: Exponen los endpoints REST.
- `serviceinterfaces` y `serviceimplements`: Lógica de negocio y contratos de servicios.
- `entities`: Modelos de datos mapeados a la base de datos.
- `dtos`: Objetos de transferencia de datos.
- `repositories`: Acceso a datos con Spring Data JPA.

## Tecnologías

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- Lombok
- PostgreSQL

## Ejecución

1. Clona el repositorio.
2. Configura la conexión a la base de datos en `application.properties`.
3. Ejecuta el proyecto con Maven:
4. Accede a los endpoints en `/api/*`.

## Autores

- Equipo de desarrollo UPC - Grupo 2 Finanzas