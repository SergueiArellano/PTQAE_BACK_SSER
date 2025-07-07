#language:es

@RegresionAPI
Característica: Api Pet Store
  Yo como usuario del portal Pet Store
  Quiero ejecutar los servicios del portal
  Para agregar, consultar y actualizar mascotas del portal

  Antecedentes: Datos para ejecutar servicios
    Dado que Edelmary tiene los datos para ejecutar el servicio

  @Pet   @NewPet
  Escenario: Agregar nueva mascota

    Cuando se ejecuta el servicio para agregar una nueva mascota
    Entonces el servicio responder de manera exitosa

  @Pet   @FindByStatus
  Esquema del escenario: Buscar mascota por ID ingresado

    Cuando se ejecuta la busqueda por status <status> en servicio rest
    Entonces el servicio responder de manera exitosa

    Ejemplos:
      | status    |
      | available |
      | pending   |
      | sold      |

