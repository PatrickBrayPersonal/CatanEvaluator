import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class CatanEvaluatorDriver{
  public static void main(String[] args){
    int[] dotInArr = new int[19];
    int[] resourceInArr = new int[19];
    CatanTranslator translator = new CatanTranslator();
    CatanCalculator calculator = new CatanCalculator();
    CatanPrinter printer = new CatanPrinter();
    Scanner scanner = new Scanner(System.in);
    int[] tileNumberArr = new int[19];

    // Temporary
    CatanPlayer playerOne = new CatanPlayer(1);


    //***SECTION 1: TILE VALUE INPUT***

    // User Input Prompt
    System.out.println("Welcome to the Catan Evaluator! \nPress a number for a premade board or 0 for custom input");
    int choice = scanner.nextInt();

    if (choice == 1){
      int[] numInArr = {3,3,9,5,6,11,4,8,9,5,2,6,10,12,8,10,4,11,0};
      int[] tempResourceInArr = {4,2,2,4,0,2,1,3,3,0,3,0,1,1,2,0,3,4,5};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 2){
      int[] numInArr = {3,8,10,6,4,5,9,2,9,11,6,12,5,10,3,11,0,8,4};
      int[] tempResourceInArr = {2,0,1,0,0,2,3,4,3,0,3,2,2,3,4,4,5,1,1};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 3){
      int[] numInArr = {11,8,9,6,12,5,9,3,2,11,0,5,8,10,4,6,4,10,3};
      int[] tempResourceInArr = {1,2,1,4,3,2,1,0,2,3,5,4,0,3,0,0,3,2,4};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 4){
      int[] numInArr = {8,10,9,3,5,6,12,6,4,0,3,11,2,9,11,4,5,10,8};
      int[] tempResourceInArr = {0,2,3,0,1,4,3,3,2,5,2,4,4,0,2,1,3,1,0};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 5){
      int[] numInArr = {8,10,0,3,4,5,9,6,9,11,6,12,2,10,3,11,5,8,4};
      int[] tempResourceInArr = {3,1,5,4,4,3,4,1,0,0,3,2,1,2,0,0,2,2,3};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 6){
      int[] numInArr = {2,2,1,3,0,3,4,3,4,0,0,0,2,5,3,2,1,4,1};
      int[] tempResourceInArr = {};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 7){
      int[] numInArr = {8,10,9,3,4,5,0,6,9,11,6,12,2,10,3,11,5,8,4};
      int[] tempResourceInArr = {0,2,2,4,0,4,5,0,1,0,3,3,3,2,2,1,4,3,1};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 8){
      int[] numInArr = {8,10,9,3,4,5,12,6,9,11,6,11,2,10,3,4,5,0,8};
      int[] tempResourceInArr = {1,2,2,4,0,0,3,2,3,1,0,4,3,4,2,3,1,5,0};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    if (choice == 9){
      int[] numInArr = {8,10,9,3,4,5,12,6,9,11,6,11,2,10,3,4,5,0,8};
      int[] tempResourceInArr = {0,4,2,3,2,3,4,1,3,3,0,0,1,1,0,2,2,5,4};
      if (numInArr.length != 19){
        System.out.println(" ### ERROR Missing Numbers ###");
      }
      if (tempResourceInArr.length != 19){
        System.out.println(" ### ERROR Missing Resources ###");
      }
      for (int ii = 0; ii < 19; ii++){
        dotInArr[ii] = translator.numberToDots(numInArr[ii]);
        tileNumberArr[ii] = numInArr[ii];
        resourceInArr[ii] = tempResourceInArr[ii];
      }
    }
    //***SECTION 2: BOARD CREATION***

    // Create Tile and Spot References
    int[][] tileRef = new int[54][3];
    int[][] spotRef = new int[54][3];
    ReferenceMaker makeRef = new ReferenceMaker();
    tileRef = makeRef.getTileRef();
    spotRef = makeRef.getSpotRef();

    // Create Linked Lists for Tiles and Spots
    CatanLinkedTiles tls = new CatanLinkedTiles();
    CatanLinkedSpots spts = new CatanLinkedSpots();

    // Create Tile and Spot Arrays
    CatanTile[] tileArr = new CatanTile[19];
    CatanSpot[] spotArr= new CatanSpot[54];

    // Add IDs to Tile Array
    for (int ii = 0; ii<19; ii++){
      tileArr[ii] = new CatanTile(ii);
    }

    // Add IDs to Spot Array
    for (int ii = 0; ii<54; ii++){
      spotArr[ii] = new CatanSpot(ii);
    }

    // Add Data to Tiles and Create Linked List
    for (int ii = 0; ii< 19 ; ii++){
      tileArr[ii].setDots(dotInArr[ii]);
      tileArr[ii].setResource(resourceInArr[ii]);
      tls.add(tileArr[ii]);
    }

    // Create Spots Linked List
    for (int ii = 0; ii < 54 ; ii++){
      spts.add(spotArr[ii]);
    }

    // Add Data to Spot Linked List
    for (int ii = 0; ii < 54; ii++){
      int tileBorderCount = 0;
      int spotBorderCount = 0;
      for(int jj = 0; jj < 3; jj++){ // number of tile borders on each spot
        if (tileRef[ii][jj] != 19){ // 19 == null or ocean however you see it
          tileBorderCount++;
        }
      }
      for(int ll = 0; ll < 3; ll++){ // number of border spots for each spot
        if (spotRef[ii][ll] != 54){ // 54 == null or ocean
          spotBorderCount++;
        }
      }
      CatanTile[] tilesInArr = new CatanTile[tileBorderCount]; // create tiles and spots arrays
      CatanSpot[] spotsInArr = new CatanSpot[spotBorderCount];
      for (int kk = 0; kk < tileBorderCount; kk++){ // fill tiles and spots arrays
        tilesInArr[kk] = tls.find(tileRef[ii][kk]);
      }
      for (int mm = 0; mm < spotBorderCount; mm++){
        spotsInArr[mm] = spts.find(spotRef[ii][mm]);
      }
      spotArr[ii].setBorderTiles(tilesInArr);
      spotArr[ii].setBorderSpots(spotsInArr);
    }




    //***SECTION 3: TILE ANALYSIS***

    // Calcualate Dots of Each resource
    double[] totalResourceYield = new double[5];
        for (int ii = 0; ii < 19; ii++){
          if (ii == 0){
          int resource = tls.getCurrent().getResource();
            if (resource < 5){
            totalResourceYield[resource] += tls.getCurrent().getDots();
            }
          }
          else {
              int resource = tls.next().getResource();
                if (resource < 5){
                totalResourceYield[resource] += tls.getCurrent().getDots();
                }
          }
        }

      //Calculate Abundance of Each Resource
      // Abundance = yield / 11.6
      double[] abundance = new double[5];
      abundance = calculator.calculateAbundance(totalResourceYield);

      // Calculate Minimum and Maximum Abundances
      double abundanceMin = 100;
      double abundanceMax = 0;
      for (int rr = 0; rr<5; rr++){
        if (abundanceMin > abundance[rr]){
          abundanceMin = abundance[rr];
        }
        if (abundanceMax < abundance[rr]){
          abundanceMax = abundance[rr];
        }
      }

      // Calculate QTP
      // QTP = 0.5*yield+ yield / abundance
      calculator.calculateQTP(tls, abundance);

      // Sort Tiles By QTP and give top 3
      printer.printQTP(tls,19);
      //***SECTION 4: PORT ANALYSIS***



      //***SECTION 5: SPOT ANALYSIS***
      // Calculate QSP  QSP = ΣQTP(CM) + ΣQTP + QPP
      System.out.println("** Quality Spot Points **");
      calculator.calculateQSP(spts,playerOne);
      // Sort Spots by QSP and Give Top 3
      printer.printQSP(spts,10);

      //tests
      System.out.println("** TESTS **");








  }
}
