A continuación, se listan los ejemplos prácticos y algunas claves para recordar o enlazar la puesta en práctica

springbasics 1 .- El Contexto, la Inversión de Control y la utilización de Spring en entornos JSE
springbasics 2 .- La Inyección de Dependecias mediante la configuración del contexto en entornos JEE
restfulljpa .- Uso Integrado de Hibernate y Spring, en la construcción de una capa de servicios REST
springbasics 9 .- Cóm osubir varios ficheros de "una tacada" y cómo devolver un pojo-XML (Perro) como respuesta 
aopsample .- Cómo defino Aspectos y creo y empleo mis propias anotaciones
springbasics 5 .- Validaciones, Internacionalización y Localización
testingbasico .- Uso combinado de JUNIT, MOCKITO y extensiones propias de SPRING para el desarrollo de TDD
salamanca .- Parte SERVIDORA del servicio RMI
clienteremoting .- Parte CLIENTE del anteriorio servicio y cómo realizar TAREAS PROGRAMADAS

EXTRA Origen Cruzado (Sólo visto en algunas ediciones)

Problema: tengo un servicio web en mi servidor local (p ej; restfulljpa). 
Desde la web http://www.hrsanroque.com/nomeva.html se consume ese servicio.
Al ser la petición de un origen distinto y HACERSE POR JAVASCRIPT, NO ME DEJA POR DEFECTO
(El servidor localhost bloque la petición. SOlución: Uso de la anotación @CrossOrigin(origins = "http://localhost:9000")
en los métodos del Controller

	
