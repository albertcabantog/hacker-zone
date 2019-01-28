package com.testdome;

public class UserInput {
    
    public static class TextInput {
        private String value = "";
        
        public void add(char input) {
            this.value += input;
        }
        
        public String getValue() {
            return this.value;
        }
    }

    public static class NumericInput extends TextInput{
        private String value = "";
        
        @Override
        public void add(char input) {
            
            this.value += Character.isDigit(input) ? input : "";
        }
        
        public String getValue() {
            return this.value;
        }
    }

    
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
