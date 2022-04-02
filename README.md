# Jets Project

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
