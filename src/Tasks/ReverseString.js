"use strict";

/**
 * Given a string S of length N, write a function that
 * transforms the string by reversing characters in groups
 * of four, and returns the transformed string e.g.
 * when S = "Lorem at" the output should be "eroLta m"
 * when S = "Tempor ip" the output should be "meT roppi"
 *
 */

function reverseInFours(stringS) {
    /** Algorithm
     * declare an empty string newString
     * assign stringS to new variable stringRemnant
     * in a while loop
     * split stringRemnant in chunks of four characters
     * reverse each chunk
     * append reversed chunk to newString
     * return newString
     *
     */
    let newString = "";
    let stringRemnant = stringS;
    while (stringRemnant) {
        let chunk = stringRemnant.substring(0, 4).split("").reverse().join("");
        stringRemnant = stringRemnant.substring(4);
        newString += chunk;
    }

    console.log(stringS);
    return newString;
}

console.log(reverseInFours("Lorem at")); // "eroLta m"
console.log("");
console.log(reverseInFours("Tempor ip")); // "meT roppi"

/* Note:
 You made a typing error in the expected result from
 reversing the string from your 2nd example;
 expected output for the second string "Tempor ip",
 not "meT roppi"
*/