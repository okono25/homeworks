package com.ua.okono;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Methods {

    public void calculateMultipleBy() {
        System.out.print("Input massive length = ");
        Scanner scanner = new Scanner(System.in);
        int masslength = scanner.nextInt();
        System.out.print("Input multiple value = ");
        int multipleValue = scanner.nextInt();
        int[] mass = new int[masslength];

        for (int i = 0; i < masslength; i++) {
            mass[i] = (int) (1 + Math.random() * 20);
        }

        System.out.println("Random math generated = " + Arrays.toString(mass));
        int sumByMultipl = 0;
        for (int j = 0; j < masslength; j++) {
            if (mass[j] % multipleValue == 0) {
                sumByMultipl += mass[j];
            }
        }
        System.out.printf("The summ of elements multiple by %d = %d", multipleValue, sumByMultipl);
    }


    public void createMassiveWithIndex0() {
        int[] mainMass = new int[]{0, 1, 0, 5, 6, 0, 0, 1, 0};
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < mainMass.length; i++) {
            if (mainMass[i] == 0) {
                resultList.add(i);
            }
        }

        System.out.print("Array of indexes for elements that equals to 0 = ");

        for (int j = 0; j < resultList.size(); j++) {
            System.out.print(resultList.get(j) + " ");
        }
    }

    public void fisrstPossitiveOrNagative(){
        int[] massive = new int[]{0,-1,2};

       for(int i=0; i < massive.length; i++){
           if(massive[i] < 0){
               System.out.println("First element is negative");
               break;
           }else if(massive[i] > 0){
               System.out.println("First element is possitive");
               break;
           }else
               continue;
       }
    }

    public void sortingAsc(){
        int[] massive = new int[]{4,1,5,4,7,0,-22,33,123};
        Arrays.sort(massive,0,massive.length);

        for(int i=0; i < massive.length-1; i++){
            if(massive[i] > massive[i+1]){
                System.out.println("Error of sorting");
               System.exit(0);
            }
        }
        System.out.println(Arrays.toString(massive) + " - massive is sorted asc");
    }

    public void pairElementsCheck(){
        int[] mass = new int[]{0,2,3,-2,5,4,1,2};
        int counter = 0;

        for (int i=0; i < mass.length; i++){
            if(mass[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println();
        int[] masspair = new int[counter];
        int counterPair = 0;

        for (int j=0; j < mass.length; j++) {
            if(mass[j] % 2 == 0){
                masspair[counterPair] = mass[j];
                counterPair++;
            }
        }
        System.out.println("Massive from pair elements = " + Arrays.toString(masspair));
    }

    public void digitReplacement(){
        System.out.print("Input massive length = ");
        Scanner scanner = new Scanner(System.in);
        int massLength = scanner.nextInt();
        int[] massRandom = new int[massLength];

        for (int i=0; i < massRandom.length; i++){
            massRandom[i] = 1 + (int)(Math.random()*10);
        }
        System.out.println("Generated massive = " + Arrays.toString(massRandom));
        System.out.print("Input element for replacement = ");
        int elementForReplacement = scanner.nextInt();

        for (int i=0; i < massRandom.length; i++) {
            if(massRandom[i] > elementForReplacement){
                massRandom[i] = elementForReplacement;
            }
        }
        System.out.println("Massive from replaced elements = " + Arrays.toString(massRandom));

    }

    public void possitiveNegativeZero(){
        int[] mass = new int[]{4,232,-3,5,3,-2,0,0, 22,33,-3433};
        System.out.println("Massive example = " + Arrays.toString(mass));
        int possitive = 0;
        int negative = 0;
        int zeroes = 0;

        for(int i=0; i < mass.length; i++){
            if(mass[i] < 0){
                negative++;
            } else if(mass[i] > 0){
              possitive++;
            } else
                zeroes++;
        }
        System.out.println("Possitive = " + possitive);
        System.out.println("Negative = "+ negative);
        System.out.println("Zeroes = " + zeroes);
    }

    public void minMaxReplacement(){
        int[] mass = new int[]{5,22,4,2,1,0};
        System.out.println("Start massive = " + Arrays.toString(mass));
        int max = 0;
        int min = 0;

        for(int i=0; i < mass.length; i++){
            if(mass[i] > max){
                max = mass[i];
            }else if(mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println("Max element = "+ max);
        System.out.println("Min element = "+ min);
        int maxIndexCounter = 0;
        int minIndexCounter = 0;

        for (int j=0; j < mass.length; j++) {
        if(mass[j] == max){
            break;
        }
        maxIndexCounter++;
        }

        for (int k=0; k < mass.length; k++) {
            if(mass[k] == min){
                break;
            }
            minIndexCounter++;
        }
        int temp = mass[maxIndexCounter];

        mass[maxIndexCounter]=mass[minIndexCounter];
        mass[minIndexCounter]=temp;
        System.out.println("Finish massive with replaced min and max element = " + Arrays.toString(mass));
    }

    public void lessthan(){
        int[] mass = new int[]{5,2,4,7,1,-1,5};
        System.out.println("Massive values = " + Arrays.toString(mass));
        System.out.print("Input value for limitation = ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int errorcount = 0;

        for (int i=0; i < mass.length; i++){
            if (mass[i] <= limit){
                System.out.print(mass[i] + " ");
            }
            else
                errorcount++;
        }

        if(errorcount == mass.length){
            System.out.println("Limitation value is less that each of massive elements");
        }
    }

    public void remainderFromDivision(){
       int[] mass = new int[]{2,5,3,4};
       System.out.println("Massive values = "+ Arrays.toString(mass));
        System.out.print("Input value for division = ");
        Scanner scanner = new Scanner(System.in);
        int divisionValue = scanner.nextInt();
        System.out.print("Input remainder = ");
        int remainder = scanner.nextInt();

        for(int i=0; i < mass.length; i++){
            if(Math.round(mass[i] % divisionValue) == remainder){
                System.out.print(mass[i] + " ");
            }
        }
    }

    public void replace(){
        int[] mass = new int[]{1,-1,3,22,5,16};
        System.out.println("Massive values = " + Arrays.toString(mass));

       for(int i=0; i < mass.length-1;)
            {
            int temp;
            temp = mass[i];
            mass[i] = mass[i+1];
            mass[i+1] = temp;
            i = i + 2;
        }
        System.out.println("Result massive = " + Arrays.toString(mass));
    }

    public void beforeZeroPrint(){
        int[] mass = new int[]{2,-1,3,8,5,0,16,2};
        System.out.println("Massive values = "+ Arrays.toString(mass));

        for(int i=0; i < mass.length; i++){
            if(mass[i] == 0){
                break;
            }else
                System.out.print(mass[i] + " ");
        }
    }

    public void minMaxPairSum(){
        int[] mass = new int[]{-1,2,0,22,-21,3,5};
        System.out.println("Massive values = "+ Arrays.toString(mass));
        int max = mass[0];
        int min = mass[1];

        for(int i=2; i < mass.length;){
            if(max <= mass[i]){
                max = mass[i];
            }
            i = i + 2;
        }

        for(int j=3; j<mass.length;){
            if(min >= mass[j]){
                min = mass[j];
            }
            j = j+2;
        }

        System.out.println("Max value of pair elements = " + max);
        System.out.println("Min value of unpaired elements= " + min);
        System.out.println("Max + Min = " + (max + min));
    }

    public void multipleBy(){
        int[] mass = new int[]{1,-22,5,34,-55,2,0,3};
        System.out.println("Massive values = " + Arrays.toString(mass));
        System.out.print("Input value = ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int counter = 0;
        int multiple = 1;

        for(int i=0; i < mass.length; i++){
            if(mass[i] > value){
                multiple = multiple * mass[i];
                counter++;
            }
        }
        if(counter > 0){
            System.out.println(multiple);
        }
        if(counter == 0){
            System.out.println("There aren't elements more than inputted value");
        }
    }

    public void modulatiry(){
        int[] mass = new int[]{-55,10,3,-12,31};
        System.out.println("Massive values = " + Arrays.toString(mass));
        int max = mass[0];

        for(int i=0; i < mass.length; i++){
            if(mass[i] > max){
                max = mass[i];
            }
        }

        for(int j=0; j < mass.length; j++){
            if(Math.abs(mass[j]) > max){
                mass[j] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    public void maxMinAbs(){
        int[] mass = new int[]{1,-7,3,-1,-22,2};
        System.out.println("Massive values = " + Arrays.toString(mass));
        int multipleNegative = 1;
        int multiplePossitive = 1;

        for(int i=0; i < mass.length; i++){
            if(mass[i] < 0){
                multipleNegative = multipleNegative * mass[i];
            }
            if(mass[i] > 0){
                multiplePossitive = multiplePossitive * mass[i];
            }
        }
        System.out.println("Multiply of negative values = " + multipleNegative);
        System.out.println("Multiply of positive values = " + multiplePossitive);
        
        if(Math.abs(multipleNegative) > Math.abs(multiplePossitive)){
            System.out.println("Negative amount is > Positive amount");
        } else if(Math.abs(multipleNegative) < Math.abs(multiplePossitive)){
            System.out.println("Positive amount is > Negative amount");
        }else{
            System.out.println("Negative amount = Positive amount");
        }



    }
}



