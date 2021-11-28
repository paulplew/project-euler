import { primesBelow } from "./utils/prime";

const answer = primesBelow(2000000).reduce((prev, curr) => prev + curr);
console.log(`Answer: ${answer}`);