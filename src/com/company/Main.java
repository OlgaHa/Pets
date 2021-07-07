package com.company;

import com.company.animalFactory.AbstractAnimalFactory;
import com.company.animalFactory.Animal;
import com.company.animalFactory.BaseAnimalType;
import com.company.cageAdapter.Cage;
import com.company.cageAdapter.CageAdapter;
import com.company.cageAdapter.RegularCage;
import com.company.foodDecorator.EnhancedWithMeatFood;
import com.company.foodDecorator.EnhancedWithVegyFood;
import com.company.petBuilding.Pet;
import com.company.petBuilding.PetBuilder;
import com.company.petBuilding.PetFeatures;
import com.company.petBuilding.PetSize;
import com.company.foodDecorator.Food;
import com.company.foodDecorator.SimpleFood;
import com.company.petIterator.Iterator;
import com.company.petIterator.PetRepository;
import com.company.petMemento.CareTaker;

public class Main {

    public static void main(String[] args) {
        //Creating factories to produce base animals
        final AbstractAnimalFactory dogFactory = AbstractAnimalFactory.makeAnimalFactory(BaseAnimalType.DOG);
        final AbstractAnimalFactory catFactory = AbstractAnimalFactory.makeAnimalFactory(BaseAnimalType.CAT);
        final AbstractAnimalFactory birdFactory = AbstractAnimalFactory.makeAnimalFactory(BaseAnimalType.BIRD);
        final AbstractAnimalFactory fishFactory = AbstractAnimalFactory.makeAnimalFactory(BaseAnimalType.FISH);

        // Create dog based animals with dogFactory
        final Animal dog1 = dogFactory.makeAnimal();
        final Animal dog2 = dogFactory.makeAnimal();

        // Create based cat with catFactory
        final Animal cat = catFactory.makeAnimal();

        // Create bird based animals with birdFactory
        final Animal bird1 = birdFactory.makeAnimal();
        final Animal bird2 = birdFactory.makeAnimal();

        // Create fish based animals with fishFactory
        final Animal fish1 = fishFactory.makeAnimal();
        final Animal fish2 = fishFactory.makeAnimal();

        // Create a pet based on dog1
        final Pet petDog1 = PetBuilder.aPet()
                .withName("Dog One")
                .withBase(dog1)
                .withSize(PetSize.BIG)
                .withFeatures(PetFeatures.CLAWS)
                .withFeatures(PetFeatures.WINGS)
                .build();

        // Create a pet based on dog2
        final Pet petDog2 = PetBuilder.aPet()
                .withName("Dog Two")
                .withBase(dog2)
                .withSize(PetSize.GIANT)
                .withFeatures(PetFeatures.LUMINESCENCE)
                .build();

        // Create a pet based on cat
        final Pet petCat = PetBuilder.aPet()
                .withName("Kitty")
                .withBase(cat)
                .withSize(PetSize.TINY)
                .withFeatures(PetFeatures.LUMINESCENCE)
                .build();

        // Create a pet based on bird1
        final Pet petBird1 = PetBuilder.aPet()
                .withName("Bird One")
                .withBase(bird1)
                .withSize(PetSize.GIANT)
                .withFeatures(PetFeatures.CLAWS)
                .withFeatures(PetFeatures.FIRE_BREATHING)
                .build();


        // Create a pet based on bird2
        final Pet petBird2 = PetBuilder.aPet()
                .withName("Bird Two")
                .withBase(bird2)
                .withSize(PetSize.REGULAR)
                .withFeatures(PetFeatures.VENOM)
                .build();

        // Create a pet based on fish1
        final Pet petFish1 = PetBuilder.aPet()
                .withName("Fish One")
                .withBase(fish1)
                .withSize(PetSize.TINY)
                .withFeatures(PetFeatures.CLAWS)
                .build();

        // Create a pet based on fish2
        final Pet petFish2 = PetBuilder.aPet()
                .withName("Fish Two")
                .withBase(fish2)
                .withSize(PetSize.BIG)
                .withFeatures(PetFeatures.LUMINESCENCE)
                .build();


        // Printing out new pets info
        petInfo(petDog1);
        petInfo(petDog2);
        petInfo(petCat);
        petInfo(petBird1);
        petInfo(petBird2);
        petInfo(petFish1);
        petInfo(petFish2);


        //Feeding animals via foodDecorator
        System.out.print(petDog1.getName() + " will eat ");
        Food dogFood = new SimpleFood();
        dogFood = new EnhancedWithMeatFood(dogFood);
        System.out.println(dogFood.feed(petDog1.getBaseAnimal().getBaseAnimalType()));

        System.out.print(petCat.getName() + " will eat ");
        Food catFood = new SimpleFood();
        catFood = new EnhancedWithVegyFood(catFood);
        System.out.println(catFood.feed(petCat.getBaseAnimal().getBaseAnimalType()));

        System.out.print(petBird1.getName() + " will eat ");
        Food birdFood = new SimpleFood();
        System.out.println(birdFood.feed(petBird1.getBaseAnimal().getBaseAnimalType()));

        System.out.print(petFish1.getName() + " will eat ");
        Food fishFood = new SimpleFood();
        fishFood = new EnhancedWithVegyFood(fishFood);
        fishFood = new EnhancedWithMeatFood(fishFood);
        System.out.println(fishFood.feed(petFish1.getBaseAnimal().getBaseAnimalType()));

        System.out.println();


        //Creating cage sample for regular size pets
        final RegularCage regularCage = new RegularCage(2, 3, 4);
        //Creating adapter to change cages size for different animals;
        final Cage cage = new CageAdapter(regularCage);
        //Output of  different cages for different pets
        System.out.println("For " + petBird2.getName() + " " + regularCage.getRegularCage(petBird2.getPetSize()));
        System.out.println("For " + petCat.getName() + " " + cage.getTinyCage(petCat.getPetSize()));
        System.out.println("For " + petDog1.getName() + " " + cage.getBigCage(petDog1.getPetSize()));
        System.out.println("For " + petBird1.getName() + " " + cage.getGiantCage(petBird1.getPetSize()));

        System.out.println();

        //Adding created pets to the petRepository
        PetRepository petRepository = new PetRepository();
        petRepository.getPets().add(petDog1.getName());
        petRepository.getPets().add(petDog2.getName());
        petRepository.getPets().add(petCat.getName());
        petRepository.getPets().add(petBird1.getName());
        petRepository.getPets().add(petBird2.getName());
        petRepository.getPets().add(petFish1.getName());
        petRepository.getPets().add(petFish2.getName());


        Iterator iterator = petRepository.getIterator();

        // Iterator output: created pets names
        while (iterator.hasNext()) {
            System.out.println("Pet created: " + iterator.next());
        }

        System.out.println();

        // Caretaker initialization.
        CareTaker caretaker = new CareTaker();
        // Save petDog1 into stack.
        caretaker.save(petDog1);
        System.out.println("original petDog1 data:               " + petDog1);
        // Update petDog1 name
        petDog1.setName("Dog One NEW");
        // Save petDog1 into stack.
        caretaker.save(petDog1);
        // Output petDog1 changed data.
        System.out.println("Dog One data after changed name save: " + petDog1);
        //Revert petDog1 data.
        caretaker.revert(petDog1);
        caretaker.revert(petDog1);
        // Output petDog1 reverted data.
        System.out.println("Reverted to original:                     " + petDog1);
    }

    private static void petInfo(final Pet pet) {
        System.out.println(pet.toString());
        System.out.println("features: ");
        for (final PetFeatures feature : pet.getFeatures()) {
            System.out.println("    - " + feature);
        }
        System.out.println();
    }
}
