package com.ua.okono;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    public static Logger logger = Logger.getLogger(Methods.class);
    /**
     * Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @param randomMassiveLength
     * @param multipleByValue
     * @return
     */
    public int calculateMultipleBy(int randomMassiveLength, int multipleByValue) {
        try {
            int[] copy = randomMassive(randomMassiveLength);
            int sumByMultipl = 0;

            for (int i = 0; i < copy.length; i++) {
                if (copy[i] % multipleByValue == 0) {
                    sumByMultipl += copy[i];
                }
            }
            logger.info("The summ of elements multiple by "+ multipleByValue+ " = " + sumByMultipl);
            return sumByMultipl;
        } catch (ArithmeticException ex){
            ex.printStackTrace();
            logger.error("Arithmetic error has happened");
            return -1;
        }
    }
    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by list
     * @param randomListLength
     * @param index
     */
    public void createMassiveFromIndexList(int randomListLength, int index) {
        try {
            ArrayList<Integer> list = randomList(randomListLength);
            printByBruteForce(list);
            ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == index) {
                    result.add(i);
                }
            }
            if (result.size() > 0) {
                logger.info("Array of indexes for elements that equals to " + index + " = "+ listPrintByString(result));
            } else
                logger.info("No elements found that equals to " + index);
        } catch(IndexOutOfBoundsException ex){
           ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        }
    }

    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by Array
     * @param randomMassiveLength
     * @param index
     */
    public void createMassiveFromIndexMassive(int randomMassiveLength, int index) {
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int count = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == index) {
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
            if (result.length > 0) {
                logger.info("Array of indexes for elements that equals to " + index + " = " + massPrintByString(result));
            } else
                logger.error("No elements found that equals to " + index);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     * встречается раньше – положительное или отрицательное.
     * @param randomMassiveLength
     * @return
     */
    public String firstPositiveOrNegative(int randomMassiveLength){
        try {
            int[] massive = randomMassive(randomMassiveLength);

            for (int i = 0; i < massive.length; i++) {
                if (massive[i] < 0) {
                    logger.info("First element is negative");
                   return "1";
                } else if (massive[i] > 0) {
                    logger.info("First element is positive");
                    return "1";
                }
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        }
        return "-1";
    }

    /**
     * Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param randomMassiveLength
     * @return
     */
    public int[] isSortingAsc(int randomMassiveLength){
        int[] mass = new int[]{-1};
        try {
            int[] massive = randomMassive(randomMassiveLength);
            Arrays.sort(massive, 0, massive.length); //comment this line for result changes
            int errorcounter = 0;

            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    errorcounter++;
                }
            }
            if (errorcounter > 0) {
               logger.info("Massive isn't sorted asc - " + massPrintByString(massive));
            } else
                logger.info("Massive is sorted asc - " + massPrintByString(massive));
            return massive;
        } catch (Exception ex){
            ex.printStackTrace();
            logger.error("Error has happened");
           return mass;
        }
    }

    /**
     * Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     * сообщение об этом факте.
     * @param randomMassiveLength
     * @return
     */
    public int[] pairElementsCheck(int randomMassiveLength){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int counter = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] % 2 == 0 && mass[i] != 0) {
                    counter++;
                }
            }
            int[] masspair = new int[counter];
            int counterPair = 0;

            for (int j = 0; j < mass.length; j++) {
                if (mass[j] % 2 == 0 && mass[j] != 0) {
                    masspair[counterPair] = mass[j];
                    counterPair++;
                }
            }
            if (counter == 0) {
                logger.info("There aren't pair elements = " + massPrintByString(masspair));
            } else
                logger.info("Massive from pair elements = "+ massPrintByString(masspair));
            return masspair;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        }
    }

    /**
     * Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     * количество замен.
     * @param randomMassiveLength
     * @param elementForReplacement
     * @return
     */
    public int[] digitReplacement(int randomMassiveLength, int elementForReplacement){
        int[] result = new int[]{-1};
        try {
            int[] massRandom = randomMassive(randomMassiveLength);
            int counter=0;

            for (int i = 0; i < massRandom.length; i++) {
                if (massRandom[i] >= elementForReplacement) {
                    massRandom[i] = elementForReplacement;
                } else
                    counter++;
            }
            if (counter == massRandom.length){
                throw new AlexException("Element is bigger than all the elements. Replacement isn't performed");//my exception example
            }
            logger.info("Massive from replaced elements = " + massPrintByString(massRandom));
            return massRandom;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("Element is bigger than all the elements. Replacement isn't performed");
            return result;
        }
    }

    /**
     * Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     * элементов.
     * @param randomMassiveLength
     */
    public void positiveNegativeZero(int randomMassiveLength){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int possitive = 0;
            int negative = 0;
            int zeroes = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 0) {
                    negative++;
                } else if (mass[i] > 0) {
                    possitive++;
                } else
                    zeroes++;
            }
            logger.info("Positive digits = " + possitive);
            logger.info("Negative digits = " + negative);
            logger.info("Zeroes digits = " + zeroes);
        } catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param randomMassiveLength
     * @return
     */
    public int[] minMaxReplacement(int randomMassiveLength){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int max = mass[0];
            int min = mass[0];

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] >= max) {
                    max = mass[i];
                } else if (mass[i] <= min) {
                    min = mass[i];
                }
            }
            logger.info("Max element = " + max);
            logger.info("Min element = " + min);
            int maxIndexCounter = 0;
            int minIndexCounter = 0;

           while(mass[maxIndexCounter] < max){
               maxIndexCounter++;
           }

            while(mass[minIndexCounter] > min){
                minIndexCounter++;
            }
            int temp = mass[maxIndexCounter];
            mass[maxIndexCounter] = mass[minIndexCounter];
            mass[minIndexCounter] = temp;
            logger.info("Finish massive with replaced min and max element = " + massPrintByString(mass));
            return mass;
        } catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        }
    }

    /**
     * Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param randomMassiveLength
     * @param valueLimitation
     */
    public void lessThanValue(int randomMassiveLength, int valueLimitation){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            logger.info("Value for limitation = " + valueLimitation);
            int errorCount = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] <= valueLimitation) {
                    System.out.print(mass[i] + " ");
                } else
                    errorCount++;
            }
            if (errorCount == mass.length) {
                throw new AlexException("Limitation value is less that each of massive elements");  //my exception example
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("Limitation value is less that each of massive elements");
        }
    }

    /**
     * Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
     * @param randomMassiveLength
     * @param divisionValue
     * @param remainder
     * @return
     */
    public int[] remainderFromDivision(int randomMassiveLength, int divisionValue, int remainder){
        int[] resMass = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int counter = 0;

            for (int i = 0; i < mass.length; i++) {
                if (Math.round(mass[i] % divisionValue) == remainder) {
                    counter++;
                }
            }
            int[] result = new int[counter];
            int counter2 = 0;

            for (int i = 0; i < mass.length; i++) {
                if (Math.round(mass[i] % divisionValue) == remainder) {
                    result[counter2] = mass[i];
                    counter2++;
                }
            }
            if (counter == 0) {
                throw new AlexException("There aren't values where remainder from divider " + divisionValue + " = " + remainder);
            }else
                logger.info("Result massive = "+  massPrintByString(result));
            return result;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return resMass;
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("There aren't values where remainder from divider " + divisionValue + " = " + remainder);
            return resMass;
        }
    }

    /**
     * Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param randomMassiveLength
     * @return
     */
    public int[] replace(int randomMassiveLength){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);

            for (int i = 0; i < mass.length - 1; i = i + 2) {
                int temp;
                temp = mass[i];
                mass[i] = mass[i + 1];
                mass[i + 1] = temp;
            }
            logger.info("Result massive = " + Arrays.toString(mass));
            return mass;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        }
    }

    /**
     * Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно
     * до нуля.
     * @param randomMassiveLength
     */
    public void beforeZeroPrint(int randomMassiveLength){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int counter = 0;

            while(counter <= mass.length-1){
                if(mass[counter] != 0) {
                    System.out.print(mass[counter] + " ");
                    counter++;
                }else
                counter=mass.length + 1;
            }
            if (counter == mass.length){
                System.out.println(" ");
                throw new AlexException("There isn't 0 in the generated massive");
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("There isn't 0 in the generated massive");
        }
    }

    /**
     * Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     * @param randomMassiveLength
     */
    public void minMaxPairSum(int randomMassiveLength){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int max = mass[0];
            int min = mass[1];

            for (int i = 2; i < mass.length; i = i + 2) {
                if (max <= mass[i]) {
                    max = mass[i];
                }
            }

            for (int j = 3; j < mass.length; j = j + 2) {
                if (min >= mass[j]) {
                    min = mass[j];
                }
            }
            logger.info("Max value of pair elements = " + max);
            logger.info("Min value of unpaired elements= " + min);
            logger.info("Max + Min = " + (max + min));
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше
     * заданного числа М. Если таких нет, то выдать сообщение об этом.
     * @param randomMassiveLength
     * @param value
     * @return
     */
    public int multipleBy(int randomMassiveLength, int value){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int counter = 0;
            int multiple = 1;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > value) {
                    multiple = multiple * mass[i];
                    counter++;
                }
            }
            if (counter > 0) {
                logger.info("Product of digits that are more than " + value + " = " + multiple);
                return multiple;
            } else
                throw new AlexException("There aren't elements more than inputted value - " + value);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return -1;
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("There aren't elements more than inputted value - " + value);
            return -1;
        }
    }

    /**
     * Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
     * по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
     * @param randomMassiveLength
     * @return
     */
    public int[] modularity(int randomMassiveLength){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int max = mass[0];

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                }
            }
            logger.info("Max value = " + max);

            for (int j = 0; j < mass.length; j++) {
                if (Math.abs(mass[j]) > max) {
                    mass[j] = 0;
                }
            }
            logger.info("Result massive = " + massPrintByString(mass));
            return mass;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        }
    }

    /**
     * Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение
     * отрицательных элементов P 1  и произведение положительных элементов Р 2 . Сравнить модуль Р 2  с
     * модулем Р 1  и указать, какое из произведений по модулю больше.
     * @param randomMassiveLength
     */
    public void maxMinAbs(int randomMassiveLength){
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int multipleNegative = 1;
            int multiplePossitive = 1;
            int counterFor1 = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 0) {
                    multipleNegative = multipleNegative * mass[i];
                }
                if (mass[i] > 0) {
                    multiplePossitive = multiplePossitive * mass[i];
                    counterFor1++;
                }
            }
            if (multipleNegative == 1) {
                multipleNegative = 0;
            }
            if (counterFor1 == 0) {
                multiplePossitive = 0;
            }
            logger.info("Multiply of negative values = " + multipleNegative);
            logger.info("Multiply of positive values = " + multiplePossitive);
            if (Math.abs(multipleNegative) > Math.abs(multiplePossitive)) {
                logger.info("Negative amount is > Positive amount");
            } else if (Math.abs(multipleNegative) < Math.abs(multiplePossitive)) {
                logger.info("Positive amount is > Negative amount");
            } else if (Math.abs(multipleNegative) == Math.abs(multiplePossitive)) {
                throw new AlexException("Negative amount = Positive amount");
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("Negative amount = Positive amount");
        }
    }

    /**
     * Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и
     * заменить его нулем.
     * @param randomMassiveLength
     * @return
     */
    public int[] firstMax(int randomMassiveLength){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            int counter = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > mass[i+1]) {
                    mass[i] = 0;
                    counter++;
                } else if(mass[i] < mass[i+1]) {
                    mass[i+1] = 0;
                    counter++;
                }
                if(counter != 0){
                    i = mass.length;
                }
            }
            logger.info("Result massive = " + massPrintByString(mass));
            return mass;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        }
    }

    /**
     * Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k.
     * @param randomMassiveLength
     * @param matchingValue
     * @return
     */
    public int[] lastElement(int randomMassiveLength, int matchingValue){
        int[] result = new int[]{-1};
        try {
            int[] mass = randomMassive(randomMassiveLength);
            String matching = Integer.toString(matchingValue);
            String[] str = new String[mass.length];

            for (int i = 0; i < mass.length; i++) {
                str[i] = Integer.toString(mass[i]);
            }
            int lengthForFinalMassive = str.length;

            for (int j = 0; j < str.length; j++) {
                if (str[j].lastIndexOf(matching) != str[j].length() - 1) {
                    str[j] = "-";
                    lengthForFinalMassive--;
                }
            }
            logger.info("Elements selection = " + Arrays.toString(str));
            int[] finalMassive = new int[lengthForFinalMassive];
            int j = 0;

            for (int i = 0; i < finalMassive.length; i++) {
                for (; j < str.length; ) {
                    if (!str[j].equals("-")) {
                        finalMassive[i] = Integer.parseInt(str[j]);
                        j++;
                        break;
                    }
                    j++;
                }
            }
            if(finalMassive.length != 0){
                logger.info("Result massive = " + massPrintByString(finalMassive));
                return finalMassive;
            }else
                throw new AlexException("There aren't digits that finished on " + matching + " value");
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            logger.error("IndexOutOFBound error has happened");
            return result;
        } catch (AlexException ex){
            ex.printStackTrace();
            logger.warn("There aren't digits that finished on " + matchingValue + " value");
            return result;
        }
    }

    private int[] randomMassive(int length){
        int[] massive = new int[length];
        for(int i=0; i < massive.length; i++){
            massive[i] = (int)(-3 + (Math.random()* 12));
        }
        logger.info("Random massive generated = " + massPrintByString(massive));
        return massive;
    }

    private ArrayList<Integer> randomList(int listLength){
        ArrayList<Integer> list = new ArrayList<>(listLength);
        for(int i=0; i < listLength; i++){
            list.add((int)(Math.random()* 10));
        }
        System.out.print("Random list generated = ");
        return list;
    }

    private String massPrintByString(int [] mass){
        return Arrays.toString(mass);
    }

    private void printByBruteForce(int [] mass){
        for(int i=0; i < mass.length; i++){
            System.out.print(" " + mass[i] + " ");
        }
    }

    private void printByBruteForce(ArrayList<Integer> list){
        for(int i=0; i < list.size(); i++){
            System.out.print(" "+ list.get(i) + " ");
        }
        System.out.println();
    }

    private String listPrintByString(ArrayList<Integer> list){
        String result ="";
        for(int i=0; i < list.size(); i++){
            result = result.concat(" ").concat(Integer.toString(list.get(i)));
        }
        return result;
    }

    private int scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}



