# language: es

Característica: Reservas de estadias desde Booking

  Esquema del escenario: Realizar una reserva de alojamiento
    Dado que el usuario ingresa sin autenticarse en la aplicación
    Y que el usuario ingresa la información del destino: Cusco
    Y que ingresa la fecha de llegada: Dia 16 Mes November Año 2023
    Y que ingresa la fecha de retorno: Dia 30 Mes November Año 2023
    Y que ingresa ingresa el número de habitaciones 1, el número de adultos 2 y el número de niños 1, con una edad de 5 años
    Cuando el usuario realiza la búsqueda con los parametros ingresos
    Y se muestra la información y la disponibilidad del destino
    Y selecciona la segunda opción de alojamiento
    Y se realiza la reserva de la primera opción de acomodación sugerida
    Y se ingresa la información del cliente: Nombres <firsName>, Apellidos <lastName>, Email <email> y Número telefónico <phoneNumber>
    Y se ingresa la información de la ubicación: Dirección <address>, Código postal <zipCode>, Ciudad de residencia <city> y país <country>
    Y se ingresa el motivo principal del viaje: <typeTrip>
    Y se ingresa los datos para el pago de la reserva: Número de la tarjeta 4444555577771111 y la fecha de expiración: 02/25
    Entonces se completa la información de la reserva

    Ejemplos:
      | firsName  | lastName  | email            | phoneNumber  |  address            | zipCode |  city     |  country   | typeTrip |
      | Pedro     | Conga     | pedroc@email.com |  3003003000  |  Calle 90 Nro 29 15 |  50031  | Medellin  |  Colombia  |  Leisure |
