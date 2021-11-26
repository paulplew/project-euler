import { isPrime } from './utils/prime';
import { factor } from './utils/factor';

const n: number = 600851475143;
const factors: number[] = factor(n);
const primeFactors: number[] = factors.filter((value) => isPrime(value));
console.log(Math.max(...primeFactors));