# Jets Project

### Week 3 - Weekend Homework Project for Skill Distillery

### Application Overview
Create a fleet of jets with different capabilities. The application will be a menu to use the jets and access information about them.

While working through the user stories, think about what classes will be needed before writing code. 

### Structure
All jets must have a `model`, `speed`, `range`, and `price` associated with them. Speed is in MPH, but your Jet can also output the speed in mach.

Jets have a `fly()` method that prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

#### Specialized Behavior
`Jet` itself is an `abstract` base class. Its purpose it to be extended by other types with different behavior.

That said, you will still have a plain vanilla Jet class. Create a `JetImpl` class - or could be named `Passenger` - that extends the base class.

Must create two interfaces of your choice for specializations of Jets. For example, `CargoCarrier` could have a `loadCargo()` method (which just prints out a message about loading cargo). `CombatReady` could have a method called `fight()`.

You will create at least two implementation classes that extend `Jet` and implement your interfaces. (The more types you have, the more interesting the project.)
* Do not structure your code so that _all_ implementation classes implement _all_ interfaces. We want Jets with different capabilities.

### UML Diagrams
For those of you that are having trouble getting started, we have provided you with a potential UML diagram [here](/UMLJets.png). (The diagram does not contain all the methods you will need.)

### User Stories

#### User Story #1
Create a `JetsApplication` with a `main` method to launch your program.

#### User Story #2
Jets are found at an `AirField`. Create the `AirField` class, which has an empty `List` of Jets.

#### User Story #3
On program startup, populate the `AirField` with at least 5 Jets of different types.

These jets must be read from a text file, where each line in the file contains data for a single `Jet` object.
* This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
* The method to parse a file into `Jet` objects should return a `List<Jet>`. Its parameter can be a `String` file name.
  * Remember to use `String.split(regex)` to break each line in the file into data to create an individual jet.

#### User Story #4
There is a menu with these options:
1. List fleet
1. Fly all jets
1. View fastest jet  
1. View jet with longest range  
1. _Load all Cargo Jets_
1. _Dogfight!_
1. Add a jet to Fleet
1. Remove a jet from Fleet
1. Quit

#### User Story #5
List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).

#### User Story #6
Fly all Jets calls the `fly()` method on the entire fleet of jets. `fly()` prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

#### User Story #7
The view fastest jet and longest range options both print out all of the information about a jet.
* Note: these methods must _search_ the collection of jets to find the appropriate jet.

#### User Story #8
The user is presented with an option specific to the interfaces you created. For example, _Load all Cargo Jets_, above, finds all implementors of the `CargoCarrier` interface and calls `loadCargo()` on each. (Note that the menu text is italicized because your options may be different, depending on your interfaces.)

#### User Story #9
A user can add custom jets to the fleet.
* This can be a `JetImpl` aka `Passenger`.
* `Stretch Goal`: This leads to a sub-menu where the user chooses the type of Jet.

Users then enter information for the Jet, and it is added to the `AirField`.

#### User Story #10
A user can remove a jet from the fleet.
* The user is presented with a sub-menu to select a jet to delete by number.
* Stretch Goal: a user can remove a jet (or jets) by name.

#### User Story #11
Quit exits the program. 

### How To Run The Program

* It is assumed the user has an IDE, such as Eclipse. 
* Download and install the .java file to local Eclipse workspace.
* Run the program

	* At the main menu, enter an integer number corresponding to one of the menu options.
	* Follow any prompts at sub-menus and enter the expected inputs.
		

### Technologies / Skills Used 

* Java
* Eclipse
* git 
* GitHub 
* Slack
* Zoom  

### Lessons Learned 

* Commit and push frequently - a practice I began on the previous weekend projects which helped me a lot on this project