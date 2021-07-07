This is a tool for creating pet by genetically modifying commonly known animals. Base animals can be modified by size (tiny, regular, big, giant) and can be given some additional features: wings (additional or first ones), venom, claws, luminescence, fire-breathing.
Project includes 6 GoF patterns:
1. Abstract Factory (creational)
2. Builder (creational)
3. Adapter (structural)
4. Decorator (structural)
5. Iterator (behavioral)
6. Memento (behavioral)

App actions: 
Step 1. Animal factory 
The basis of the future pets are common animals - dog, cat, fish, bird, created via abstract factory (animalFactory package). 
Step 2. Pet builder 
Pets with the added features and size of choice are created with the help of builder pattern (petBuilding package).
Step 3. Food decorator
Pets are fed with the food, according to their base animal type, with addition of choice: enhanced with meat or enhanced with vegetables.
It is achieved via decorator pattern (foodDecorator package).
Step 4. Cage adapter
Pets are held in the cages, built according to the chosen size. Basic size is 'regular', with the adapter pattern cage size is enlarged or reduced.
Step 5. Pet iterator
All created pets' names are recorded and can be reached with the help of iterator (petIterator).
Step 6. Pet memento 
Pet changes are tracked and can be reverted via memento pattern (petMemento).