import { fibonacci } from "./utils/fibonacci";

let answer = 0n;
let i = 1;
while (answer.toString().length < 1000) {
  answer = fibonacci(i);
  i += 1;
}
console.log(`Answer ${i}`);