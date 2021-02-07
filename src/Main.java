import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    private static Scanner scn = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("544 640 16 22");
//    private static int[] readInt(int count){
//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//            scn.nextLine();
//        }
//        return arr;
//    }
//
//    private static int findMin(int[] arr){
//         int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min)
//                min=arr[i];
//        }
//        return min;
//    }

    //    public static int[] reverseA(int[] arr){
//
//        for (int i = 0; i < arr.length/2; i++) {
//            int tmp = arr[i];
//            arr[i] =arr[arr.length-1-i];
//            arr[arr.length-1-i] = tmp;
//        }
//        return arr;
//    }
//    private static GroceryList gl = new GroceryList();
//
    private static void printAll() {
        System.out.println("\nPress ");
        System.out.println("\r0 - Shutdown");
        System.out.println("\r1 - Print Contacts");
        System.out.println("\r2 - Add");
        System.out.println("\r3 - Update");
        System.out.println("\r4 - Print All");
    }
//
//    public static void addItem() {
//        System.out.println("Enter a grocery to add");
//        gl.addGroceryItem(scn.nextLine());
//    }
//
//
//    public static void removeItem() {
//        System.out.println("Enter a grocery to remove");
//        gl.removeGL(scn.nextInt()-1);
//    }
//
//    public static void modifyItem() {
//        System.out.println("Enter a grocery number and replacement");
//        int itemNo = scn.nextInt();
//        scn.nextLine();
//        String itemName = scn.nextLine();
//        gl.modifyGL(itemNo, itemName);
//    }
//
//
//    public static void searchItem() {
//        System.out.println("Enter a grocery to search");
//        String item = gl.findItem(scn.nextLine());
//         if(gl.findItem(item)!=null)
//             System.out.println("Found "+item+" in the list");
//             else
//             System.out.println("Where the fuck");
//         }

    public static void startPhone() {
        System.out.println("Kill M'self");
    }


    public static void printContacts(){
       mobilePhone.printContact();
    }
    public static void addContact(){
        System.out.println("Enter a contact name");
        String name = scn.nextLine();
        System.out.println("Enter a contact number");
        String num = scn.nextLine();

        Contacts contact = Contacts.createContact(name, num);

        if(mobilePhone.addNewContact(contact))
            System.out.println("New contact added: "+name+ " | " + num);
        else
            System.out.println(name + " already on file.");

    }

    public static void updateContact(){
        System.out.println("Enter a name");
        String name = scn.nextLine();
        Contacts contacts;
        contacts = mobilePhone.queryContact(name);
        if(contacts==null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter a new name");
        String newName = scn.nextLine();
        System.out.println("Enter a number");
        String newNumber = scn.nextLine();

        Contacts newCont = Contacts.createContact(newName, newNumber);
        if(mobilePhone.updateContact(contacts, newCont))
            System.out.println("Succesfully updated");
        else
            System.out.println("Error...");
    }

    public static void main(String[] args) {


        startPhone();
        printAll();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter a action: ");
            int action = scn.nextInt();
            scn.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    printAll();
                    break;
                default:
                    System.out.println("WTF");
                    break;
            }
        }


//        int a[] = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 8;
//        a[3] = 7;
//        a[4] = 6;
//        int ilk = 0, iki = 0;
//        int enYuksek = Integer.MIN_VALUE;
//        for (int i = 0; i < a.length - 1; i++) {
//            int fark = a[i] - a[i + 1];
//            if (Math.abs(fark) > enYuksek) {
//                enYuksek = Math.abs(fark);
//                ilk = i;
//                iki = i + 1;
//            }
//        }
//        System.out.println("\n Fark: " + enYuksek + " \n sayi[" + ilk + "] \n sayi[" + iki+"]");
//        ArrayList<Integer> values = new ArrayList<>();
//
//        values.add(1);
//        values.add(5);
//        System.out.println(values.get(1));
//          String a = "Java Programlama Dersi Fall 2012";
//
//        System.out.print(a.substring(a.indexOf("J"), a.indexOf("P")));
//        System.out.print(a.substring(a.indexOf("F")));


//
//        boolean quit = false;
//        while (!quit) {
//            System.out.println("Enter a choice");
//            int num = scn.nextInt();
//            scn.nextLine();
//
//            switch (num) {
//                case 0:
//                    printAll();
//                    break;
//                case 1:
//                    gl.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchItem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//        }

//        int[] myInt = getIntegers(5);
//
//        for (int i = 0; i < myInt.length; i++) {
//            System.out.println("\r"+myInt[i]);
//        }
//
//        System.out.println("\n nn "+ getAvg(myInt));
//        sortArr(myInt);
//
//        for (int i = 0; i < myInt.length; i++) {
//            System.out.println("\r"+myInt[i]);
//        }
//
//        int[] ant = myInt;
//        System.out.println("m: " + Arrays.toString(myInt));
//        System.out.println("m: " + Arrays.toString(ant));
//
//        myInt = new int[] {1,2,5,7,9};
//        ant[0]=463;
//        System.out.println("m: " + Arrays.toString(myInt));
//        System.out.println("m: " + Arrays.toString(ant));


//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " int values.\r");
//        int[] values = new int[number];
//        for (int i = 0; i < values.length; i++) {
//            values[i] = scn.nextInt();
//        }
//        return values;
//    }

//    public static int[] sortArr(int[] arr) {
////        int[] sorted = new int[arr.length];
////        for (int i = 0; i < arr.length; i++) {
////            sorted[i]=arr[i];
////        }
//
//         int[] sorted = Arrays.copyOf(arr, arr.length);
//
//        boolean flag=true;
//        int tmp;
//        while(flag){
//            flag =false;
//
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i]<arr[i+1]){
//                   tmp = arr[i];
//                   arr[i]=arr[i+1];
//                   arr[i+1]=tmp;
//                   flag = true;
//                }
//            }
//        }
//
//        return sorted;
//
//    }

//    public static double getAvg(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return (double) sum / (double) arr.length;
//    }


    }
}