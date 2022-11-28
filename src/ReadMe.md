### Mash, the Fortune - Telling Game!

## Instructions: The App has a GUI user handler interface that requests 4 entries for each category and randomizes the selection 
and returns a vision of what life could be.

### Categories - Classes : 
    All Mash Category Classes share a randomizer method 
    All Mash Category Classes stores instances into sets. 
### Dream Partner Name : Instantiates an instance of a user provided name
    Stores 4 names in set 
    Has a shared method by each Category Class that randomizes the entries 

### NumberOfKids : Instantiaties an instance of each user entered value 
    Stores 4 values in set 
    Stores values provided as ints and restricts String input
    Implements shared randomizer method 

### Dream Job: Instantiates an instance of User's Dream Job entry
    Stores in 4 values set
    Implements shared randomizer method

### Dream Car:Instantiates an instance of User Provided Entry
    Stores 4 values in set

### Dream Home Environment : 
    Stores 4 values in Set 
    Exception Handling to catch any typos or 
    detect and accept different city and country formats input by user
    ex. city, country. city, state. city. country. state. mountainous state.

### UserHandler:
    Requests User's Name and Pronouns
    Provides Instructions to User as User is entering their values.
    Provides Logic to ensure user is writing exactly 3 good entries, and 1 bad entry.

### Main :
    Receives all randomized entries from each classes' set.
    Provides the User organized result repeated back with their name. 