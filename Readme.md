sebastian yepes padilla 

estructura y diseño de arquitectura de software para un sistema de gestión de flotas inteligente 

Análisis del problema 
el objetivo principal es desarrollar un sistema de gestión de flotas inteligente donde el cual debe de ser escalable, eficiente, y económico, el cual debo de tener varios factores clave como que este sistema va a satisfacer a diferentes industrias el cual utiliza un enfoque modular que optimiza los recursos  con un estilo arquitectónico de microservicios  donde estos permiten su escalabilidad 


Requisitos funcionales 
Seguimientos en tiempo real : monitoreo  de los vehículos en tiempo real (ubicación, velocidad, estado) la información será almacenada en un servicio aws que tendrá una capacidad determinada si la sobrepasa tomara espacio de la nube así para reducir costos 

Optimización de rutas : se calculará la ruta más óptima según su entorno utilizando una api externas como google maps para la optimización  de rutas 

Mantenimiento predictivo : alertas de mantenimiento basada en datos que arrojen los sensores, estos datos se almacenarán localmente y sincronizados cuando sea posible así se podría minimizar costos y optimizando velocidad 

Gestión de conductores : su desempeño será basado en los datos obtenidos por mantenimiento predictivo y los datos de optimización de rutas que se encargaran de mostrar que tan eficiente es conduciendo y mientras lo hace qué tan bien mantiene la integridad del vehículo  

Integración con terceros : las funcionalidades principales  estarán hechas en apis escalables facilitando la integración a futuro con otros elementos o entidades 


Requisitos tecnicos
Escalabilidad : se utilizará una infraestructura en la nube con autoescalado para ajustarse a la demanda 
Alta Disponibilidad (99.9% SLA): se utilizará uso de proveedores en la nube con SLA garantizados (AWS, GOOGLE CLOUD)
Modularidad: la implementación de microservicios escalables empezando por servicios esenciales como seguimiento en tiempo real, rutas  y alertas de mantenimiento 
Seguridad: cumplimiento con normativas de privacidad como GDPR y cifrado de datos para asegurar la privacidad de todos 
Restricciones 
presupuesto limitado: propongo que  se utilice una infraestructura en la nube y tecnologías open-source para minimizar la inversión inicial
Implementación gradual: inició con un mvp que incluya las funcionalidades críticas y de expansión gradual 
Soporte multi zona horaria y multimoneda: uso de un servicio en la nube que ofrezca un soporte global 
Desafíos adicionales  
Manejo de picos de tráfico: utilizar un balanceador de cargas por ejemplo el de amazon aws (elastic load balancer)
Sincronización en áreas con conectividad reducida: implementar un sistema híbrido que almacene datos localmente y sincronizarlos cuando haya una conectividad estable 
Diseño de interfaces para múltiples usuarios
Web para administradores
Interfaz mobile para conductores
Api para integraciones externas  

Selección de arquitectura 
Microservicios : se utilizara la implementación de microservicios por medio de una comunicación  de bus de eventos y se añadirá un api gateway para la centralización de solicitudes para simplificar el acceso a los servicios 
Patrones de diseño 
En capas: a cada capa se le puede establecer una responsabilidad bien definida lo que facilita la escalabilidad y su mantenibilidad 
Trade-offs  
Beneficios: 
modularidad 
escalabilidad
aislamiento de fallas entre servicios 

Debilidades: 
es una estructuración compleja que requiere un esfuerzo para su operabilidad 

Aplicación de los 12 factores  

código base  un único repositorio para múltiples servicios 
dependencias aislamiento mediantes contenedores docker 
configuración variables de entorno que serán gestionadas
servicios de soporte bases de datos como postgresql que permite cumplir con los requerimientos 
construcción , lanzamiento y ejecución gestión de despliegues mediantes cl/cd
procesos servicios sin estados con un estados externos
vinculación de puertos servicios que estarán expuestos mediante un api gateway
concurrencia escalado con kubernetes
descartabilidad servicios iniciados  y detenidos rapidamentes
paridad entre entornos uso de docker para mantener la consistencia 
registros centralización de logs 
procesos de administración tareas que serán gestionadas con contenedores efímeros para optimizar el rendimiento
