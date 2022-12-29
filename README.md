# webfkux
Projeto de estudo do Spring Boot Reativo

PlaulistController(RestController):
When we are talking about @Controller I would say that we usually will think in term of synchronous Java world: Servlets, ServletContext, ServletContainerInitializer, DispatcherServlet  etc. Even if we will return Mono from a controller to make our application reactive we still will play in terms of Servlet 3.0 specification that supports java.nio.* and running on the same servlets containers such as Jetty or Tomcat. Subsequently, here we will use corresponding design patterns and approaches for building web apps.

(Router/Handler)
RouterFunction on the other hand was inspired by the true reactive approach that originates from the async Java world - Netty and its Channel Model.
