#Spring-MVC#

##RESTful Web Service using Spring MVC ##

This project shows a RESTful web service using Spring MVC, it has two methods:
1 returns a greting with a custom name that you send as parameter in the request.
2 returns a Json response with a custom name you send as parameter in the request.

#### Prerequisites

- Java 7
- Maven 3

#### Tools and Technologies

* JDK 1.7
* Spring 4.2.0.RELEASE
* jackson-core 2.6.0 
* Tomcat 7.0
* Maven
* Eclipse 

### Build and run
#### Configurations

Open the `properties` of the project and set your own Targeted Runtime (server).

#### From terminal

Go on the project's root folder, then type:

    $ mvn tomcat:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it on *Server*.

### Run

- Run the application and go on http://localhost:8080/restmvc/greeting/{name}
- Use the following urls to invoke interface methods using a testing tool:

  * GET operation, so that you get a response, try to go:
  `http://localhost:8080/restmvc/greeting/{name}`, where {name} it´s the name that is returned with a greeting.
    
  * POST operation, so that you get a Json response with the name you send in the request parameters, try to go:                  `http://localhost:8080/restmvc/greeting/subjects/{name}`, where {name} it´s the name that is returned like following:
{
	"studentName" : " [ name ] ” ,
	"subjectsAtSchool" : 5
}
