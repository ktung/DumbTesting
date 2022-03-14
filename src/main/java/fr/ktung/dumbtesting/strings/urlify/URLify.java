package fr.ktung.dumbtesting.strings.urlify;

public interface URLify {

//  URLify: write a method to replace all spaces in a string with '%20'.
//  You may assume that the string has sufficient space at the end to hold
//  the additional characters, and that you are given the "true" length of the string
//  (Not: if implementing in Java, please use character array so that
//  you can perform this operation in place.)
//  Example
//  Input : "Mr John Smith    ", 13
//  Ouput : "Mr%20John%20Smith"
  char[] urlify(char[] url, int trueLength);
}
