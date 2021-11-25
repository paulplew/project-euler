import { factorial, range } from '../utils'

// permutes the array of numbers assuming there are no repeating numbers
// returns the 
const nthPermutation = (digits: number[], index: number): string => {
  // the total number of permutations for the current length
  const totalPermutations = factorial(digits.length);

  // there is only one single permutation
  if (digits.length === 1) {
    return String(digits[0]);
  } else {
    const permutationsForEachDigit = totalPermutations / digits.length;
    const startingIndex = Math.floor(index / permutationsForEachDigit);
    console.log(`digits:${digits}, idx:${index}, each:${permutationsForEachDigit}, starting:${startingIndex}`);
    return String(digits.splice(startingIndex, 1)) 
          + nthPermutation(digits, index - (startingIndex * permutationsForEachDigit));
  }
}

console.log(nthPermutation(range(0,9), 999999));
console.log(nthPermutation(range(0,2), 4));
