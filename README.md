# Postwork_Desarrollo_Web_Java_F3
Repositorio para almacenar los Postworks del curso Java Backend II

- **Postwork 1** 
	- Creamos el proyecto con ayuda de Spring Initializr, dentro del cual solo asignaremos la dependencia de **Spring Web**


- **Postwork 2** 
	- Creamos los paquetes de *models, controllers, presistence y service*, ademas de crear dentro de **models y controllers** los archivos correspondientes para las siguientes entidades: 
	 	- models

				1. Cliente
				2. Visita
				3. Producto
				4. Venta
				5. Etapa
		
		- controllers

				1. ClienteController
				2. VisitaController
				3. ProductoController
				4. VentaController
				5. EtapaController
	
	- Por ultimo se crean los endpoins de cada archivo de controllers, para ir viendo como funcionaran, estos solo regresan una respuesta generica.


- **Postwork 3** 
	- Agregamos en build.gradle la libreria de validator, se crean los paquetes de *handlers y builders*, dentro de handlers secrea el manejadorglobal de errores, y dentro de builders se crea RespuestaErrorBuilder. Estos manejaran los errores de las peticiones http. por ultimo en los models se agregan los atributos y a cada uno de estos las validaciones necesarias para poder crear los objetos de forma correcta.


- **Postwork 4** 
	- Dentro de handlers creamos ManejadorGlobalExcepciones el cual contendra el codigo que nos ayudara a manaejar las excepciones que se encuentren y dentro de models creamos el modelo de RespuestaError, para poder crear los errores y responder de forma correcta al cliete http.


- **Postwork 8** 
	- Se agrega dentro de builder.gradle la libreria de mockMvc y las configuraciones necesarias para poder hacer uso de restdocs y asciidoctor, ahora dentro de el siguiente directorio 'src/main/asciidoc' se crea el archivo index.adoc, el cual es la plantilla para la documentacion. en el apartado de test agregamos las anotaciones, @AutoConfigureMockMvc y @AutoConfigureRestDocs(), al final de la prueba se agrega la siguiente liniea:
	```java
	.andDo(MockMvcRestDocumentation.document("clientes/findAll"))
	```
	Con esta linea creamos la documentacion. para terminar ejecutamos asciidoctor para generar la documentacion con ayuda de la plantilla y los documentos generados por las pruebas.