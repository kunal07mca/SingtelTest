# SingtelTest
A. 
1. I created four interfaces: Singble, Swimmable, Flyable, Walkable to represent the behavior.
2. Duck implements Talkable and make its own sound, and implements Swimmable, flyable.
3. Chicken can't fly so not implementing flyable interface but have bird behavior.
3. Rooster is like a chicken. Rooster implements Talkable and make its own sound.
 instead of modeling, we could have a boolean flag isRooster in Chicken.
5. Parrot is having a neighbor property, and mimics the neighbor's talk behavior. So we need 
to pass neighbor property while creating a Parrot;

B. 
1. Fish only implements Swimmable.
2. Shark and ClownFish has two enum properties: size and color; Shark has a
   eat() method, ClownFish has a joke() method.
3. Dolphin implements Swimmable so no need to extends fish class.

C.

1. Parrot is not implement Singable interface but implementing flyable.
2. Caterpillar has a grow() method which transform it into a Butterfly object;

D. 
For counting, checking the animal object instanceOf an interface.

E. 

Created LanguageUtil to get the Translation and LanguageEnum for rooster. 
while creating rooster object pass the language for sing.

F.

RESTful API: 

1: The four interfaces will turn into four boolean flags in the model.
2: All animals could be queried like GET /animals.
3: Specific types can be queried like GET /animals?type=Dolphin or GET /animals?walkable=1