# design-patterns
Implementation of design patterns (Implementations using Java and Kotlin)

1.)Momento Pattern :  Used in managing undo feature of an application

    Design Diagram of the implementation  - In theoritacal implementation we can say
         Editor - Originator
         EditorState - Momento
         EditorHistory - Care taker
  
  ![image](https://user-images.githubusercontent.com/4921099/118596977-aabbf700-b7de-11eb-9f32-7a445e40ffb1.png)

2.)State Pattern : The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes.

    Design Diagram of the implementation  - In theoritacal implementation we can say
         Canvas - Context
         Tool - State
         BrushTool - Concrete implementation
         SelectionTool - Concrete implementation
         
  ![SelectionTool](https://user-images.githubusercontent.com/4921099/118616021-e614f080-b7f3-11eb-89e6-144c0afc89b2.PNG)
  
  
3.)Chain of responsibility Pattern : A source of command objects and a series of processing objects. It allows to crete chain of jobs
   here I took the use case of a web server
    
    Design Diagram of the implementation  - In theoritacal implementation we can say
            Webserver invokes following operations
            
            Chain of operations :
             Auth -> Logging -> Compression
              
             At any given time user remove operations from the chain. And you don't need to update Webserver class.
             This proves  SOLID
                          O -> Open for extention (Classes should open for extention and close for modifications) this is a great example for tha
                          
                          
 ![image (1)](https://user-images.githubusercontent.com/4921099/123273354-28d59100-d535-11eb-9855-999d909e2f13.png)
                         
                          
 
