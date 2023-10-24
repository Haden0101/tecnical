# tecnical-mount
Prueba técnica : API para aplicar un tipo de cambio a un monto

# test de funcionamiento: OK

Crear un tipo de cambio segun su prefijo y su monto.

{
    "typeCurr": "EUR",
    "mountCurr": 4.40
}
{
    "typeCurr": "PE",
    "mountCurr": 1.00
}
{
    "typeCurr": "USD",
    "mountCurr": 3.60
}
{
    "typeCurr": "CAD",
    "mountCurr": 3.25
}

Actualizar tipo de cambio segun el {id} como parametro path

{
    "typeCurr": "EUR",
    "mountCurr": 2.00
}

Listar los tipos de cambios find.


#####

# test de cambio: OK

... /tecnical/aplicar

{
  "amount": 2.0,
  "originalCurrency": "PE",
  "targetCurrency": "CAD"
}

se ingresa el monto a cambiar, se selecciona la monera, y la moneda a la que quiere cambiarse.
    el valor residual sera el tipo de cambio. 