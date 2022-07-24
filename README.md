Coverage: 63.4%
Link to presentation within Documentation Folder
# IMS Project

A basic Inventory Management System implimenting JDBC.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

In order to use this project on your local machine, an up-to-date version of Java must be installed, along with Maven for building the project.

### Installing

A step by step series of examples that tell you how to get a development env running

Once the machine you are using has Java, Maven and MYSQL installed (with a local server running), the repo should be either forked or cloned to your own machine, and then mvn clean package should be ran to create a new JAR file which can then be executed from a terminal.

Alternatively the project folder can be imported into an IDE of your choice, I use Eclipse, and from there you can continue developing the application. If this is your inteded purpose I would ask that you fork the repo instead of cloning.

## Running the tests

There are tests implimented within the test folders of the project, the files within directly correlate to specific classes, and are used to ensure that the methods being users are funtional and will not run into any issues during runtime. To run these yourself, when within an IDE you can run the test folders as a JUnit test, and the tests will begin to run, with any error/failures being displayed. Alternatively, when you run Maven it will flag any test failures.

### Unit Tests 

Unit Tests are used here to test specific isolated methods. Tests in this regard are not sequential and just ensure that the method works on its own.

![image](https://user-images.githubusercontent.com/107627845/180637950-7a3bddde-73af-454e-af37-0f99f408873e.png)

the test shown here, tests the CustomerDAO Create() method. It does this by utilising the full functionality of the method, without relying on another method to pass it any arguments. In this instance the create method is called, using a constructor which takes three arguments, and is then checked using assertEquals, that the object has infact been created and matches the expected outcome of the method.


### Integration Tests 
Integration tests are used to test how multiple parts of a system work together, as such it tests how methods integrate with eachother, often times with two or more being used within a single test.

![image](https://user-images.githubusercontent.com/107627845/180638110-d5957def-f89b-4094-bdea-5acd22431885.png)

In the above example of an integration test, a List of Customers is initialised, followed by a new customer being made utilising the create() method, this newly made object is then added to the ArrayList. Mockito is used when calling the readAll() method, and is given an expected outcome, which it will compare to the actual outcome of the test, again using assertEquals to ensure the expected and actual outputs are the same. Mockito then verifies this to pass or fail the test. 


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* Eclipse - IDE
* JUnit - Testing suite
* MySQL - Database Services

## Versioning
Versioning all done through the use of Git and semi successfully utilising the Feature Branch Model.

## Authors

* **Jordan Harrison* - *Initial work* - [JHarry444](https://github.com/JHarry444)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Edward Reynolds for top tier teaching and assistance
* Jordan Harrison for explaining complex concepts to a level a 5 year old could understand.
* Andrew McCall for seemlingly knowing how to solve any problem.

