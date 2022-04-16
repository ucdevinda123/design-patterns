# design-patterns <a href="https://www.codefactor.io/repository/github/ucdevinda123/design-patterns"><img src="https://www.codefactor.io/repository/github/ucdevinda123/design-patterns/badge" alt="CodeFactor" /></a>
Implementation of design patterns (Implementations using Java and Kotlin)

 #### 1.)Momento Pattern : 
  Used in managing undo feature of an applications
 
    Design Diagram of the implementation  - In theoritacal implementation we can say
         Editor - Originator
         EditorState - Momento
         EditorHistory - Care taker
  
  ![image](https://user-images.githubusercontent.com/4921099/118596977-aabbf700-b7de-11eb-9f32-7a445e40ffb1.png)

  *  [Java Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/momento/java/)   
  *  [Kotlin Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/momento/kotlin/)   
             
  *  [Test Case](https://github.com/ucdevinda123/design-patterns/blob/master/src/test/java/com/designpatterns/dev/behavioral/momento/)   
    


 #### 2.)State Pattern : 
 The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes.

    Design Diagram of the implementation  - In theoritacal implementation we can say
         Canvas - Context
         Tool - State
         BrushTool - Concrete implementation
         SelectionTool - Concrete implementation
         
  ![SelectionTool](https://user-images.githubusercontent.com/4921099/118616021-e614f080-b7f3-11eb-89e6-144c0afc89b2.PNG)
  
      
  *  [Java Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/state/java/)   
  *  [Kotlin Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/state/kotlin/)   
             
  *  [Test Case](https://github.com/ucdevinda123/design-patterns/blob/master/src/test/java/com/designpatterns/dev/behavioral/state/)   
    
  
 #### 3.)Chain of responsibility Pattern : 
   A source of command objects and a series of processing objects.It allows to crete chain of jobs
   here I took the use case of a web server
    
    Design Diagram of the implementation  - In theoritacal implementation we can say
            Webserver invokes following operations
            
            Chain of operations :
             Auth -> Logging -> Compression
              
             At any given time user remove operations from the chain. And you don't need to update Webserver class.
             This proves  SOLID
                          O -> Open for extention (Classes should open for extention and close for modifications) this is a great example for tha
  
 ![image (1)](https://user-images.githubusercontent.com/4921099/123273354-28d59100-d535-11eb-9855-999d909e2f13.png)
 
     
  *  [Java Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/chainofresponsibility/java/)   
  *  [Kotlin Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/chainofresponsibility/kotlin/)   
             
  *  [Test Case](https://github.com/ucdevinda123/design-patterns/blob/master/src/test/java/com/designpatterns/dev/behavioral/chainofresponsibility/)   
    
 
 #### 4.)Visitor Pattern 
   Way of separating an algorithm from an object structure on which it operates.
   Most suitable for introducing new operations to an existing platform
    
  *  [Java Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/visitor/java/)   
  *  [Kotlin Implementation](https://github.com/ucdevinda123/design-patterns/blob/main/src/main/java/com/designpatterns/dev/behavioral/visitor/kotlin/)   
            
  *  [Test Case](https://github.com/ucdevinda123/design-patterns/blob/master/src/test/java/com/designpatterns/dev/behavioral/visitor/TestVisitorPatternJava.java)   
                            
      Design Diagram of the implementation  - Let's take a Html Document as an example here
                 HtmlElement -> Interface to child html elements it has this method : execute(operation : Operations) : String
                     AnchorElement -> Child ui element
                     HeaderElement -> Child ui element  
                     
                 Operation -> Interface to apply operations to each element implements  apply(htmlElement : HtmlElement)
                     HighlightOperations -> apply(htmlElement : HtmlElement) : String
                     TextHintingOperation -> apply(htmlElement : HtmlElement) : String
                     
      This will again proves Open for extention principle. Imagine in future if you want to add a new  operation just need to add a sub classs that implements operations interface
      However in this example we can say html ui elements are more stable and we don't have infinite no of elements (We know what's the elements of tags exists) still so this pattern is more usful.                  
