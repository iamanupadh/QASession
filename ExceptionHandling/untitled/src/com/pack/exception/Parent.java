package com.pack.exception;

public class Parent {
    public static void main(String[] args) {
        boolean isValid =  false;
        int[] numbers = {1,2,3};
        try {
            if(!isValid) {
                throw new ParentException("This is  an Parent exception");

            }
            //System.out.println(numbers[3]);
            //int num = 1/0;
        } catch (ParentException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
