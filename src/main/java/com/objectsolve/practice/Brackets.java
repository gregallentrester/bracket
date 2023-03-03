package com.objectsolve.practice;

import java.util.Stack;


/*
  Valid = {}()[]
  Valid = ([{}])
  Invalid = {[}]
 */
public class Brackets {

  /**
   *
   */
  public static void main(String ... any) {
    new Brackets().jayunity();
  }

  /**
   *
   */
  private void jayunity() {

    System.err.println(
      "input " + isBalanced(input));

    System.err.println(
      "input1 " + isBalanced(input1));

    System.err.println(
      "input2 " + isBalanced(input2));
  }

  /**
   *
   */
  public boolean isBalanced(String str) {

    if (str == null || str.length() % 2 != 0) { return false; }


    model = new Stack();

    for (int i = 0; i < str.length(); i++) {

      char c = str.charAt(i);

      if (c == '(' || c == '{' || c == '[') {

        model.push(c);
      }
      else if (c == ')' || c == '}' || c == ']') {

        char lastChecked = model.pop();

        if ((lastChecked == '(' && c != ')') ||
            (lastChecked == '{' && c != '}') ||
            (lastChecked == '[' && c != ']')) {

          return false;
        }
      }

      // NB THIS IS NOT NEEDED --> else return false; <--
    }

    return model.isEmpty();
  }


  private static Stack<Character> model;

  private static final String input = "{}()[]";
  private static final String input1= "([{}])";
  private static final String input2 = "{[}]";
}
