package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoons = 3;
		int numberOfRaccoonsAtDinner = 2;
		int raccoonsLeftInTheWoods = numberOfRaccoons-numberOfRaccoonsAtDinner;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int amountOfFlowers = 5;
		int amountOfBees = 3;
		int amountOfExtraFlowers = amountOfFlowers-amountOfBees;
        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int initialAmountOfPigeonsEatingBreadcrumbs = 1;
		int amountOfNewPigeons = 1;
		int totalAmountOfPigeonsEatingBreadcrumbs = initialAmountOfPigeonsEatingBreadcrumbs+amountOfNewPigeons;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int initialAmountOfOwlsSittingOnTheFence = 3;
		int newOwlsThatJoinedTheFence = 2;
		int totalOwlsSittingOnTheFence = initialAmountOfOwlsSittingOnTheFence+newOwlsThatJoinedTheFence;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int initialAmountOfBeaversWorkingOnTheirHome = 2;
		int amountOfBeaversThatWentSwimming = 1;
		int beaversLeftWorkingOnTheirHome = initialAmountOfBeaversWorkingOnTheirHome-amountOfBeaversThatWentSwimming;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int initialAmountOfToucansSittingOnTree = 2;
		int newToucansThatJoined = 1;
		int totalToucansOnTreeLimb = initialAmountOfToucansSittingOnTree+newToucansThatJoined;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTheTree = 4;
		int amountOfNuts = 2;
		int howManyMoreSquirrelsThanNuts = squirrelsInTheTree-amountOfNuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int totalQuartersHiltFound = 1;
		int totalDimesHiltFound = 1;
		int totalNickelsHiltFound = 2;
		double amountOfMoneyInQuarters = totalQuartersHiltFound*0.25;
		double amountOfMoneyInDimes = totalDimesHiltFound*0.10;
		double amountOfMoneyInNickels = totalNickelsHiltFound*0.05;
		double totalAmountOfMoneyFound =amountOfMoneyInDimes+amountOfMoneyInNickels+amountOfMoneyInQuarters;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int muffinsBakedByBriersClass = 18;
		int muffinsBakedByMacAdamsClass =20;
		int muffinsBakedByFlannerysClass = 17;
		int totalMuffinsBakedInFirstGradeClasses =muffinsBakedByBriersClass+muffinsBakedByFlannerysClass+muffinsBakedByMacAdamsClass;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double costOfYoyo = 0.24;
		double costOfWhistle = 0.14;
		double totalCostOfToys =costOfWhistle+costOfYoyo;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int amountOfLageMarshmallows = 8;
		int amountOfMiniMarshmellows = 10;
		int totalAmountOfMarshMellows = amountOfMiniMarshmellows+amountOfLageMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int amountOfSnowInInchesAtHiltsHouse = 29;
		int amountOfSnowInInchesAtBrecknockElementary = 17;
		int totalSnowAtHiltsHouseAboveElementary = amountOfSnowInInchesAtHiltsHouse-amountOfSnowInInchesAtBrecknockElementary;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double totalMoney = 10;
		double moneySpentOnToyTruck = 3;
		double moneySpentOnPencilCase = 2;
		double remainingMoneyAfterPurchase = totalMoney-(moneySpentOnToyTruck+moneySpentOnPencilCase);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int initialAmountOfMarblesJoshHas = 16;
		int amountOfMarblesLost = 7;
		int numbersOfMarblesLeftAfterLoss = initialAmountOfMarblesJoshHas-amountOfMarblesLost;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int amountOfShellsMeganWants = 25;
		int amountOfShellsMeganHas = 19;
		int amountOfShellsMeganNeeds =amountOfShellsMeganWants-amountOfShellsMeganHas;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalAmountOfBalloons = 17;
		int totalRedBalloons = 8;
		int totalGreenBalloons = totalAmountOfBalloons-totalRedBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int amountOfBooksOnShelf = 38;
		int newBooksPutOnShelf = 10;
		int totalBooksOnShelf = amountOfBooksOnShelf+newBooksPutOnShelf;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int amountOfLegsBeesHave = 6;
		int numberOfBees = 8;
		int totalBeeLegs = amountOfLegsBeesHave*numberOfBees;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int iceCreamConesWanted =2;
		double costOfIceCreamCones = 0.99;
		double costOf2Cones = iceCreamConesWanted*costOfIceCreamCones;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int amountOfRocksForHiltsBorder = 125;
		int amountOfRocksHiltHas = 64;
		int amountOfRocksHiltNeeds = amountOfRocksForHiltsBorder-amountOfRocksHiltHas;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int amountOfMarblesHiltHas = 38;
		int amountOfMarblesHiltLost = 15;
		int totalNumberOfMarbles = amountOfMarblesHiltHas-amountOfMarblesHiltLost;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int amountOfMilesForConcert = 78;
		int amountOfMileDrivenByHilt =32;
		int amountOfMilesLeftForConcert= amountOfMilesForConcert-amountOfMileDrivenByHilt;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int amountOfHoursSpentShovelingSnowOnSaturdayMorning = 1;
		int amountOfMinutesSpentShovelingSnowOnSaturdayMorning = 30+(amountOfHoursSpentShovelingSnowOnSaturdayMorning*60);
		int amountOfMinutesSpentShovelingSnowOnSaturdayEvening = 45;
		int totalMinutesSpentShovelingSnow = amountOfMinutesSpentShovelingSnowOnSaturdayMorning+amountOfMinutesSpentShovelingSnowOnSaturdayEvening;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costOfHotDogForHilt = 0.50;
		int numberOfHotDogsBoughtByHilt = 6;
		double totalCostOfHotDogsBoughtByHilt =costOfHotDogForHilt*numberOfHotDogsBoughtByHilt;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double amountOfMoneyHiltHas = 0.50;
		double costOfPencilForHilt = 0.07;
		int amountOfPencilsThatCanBeBoughtByHilt = (int) (amountOfMoneyHiltHas/costOfPencilForHilt);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeenByHilt = 33;
		int orangeButterfliesSeenByHilt = 20;
		int redButterfliesSeenByHilt = butterfliesSeenByHilt-orangeButterfliesSeenByHilt;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyHandedByKate = 1.00;
		double costOfCandyForKate = 0.54;
		double changeForKateAfterCandyBought = moneyHandedByKate-costOfCandyForKate;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesMarkHasInBackyard = 13;
		int amountOfTreesMarkWantsToPlant = 12;
		int totalTreesAfterMarkPlantsNewTrees = treesMarkHasInBackyard+amountOfTreesMarkWantsToPlant;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTillJoySeesHerGrandma = 2;
		int hoursInADay = 24;
		int hoursUntillJoySeesGrandma = daysTillJoySeesHerGrandma*hoursInADay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousinsKimHas = 4;
		int amountOfGumSheWantsToGiveEach = 5;
		int amountOfGumKimNeeds = cousinsKimHas*amountOfGumSheWantsToGiveEach;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyDanHas = 3.00;
		double priceOfCandyBar =1.00;
		double moneyDanHasLeft = moneyDanHas-priceOfCandyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int peoplePerBoat = 3;
		int totalPeopleOnTheLake = boatsOnTheLake*peoplePerBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosEllenHasInitially = 380;
		int legosEllenLost = 57;
		int legosLeftForEllen = legosEllenHasInitially-legosEllenLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsBakedByArthur = 35;
		int muffinsArthurNeedsToBake = 83;
		int muffinsLeftForArthurToBake = muffinsArthurNeedsToBake-muffinsBakedByArthur;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int crayonsWillyHas = 1400;
		int crayonsLucyHas = 290;
		int crayonsWillyHasOverLucysAmount = crayonsWillyHas-crayonsLucyHas;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersPerPage*numberOfPages;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakesAvalibleForChildren = 100;
		int childrenWhoWantCupcakes = 8;
		double equalCupcakesPerChild = (double)cupcakesAvalibleForChildren/childrenWhoWantCupcakes;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookiesMade = 47;
		int cookieAmountThatFitInJar = 6;
		int cookiesNotInJars = gingerbreadCookiesMade%cookieAmountThatFitInJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsPrepared = 59;
		int neighborsMarianHas = 8;
		int croissantsLeftForMarian = croissantsPrepared%neighborsMarianHas;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesThatFitOnTray = 12;
		int cookiesMarianNeedsToPrepare = 276;
		int traysNeededByMarian = cookiesMarianNeedsToPrepare/cookiesThatFitOnTray;

        /* Exercise 43
        43. Marian???s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizedPretzlesPrepared = 480;
		int pretzlesPerServing = 12;
		int servingsMadeByMarian = biteSizedPretzlesPrepared/pretzlesPerServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakesBakedForChildrenInOrphanage = 53;
		int cupcakesLeftAtHome = 2;
		int cupcakesNotLeftAtHome = lemonCupcakesBakedForChildrenInOrphanage-cupcakesLeftAtHome;
		int cupcakesPerBox = 3;
		int boxesNeededToGIveAwayCupcakes = cupcakesNotLeftAtHome/cupcakesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksPreparedBySusiesMom = 74;
		int carrotsPerPerson = 12;
		int carrotsLeftOverAfterBreakfast = carrotSticksPreparedBySusiesMom%carrotsPerPerson;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBearsGatheredBySusieAndSister = 98;
		int teddyBearsEachShelfHolds = 7;
		int shelvesFilledByTeddyBears = teddyBearsGatheredBySusieAndSister/teddyBearsEachShelfHolds;

        /* Exercise 47
        47. Susie???s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesOfSusiesFamily = 480;
		int picturesOfFamilyPerAlbum = 20;
		int albumsNeededForSusiesFamilyPictures = picturesOfSusiesFamily/picturesOfFamilyPerAlbum;

        /* Exercise 48
        48. Joe, Susie???s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cardSusiesBrotherHas = 94;
		int cardsThatFitInBoxes = 8;
		int boxesFilledByCards = cardSusiesBrotherHas/cardsThatFitInBoxes;
		int cardsLeftInUnfilledBox = cardSusiesBrotherHas%cardsThatFitInBoxes;

        /* Exercise 49
        49. Susie???s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksOwnedBySusiesFather = 210;
		int shelvesFatherHasForBooks = 10;
		int booksPerShelf = booksOwnedBySusiesFather/shelvesFatherHasForBooks;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissantsBakedByCristina = 17;
		int guestsCristinaHas = 7;
		double croissantsPerCristinaGuest = (double) croissantsBakedByCristina/guestsCristinaHas;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double squareFootPerHourForBill = (12*14)/2.15;
		double squareFootPerHourForJill = (12*14)/1.90;
		double squareFootNeededToBePainted = (12*14)*5;
		double hoursNeededToFinishFiveRooms = squareFootNeededToBePainted/(squareFootPerHourForBill+squareFootPerHourForJill);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" ???> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleName = "B";
		String fullName = lastName+", "+firstName+" "+middleName+".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int distanceBetweenNewYorkAndChicago = 800;
		int distanceTraveledByTrain = 537;
		int percentOfDistanceTraveled = distanceTraveledByTrain*100/distanceBetweenNewYorkAndChicago;
	}

}
