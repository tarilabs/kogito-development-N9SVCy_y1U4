Ref https://groups.google.com/d/msg/kogito-development/N9SVCy_y1U4/aAZwm57oBAAJ

# org.kie.kogito.kogito-quarkus-archetype - 0.13.0 #

# Running

- Compile and Run

    ```
     mvn clean package quarkus:dev
    ```

# Developing

Add your business assets resources (process definition, rules, decisions) into src/main/resources.

Add your java classes (data model, utilities, services) into src/main/java.

Then just build the project and run.


# Swagger documentation

The exposed service [OpenAPI specification](https://swagger.io/docs/specification) is generated at 
[/docs/openapi.json](http://localhost:8080/docs/openapi.json).

You can visualize and interact with the generated specification using the embbeded [Swagger UI](http://localhost:8080/swagger-ui) or importing the generated specification file on [Swagger Editor](https://editor.swagger.io).

In addition client application can be easily generated from the swagger definition to interact with this service.
