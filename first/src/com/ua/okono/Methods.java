package com.ua.okono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    /**
     * Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @return
     */
    public int calculateMultipleBy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length for random massive = ");
        int randomMassiveLength = scanner.nextInt();
        int[] copy = Arrays.copyOf(randomMassive(randomMassiveLength),randomMassiveLength);
        System.out.print("Random massive generated = ");
        massPrintByString(copy);
        System.out.print("Input multiple value = ");
        int multipleByValue = scanner.nextInt();
        int sumByMultipl = 0;

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] % multipleByValue == 0) {
                sumByMultipl += copy[i];
            }
        }
        System.out.printf("The summ of elements multiple by %d = %d", multipleByValue, sumByMultipl);
        return sumByMultipl;
    }

    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by list
     * @param index
     */
    public void createMassiveFromIndexList(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length for random list = ");
        int randomListLength = scanner.nextInt();
        System.out.print("Random list generated = ");
        ArrayList<Integer> list = new ArrayList<>(randomList(randomListLength));
        printByBruteForce(list);
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == index) {
                result.add(i);
            }
        }
        if(result.size() > 0) {
            System.out.printf("Array of indexes for elements that equals to %d = ", index);
            printByBruteForce(result);
        }else
            System.out.printf("No elements found that equals to %d ",index);
    }

    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by Array
     * @param index
     */
    public void createMassiveFromIndexMassive(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length for random massive = ");
        int randomMassiveLength = scanner.nextInt();
        System.out.print("Random massive generated = ");
        int[] mass = randomMassive(randomMassiveLength);
        printByBruteForce(mass);
        int count=0;

        for(int i=0; i < mass.length; i++){
               if(mass[i] == index){
                   count++;
               }
        }
        int[] result = new int[count];
        int counter = 0;

        for (int j = 0; j < mass.length; j++) {
            if (mass[j] == index) {
                result[counter] = j;
                counter++;
            }
        }
        System.out.println();
        if (result.length > 0) {
            System.out.printf("Array of indexes for elements that equals to %d = ",index);
            printByBruteForce(result);
        }else
            System.out.printf("No elements found that equals to %d ",index);
    }

    /**
     * Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     *  встречается раньше – положительное или отрицательное.
     * @param length
     */
    public void firstPositiveOrNegative(int length){
        int[] massive = randomMassive(length);
        System.out.print("Random massive generated = ");
        massPrintByString(massive);

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

    /**
     * Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param length
     * @return
     */
    public int[] isSortingAsc(int length){
        int[] massive = randomMassive(length);
        System.out.print("Random massive generated = ");
        massPrintByString(massive);
        Arrays.sort(massive,0,massive.length); //comment this line for result changes
        int errorcounter = 0;

        for(int i=0; i < massive.length-1; i++){
            if(massive[i] > massive[i+1]){
                errorcounter++;
            }
        }
        if(errorcounter > 0){
            System.out.print("Massive isn't sorted asc - ");
        }else
        System.out.print("Massive is sorted asc - ");
        massPrintByString(massive);
        return massive;
    }

    /**
     * Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     * сообщение об этом факте.
     */
    public int[] pairElementsCheck(){
        int[] mass = randomMassive(6);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        int counter = 0;

        for (int i=0; i < mass.length; i++){
            if(mass[i] % 2 == 0 && mass[i]!=0){
                counter++;
            }
        }
        int[] masspair = new int[counter];
        int counterPair = 0;

        for (int j=0; j < mass.length; j++) {
            if(mass[j] % 2 == 0 && mass[j]!=0){
                masspair[counterPair] = mass[j];
                counterPair++;
            }
        }
        if(counter == 0){
            System.out.println("There aren't pair elements");
        }else
            System.out.print("Massive from pair elements = ");
        massPrintByString(masspair);
        return masspair;

    }

    /**
     *Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     * количество замен.
     * @param length
     * @return
     */
    public int[] digitReplacement(int length){
        Scanner scanner = new Scanner(System.in);
        int[] massRandom = randomMassive(length);
        System.out.print("Random massive generated = ");
        massPrintByString(massRandom);
        System.out.print("Input element for replacement = ");
        int elementForReplacement = scanner.nextInt();

        for (int i=0; i < massRandom.length; i++) {
            if(massRandom[i] > elementForReplacement){
                massRandom[i] = elementForReplacement;
            }
        }
        System.out.println("Massive from replaced elements = ");
        massPrintByString(massRandom);
        return massRandom;
    }

    /**
     * Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     * элементов.
     * @param length
     */
    public void positiveNegativeZero(int length){
        int[] mass = randomMassive(length);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
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
        System.out.println("Positive digits= " + possitive);
        System.out.println("Negative digits= "+ negative);
        System.out.println("Zeroes digits= " + zeroes);
    }

    /**
     * Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param length
     * @return
     */
    public int[] minMaxReplacement(int length){
        int[] mass = randomMassive(length);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        int max = mass[0];
        int min = mass[0];

        for(int i=0; i < mass.length; i++){
            if(mass[i] > max){
                max = mass[i];
            }else if(mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println("Max element = " + max);
        System.out.println("Min element = " + min);
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
        mass[maxIndexCounter] = mass[minIndexCounter];
        mass[minIndexCounter] = temp;
        System.out.print("Finish massive with replaced min and max element = ");
        massPrintByString(mass);
        return mass;
    }

    /**
     * Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param lengthMass
     * @param valueLimitation
     */
    public void lessThanValue(int lengthMass, int valueLimitation){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        System.out.println("Value for limitation = " + valueLimitation);
        int errorCount = 0;

        for (int i=0; i < mass.length; i++){
            if (mass[i] <= valueLimitation){
                System.out.print(mass[i] + " ");
            }
            else
                errorCount++;
        }
        if(errorCount == mass.length){
            System.out.println("Limitation value is less that each of massive elements");
        }
    }

    /**
     * Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     * @param lengthMass
     * @param divisionValue
     * @param remainder
     * @return
     */
    public int[] remainderFromDivision(int lengthMass, int divisionValue, int remainder){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        int counter = 0;

        for(int i=0; i < mass.length; i++){
            if(Math.round(mass[i] % divisionValue) == remainder){
               counter++;
            }
        }
        int[] result = new int[counter];
        int counter2 = 0;

        for(int i=0; i < mass.length; i++){
            if(Math.round(mass[i] % divisionValue) == remainder){
               result[counter2] = mass[i];
                counter2++;
            }
        }
        if(counter == 0){
            System.out.printf("There aren't values where remainder from divider %d = %d",divisionValue,remainder);
        }else
            System.out.println("Result massive = ");
            massPrintByString(result);
            return result;
    }

    /**
     * Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param lengthMass
     * @return
     */
    public int[] replace(int lengthMass){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);

        for(int i=0; i < mass.length-1;)
            {
            int temp;
            temp = mass[i];
            mass[i] = mass[i+1];
            mass[i+1] = temp;
            i = i + 2;
        }
        System.out.println("Result massive = " + Arrays.toString(mass));
        return mass;
    }

    /**
     * Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно
     * до нуля.
     */
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

    /**
     * Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     * @param lengthMass
     */
    public void minMaxPairSum(int lengthMass){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
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

    /**
     * Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше
     * заданного числа М. Если таких нет, то выдать сообщение об этом.
     * @param lengthMass
     * @param value
     * @return
     */
    public int multipleBy(int lengthMass,int value){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
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
            return multiple;
        }else
            System.out.printf("There aren't elements more than inputted value %d",value);
            return -1;
    }

    /**
     * 16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
     * по модулю больше максимального числа (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})
     * @param lengthMass
     */
    public int[] modularity(int lengthMass){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        int max = mass[0];

        for(int i=0; i < mass.length; i++){
            if(mass[i] > max){
                max = mass[i];
            }
        }
        System.out.println("Max value = " + max);

        for(int j=0; j < mass.length; j++){
            if(Math.abs(mass[j]) > max){
                mass[j] = 0;
            }
        }
        System.out.print("Result massive = ");
        massPrintByString(mass);
        return mass;
    }

    /**
     * Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение
     * отрицательных элементов P 1  и произведение положительных элементов Р 2 . Сравнить модуль Р 2  с
     * модулем Р 1  и указать, какое из произведений по модулю больше.
      * @param lengthMass
     */
    public void maxMinAbs(int lengthMass){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);
        int multipleNegative = 1;
        int multiplePossitive = 1;
        int counterFor1 = 0;

        for(int i=0; i < mass.length; i++){
            if(mass[i] < 0){
                multipleNegative = multipleNegative * mass[i];
            }
            if(mass[i] > 0){
                multiplePossitive = multiplePossitive * mass[i];
                counterFor1++;
            }
        }
        if(multipleNegative == 1){
            multipleNegative = 0;
        }
        if(counterFor1 == 0){
            multiplePossitive = 0;
        }
        System.out.println("Multiply of negative values = " + multipleNegative);
        System.out.println("Multiply of positive values = " + multiplePossitive);
        if(Math.abs(multipleNegative) > Math.abs(multiplePossitive)){
            System.out.println("Negative amount is > Positive amount");
        } else if(Math.abs(multipleNegative) < Math.abs(multiplePossitive)){
            System.out.println("Positive amount is > Negative amount");
        }else if(Math.abs(multipleNegative) == Math.abs(multiplePossitive)){
            System.out.println("Negative amount = Positive amount");
        }
    }

    /**
     * Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и
     * заменить его нулем.
     * @param lengthMass
     */
    public int[] firstMax(int lengthMass){
        int[] mass = randomMassive(lengthMass);
        System.out.print("Random massive generated = ");
        massPrintByString(mass);

        for(int i=0; i<mass.length; i++){
            if(mass[i] > mass[i+1]){
                mass[i]=0;
                break;
            }else if(mass[i] < mass[i+1]){
                mass[i+1] = 0;
                break;
            }
        }
        System.out.println("Result massive = ");
        massPrintByString(mass);
        return mass;
    }

    /**
     * Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k.
     * @return
     */
    public int[] lastElement(){
        int[] mass = new int[]{0,2,3,54,1,101,2,111,3,12,110,0};
        System.out.println("Massive values = " + Arrays.toString(mass));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value for matching = ");
        String matching = scanner.nextLine();
        String[] str = new String[mass.length];

        for(int i=0; i < mass.length; i++){
            str[i] = Integer.toString(mass[i]);
        }
        int lengthForFinalMassive=str.length;

        for(int j=0; j < str.length; j++){
            if(str[j].lastIndexOf(matching) != str[j].length()-1){
                str[j] = "-";
                lengthForFinalMassive--;
            }
        }
        System.out.println("Elements selection = " + Arrays.toString(str));
        int[] finalMassive = new int[lengthForFinalMassive];
        int j=0;

        for(int i=0; i < finalMassive.length; i++) {
            for (; j < str.length; ) {
               if (!str[j].equals("-")) {
                   finalMassive[i] = Integer.parseInt(str[j]);
                   j++;
                   break;
               }
               j++;
           }
       }
        System.out.print("Result massive = ");
        massPrintByString(finalMassive);
        return finalMassive;
    }

    private int[] randomMassive(int length){
        int[] massive = new int[length];
        for(int i=0; i<massive.length; i++){
            massive[i] = (int)(-3 + (Math.random()* 12));
        }
        return massive;
    }

    private ArrayList<Integer> randomList(int listLength){
        ArrayList<Integer> list = new ArrayList<>(listLength);
        for(int i=0; i<listLength; i++){
            list.add((int)(Math.random()* 10));
        }
        return list;
    }

    private void massPrintByString(int [] mass){
        System.out.println(Arrays.toString(mass));
    }

    private void printByBruteForce(int [] mass){
        for(int i=0; i<mass.length; i++){
            System.out.print(" " + mass[i] + " ");
        }
    }

    private void printByBruteForce(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(" " + list.get(i) + " ");
        }
    }
}



