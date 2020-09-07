package com.codersbay;

import java.util.Scanner;

/*
Schreibe ein kleines Programm, welches einen String über die Konsole einliest.
Übersetzte den Text dann in Leetspeak - Du darfst dir hier eine beliebige Konfiguration verwenden,
falls dir keine einfällt hier ein Vorschlag:
A => '@'
B => '8'
C => '('
D => 'D'
E => '3'
F => 'F'
G => '6'
H => '#'
I => '!'
J => 'J'
K => 'K'
L => '1'
M => 'M'
N => 'N'
O => '0'
P => 'P'
Q => 'Q'
R => 'R'
S => '$'
T => '7'
U => 'U'
V => 'V'
W => 'W'
X => 'X'
Y => 'Y'
Z => '2'
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Text eingeben: ");
        String in = sc.nextLine();

        char[] userIn = in.toCharArray();
        char[] out = new char[userIn.length];

        for (int i = 0; i < userIn.length; i++) {

            if (userIn[i] == 'A') {
                out[i] = '@';
            } else if (userIn[i] == 'B') {
                out[i] = '8';
            } else if (userIn[i] == 'C') {
                out[i] = '(';
            } else if (userIn[i] == 'E') {
                out[i] = '3';
            } else if (userIn[i] == 'G') {
                out[i] = '6';
            } else if (userIn[i] == 'H') {
                out[i] = '#';
            } else if (userIn[i] == 'I') {
                out[i] = '!';
            } else if (userIn[i] == 'L') {
                out[i] = '1';
            } else if (userIn[i] == 'O') {
                out[i] = '0';
            } else if (userIn[i] == 'S') {
                out[i] = '$';
            } else if (userIn[i] == 'T') {
                out[i] = '7';
            } else if (userIn[i] == 'Z') {
                out[i] = '2';
            } else {
                out[i] = userIn[i];
            }
        }

        for (Character c : out) {
            System.out.print(c);
        }

    }
}
