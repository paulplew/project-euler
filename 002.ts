import { fibonacci } from './utils'

// computes the sum of the even fibonacci numbers from start until
// the nth fibonacci number is greater than the max
const evenFibonacciNumbers = (max: number, start: number): number => {
  if (fibonacci(start) > max) {
    return 0;
  } else {
    return fibonacci(start) % 2 === 0 ?
      fibonacci(start) + evenFibonacciNumbers(max, start + 1) :
      evenFibonacciNumbers(max, start + 1);
  }
}

console.log(evenFibonacciNumbers(4000000, 0));