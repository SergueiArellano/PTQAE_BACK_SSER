#language:es

@RepResAPI
Característica: Obtener lista de usuarios desde una API REST
Como consumidor de la API
Quiero obtener una lista de usuarios en una página específica
Para visualizar sus datos correctamente

@ListUser
Escenario: Obtener usuarios de la página 2 exitosamente
  Dado que el cliente tiene los datos para ejecutar el servicio
  Cuando el cliente realiza una petición GET para listar usuarios
  Entonces la respuesta debe tener un código de estado 200
