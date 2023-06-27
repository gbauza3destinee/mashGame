### Mash, the Fortune - Telling Game!

## Instructions: The App has a GUI user handler interface that 
requests 4 entries for each category and randomizes the selection 
and returns a vision of what life could be.


### App :
    Integrates all Category Classes here
    Has access to create a new instance of each category instantly. 
  
### Shell:
    The console- communicates with the User Prompts/ Instructions for each entry

### UserHandler:
    TODO- The IgnoreCase and Editing Class to fix any user errors and
    count occurence of a category in a given session.


### Categories - Classes : 
    All Mash Category Classes share a randomizer method 
    All Mash Category Classes stores instances into sets. 
### Dream Partner Name : Instantiates an instance of a User provided name.
    Stores 4 names in set 
    Has a shared method by each Category Class that randomizes the entries 

### NumberOfKids : Instantiaties an instance of a User provided number. 
    Stores 4 values in set 
    Stores values provided as ints and restricts String input
    Implements shared randomizer method 

### Dream Job : Instantiates an instance of a User provided Dream Job.
    Stores in 4 values set
    Implements shared randomizer method

### Dream Car : Instantiates an instance of a User Provided Dream Car.
    Stores 4 values in set

### Dream Home Environment : Instantiates an instance of a User Provided Dream City or Country.
    Stores 4 values in Set 
    Exception Handling to catch any typos or 
    detect and accept different city and country formats input by user
    ex. city, country. city, state. city. country. state. mountainous state.

