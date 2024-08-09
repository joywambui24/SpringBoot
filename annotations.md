# Spring Boot Annotations

* @Service: It is also used at class level. It tells the Spring that class contains the business logic.
* @Controller: The @Controller is a class-level annotation. It is a specialization of @Component. It marks a class as a web request handler. It is often used to serve web pages. By default, it returns a string that indicates which route to redirect. It is mostly used with @RequestMapping annotation.
*  @Repository: It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.
*  @GetMapping: It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using:
       --@RequestMapping(method = RequestMethod.GET)
*  @PostMapping: It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates It is used instead of using:
         @RequestMapping(method = RequestMethod.POST)
*  @PutMapping: It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using:
         @RequestMapping(method = RequestMethod.PUT)
*  @DeleteMapping: It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using:
         @RequestMapping(method = RequestMethod.DELETE)
*  @PatchMapping: It maps the HTTP PATCH requests on the specific handler method. It is used instead of using:
         @RequestMapping(method = RequestMethod.PATCH)
*  @RequestBody: It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.
*  @ResponseBody: It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
*  @PathVariable: It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.
*  @RequestParam: It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.
*  @Autowired: is used for automatic dependency injection. This means that Spring will automatically provide the required dependencies for a class, without you having to manually set them up.
*  @Data:The @Data annotation in Project Lombok is a convenient shortcut that bundles several other annotations into one. When you use @Data on a class, it automatically generates:
   Getters,setters, to string(), equal() and hash code() methods 
*  @RestController: makes it easier to build web services that can handle HTTP requests and send responses in a format like JSON.
*  @Override: is used to indicate that a method in a subclass is intended to override a method in its superclass.
*
