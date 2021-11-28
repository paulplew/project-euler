import { isPalindrome } from './utils/palindrome';

let largest = -1;
for (let i = 100; i < 1000; i += 1) {
  for (let j = 100; j < 1000; j += 1) {
    const product = i * j;
    if (isPalindrome(product)) {
      largest = Math.max(largest, product);
    }
  }
}

console.info(largest);