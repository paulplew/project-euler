import { range } from './utils/range';

const squareFirst100Sum = range(1, 100).map(n => Math.pow(n, 2)).reduce((a, b) => a + b)
const sumFirst100Square = Math.pow(range(1, 100).reduce((a, b) => a + b), 2)
const answer = sumFirst100Square - squareFirst100Sum;

console.log(`answer: ${answer}`);