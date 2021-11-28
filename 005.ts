import { range } from "./utils";

const divisibleByAll = (n: number, numbers: number[]): boolean => {
  if (numbers.length === 0) {
    return true;
  } else {
    return n % numbers[0] === 0 && divisibleByAll(n, numbers.slice(1));
  }
}

let i = 20;
let divisors = range(3, 20);
while (!divisibleByAll(i, divisors)) {
  // will always be divisible by 20 so we can add 20 at a time
  i += 20;
}

console.log(`Answer: ${i}`);