# The Zoo

This application simulates life of animals in the zoo using following rules:
* Each day every animal looses randomly one friend
  * If animal doesn't have any friend, nothing happens
* Each day every animal establishes friendship randomly with one animal
  * If animal is already a friend of all other animals, nothing happens
* Relationships are bidirectional. I.e. if **A** is a friend of **B**, then **B** is a friend of **A**
* It's possible that **A** breaks a friendship with **B** and **B** breaks a friendship with **A** at the same day. In this case the zoo loses one relationship.
* It's possible that **A** breaks a friendship with **B**; **B** breaks a friendship with **C** and **C** breaks friendship with **A** at the same day. In this case the zoo loses two relationships.

### Design notes

* `Controller` and `View` interfaces were used to allow easily support GUI or REST interface
* If we add more animals, it's better to create `Mammal` class and make `Dog` extend it instead of having `Dog` that extends `Animal` directly  
* `Zoo#breakFriendship` and `Zoo#establishFriendship` have `O(n)` complexity. It may be a problem when we have huge amount of animals in the zoo.
