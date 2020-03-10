package com.ua.okono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    /**
     * Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K.
     * @return Calculated value of digits that are multiple by multiple value
     */
    public int calculateMultipleBy() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input length for random massive = ");
            int randomMassiveLength = scanner.nextInt();
            int[] copy = Arrays.copyOf(randomMassive(randomMassiveLength), randomMassiveLength);
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
        } catch (ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("Arithmetic error has happened");
            return -1;
        }
    }

    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by list
     * @param index
     */
    public void createMassiveFromIndexList(int index) {
        try {
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
            if (result.size() > 0) {
                System.out.printf("Array of indexes for elements that equals to %d = ", index);
                printByBruteForce(result);
            } else
                System.out.printf("No elements found that equals to %d ", index);
        } catch(IndexOutOfBoundsException ex){
           ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        }
    }

    /**
     * В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов.
     * by Array
     * @param index
     */
    public void createMassiveFromIndexMassive(int index) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input length for random massive = ");
            int randomMassiveLength = scanner.nextInt();
            System.out.print("Random massive generated = ");
            int[] mass = randomMassive(randomMassiveLength);
            printByBruteForce(mass);
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
            System.out.println();
            if (result.length > 0) {
                System.out.printf("Array of indexes for elements that equals to %d = ", index);
                printByBruteForce(result);
            } else
                System.out.printf("No elements found that equals to %d ", index);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     *  встречается раньше – положительное или отрицательное.
     * @param length
     */
    public void firstPositiveOrNegative(int length){
        try {
            int[] massive = randomMassive(length);
            System.out.print("Random massive generated = ");
            massPrintByString(massive);

            for (int i = 0; i < massive.length; i++) {
                if (massive[i] < 0) {
                    System.out.println("First element is negative");
                    break;
                } else if (massive[i] > 0) {
                    System.out.println("First element is possitive");
                    break;
                }
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан массив чисел. Выяснить, отсортирован ли он по возрастанию.
     * @param length
     * @return
     */
    public int[] isSortingAsc(int length){
        int[] mass;
        try {
            int[] massive = randomMassive(length);
            System.out.print("Random massive generated = ");
            massPrintByString(massive);
            Arrays.sort(massive, 0, massive.length); //comment this line for result changes
            int errorcounter = 0;

            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    errorcounter++;
                }
            }
            if (errorcounter > 0) {
                System.out.print("Massive isn't sorted asc - ");
            } else
                System.out.print("Massive is sorted asc - ");
            massPrintByString(massive);
            mass = Arrays.copyOf(massive,massive.length);
            return mass;
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Error has happened");
            mass = new int[]{-1};
           return mass;
        }
    }

    /**
     * Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     * сообщение об этом факте.
     */
    public int[] pairElementsCheck(){
        int[] result;
        try {
            int[] mass = randomMassive(6);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
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
                System.out.println("There aren't pair elements");
            } else
                System.out.print("Massive from pair elements = ");
            massPrintByString(masspair);
            result = Arrays.copyOf(masspair,masspair.length);
            return result;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        }
    }

    /**
     *Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать
     * количество замен.
     * @param length
     * @return
     */
    public int[] digitReplacement(int length){
        int[] result;
        try {
            Scanner scanner = new Scanner(System.in);
            int[] massRandom = randomMassive(length);
            System.out.print("Random massive generated = ");
            massPrintByString(massRandom);
            System.out.print("Input element for replacement = ");
            int elementForReplacement = scanner.nextInt();
            int counter=0;

            for (int i = 0; i < massRandom.length; i++) {
                if (massRandom[i] >= elementForReplacement) {
                    massRandom[i] = elementForReplacement;
                } else
                    counter++;
            }
            if (counter==massRandom.length){
                throw new AlexException("Element is bigger than all the elements. Replacement isn't performed"); //my exception example
            }
            System.out.println("Massive from replaced elements = ");
            massPrintByString(massRandom);
            result = Arrays.copyOf(massRandom,massRandom.length);
            return result;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            result = new int[]{-1};
            System.out.println("IndexOutOFBound error has happened");
            return result;
        } catch (AlexException ex){
            ex.printStackTrace();
            result = new int[]{-1};
            return result;
        }
    }

    /**
     * Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     * элементов.
     * @param length
     */
    public void positiveNegativeZero(int length){
        try {
            int[] mass = randomMassive(length);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
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
            System.out.println("Positive digits= " + possitive);
            System.out.println("Negative digits= " + negative);
            System.out.println("Zeroes digits= " + zeroes);
        } catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан массив чисел. Поменять местами наибольший и наименьший элементы.
     * @param length
     * @return
     */
    public int[] minMaxReplacement(int length){
        int[] result;
        try {
            int[] mass = randomMassive(length);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            int max = mass[0];
            int min = mass[0];

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                } else if (mass[i] < min) {
                    min = mass[i];
                }
            }
            System.out.println("Max element = " + max);
            System.out.println("Min element = " + min);
            int maxIndexCounter = 0;
            int minIndexCounter = 0;

            for (int j = 0; j < mass.length; j++) {
                if (mass[j] == max) {
                    break;
                }
                maxIndexCounter++;
            }

            for (int k = 0; k < mass.length; k++) {
                if (mass[k] == min) {
                    break;
                }
                minIndexCounter++;
            }
            int temp = mass[maxIndexCounter];
            mass[maxIndexCounter] = mass[minIndexCounter];
            mass[minIndexCounter] = temp;
            System.out.print("Finish massive with replaced min and max element = ");
            massPrintByString(mass);
            result = Arrays.copyOf(mass,mass.length);
            return result;
        } catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        }
    }

    /**
     * Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
     * @param lengthMass
     * @param valueLimitation
     */
    public void lessThanValue(int lengthMass, int valueLimitation){
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            System.out.println("Value for limitation = " + valueLimitation);
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
            System.out.println("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
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
        int[] resMass;
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
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
                System.out.println("Result massive = ");
            massPrintByString(result);
            resMass = Arrays.copyOf(result,result.length);
            return resMass;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            resMass = new int[]{-1};
            return resMass;
        } catch (AlexException ex){
            ex.printStackTrace();
            resMass = new int[]{-1};
            return resMass;
        }
    }

    /**
     * Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     * @param lengthMass
     * @return
     */
    public int[] replace(int lengthMass){
        int[] result;
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);

            for (int i = 0; i < mass.length - 1; ) {
                int temp;
                temp = mass[i];
                mass[i] = mass[i + 1];
                mass[i + 1] = temp;
                i = i + 2;
            }
            System.out.println("Result massive = " + Arrays.toString(mass));
            result = Arrays.copyOf(mass,mass.length);
            return result;
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        }
    }

    /**
     * Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно
     * до нуля.
     */
    public void beforeZeroPrint(int lengthMass){
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            int counter = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == 0) {
                    break;
                } else
                    System.out.print(mass[i] + " ");
                counter++;
            }
            if (counter == mass.length){
                System.out.println(" ");
                throw new AlexException("There isn't 0 in the generated massive");
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Дан массив чисел. Найти  mаx(а[0], а[2], ..., а[2к]) + min(а[1], а[3], …, а[2к-1]).
     * @param lengthMass
     */
    public void minMaxPairSum(int lengthMass){
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            int max = mass[0];
            int min = mass[1];

            for (int i = 2; i < mass.length; i = i + 2) {
                if (max <= mass[i]) {
                    max = mass[i];
                }
            }

            for (int j = 3; j < mass.length; j = j + 2 ) {
                if (min >= mass[j]) {
                    min = mass[j];
                }
            }
            System.out.println("Max value of pair elements = " + max);
            System.out.println("Min value of unpaired elements= " + min);
            System.out.println("Max + Min = " + (max + min));
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        }
    }

    /**
     * Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше
     * заданного числа М. Если таких нет, то выдать сообщение об этом.
     * @param lengthMass
     * @param value
     * @return
     */
    public int multipleBy(int lengthMass, int value){
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            int counter = 0;
            int multiple = 1;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > value) {
                    multiple = multiple * mass[i];
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.println("Product of digits that are more than " + value + " = " + multiple);
                return multiple;
            } else
                throw new AlexException("There aren't elements more than inputted value - " + value);
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            return -1;
        } catch (AlexException ex){
            ex.printStackTrace();
            return -1;
        }
    }

    /**
     * 16. Дан массив положительных и отрицательных чисел.  Заменить нулями те числа, величина которых
     * по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
     * @param lengthMass
     */
    public int[] modularity(int lengthMass){
        int[] result;
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
            int max = mass[0];

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                }
            }
            System.out.println("Max value = " + max);

            for (int j = 0; j < mass.length; j++) {
                if (Math.abs(mass[j]) > max) {
                    mass[j] = 0;
                }
            }
            System.out.print("Result massive = ");
            massPrintByString(mass);
            result = Arrays.copyOf(mass,mass.length);
            return result;
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        }
    }

    /**
     * Дан массив чисел с положительными и отрицательными элементы. Вычислить произведение
     * отрицательных элементов P 1  и произведение положительных элементов Р 2 . Сравнить модуль Р 2  с
     * модулем Р 1  и указать, какое из произведений по модулю больше.
      * @param lengthMass
     */
    public void maxMinAbs(int lengthMass){
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);
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
            System.out.println("Multiply of negative values = " + multipleNegative);
            System.out.println("Multiply of positive values = " + multiplePossitive);
            if (Math.abs(multipleNegative) > Math.abs(multiplePossitive)) {
                System.out.println("Negative amount is > Positive amount");
            } else if (Math.abs(multipleNegative) < Math.abs(multiplePossitive)) {
                System.out.println("Positive amount is > Negative amount");
            } else if (Math.abs(multipleNegative) == Math.abs(multiplePossitive)) {
                throw new AlexException("Negative amount = Positive amount");
            }
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
        } catch (AlexException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и
     * заменить его нулем.
     * @param lengthMass
     */
    public int[] firstMax(int lengthMass){
        int[] result;
        try {
            int[] mass = randomMassive(lengthMass);
            System.out.print("Random massive generated = ");
            massPrintByString(mass);

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > mass[i + 1]) {
                    mass[i] = 0;
                    break;
                } else if (mass[i] < mass[i + 1]) {
                    mass[i + 1] = 0;
                    break;
                }
            }
            System.out.print("Result massive = ");
            massPrintByString(mass);
            result = Arrays.copyOf(mass,mass.length);
            return result;
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        }
    }

    /**
     * Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k.
     * @return
     */
    public int[] lastElement(){
        int[] result;
        try {
            int[] mass = new int[]{0, 2, 3, 54, 1, 101, 2, 111, 3, 12, 110, 0};
            System.out.println("Massive values = " + Arrays.toString(mass));
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input value for matching = ");
            String matching = scanner.nextLine();
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
            System.out.println("Elements selection = " + Arrays.toString(str));
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
                System.out.print("Result massive = ");
                massPrintByString(finalMassive);
                result = Arrays.copyOf(finalMassive, finalMassive.length);
                return result;
            }else
                throw new AlexException("There aren't digits that finished on " + matching + " value");
        } catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("IndexOutOFBound error has happened");
            result = new int[]{-1};
            return result;
        } catch (AlexException ex){
            ex.printStackTrace();
            result = new int[]{-1};
            return result;
        }
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



