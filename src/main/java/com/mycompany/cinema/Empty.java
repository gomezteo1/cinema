/*La empresa de entretenimiento “¿Qué hay para ver?” es la dueña de diversos complejos de salas de cines que
hay en la ciudad. Cada complejo tiene varias salas y en cada sala se pueden proyectar varias películas en
diferentes horarios.
Un complejo tiene asociados a él un nombre, una dirección, un administrador y una lista de salas de cine que en
ningún caso supera las 10 salas. Por su lado, cada sala tiene un identificador, un valor de boleta, un tamaño
(definido en términos de la cantidad de filas y sillas por fila) y una programación que como máximo tiene 5
películas. La programación de las salas se renueva en forma semanal. Por esto, a la programación se le puede
eliminar agregar una nueva película en un horario específico (que no puede traslaparse con el horario de otra
película ya programada).
Un cliente puede ver o bien la programación de cada sala de cine o del complejo completo o puede consultar la
programación para una película específica. También, un cliente poder ver el mapa de la sala para determinar si
hay espacios para hacer o no su reserva. Adicionalmente, un cliente puede reservar un número de boletas
determinadas para una película, en una sala específica. Se debe tener en cuenta que todas las boletas reservadas
por un cliente deben hacerse en una misma fila de manera consecutiva. Cuando se hace una reserva efectiva, se
emite una boleta que tiene como información: Fecha de venta (que es el mismo día de la película), nombre del
complejo, sala en la que se proyecta la película, el nombre de la película, la hora de la función, el precio, la
calificación de la película y las sillas reservadas.
Además, cuando se consulta la programación de cada película, se puede ver el detalle de la película, esta
información incluye: el nombre en español, el año de estreno, la duración en minutos, el nombre original, el
género (drama, suspenso, terror, acción, comedia o infantil) y el país de origen. Además, una película puede estar
activa o inactiva, esto significa que si la película está activa puede ser agregada a la programación de una sala,
de lo contrario no se puede agregar. Esto quiere decir que a una película solo se le puede modificar su estado.
Para fines estadísticos, el sistema debe permitir mostrar el porcentaje de ocupación de cada película, en cada
sala, además debe permitir al administrador conocer cuánto se recaudó por venta de boletas en un día, bien sea
en una sala específica o en el complejo completo.
Opcional: La información del sistema debe ser persistente y no se debe perder cuando este se cierre.*/